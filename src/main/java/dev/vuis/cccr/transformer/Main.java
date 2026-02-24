package dev.vuis.cccr.transformer;

import dev.vuis.cccr.transformer.util.Util;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Stream;
import lombok.Cleanup;
import lombok.SneakyThrows;

public final class Main {
	static String cloudHost;
	static int cloudPort;

	private Main() {
	}

	@SneakyThrows
	static void main(String[] args) {
		Path inputPath = Path.of(args[0]);
		Path outputPath = Path.of(args[1]);
		Path injectPath = Path.of(args[2]);
		cloudHost = args[3];
		cloudPort = Integer.parseInt(args[4]);

		System.out.println("Input jar: " + inputPath);
		System.out.println("Output jar: " + outputPath);

		System.out.println("Opening input jar");

		@Cleanup
		FileSystem inputFs = FileSystems.newFileSystem(
			Util.getJarUri(inputPath),
			Map.of("create", "false")
		);

		System.out.println("Deleting previous output jar");
		Files.deleteIfExists(outputPath);

		System.out.println("Opening output jar");

		@Cleanup
		FileSystem outputFs = FileSystems.newFileSystem(
			Util.getJarUri(outputPath),
			Map.of("create", "true")
		);

		Path inputRoot = inputFs.getPath("/");
		Path outputRoot = outputFs.getPath("/");

		System.out.println("Starting transformer file visitor");
		Files.walkFileTree(inputRoot, new InputJarFileVisitor(inputRoot, outputRoot));

		System.out.println("Adding inject files");

		@Cleanup
		Stream<Path> injectStream = Files.walk(injectPath);
		Iterator<Path> injectIterator = injectStream.iterator();
		while (injectIterator.hasNext()) {
			Path path = injectIterator.next();
			Path relative = injectPath.relativize(path);

			Path dest = outputRoot.getFileSystem().getPath(relative.toString());
			dest = outputRoot.resolve(dest);

			if (Files.isDirectory(path)) {
				if (!Files.isDirectory(dest)) {
					System.out.println("Creating dir " + dest);
					Files.createDirectory(dest);
				}
				continue;
			}

			System.out.println("Copying inject file " + relative);
			Files.copy(path, dest, StandardCopyOption.REPLACE_EXISTING);
		}

		System.out.println("Done!");
	}
}
