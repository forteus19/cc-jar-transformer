package dev.vuis.cccr.transformer;

import java.net.URI;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import lombok.Cleanup;
import lombok.SneakyThrows;

public final class Main {
	private Main() {
	}

	@SneakyThrows
	static void main(String[] args) {
		Path inputPath = Path.of(args[0]);
		Path outputPath = Path.of(args[1]);

		IO.println("Input jar: " + inputPath);
		IO.println("Output jar: " + outputPath);

		IO.println("Opening input jar");

		@Cleanup
		FileSystem inputFs = FileSystems.newFileSystem(
			getJarUri(inputPath),
			Map.of("create", "false")
		);

		IO.println("Opening output jar");

		@Cleanup
		FileSystem outputFs = FileSystems.newFileSystem(
			getJarUri(outputPath),
			Map.of("create", "true")
		);

		Path inputRoot = inputFs.getPath("/");
		Path outputRoot = outputFs.getPath("/");

		IO.println("Starting file visitor");
		Files.walkFileTree(inputRoot, new InputJarFileVisitor(inputRoot, outputRoot));

		IO.println("Done!");
	}

	private static URI getJarUri(Path jarPath) {
		return URI.create("jar:" + jarPath.toUri());
	}
}
