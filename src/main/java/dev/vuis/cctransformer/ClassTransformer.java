package dev.vuis.cctransformer;

import org.objectweb.asm.tree.ClassNode;

@FunctionalInterface
public interface ClassTransformer {
	void transform(ClassNode classNode);
}
