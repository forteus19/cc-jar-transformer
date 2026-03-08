package cccr_inject;

import com.f3rullo14.cloud.G_TcpPacket;
import com.ferullogaming.countercraft.client.cloud.ClientCloudManager;
import com.ferullogaming.countercraft.client.cloud.achievements.AchievementManager;
import com.ferullogaming.countercraft.client.cloud.achievements.CloudAchievement;
import com.ferullogaming.countercraft.client.cloud.item.CloudItem;
import com.ferullogaming.countercraft.client.cloud.item.CloudItemCase;
import com.ferullogaming.countercraft.client.cloud.item.CloudItemRarity;
import com.ferullogaming.countercraft.client.cloud.packet.PacketConsoleCommand;
import com.ferullogaming.countercraft.client.gui.GuiCCMenu;
import com.ferullogaming.countercraft.game.GameHelper;
import com.ferullogaming.countercraft.game.GameManager;
import com.ferullogaming.countercraft.game.IGame;
import com.ferullogaming.countercraft.game.Team;
import com.ferullogaming.countercraft.game.references.GameType;
import com.ferullogaming.countercraft.game.references.MapType;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

@SuppressWarnings("unused")
public final class CCCR {
	private static final MapType MAP_LAPUTA = new MapType(24, "Laputa", "", "F3RULLO14").setImage("laputa");

	private CCCR() {
	}

	public static void noop(int i) {
	}

	public static Object noop(HashMap<?, ?> map, Object o) {
		return 0;
	}

	public static void setGameMaps() {
		for (GameType gameType : GameType.gameTypeList) {
			if (gameType == GameType.GAMEMODE_CASUAL) {
				gameType.setMaps(
					MapType.DUST, MapType.HAUNTS, MapType.MIRAGE, MapType.TOXIC
				);
			} else if (gameType == GameType.GAMEMODE_COMPETITIVE) {
				gameType.setMaps(
					MapType.DUST, MapType.MIRAGE, MapType.TOXIC
				);
			} else if (gameType == GameType.GAME_FREEFORALL) {
				gameType.setMaps(
					MapType.DUST, MapType.HAUNTS, MAP_LAPUTA, MapType.MIRAGE, MapType.RANGE, MapType.TERMINAL
				);
			} else if (gameType == GameType.GAMEMODE_TEAM_DEATHMATCH) {
				gameType.setMaps(
					MapType.DOME, MapType.DUST, MapType.HAUNTS, MAP_LAPUTA, MapType.MIRAGE, MapType.NUKE, MapType.RANGE, MapType.SALVAGE, MapType.TERMINAL
				);
			} else if (gameType != null) {
				gameType.setMaps();
			}
		}
	}

	public static List<String> getNews(GuiCCMenu.NewsText type) {
		switch (type) {
			case NEWS:
				return Arrays.asList(
					"Welcome to CounterCraft: Condition Revived!",
					"",
					"Discord: https://discord.gg/4Z6W9QV2Sp"
				);
			case UPDATES:
				return Arrays.asList(
					"1.0.0-ALPHA-RC7 Changelog:",
					" - Added updates text",
					" - Readded classic AWP Dragon texture",
					" - Fixed incorrect case banner text",
					" - Fixed money in casual and competitive going below $0",
					" - Fixed Dragunov Elite and CZ75 Ghost having the wrong texture",
					" - Fixed M4A4 Nerfed being iron instead of lapis"
				);
			default:
				return Collections.emptyList();
		}
	}

