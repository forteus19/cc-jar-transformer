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
	public static Item knifeTacticalAutotronic;
	public static Item knifeTacticalBlackout;
	public static Item knifeTacticalRuby;
	public static Item knifeTacticalFade;
	public static Item knifeTacticalRust;
	public static Item knifeTacticalEtherfire;
	public static Item knifeTacticalWatermelon;
	public static Item knifeTacticalInverted;

	public static Item knifeBayonetPrestige;
	public static Item knifeBayonetAutotronic;
	public static Item knifeBayonetBlackout;
	public static Item knifeBayonetRuby;
	public static Item knifeBayonetFade;
	public static Item knifeBayonetRust;
	public static Item knifeBayonetEtherfire;
	public static Item knifeBayonetWatermelon;
	public static Item knifeBayonetInverted;

	public static Item knifeKarambitPrestige;
	public static Item knifeKarambitAutotronic;
	public static Item knifeKarambitBlackout;
	public static Item knifeKarambitRuby;
	public static Item knifeKarambitFade;
	public static Item knifeKarambitRust;
	public static Item knifeKarambitEtherfire;
	public static Item knifeKarambitWatermelon;
	public static Item knifeKarambitInverted;

	public static Item knifeButterflyMarble;
	public static Item knifeButterflyTiger;
	public static Item knifeButterflySteel;
	public static Item knifeButterflyDoppler;
	public static Item knifeButterflyLore;
	public static Item knifeButterflyGamma;
	public static Item knifeButterflyPrestige;
	public static Item knifeButterflyAutotronic;
	public static Item knifeButterflyBlackout;
	public static Item knifeButterflyRuby;
	public static Item knifeButterflyFade;
	public static Item knifeButterflyRust;
	public static Item knifeButterflyEtherfire;
	public static Item knifeButterflyWatermelon;
	public static Item knifeButterflyInverted;

	public static Item caseChronical;
	public static Item caseMythic;
	public static Item caseOasis;
	public static Item caseClash;
	public static Item caseElemental;
	public static Item caseRevolution;
	public static Item caseVectorized;
	public static Item caseBiomechanic;
	public static Item casePhantasmagoria;
	public static Item caseSepulcher;

	public static Item keyCaseChronical;
	public static Item keyCaseMythic;
	public static Item keyCaseOasis;
	public static Item keyCaseClash;
	public static Item keyCaseElemental;
	public static Item keyCaseRevolution;
	public static Item keyCaseVectorized;
	public static Item keyCaseBiomechanic;
	public static Item keyCasePhantasmagoria;
	public static Item keyCaseSepulcher;

	public static Item gunDisplayLapis;
	public static Item gunDisplayGold;
	public static Item gunDisplayDiamond;
	public static Item gunDisplayObsidan;

	private CCCRItems() {
	}

	public static void getData() {
		knifeTacticalPrestige = new ItemKnife(4208).setAnimationInspecting(KnifeAnimationInspectTac.class).setCCItemDisplayName("Prestige Tac Knife").setCCItemTextureName("blueknife");
		knifeTacticalAutotronic = new ItemKnife(4209).setAnimationInspecting(KnifeAnimationInspectTac.class).setCCItemDisplayName("Autotronic Tac Knife").setCCItemTextureName("blueknife");
		knifeTacticalBlackout = new ItemKnife(4240).setAnimationInspecting(KnifeAnimationInspectTac.class).setCCItemDisplayName("Blackout Tac Knife").setCCItemTextureName("blueknife");
		knifeTacticalRuby = new ItemKnife(4241).setAnimationInspecting(KnifeAnimationInspectTac.class).setCCItemDisplayName("Ruby Tac Knife").setCCItemTextureName("blueknife");
		knifeTacticalFade = new ItemKnife(4242).setAnimationInspecting(KnifeAnimationInspectTac.class).setCCItemDisplayName("Fade Tac Knife").setCCItemTextureName("blueknife");
		knifeTacticalRust = new ItemKnife(4243).setAnimationInspecting(KnifeAnimationInspectTac.class).setCCItemDisplayName("Rust Tac Knife").setCCItemTextureName("blueknife");
		knifeTacticalEtherfire = new ItemKnife(4244).setAnimationInspecting(KnifeAnimationInspectTac.class).setCCItemDisplayName("Etherfire Tac Knife").setCCItemTextureName("blueknife");
		knifeTacticalWatermelon = new ItemKnife(4245).setAnimationInspecting(KnifeAnimationInspectTac.class).setCCItemDisplayName("Watermelon Tac Knife").setCCItemTextureName("blueknife");
		knifeTacticalInverted = new ItemKnife(4246).setAnimationInspecting(KnifeAnimationInspectTac.class).setCCItemDisplayName("Inverted Tac Knife").setCCItemTextureName("blueknife");

		knifeBayonetPrestige = new ItemKnife(4218).setAnimationInspecting(KnifeAnimationInspect.class).setCCItemDisplayName("Prestige Bayonet").setCCItemTextureName("blueknife");
		knifeBayonetAutotronic = new ItemKnife(4219).setAnimationInspecting(KnifeAnimationInspect.class).setCCItemDisplayName("Autotronic Bayonet").setCCItemTextureName("blueknife");
		knifeBayonetBlackout = new ItemKnife(4250).setAnimationInspecting(KnifeAnimationInspect.class).setCCItemDisplayName("Blackout Bayonet").setCCItemTextureName("blueknife");
		knifeBayonetRuby = new ItemKnife(4251).setAnimationInspecting(KnifeAnimationInspect.class).setCCItemDisplayName("Ruby Bayonet").setCCItemTextureName("blueknife");
		knifeBayonetFade = new ItemKnife(4252).setAnimationInspecting(KnifeAnimationInspect.class).setCCItemDisplayName("Fade Bayonet").setCCItemTextureName("blueknife");
		knifeBayonetRust = new ItemKnife(4253).setAnimationInspecting(KnifeAnimationInspect.class).setCCItemDisplayName("Rust Bayonet").setCCItemTextureName("blueknife");
		knifeBayonetEtherfire = new ItemKnife(4254).setAnimationInspecting(KnifeAnimationInspect.class).setCCItemDisplayName("Etherfire Bayonet").setCCItemTextureName("blueknife");
		knifeBayonetWatermelon = new ItemKnife(4255).setAnimationInspecting(KnifeAnimationInspect.class).setCCItemDisplayName("Watermelon Bayonet").setCCItemTextureName("blueknife");
		knifeBayonetInverted = new ItemKnife(4256).setAnimationInspecting(KnifeAnimationInspect.class).setCCItemDisplayName("Inverted Bayonet").setCCItemTextureName("blueknife");

		knifeKarambitPrestige = new ItemKnife(4228).setAnimationInspecting(KnifeAnimationInspectKarambit.class).setCCItemDisplayName("Karambit Prestige").setCCItemTextureName("blueknife");
		knifeKarambitAutotronic = new ItemKnife(4229).setAnimationInspecting(KnifeAnimationInspectKarambit.class).setCCItemDisplayName("Karambit Autotronic").setCCItemTextureName("blueknife");
		knifeKarambitBlackout = new ItemKnife(4260).setAnimationInspecting(KnifeAnimationInspectKarambit.class).setCCItemDisplayName("Karambit Blackout").setCCItemTextureName("blueknife");
		knifeKarambitRuby = new ItemKnife(4261).setAnimationInspecting(KnifeAnimationInspectKarambit.class).setCCItemDisplayName("Karambit Ruby").setCCItemTextureName("blueknife");
		knifeKarambitFade = new ItemKnife(4262).setAnimationInspecting(KnifeAnimationInspectKarambit.class).setCCItemDisplayName("Karambit Fade").setCCItemTextureName("blueknife");
		knifeKarambitRust = new ItemKnife(4263).setAnimationInspecting(KnifeAnimationInspectKarambit.class).setCCItemDisplayName("Karambit Rust").setCCItemTextureName("blueknife");
		knifeKarambitEtherfire = new ItemKnife(4264).setAnimationInspecting(KnifeAnimationInspectKarambit.class).setCCItemDisplayName("Karambit Etherfire").setCCItemTextureName("blueknife");
		knifeKarambitWatermelon = new ItemKnife(4265).setAnimationInspecting(KnifeAnimationInspectKarambit.class).setCCItemDisplayName("Karambit Watermelon").setCCItemTextureName("blueknife");
		knifeKarambitInverted = new ItemKnife(4266).setAnimationInspecting(KnifeAnimationInspectKarambit.class).setCCItemDisplayName("Karambit Inverted").setCCItemTextureName("blueknife");

		knifeButterflyMarble = new ItemKnife(4231).setAnimationInspecting(KnifeAnimationInspectButterfly.class).setCCItemDisplayName("Prestige Butterfly").setCCItemTextureName("blueknife");
		knifeButterflyTiger = new ItemKnife(4232).setAnimationInspecting(KnifeAnimationInspectButterfly.class).setCCItemDisplayName("Tiger Butterfly").setCCItemTextureName("blueknife");
		knifeButterflySteel = new ItemKnife(4233).setAnimationInspecting(KnifeAnimationInspectButterfly.class).setCCItemDisplayName("Steel Butterfly").setCCItemTextureName("blueknife");
		knifeButterflyDoppler = new ItemKnife(4234).setAnimationInspecting(KnifeAnimationInspectButterfly.class).setCCItemDisplayName("Doppler Butterfly").setCCItemTextureName("blueknife");
		knifeButterflyLore = new ItemKnife(4235).setAnimationInspecting(KnifeAnimationInspectButterfly.class).setCCItemDisplayName("Lore Butterfly").setCCItemTextureName("blueknife");
		knifeButterflyGamma = new ItemKnife(4236).setAnimationInspecting(KnifeAnimationInspectButterfly.class).setCCItemDisplayName("Butterfly Gamma Doppler").setCCItemTextureName("blueknife");
		knifeButterflyPrestige = new ItemKnife(4238).setAnimationInspecting(KnifeAnimationInspectButterfly.class).setCCItemDisplayName("Prestige Butterfly").setCCItemTextureName("blueknife");
		knifeButterflyAutotronic = new ItemKnife(4239).setAnimationInspecting(KnifeAnimationInspectButterfly.class).setCCItemDisplayName("Autotronic Butterfly").setCCItemTextureName("blueknife");
		knifeButterflyBlackout = new ItemKnife(4270).setAnimationInspecting(KnifeAnimationInspectButterfly.class).setCCItemDisplayName("Blackout Butterfly").setCCItemTextureName("blueknife");
		knifeButterflyRuby = new ItemKnife(4271).setAnimationInspecting(KnifeAnimationInspectButterfly.class).setCCItemDisplayName("Ruby Butterfly").setCCItemTextureName("blueknife");
		knifeButterflyFade = new ItemKnife(4272).setAnimationInspecting(KnifeAnimationInspectButterfly.class).setCCItemDisplayName("Fade Butterfly").setCCItemTextureName("blueknife");
		knifeButterflyRust = new ItemKnife(4273).setAnimationInspecting(KnifeAnimationInspectButterfly.class).setCCItemDisplayName("Rust Butterfly").setCCItemTextureName("blueknife");
		knifeButterflyEtherfire = new ItemKnife(4274).setAnimationInspecting(KnifeAnimationInspectButterfly.class).setCCItemDisplayName("Etherfire Butterfly").setCCItemTextureName("blueknife");
		knifeButterflyWatermelon = new ItemKnife(4275).setAnimationInspecting(KnifeAnimationInspectButterfly.class).setCCItemDisplayName("Watermelon Butterfly").setCCItemTextureName("blueknife");
		knifeButterflyInverted = new ItemKnife(4276).setAnimationInspecting(KnifeAnimationInspectButterfly.class).setCCItemDisplayName("Inverted Butterfly").setCCItemTextureName("blueknife");

		caseChronical = new ItemCase(4106).setCCItemDisplayName("Prestige Case").setCCItemTextureName("caseprestige");
		caseMythic = new ItemCase(4107).setCCItemDisplayName("Prestige Case").setCCItemTextureName("caseprestige");
		caseOasis = new ItemCase(4108).setCCItemDisplayName("Prestige Case").setCCItemTextureName("caseprestige");
		caseClash = new ItemCase(4109).setCCItemDisplayName("Prestige Case").setCCItemTextureName("caseprestige");
		caseElemental = new ItemCase(4110).setCCItemDisplayName("Prestige Case").setCCItemTextureName("caseprestige");
		caseRevolution = new ItemCase(4111).setCCItemDisplayName("Prestige Case").setCCItemTextureName("caseprestige");
		caseVectorized = new ItemCase(4112).setCCItemDisplayName("Prestige Case").setCCItemTextureName("caseprestige");
		caseBiomechanic = new ItemCase(4113).setCCItemDisplayName("Prestige Case").setCCItemTextureName("caseprestige");
		casePhantasmagoria = new ItemCase(4114).setCCItemDisplayName("Prestige Case").setCCItemTextureName("caseprestige");
		caseSepulcher = new ItemCase(4115).setCCItemDisplayName("Prestige Case").setCCItemTextureName("caseprestige");

		keyCaseChronical = new ItemKey(5506).setCCItemDisplayName("Key").setCCItemTextureName("casekey_chronical");
		keyCaseMythic = new ItemKey(5507).setCCItemDisplayName("Key").setCCItemTextureName("casekey_mythic");
		keyCaseOasis = new ItemKey(5508).setCCItemDisplayName("Key").setCCItemTextureName("casekey_oasis");
		keyCaseClash = new ItemKey(5509).setCCItemDisplayName("Key").setCCItemTextureName("casekey_clash");
		keyCaseElemental = new ItemKey(5510).setCCItemDisplayName("Key").setCCItemTextureName("casekey_elemental");
		keyCaseRevolution = new ItemKey(5511).setCCItemDisplayName("Key").setCCItemTextureName("casekey_revolution");
		keyCaseVectorized = new ItemKey(5512).setCCItemDisplayName("Key").setCCItemTextureName("casekey_vectorized");
		keyCaseBiomechanic = new ItemKey(5513).setCCItemDisplayName("Key").setCCItemTextureName("casekey_biomechanical");
		keyCasePhantasmagoria = new ItemKey(5514).setCCItemDisplayName("Key").setCCItemTextureName("casekey_phantasmagoria");
		keyCaseSepulcher = new ItemKey(5515).setCCItemDisplayName("Key").setCCItemTextureName("casekey_sepulcher");

		gunDisplayLapis = new ItemGun(6000, 0, 0, 0, 0, 0).setCCItemDisplayName("Gun Display Lapis").setCCItemTextureName("gundisplay_lapis");
		gunDisplayGold = new ItemGun(6001, 0, 0, 0, 0, 0).setCCItemDisplayName("Gun Display Gold").setCCItemTextureName("gundisplay_gold");
		gunDisplayDiamond = new ItemGun(6002, 0, 0, 0, 0, 0).setCCItemDisplayName("Gun Display Diamond").setCCItemTextureName("gundisplay_diamond");
		gunDisplayObsidan = new ItemGun(6003, 0, 0, 0, 0, 0).setCCItemDisplayName("Gun Display Obsidian").setCCItemTextureName("gundisplay_obsidian");
	}
}
