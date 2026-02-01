package dev.vuis.cccr.transformer.util;

import java.net.URI;
import java.nio.file.Path;

public final class Util {
	private Util() {
	}

	public static URI getJarUri(Path jarPath) {
		return URI.create("jar:" + jarPath.toUri());
	}
}
