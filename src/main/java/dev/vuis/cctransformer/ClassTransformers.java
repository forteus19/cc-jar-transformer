package dev.vuis.cctransformer;

import java.util.Map;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.JumpInsnNode;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;

public final class ClassTransformers {
	public static final Map<String, ClassTransformer> TRANSFORMERS = Map.ofEntries(
		Map.entry(
			"com/ferullogaming/countercraft/client/ClientManager",
			ClassTransformers::transformClientManager
		),
		Map.entry(
			"com/ferullogaming/countercraft/game/GameManager",
			ClassTransformers::transformGameManager
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
				if (ldcInsn.cst.equals("eu.mcdecimation.net")) {
					ldcInsn.cst = "127.0.0.1";
				}
			}
		}
	}

	private static void transformClientManager(ClassNode classNode) {
		// cloud address
		// TODO: make configurable
		for (MethodNode method : classNode.methods) {
			if (matchMethod(method, "<init>", "()V") ||
				matchMethod(method, "preInit", "(Lcpw/mods/fml/common/event/FMLPreInitializationEvent;)V")
			) {
				transformCloudAddress(method);
			}
		}
	}

	private static void transformGameManager(ClassNode classNode) {
		// server manager null check, fixes crash upon leaving singleplayer world
		MethodNode onServerStoppedMethod = null;
		for (MethodNode method : classNode.methods) {
			if (matchMethod(method, "onServerStopped", "()V")) {
				onServerStoppedMethod = method;
			}
		}
		if (onServerStoppedMethod == null) {
			throw new IllegalStateException("onServerStopped()V does not exist");
		}

		{
			InsnList insns = new InsnList();
			LabelNode continueLabel = new LabelNode();
			insns.add(new MethodInsnNode(
				Opcodes.INVOKESTATIC,
				"com/ferullogaming/countercraft/server/ServerManager",
				"instance",
				"()Lcom/ferullogaming/countercraft/server/ServerManager;"
			));
			insns.add(new JumpInsnNode(Opcodes.IFNONNULL, continueLabel));
			insns.add(new InsnNode(Opcodes.RETURN));
			insns.add(continueLabel);

			onServerStoppedMethod.instructions.insert(insns);
		}
	}
}
