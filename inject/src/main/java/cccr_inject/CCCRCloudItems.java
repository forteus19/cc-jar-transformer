package cccr_inject;

import com.ferullogaming.countercraft.client.cloud.item.CloudItem;
import com.ferullogaming.countercraft.client.cloud.item.CloudItemCase;
import com.ferullogaming.countercraft.client.cloud.item.CloudItemGun;
import com.ferullogaming.countercraft.client.cloud.item.CloudItemKey;
import com.ferullogaming.countercraft.client.cloud.item.CloudItemKnife;
import com.ferullogaming.countercraft.client.cloud.item.CloudItemRarity;

@SuppressWarnings("unused")
public final class CCCRCloudItems {
	public static final CloudItem M4A4_CYREX = new CloudItemGun(108, 4000, "M4A4").setSuffix("Cyrex").setValue(CloudItemRarity.TIER3).setCollection("Prealpha").setFilterMT("rifle");
	public static final CloudItem AK47_VULCAN = new CloudItemGun(207, 4001, "AK47").setSuffix("Vulcan").setValue(CloudItemRarity.TIER5).setCollection("Prealpha").setFilterMT("rifle");
	public static final CloudItem FAMAS_PULSE = new CloudItemGun(304, 4002, "Famas").setSuffix("Pulse").setValue(CloudItemRarity.TIER3).setCollection("Prealpha").setFilterMT("rifle");
	public static final CloudItem FNFAL_STAIN = new CloudItemGun(403, 4003, "FN FAL").setSuffix("Stain").setValue(CloudItemRarity.TIER2).setCollection("Prealpha").setFilterMT("rifle");
	public static final CloudItem M1911_RAIN = new CloudItemGun(503, 4010, "M1911").setSuffix("Rain").setValue(CloudItemRarity.TIER1).setCollection("Prealpha").setFilterMT("pistol");
	public static final CloudItem G18_FADE = new CloudItemGun(604, 4011, "G18").setSuffix("Fade").setValue(CloudItemRarity.TIER4).setCollection("Prealpha").setFilterMT("pistol");
	public static final CloudItem DEAGLE_NAVY = new CloudItemGun(704, 4012, "Deagle").setSuffix("Navy").setValue(CloudItemRarity.TIER1).setCollection("Prealpha").setFilterMT("pistol");
	public static final CloudItem P250_ARCTIC = new CloudItemGun(755, 4013, "P250").setSuffix("Arctic").setValue(CloudItemRarity.TIER1).setCollection("Prealpha").setFilterMT("pistol");
	public static final CloudItem P90_RUBY = new CloudItemGun(803, 4020, "P90").setSuffix("Ruby").setValue(CloudItemRarity.TIER2).setCollection("Prealpha").setFilterMT("smg");
	public static final CloudItem MAC10_VIOLET = new CloudItemGun(903, 4021, "MAC10").setSuffix("Violet").setValue(CloudItemRarity.TIER3).setCollection("Prealpha").setFilterMT("smg");
	public static final CloudItem VECTOR_ARCTIC = new CloudItemGun(1003, 4022, "Vector").setSuffix("Arctic").setValue(CloudItemRarity.TIER4).setCollection("Prealpha").setFilterMT("smg");
	public static final CloudItem AWP_LIGHTNING = new CloudItemGun(1107, 4030, "AWP").setSuffix("Lightning").setValue(CloudItemRarity.TIER5).setCollection("Prealpha").setFilterMT("sniper");
	public static final CloudItem DRAGUNOV_JUNGLE = new CloudItemGun(1203, 4031, "Dragunov").setSuffix("Jungle").setValue(CloudItemRarity.TIER2).setCollection("Prealpha").setFilterMT("sniper");
	public static final CloudItem SCAR20_ELITE = new CloudItemGun(1303, 4032, "Scar20").setSuffix("Elite").setValue(CloudItemRarity.TIER1).setCollection("Prealpha").setFilterMT("sniper");

