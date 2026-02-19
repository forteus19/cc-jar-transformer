package dev.vuis.cccr.transformer;

import java.util.Map;
import java.util.NoSuchElementException;
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
//		Map.entry("com/ferullogaming/countercraft/ClientSessionHandler", ClassTransformers::transformClientSessionHandler),
		Map.entry("com/ferullogaming/countercraft/CommonTickHandler", ClassTransformers::transformCommonTickHandler),
		Map.entry("com/ferullogaming/countercraft/CounterCraft", ClassTransformers::transformCounterCraft),
//		Map.entry("com/ferullogaming/countercraft/References", ClassTransformers::transformReferences), // 1.5.1a
		Map.entry("com/ferullogaming/countercraft/client/ClientManager", ClassTransformers::transformClientManager),
		Map.entry("com/ferullogaming/countercraft/client/ClientProxy", ClassTransformers::transformClientProxy),
		Map.entry("com/ferullogaming/countercraft/client/NewsManager", ClassTransformers::transformNewsManager),
		Map.entry("com/ferullogaming/countercraft/client/cloud/ClientCloudManager", ClassTransformers::transformClientCloudManager),
		Map.entry("com/ferullogaming/countercraft/client/cloud/command/LocalCommandHandler", ClassTransformers::transformLocalCommandHandler),
		Map.entry("com/ferullogaming/countercraft/client/cloud/item/CloudItem", ClassTransformers::transformCloudItem),
		Map.entry("com/ferullogaming/countercraft/client/cloud/packet/server/PacketServerGameStatus", ClassTransformers::transformPacketServerGameStatus),
		Map.entry("com/ferullogaming/countercraft/client/gui/GuiCCDDMCommunity", ClassTransformers::transformGuiCCDDMCommunity),
		Map.entry("com/ferullogaming/countercraft/game/GameManager", ClassTransformers::transformGameManager),
		Map.entry("com/ferullogaming/countercraft/game/references/GameType", ClassTransformers::transformGameType),
		Map.entry("com/ferullogaming/countercraft/item/ItemManager", ClassTransformers::transformItemManager)
	);

	private ClassTransformers() {
	}

	private static boolean matchMethod(MethodNode method, String name, String desc) {
		return method.name.equals(name) && method.desc.equals(desc);
	}

	private static boolean matchMethod(MethodInsnNode methodInsn, String owner, String name, String desc) {
		return methodInsn.owner.equals(owner) && methodInsn.name.equals(name) && methodInsn.desc.equals(desc);
	}

	private static MethodNode getMethod(ClassNode classNode, String name, String desc) {
		return classNode.methods.stream().filter(m -> matchMethod(m, name, desc)).findFirst().orElseThrow(
			() -> new NoSuchElementException(String.format("Method %s%s does not exist in %s", name, desc, classNode.name))
		);
	}

	private static void resetMethodInfo(MethodNode method, boolean clearInsns) {
		if (clearInsns) {
			method.instructions.clear();
		}
		method.tryCatchBlocks.clear();
		method.localVariables.clear();
		method.maxStack = 0;
		method.maxLocals = 0;
	}

	private static void insertTail(MethodNode method, InsnList insns) {
		InsnList methodInsns = method.instructions;

		if (methodInsns.size() == 0) {
			methodInsns.insert(insns);
		}

		AbstractInsnNode lastReturn = methodInsns.getLast();
		while (!(lastReturn.getOpcode() >= 172 && lastReturn.getOpcode() <= 177)) {
			lastReturn = lastReturn.getPrevious();
		}
		methodInsns.insertBefore(lastReturn, insns);
	}

	private static void redirectSystemExit(MethodNode method) {
		for (AbstractInsnNode insn : method.instructions) {
			if (insn.getOpcode() == Opcodes.INVOKESTATIC && insn instanceof MethodInsnNode methodInsn && matchMethod(methodInsn, "java/lang/System", "exit", "(I)V")) {
				methodInsn.owner = "cccr_inject/CCCR";
				methodInsn.name = "noop";
			}
		}
	}

	private static void transformClientSessionHandler(ClassNode classNode) {
		// bypass session login request
		MethodNode handleClientSessionLoginMethod = getMethod(classNode, "handleClientSessionLogin", "()Z");

		{
			// REPLACE
			// return true;

			InsnList insns = new InsnList();
			insns.add(new InsnNode(Opcodes.ICONST_1));
			insns.add(new InsnNode(Opcodes.IRETURN));

			resetMethodInfo(handleClientSessionLoginMethod, true);
			handleClientSessionLoginMethod.instructions.insert(insns);
		}
	}

	private static void transformCommonTickHandler(ClassNode classNode) {
		MethodNode onTickEndPlayerMethod = getMethod(classNode, "onTickEndPlayer", "(Lnet/minecraft/entity/player/EntityPlayer;)V");

		{
			// TAIL
			// player.field_71075_bZ.field_75101_c = true;

			InsnList insns = new InsnList();
			insns.add(new VarInsnNode(Opcodes.ALOAD, 1));
			insns.add(new FieldInsnNode(
				Opcodes.GETFIELD,
				"net/minecraft/entity/player/EntityPlayer",
				"field_71075_bZ",
				"Lnet/minecraft/entity/player/PlayerCapabilities;"
			));
			insns.add(new InsnNode(Opcodes.ICONST_1));
			insns.add(new FieldInsnNode(
				Opcodes.PUTFIELD,
				"net/minecraft/entity/player/PlayerCapabilities",
				"field_75101_c",
				"Z"
			));

			insertTail(onTickEndPlayerMethod, insns);
		}
	}

	private static void transformCounterCraft(ClassNode classNode) {
//		MethodNode onPreInitMethod = getMethod(classNode, "onPreInit", "(Lcpw/mods/fml/common/event/FMLPreInitializationEvent;)V");
//
//		{
//			onPreInitMethod.instructions.insert(new MethodInsnNode(
//				Opcodes.INVOKESTATIC,
//				"cccr_inject/CCCR",
//				"printCloudItems",
//				"()V"
//			));
//		}

		redirectSystemExit(getMethod(classNode, "postInit", "(Lcpw/mods/fml/common/event/FMLPostInitializationEvent;)V"));

//		MethodNode serverStartMethod = getMethod(classNode, "serverStart", "(Lcpw/mods/fml/common/event/FMLServerStartingEvent;)V");
//
//		{
//			// HEAD
//			// event.registerServerCommand(new DoWeatherCycleCommand());
//
//			InsnList insns = new InsnList();
//			insns.add(new VarInsnNode(Opcodes.ALOAD, 1));
//			insns.add(new TypeInsnNode(Opcodes.NEW, "cccr_inject/DoWeatherCycleCommand"));
//			insns.add(new InsnNode(Opcodes.DUP));
//			insns.add(new MethodInsnNode(
//				Opcodes.INVOKESPECIAL,
//				"cccr_inject/DoWeatherCycleCommand",
//				"<init>",
//				"()V"
//			));
//			insns.add(new MethodInsnNode(
//				Opcodes.INVOKEVIRTUAL,
//				"cpw/mods/fml/common/event/FMLServerStartingEvent",
//				"registerServerCommand",
//				"(Lnet/minecraft/command/ICommand;)V"
//			));
//
//			serverStartMethod.instructions.insert(insns);
//		}
	}

	private static void transformCloudAddress(MethodNode method) {
		for (AbstractInsnNode insn : method.instructions) {
			if (insn instanceof LdcInsnNode ldcInsn) {
				if (ldcInsn.cst.equals("eu.mcdecimation.net")) {
					ldcInsn.cst = Main.cloudHost;
				}
			}
		}
	}

	private static void transformReferences(ClassNode classNode) {
		transformCloudAddress(getMethod(classNode, "<clinit>", "()V"));
	}

	private static void transformClientManager(ClassNode classNode) {
		transformCloudAddress(getMethod(classNode, "<init>", "()V"));
		transformCloudAddress(getMethod(classNode, "preInit", "(Lcpw/mods/fml/common/event/FMLPreInitializationEvent;)V"));
	}

	private static void transformClientProxy(ClassNode classNode) {
		MethodNode loadMethod = getMethod(classNode, "load", "()V");
		redirectSystemExit(loadMethod);

		{
			loadMethod.instructions.insert(new MethodInsnNode(
				Opcodes.INVOKESTATIC,
				"cccr_inject/CCCRClientProxy",
				"load",
				"()V"
			));
		}
	}

	private static void transformNewsManager(ClassNode classNode) {
		MethodNode getNewsAsStringListMethod = getMethod(classNode, "getNewsAsStringList", "(Lcom/ferullogaming/countercraft/client/gui/GuiCCMenu$NewsText;)Ljava/util/List;");

		{
			// REPLACE
			// if (givenEnum == GuiCCMenu.NewsText.NEWS) {
			//     return Collections.singletonList("Welcome to CounterCraft: Condition Revived!");
			// } else {
			//     return Collections.emptyList();
			// }

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

			resetMethodInfo(getNewsAsStringListMethod, true);
			getNewsAsStringListMethod.instructions.insert(insns);
		}
	}

	private static void transformClientCloudManager(ClassNode classNode) {
		for (AbstractInsnNode insn : getMethod(classNode, "<init>", "(Ljava/lang/String;)V").instructions) {
			if (insn instanceof LdcInsnNode ldcInsn) {
				if (ldcInsn.cst.equals(1923)) {
					ldcInsn.cst = Main.cloudPort;
				}
			}
		}

//		MethodNode sendPacketMethod = getMethod(classNode, "sendPacket", "(Lcom/f3rullo14/cloud/G_TcpPacket;)V");
//
//		{
//			InsnList insns = new InsnList();
//			insns.add(new VarInsnNode(Opcodes.ALOAD, 0));
//			insns.add(new MethodInsnNode(
//				Opcodes.INVOKESTATIC,
//				"cccr_inject/CCCR",
//				"logPacket",
//				"(Lcom/f3rullo14/cloud/G_TcpPacket;)V"
//			));
//
//			sendPacketMethod.instructions.insert(insns);
//		}
	}

	private static void transformLocalCommandHandler(ClassNode classNode) {
		MethodNode handleCommandPresendMethod = getMethod(classNode, "handleCommandPresend", "(Lcom/ferullogaming/countercraft/client/cloud/command/ICommandSender;Ljava/lang/String;)V");

		{
			InsnList insns = new InsnList();
			insns.add(new VarInsnNode(Opcodes.ALOAD, 2));
			insns.add(new MethodInsnNode(
				Opcodes.INVOKESTATIC,
				"cccr_inject/CCCR",
				"handleCommand",
				"(Ljava/lang/String;)V"
			));
			insns.add(new InsnNode(Opcodes.RETURN));

			resetMethodInfo(handleCommandPresendMethod, true);
			handleCommandPresendMethod.instructions.insert(insns);
		}
	}

	private static void transformCloudItem(ClassNode classNode) {
		MethodNode clinitMethod = getMethod(classNode, "<clinit>", "()V");

		{
			InsnList insns = new InsnList();
			insns.add(new MethodInsnNode(
				Opcodes.INVOKESTATIC,
				"cccr_inject/CCCRCloudItems",
				"noop",
				"()V"
			));

			insertTail(clinitMethod, insns);
		}
	}

	private static void transformPacketServerGameStatus(ClassNode classNode) {
		MethodNode writePacketToStreamMethod = getMethod(classNode, "writePacketToStream", "(Ljava/io/DataOutputStream;)V");

		{
			InsnList insns = new InsnList();
			insns.add(new VarInsnNode(Opcodes.ALOAD, 1));
			insns.add(new MethodInsnNode(
				Opcodes.INVOKESTATIC,
				"cccr_inject/CCCR",
				"writeTeams",
				"(Ljava/io/DataOutputStream;)V"
			));

			insertTail(writePacketToStreamMethod, insns);
		}
	}

	private static void transformGuiCCDDMCommunity(ClassNode classNode) {
		// discord link change
		for (AbstractInsnNode insn : getMethod(classNode, "onResult", "(IZ)V").instructions) {
			if (insn instanceof LdcInsnNode ldcInsn && ldcInsn.cst.equals("https://discord.gg/BoehMod")) {
				ldcInsn.cst = "https://discord.gg/4Z6W9QV2Sp";
			}
		}
	}

	private static void transformGameManager(ClassNode classNode) {
		// incorrect tags fix
		for (AbstractInsnNode insn : getMethod(classNode, "onServerStarted", "()V").instructions) {
			if (insn instanceof LdcInsnNode ldcInsn && ldcInsn.cst instanceof String cst) {
				switch (cst) {
					case "name" -> ldcInsn.cst = "gn";
					case "type" -> ldcInsn.cst = "gt";
					case "map" -> ldcInsn.cst = "gm";
					case "time" -> ldcInsn.cst = "mt";
				}
			}
		}

		// server manager null check, fixes crash upon leaving singleplayer world
		MethodNode onServerStoppedMethod = getMethod(classNode, "onServerStopped", "()V");

		{
			// HEAD
			// if (ServerManager.instance() != null) {
			//     ...
			// }

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

	private static void transformGameType(ClassNode classNode) {
		MethodNode clinitMethod = getMethod(classNode, "<clinit>", "()V");

		{
			// TAIL
			// CCCR.setGameMaps();

			InsnList insns = new InsnList();
			insns.add(new MethodInsnNode(
				Opcodes.INVOKESTATIC,
				"cccr_inject/CCCR",
				"setGameMaps",
				"()V"
			));

			insertTail(clinitMethod, insns);
		}
	}

	private static void transformItemManager(ClassNode classNode) {
		MethodNode getDataMethod = getMethod(classNode, "getData", "()V");

		{
			InsnList insns = new InsnList();
			insns.add(new MethodInsnNode(
				Opcodes.INVOKESTATIC,
				"cccr_inject/CCCRItems",
				"getData",
				"()V"
			));
			insns.add(new MethodInsnNode(
				Opcodes.INVOKESTATIC,
				"cccr_inject/CCCR",
				"printAchievements",
				"()V"
			));

			insertTail(getDataMethod, insns);
		}
	}
}
