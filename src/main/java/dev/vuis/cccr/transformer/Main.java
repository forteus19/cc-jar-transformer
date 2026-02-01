package dev.vuis.cccr.transformer;

import dev.vuis.cccr.transformer.util.Util;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
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
		cloudHost = args[2];
		cloudPort = Integer.parseInt(args[3]);

		IO.println("Input jar: " + inputPath);
		IO.println("Output jar: " + outputPath);

		IO.println("Opening input jar");

		@Cleanup
		FileSystem inputFs = FileSystems.newFileSystem(
			Util.getJarUri(inputPath),
			Map.of("create", "false")
		);

		IO.println("Opening output jar");

		@Cleanup
		FileSystem outputFs = FileSystems.newFileSystem(
			Util.getJarUri(outputPath),
			Map.of("create", "true")
		);

		Path inputRoot = inputFs.getPath("/");
		Path outputRoot = outputFs.getPath("/");

		IO.println("Starting file visitor");
		Files.walkFileTree(inputRoot, new InputJarFileVisitor(inputRoot, outputRoot));

		IO.println("Done!");
	}
}