	public static final CloudItem GUN_DISPLAY_LAPIS = new CloudItemGun(5000, 6000, "Lapis").setSuffix("Collection").setValue(CloudItemRarity.TIER3);
	public static final CloudItem GUN_DISPLAY_GOLD = new CloudItemGun(5001, 6001, "Gold").setSuffix("Collection").setValue(CloudItemRarity.TIER4);
	public static final CloudItem GUN_DISPLAY_DIAMOND = new CloudItemGun(5002, 6002, "Diamond").setSuffix("Collection").setValue(CloudItemRarity.TIER5);
	public static final CloudItem GUN_DISPLAY_OBSIDIAN = new CloudItemGun(5003, 6003, "Obsidian").setSuffix("Collection").setValue(CloudItemRarity.TIER6);

	public static final CloudItem KNIFE_TAC_PRESTIGE = new CloudItemKnife(1508, 4208, "Tac Knife").setSuffix("Prestige").setValue(CloudItemRarity.TIER6).setFilterMT("knife");
	public static final CloudItem KNIFE_BAY_PRESTIGE = new CloudItemKnife(1518, 4218, "Bayonet").setSuffix("Prestige").setValue(CloudItemRarity.TIER6).setFilterMT("knife");
	public static final CloudItem KNIFE_KAR_PRESTIGE = new CloudItemKnife(1528, 4228, "Karambit").setSuffix("Prestige").setValue(CloudItemRarity.TIER6).setFilterMT("knife");
	public static final CloudItem KNIFE_BFL_PRESTIGE = new CloudItemKnife(1531, 4231, "Butterfly").setSuffix("Prestige").setValue(CloudItemRarity.TIER6).setFilterMT("knife");

	public static final CloudItem CASE_KEY_PREALPHA = new CloudItemKey(4506, 5506, "Key").setSuffix("Prealpha").setValue(CloudItemRarity.TIER1);
	public static final CloudItem CASE_KEY_PRESTIGE = new CloudItemKey(4507, 5507, "Key").setSuffix("Prestige").setValue(CloudItemRarity.TIER1);

	public static final CloudItem CASE_PREALPHA = new CloudItemCase(2006, 4106, "Prealpha", 4506)
		.addContent(CloudItem.KNIFE_TAC_DISPLAY, 1)
		.addContent(AK47_VULCAN, 3)
		.addContent(AWP_LIGHTNING, 4)
		.addContent(G18_FADE, 10)
		.addContent(VECTOR_ARCTIC, 12)
		.addContent(MAC10_VIOLET, 25)
		.addContent(M4A4_CYREX, 30)
		.addContent(FAMAS_PULSE, 35)
		.addContent(FNFAL_STAIN, 55)
		.addContent(DRAGUNOV_JUNGLE, 60)
		.addContent(P90_RUBY, 65)
		.addContent(SCAR20_ELITE, 80)
		.addContent(DEAGLE_NAVY, 90)
		.addContent(P250_ARCTIC, 100)
		.addContent(M1911_RAIN, 100)
		.setSuffix("Case").setValue(CloudItemRarity.TIER1).setFilterMT("case").disableNameable().disableShowcase().disableContracts();
	public static final CloudItem CASE_PRESTIGE = new CloudItemCase(2007, 4107, "Prestige", 4507)
		.addContent(CloudItem.KNIFE_TAC_DISPLAY, 0)
		.addContent(GUN_DISPLAY_OBSIDIAN, 0)
		.addContent(GUN_DISPLAY_DIAMOND, 0)
		.addContent(GUN_DISPLAY_GOLD, 0)
		.addContent(GUN_DISPLAY_LAPIS, 0)
		.setSuffix("Case").setValue(CloudItemRarity.TIER6).setFilterMT("case").disableNameable().disableShowcase().disableContracts();

	private CCCRCloudItems() {
	}

	public static void noop() {
	}
}
