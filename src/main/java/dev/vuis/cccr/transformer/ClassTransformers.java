package dev.vuis.cccr.transformer;

import java.util.Map;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.JumpInsnNode;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.VarInsnNode;

public final class ClassTransformers {
	public static final Map<String, ClassTransformer> TRANSFORMERS = Map.ofEntries(
		Map.entry("com/ferullogaming/countercraft/ClientSessionHandler", ClassTransformers::transformClientSessionHandler),
		Map.entry("com/ferullogaming/countercraft/client/ClientManager", ClassTransformers::transformClientManager),
		Map.entry("com/ferullogaming/countercraft/client/NewsManager", ClassTransformers::transformNewsManager),
		Map.entry("com/ferullogaming/countercraft/game/GameManager", ClassTransformers::transformGameManager)
	);

	private ClassTransformers() {
	}

	private static boolean matchMethod(MethodNode method, String name, String desc) {
		return method.name.equals(name) && method.desc.equals(desc);
	}

	private static void resetMethodInfo(MethodNode method) {
		method.instructions.clear();
		method.tryCatchBlocks.clear();
		method.localVariables.clear();
		method.maxStack = 0;
		method.maxLocals = 0;
	}

	private static void transformClientSessionHandler(ClassNode classNode) {
		// bypass session login request
		MethodNode handleClientSessionLoginMethod = null;
		for (MethodNode method : classNode.methods) {
			if (matchMethod(method, "handleClientSessionLogin", "()Z")) {
				handleClientSessionLoginMethod = method;
			}
		}
		if (handleClientSessionLoginMethod == null) {
			throw new IllegalStateException("ClientSessionManager#handleClientSessionLogin()Z does not exist");
		}

		{
			InsnList insns = new InsnList();
			insns.add(new InsnNode(Opcodes.ICONST_1));
			insns.add(new InsnNode(Opcodes.IRETURN));

			resetMethodInfo(handleClientSessionLoginMethod);
			handleClientSessionLoginMethod.instructions.insert(insns);
		}
	}

	private static void transformCloudAddress(MethodNode method) {
		for (AbstractInsnNode insn : method.instructions) {
			if (insn instanceof LdcInsnNode ldcInsn) {
				if (ldcInsn.cst.equals("eu.mcdecimation.net")) {
					ldcInsn.cst = "71.76.35.25";
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

	private static void transformNewsManager(ClassNode classNode) {
		MethodNode getNewsAsStringListMethod = null;
		for (MethodNode method : classNode.methods) {
			if (matchMethod(method, "getNewsAsStringList", "(Lcom/ferullogaming/countercraft/client/gui/GuiCCMenu$NewsText;)Ljava/util/List;")) {
				getNewsAsStringListMethod = method;
			}
		}
		if (getNewsAsStringListMethod == null) {
			throw new IllegalStateException("NewsManager#getNewsAsStringList(Lcom/ferullogaming/countercraft/client/gui/GuiCCMenu$NewsText;)Ljava/util/List; does not exist");
		}

		{
			InsnList insns = new InsnList();
			LabelNode emptyListLabel = new LabelNode();

			insns.add(new VarInsnNode(Opcodes.ALOAD, 0));
			insns.add(new FieldInsnNode(
				Opcodes.GETSTATIC,
				"com/ferullogaming/countercraft/client/gui/GuiCCMenu$NewsText",
				"NEWS",
				"Lcom/ferullogaming/countercraft/client/gui/GuiCCMenu$NewsText;"
			));
			insns.add(new JumpInsnNode(Opcodes.IF_ACMPNE, emptyListLabel));

			insns.add(new LdcInsnNode("Welcome to CounterCraft: Condition Revived!"));
			insns.add(new MethodInsnNode(
				Opcodes.INVOKESTATIC,
				"java/util/Collections",
				"singletonList",
				"(Ljava/lang/Object;)Ljava/util/List;"
			));
			insns.add(new InsnNode(Opcodes.ARETURN));

			insns.add(emptyListLabel);
			insns.add(new MethodInsnNode(
				Opcodes.INVOKESTATIC,
				"java/util/Collections",
				"emptyList",
				"()Ljava/util/List;"
			));
			insns.add(new InsnNode(Opcodes.ARETURN));

			resetMethodInfo(getNewsAsStringListMethod);
			getNewsAsStringListMethod.instructions.insert(insns);
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
			throw new IllegalStateException("GameManager#onServerStopped()V does not exist");
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