	private static BufferedWriter createWriter(String filename) {
		try {
			return new BufferedWriter(new OutputStreamWriter(Files.newOutputStream(Paths.get(filename), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING)));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public static void printCloudItems() {
		SortedMap<Integer, Field> idMap = new TreeMap<>();

		for (Field itemField : CloudItem.class.getFields()) {
			if (!(Modifier.isStatic(itemField.getModifiers()) && itemField.getType() == CloudItem.class)) {
				continue;
			}
			try {
				idMap.put(((CloudItem) itemField.get(null)).getID(), itemField);
			} catch (IllegalAccessException e) {
				throw new RuntimeException(e);
			}
		}

		try (BufferedWriter writer = createWriter("skins.java")) {
			for (Field itemField : idMap.values()) {
				CloudItem item;
				try {
					item = (CloudItem) itemField.get(null);
				} catch (IllegalAccessException e) {
					throw new RuntimeException(e);
				}
				if (item instanceof CloudItemCase) {
					continue;
				}
				String itemClassName = item.getClass().getSimpleName();

				StringBuilder sb = new StringBuilder();

				sb.append("public static final ");
				sb.append(itemClassName);
				sb.append(" ");
				sb.append(itemField.getName());
				sb.append(" = new ");
				sb.append(itemClassName);
				sb.append("(");
				sb.append(item.getID());
				sb.append(", ");
				sb.append(item.getMCItemID());
				sb.append(", CloudItemRarity.");
				sb.append(rarityName(item.getValue()));
				sb.append(", \"");
				sb.append(item.getDisplayName());
				sb.append("\", ");
				sb.append(item.isDefault());
				sb.append(")");
//				if (item instanceof CloudItemCase) {
//					CloudItemCase caseItem = (CloudItemCase) item;
//
//					Map<CloudItem, Integer> contentCount = new HashMap<>();
//					for (CaseContent content : caseItem.content) {
//						CloudItem contentItem = content.getCloudItem();
//						Integer currentWeight = contentCount.get(content.getCloudItem());
//						if (currentWeight == null) {
//							contentCount.put(contentItem, 1);
//						} else {
//							contentCount.put(contentItem, currentWeight + 1);
//						}
//					}
//
//					for (Map.Entry<CloudItem, Integer> contentEntry : contentCount.entrySet()) {
//						sb.append(System.lineSeparator());
//						sb.append("\t.addContent(");
//						sb.append(idMap.get(contentEntry.getKey().getID()).getName());
//						sb.append(", ");
//						sb.append(contentEntry.getValue());
//						sb.append(")");
//					}
//				}
				sb.append(";");

				writer.append(sb);
				writer.newLine();
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	private static String rarityName(CloudItemRarity rarity) {
		switch (rarity) {
			case DEFAULT:
				return "DEFAULT";
			case TIER1:
				return "COAL";
			case TIER2:
				return "IRON";
			case TIER3:
				return "LAPIS";
			case TIER4:
				return "GOLD";
			case TIER5:
				return "DIAMOND";
			case TIER6:
				return "OBSIDIAN";
			default:
				throw new IllegalArgumentException();
		}
	}

	public static void printAchievements() {
		try (BufferedWriter writer = createWriter("achievements.java")) {
			for (Field field : AchievementManager.class.getFields()) {
				if (field.getType() != CloudAchievement.class) {
					continue;
				}

				CloudAchievement achievement = (CloudAchievement) field.get(null);
				StringBuilder sb = new StringBuilder();

				sb.append("public static final CloudAchievement ");
				sb.append(field.getName());
				sb.append(" = new CloudAchievement(");
				sb.append(achievement.getID());
				sb.append(", \"");
				sb.append(achievement.getName());
				sb.append("\");");

				writer.append(sb);
				writer.newLine();
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public static void logPacket(G_TcpPacket packet) {
		System.out.println("PACKET: " + packet.getClass().getSimpleName());
	}

	public static void writeTeams(DataOutputStream out) throws IOException {
		GameManager gm = GameManager.instance();
		if (gm.matchMakingGame == null) {
			return;
		}

		ArrayList<Team> teams = gm.matchMakingGame.getPlayerHandler().getTeams();
		out.writeInt(teams.size());

		for (Team team : teams) {
			G_TcpPacket.writeString(out, team.teamName);
			out.writeInt(team.getPlayers().size());
		}
	}

	public static void handleCommand(String command) {
		String trimmed = command.trim();
		if (trimmed.isEmpty()) {
			return;
		}
		if (trimmed.charAt(0) == '/') {
			trimmed = trimmed.substring(1);
		}
		ClientCloudManager.sendPacket(new PacketConsoleCommand(trimmed));
	}

	public static void removePlayerEconomy(IGame game, String player, int amount) {
		GameHelper.setPlayerGameValue(game, player, "economy", Math.max(0, GameHelper.getPlayerGameValue(game, player, "economy") - amount));
	}
}
