package dev.vuis.cctransformer;

import java.util.Map;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.MethodNode;

public final class ClassTransformers {
	public static final Map<String, ClassTransformer> TRANSFORMERS = Map.ofEntries(
		Map.entry(
			"com/ferullogaming/countercraft/client/ClientManager",
			ClassTransformers::transformClientManager
		)
	);

	private ClassTransformers() {
	}

	private static boolean matchMethod(MethodNode method, String name, String desc) {
		return method.name.equals(name) && method.desc.equals(desc);
	}

	private static void transformCloudAddress(MethodNode method) {
		for (AbstractInsnNode insn : method.instructions) {
			if (insn instanceof LdcInsnNode ldcInsn) {
				if (ldcInsn.cst instanceof String cstString) {
					if (cstString.equals("eu.mcdecimation.net")) {
						ldcInsn.cst = "127.0.0.1";
					}
				}
			}
		}
	}

	private static void transformClientManager(ClassNode classNode) {
		for (MethodNode method : classNode.methods) {
			if (matchMethod(method, "<init>", "()V") ||
				matchMethod(method, "preInit", "(Lcpw/mods/fml/common/event/FMLPreInitializationEvent;)V")
			) {
				transformCloudAddress(method);
			}
		}
	}
}
