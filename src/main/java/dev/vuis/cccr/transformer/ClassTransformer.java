package dev.vuis.cccr.transformer;

import org.objectweb.asm.tree.ClassNode;

@FunctionalInterface
public interface ClassTransformer {
	void transform(ClassNode classNode);
}
