package dev.vuis.cccr.transformer;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Set;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.tree.ClassNode;

@RequiredArgsConstructor
public final class InputJarFileVisitor extends SimpleFileVisitor<Path> {
	private static final Set<String> EXCLUDED_PATHS = Set.of(
		"assets/minecraft/textures/blocks"
	);

	private final Path inputRoot, outputRoot;

	@Override
	public @NotNull FileVisitResult visitFile(@NotNull Path file, @NotNull BasicFileAttributes attrs) throws IOException {
		Path relative = inputRoot.relativize(file);
		Path dest = outputRoot.resolve(relative);

		if (file.getFileName().toString().endsWith(".class")) {
			if (dest.getParent() != null) {
				Files.createDirectories(dest.getParent());
			}

			String relativeFilename = relative.toString();
			String strippedFilename = relativeFilename.substring(0, relativeFilename.lastIndexOf('.'));

			ClassTransformer transformer = ClassTransformers.TRANSFORMERS.get(strippedFilename);
			if (transformer != null) {
				System.out.println("Transforming class " + strippedFilename);

				ClassReader reader = new ClassReader(Files.readAllBytes(file));
				ClassNode node = new ClassNode();
				reader.accept(node, 0);

				transformer.transform(node);

				ClassWriter writer = new ClassWriter(ClassWriter.COMPUTE_MAXS | ClassWriter.COMPUTE_FRAMES);
				node.accept(writer);

				Files.write(dest, writer.toByteArray(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
			} else {
				Files.copy(file, dest, StandardCopyOption.REPLACE_EXISTING);
			}
		} else if (!Files.exists(dest)) {
			for (String excluded : EXCLUDED_PATHS) {
				if (relative.startsWith(excluded)) {
					return FileVisitResult.CONTINUE;
				}
			}
			if (dest.getParent() != null) {
				Files.createDirectories(dest.getParent());
			}
			Files.copy(file, dest);
		}

		return FileVisitResult.CONTINUE;
	}
}
