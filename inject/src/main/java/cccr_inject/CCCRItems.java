package cccr_inject;

import com.ferullogaming.countercraft.client.anim.KnifeAnimationInspect;
import com.ferullogaming.countercraft.client.anim.KnifeAnimationInspectButterfly;
import com.ferullogaming.countercraft.client.anim.KnifeAnimationInspectKarambit;
import com.ferullogaming.countercraft.client.anim.KnifeAnimationInspectTac;
import com.ferullogaming.countercraft.item.ItemCase;
import com.ferullogaming.countercraft.item.ItemKey;
import com.ferullogaming.countercraft.item.ItemKnife;
import com.ferullogaming.countercraft.item.gun.ItemGun;
import net.minecraft.item.Item;

@SuppressWarnings("unused")
public final class CCCRItems {
	public static Item knifeTacticalPrestige;
	public static Item knifeBayonetPrestige;
	public static Item knifeKarambitPrestige;
	public static Item knifeButterflyPrestige;
	public static Item casePrealpha;
	public static Item casePrestige;
	public static Item caseBlaze;
	public static Item keyCasePrealpha;
	public static Item keyCasePrestige;
	public static Item keyCaseBlaze;
	public static Item gunDisplayLapis;
	public static Item gunDisplayGold;
	public static Item gunDisplayDiamond;
	public static Item gunDisplayObsidan;

	private CCCRItems() {
	}

	public static void getData() {
		knifeTacticalPrestige = new ItemKnife(4208).setAnimationInspecting(KnifeAnimationInspectTac.class).setCCItemDisplayName("Prestige Tac Knife").setCCItemTextureName("blueknife");
		knifeBayonetPrestige = new ItemKnife(4218).setAnimationInspecting(KnifeAnimationInspect.class).setCCItemDisplayName("Prestige Bayonet").setCCItemTextureName("blueknife");
		knifeKarambitPrestige = new ItemKnife(4228).setAnimationInspecting(KnifeAnimationInspectKarambit.class).setCCItemDisplayName("Karambit Prestige").setCCItemTextureName("blueknife");
		knifeButterflyPrestige = new ItemKnife(4231).setAnimationInspecting(KnifeAnimationInspectButterfly.class).setCCItemDisplayName("Butterfly Prestige").setCCItemTextureName("blueknife");
		casePrealpha = new ItemCase(4106).setCCItemDisplayName("Prealpha Case").setCCItemTextureName("caseprealpha");
		casePrestige = new ItemCase(4107).setCCItemDisplayName("Prestige Case").setCCItemTextureName("caseprestige");
		caseBlaze = new ItemCase(4108).setCCItemDisplayName("Blaze Case").setCCItemTextureName("caseblaze");
		keyCasePrealpha = new ItemKey(5506).setCCItemDisplayName("Key").setCCItemTextureName("casekey_prealpha");
		keyCasePrestige = new ItemKey(5507).setCCItemDisplayName("Key").setCCItemTextureName("casekey_prestige");
		keyCaseBlaze = new ItemKey(5508).setCCItemDisplayName("Key").setCCItemTextureName("casekey_blaze");
		gunDisplayLapis = new ItemGun(6000, 0, 0, 0, 0, 0).setCCItemDisplayName("Gun Display Lapis").setCCItemTextureName("gundisplay_lapis");
		gunDisplayGold = new ItemGun(6001, 0, 0, 0, 0, 0).setCCItemDisplayName("Gun Display Gold").setCCItemTextureName("gundisplay_gold");
		gunDisplayDiamond = new ItemGun(6002, 0, 0, 0, 0, 0).setCCItemDisplayName("Gun Display Diamond").setCCItemTextureName("gundisplay_diamond");
		gunDisplayObsidan = new ItemGun(6003, 0, 0, 0, 0, 0).setCCItemDisplayName("Gun Display Obsidian").setCCItemTextureName("gundisplay_obsidian");
	}
}
