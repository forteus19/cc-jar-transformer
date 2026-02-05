package cccr_inject;

import com.f3rullo14.cloud.G_TcpPacket;
import com.ferullogaming.countercraft.client.cloud.item.CaseContent;
import com.ferullogaming.countercraft.client.cloud.item.CloudItem;
import com.ferullogaming.countercraft.client.cloud.item.CloudItemCase;
import com.ferullogaming.countercraft.client.cloud.item.CloudItemGun;
import com.ferullogaming.countercraft.client.cloud.item.CloudItemRarity;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public final class CCCR {
	private CCCR() {
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

		try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(Files.newOutputStream(Paths.get("skins.java"), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING)))) {
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
				if (item instanceof CloudItemGun) {
					sb.append(", ");
					sb.append(item.getMCItemID());
				}
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

	public static void logPacket(G_TcpPacket packet) {
		System.out.println("PACKET: " + packet.getClass().getSimpleName());
	}
}
