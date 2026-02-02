package dev.vuis.cccr.transformer.util;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import lombok.Cleanup;
import lombok.SneakyThrows;
import net.fabricmc.mappingio.MappingReader;
import net.fabricmc.mappingio.MappingVisitor;
import net.fabricmc.mappingio.MappingWriter;
import net.fabricmc.mappingio.adapter.ForwardingMappingVisitor;
import net.fabricmc.mappingio.format.MappingFormat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.tree.ClassNode;

public final class MappingConvertMain {
	private static final Map<String, ClassNode> JAR_CLASSES = new HashMap<>();

	private MappingConvertMain() {
	}

	@SneakyThrows
	public static void main(String[] args) {
		Path inputJar = Path.of(args[0]);
		Path inputPath = Path.of(args[1]);
		Path outputPath = Path.of(args[2]);

		@Cleanup
		FileSystem inputFs = FileSystems.newFileSystem(
			Util.getJarUri(inputJar),
			Map.of("create", "false")
		);

		Path inputJarRoot = inputFs.getPath("/");

		Files.walkFileTree(inputFs.getPath("/"), new SimpleFileVisitor<>() {
			@Override
			public @NotNull FileVisitResult visitFile(@NotNull Path file, @NotNull BasicFileAttributes attrs) throws IOException {
				if (!file.getFileName().toString().endsWith(".class")) {
					return FileVisitResult.CONTINUE;
				}

				String relativeFilename = inputJarRoot.relativize(file).toString();
				String strippedFilename = relativeFilename.substring(0, relativeFilename.lastIndexOf('.'));

				ClassReader reader = new ClassReader(Files.readAllBytes(file));
				ClassNode node = new ClassNode();
				reader.accept(node, 0);

				JAR_CLASSES.put(strippedFilename, node);

				return FileVisitResult.CONTINUE;
			}
		});

		@Cleanup
		MappingWriter writer = MappingWriter.create(outputPath, MappingFormat.TINY_2_FILE);
		assert writer != null;
		MappingReader.read(inputPath, MappingFormat.SRG_FILE, new FieldDescLookupVisitor(writer));
	}

	private static class FieldDescLookupVisitor extends ForwardingMappingVisitor {
		private String currentClass = null;

		private FieldDescLookupVisitor(MappingVisitor next) {
			super(next);
		}

		@Override
		public boolean visitClass(String srcName) throws IOException {
			currentClass = srcName;
			return super.visitClass(srcName);
		}

		@Override
		public boolean visitField(String srcName, @Nullable String srcDesc) throws IOException {
			if (srcDesc == null && currentClass != null) {
				ClassNode classNode = JAR_CLASSES.get(currentClass);
				if (classNode != null) {
					Optional<String> lookupDesc = classNode.fields.stream().filter(field -> field.name.equals(srcName)).map(field -> field.desc).findFirst();
					if (lookupDesc.isPresent()) {
						srcDesc = lookupDesc.get();
					}
				} else {
					System.err.printf("Missing class %s%n", currentClass);
				}
			}
			return super.visitField(srcName, srcDesc);
		}
	}
}
