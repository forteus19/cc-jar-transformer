package dev.vuis.cctransformer;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.BasicFileAttributes;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.tree.ClassNode;

@RequiredArgsConstructor
public final class InputJarFileVisitor extends SimpleFileVisitor<Path> {
	private final Path inputRoot, outputRoot;

	@Override
	public @NotNull FileVisitResult visitFile(@NotNull Path file, @NotNull BasicFileAttributes attrs) throws IOException {
		Path relative = inputRoot.relativize(file);
		Path dest = outputRoot.resolve(relative);

		if (dest.getParent() != null) {
			Files.createDirectories(dest.getParent());
		}

		if (file.getFileName().toString().endsWith(".class")) {
			String relativeFilename = relative.toString();
			String strippedFilename = relativeFilename.substring(0, relativeFilename.lastIndexOf('.'));

			ClassTransformer transformer = ClassTransformers.TRANSFORMERS.get(strippedFilename);
			if (transformer != null) {
				IO.println("Transforming class " + strippedFilename);

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
		} else {
			Files.copy(file, dest, StandardCopyOption.REPLACE_EXISTING);
		}

		return FileVisitResult.CONTINUE;
	}
}
