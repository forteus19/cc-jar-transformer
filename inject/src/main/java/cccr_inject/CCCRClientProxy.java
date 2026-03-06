package cccr_inject;

import com.ferullogaming.countercraft.client.model.guns.ModelAK47;
import com.ferullogaming.countercraft.client.model.guns.ModelGun;
import com.ferullogaming.countercraft.client.render.RenderCase;
import com.ferullogaming.countercraft.client.render.guns.RenderAK47;
import com.ferullogaming.countercraft.client.render.knives.RenderKnifeBayonet;
import com.ferullogaming.countercraft.client.render.knives.RenderKnifeButterfly;
import com.ferullogaming.countercraft.client.render.knives.RenderKnifeKarambit;
import com.ferullogaming.countercraft.client.render.knives.RenderKnifeTactical;
import net.minecraftforge.client.MinecraftForgeClient;

@SuppressWarnings("unused")
public final class CCCRClientProxy {
	private CCCRClientProxy() {
	}

	public static void load() {
		MinecraftForgeClient.registerItemRenderer(CCCRItems.knifeTacticalPrestige.field_77779_bT, new RenderKnifeTactical("tactical_prestige"));
		MinecraftForgeClient.registerItemRenderer(CCCRItems.knifeTacticalAutotronic.field_77779_bT, new RenderKnifeTactical("tactical_autotronic"));
		MinecraftForgeClient.registerItemRenderer(CCCRItems.knifeTacticalBlackout.field_77779_bT, new RenderKnifeTactical("tactical_blackout"));
		MinecraftForgeClient.registerItemRenderer(CCCRItems.knifeTacticalRuby.field_77779_bT, new RenderKnifeTactical("tactical_ruby"));
		MinecraftForgeClient.registerItemRenderer(CCCRItems.knifeTacticalFade.field_77779_bT, new RenderKnifeTactical("tactical_fade"));
		MinecraftForgeClient.registerItemRenderer(CCCRItems.knifeTacticalRust.field_77779_bT, new RenderKnifeTactical("tactical_rust"));
		MinecraftForgeClient.registerItemRenderer(CCCRItems.knifeTacticalEtherfire.field_77779_bT, new RenderKnifeTactical("tactical_etherfire"));
		MinecraftForgeClient.registerItemRenderer(CCCRItems.knifeTacticalWatermelon.field_77779_bT, new RenderKnifeTactical("tactical_watermelon"));
		MinecraftForgeClient.registerItemRenderer(CCCRItems.knifeTacticalInverted.field_77779_bT, new RenderKnifeTactical("tactical_inverted"));

		MinecraftForgeClient.registerItemRenderer(CCCRItems.knifeBayonetPrestige.field_77779_bT, new RenderKnifeBayonet("bayonet_prestige"));
		MinecraftForgeClient.registerItemRenderer(CCCRItems.knifeBayonetAutotronic.field_77779_bT, new RenderKnifeBayonet("bayonet_autotronic"));
		MinecraftForgeClient.registerItemRenderer(CCCRItems.knifeBayonetBlackout.field_77779_bT, new RenderKnifeBayonet("bayonet_blackout"));
		MinecraftForgeClient.registerItemRenderer(CCCRItems.knifeBayonetRuby.field_77779_bT, new RenderKnifeBayonet("bayonet_ruby"));
		MinecraftForgeClient.registerItemRenderer(CCCRItems.knifeBayonetFade.field_77779_bT, new RenderKnifeBayonet("bayonet_fade"));
		MinecraftForgeClient.registerItemRenderer(CCCRItems.knifeBayonetRust.field_77779_bT, new RenderKnifeBayonet("bayonet_rust"));
		MinecraftForgeClient.registerItemRenderer(CCCRItems.knifeBayonetEtherfire.field_77779_bT, new RenderKnifeBayonet("bayonet_etherfire"));
		MinecraftForgeClient.registerItemRenderer(CCCRItems.knifeBayonetWatermelon.field_77779_bT, new RenderKnifeBayonet("bayonet_watermelon"));
		MinecraftForgeClient.registerItemRenderer(CCCRItems.knifeBayonetInverted.field_77779_bT, new RenderKnifeBayonet("bayonet_inverted"));

		MinecraftForgeClient.registerItemRenderer(CCCRItems.knifeKarambitPrestige.field_77779_bT, new RenderKnifeKarambit("karambit_prestige"));
		MinecraftForgeClient.registerItemRenderer(CCCRItems.knifeKarambitAutotronic.field_77779_bT, new RenderKnifeKarambit("karambit_autotronic"));
		MinecraftForgeClient.registerItemRenderer(CCCRItems.knifeKarambitBlackout.field_77779_bT, new RenderKnifeKarambit("karambit_blackout"));
		MinecraftForgeClient.registerItemRenderer(CCCRItems.knifeKarambitRuby.field_77779_bT, new RenderKnifeKarambit("karambit_ruby"));
		MinecraftForgeClient.registerItemRenderer(CCCRItems.knifeKarambitFade.field_77779_bT, new RenderKnifeKarambit("karambit_fade"));
		MinecraftForgeClient.registerItemRenderer(CCCRItems.knifeKarambitRust.field_77779_bT, new RenderKnifeKarambit("karambit_rust"));
		MinecraftForgeClient.registerItemRenderer(CCCRItems.knifeKarambitEtherfire.field_77779_bT, new RenderKnifeKarambit("karambit_etherfire"));
		MinecraftForgeClient.registerItemRenderer(CCCRItems.knifeKarambitWatermelon.field_77779_bT, new RenderKnifeKarambit("karambit_watermelon"));
		MinecraftForgeClient.registerItemRenderer(CCCRItems.knifeKarambitInverted.field_77779_bT, new RenderKnifeKarambit("karambit_inverted"));

		MinecraftForgeClient.registerItemRenderer(CCCRItems.knifeButterflyMarble.field_77779_bT, new RenderKnifeButterfly("butterfly_marble"));
		MinecraftForgeClient.registerItemRenderer(CCCRItems.knifeButterflyTiger.field_77779_bT, new RenderKnifeButterfly("butterfly_tiger"));
		MinecraftForgeClient.registerItemRenderer(CCCRItems.knifeButterflySteel.field_77779_bT, new RenderKnifeButterfly("butterfly_steel"));
		MinecraftForgeClient.registerItemRenderer(CCCRItems.knifeButterflyDoppler.field_77779_bT, new RenderKnifeButterfly("butterfly_doppler"));
		MinecraftForgeClient.registerItemRenderer(CCCRItems.knifeButterflyLore.field_77779_bT, new RenderKnifeButterfly("butterfly_lore"));
		MinecraftForgeClient.registerItemRenderer(CCCRItems.knifeButterflyGamma.field_77779_bT, new RenderKnifeButterfly("butterfly_gamma"));
		MinecraftForgeClient.registerItemRenderer(CCCRItems.knifeButterflyPrestige.field_77779_bT, new RenderKnifeButterfly("butterfly_prestige"));
		MinecraftForgeClient.registerItemRenderer(CCCRItems.knifeButterflyAutotronic.field_77779_bT, new RenderKnifeButterfly("butterfly_autotronic"));
		MinecraftForgeClient.registerItemRenderer(CCCRItems.knifeButterflyBlackout.field_77779_bT, new RenderKnifeButterfly("butterfly_blackout"));
		MinecraftForgeClient.registerItemRenderer(CCCRItems.knifeButterflyRuby.field_77779_bT, new RenderKnifeButterfly("butterfly_ruby"));
		MinecraftForgeClient.registerItemRenderer(CCCRItems.knifeButterflyFade.field_77779_bT, new RenderKnifeButterfly("butterfly_fade"));
		MinecraftForgeClient.registerItemRenderer(CCCRItems.knifeButterflyRust.field_77779_bT, new RenderKnifeButterfly("butterfly_rust"));
		MinecraftForgeClient.registerItemRenderer(CCCRItems.knifeButterflyEtherfire.field_77779_bT, new RenderKnifeButterfly("butterfly_etherfire"));
		MinecraftForgeClient.registerItemRenderer(CCCRItems.knifeButterflyWatermelon.field_77779_bT, new RenderKnifeButterfly("butterfly_watermelon"));
		MinecraftForgeClient.registerItemRenderer(CCCRItems.knifeButterflyInverted.field_77779_bT, new RenderKnifeButterfly("butterfly_inverted"));

		MinecraftForgeClient.registerItemRenderer(CCCRItems.caseChronical.field_77779_bT, new RenderCase("case_chronical"));
		MinecraftForgeClient.registerItemRenderer(CCCRItems.caseMythic.field_77779_bT, new RenderCase("case_mythic"));
		MinecraftForgeClient.registerItemRenderer(CCCRItems.caseOasis.field_77779_bT, new RenderCase("case_oasis"));
		MinecraftForgeClient.registerItemRenderer(CCCRItems.caseClash.field_77779_bT, new RenderCase("case_clash"));
		MinecraftForgeClient.registerItemRenderer(CCCRItems.caseElemental.field_77779_bT, new RenderCase("case_elemental"));
		MinecraftForgeClient.registerItemRenderer(CCCRItems.caseRevolution.field_77779_bT, new RenderCase("case_revolution"));
		MinecraftForgeClient.registerItemRenderer(CCCRItems.caseVectorized.field_77779_bT, new RenderCase("case_vectorized"));
		MinecraftForgeClient.registerItemRenderer(CCCRItems.caseBiomechanic.field_77779_bT, new RenderCase("case_biomechanic"));
		MinecraftForgeClient.registerItemRenderer(CCCRItems.casePhantasmagoria.field_77779_bT, new RenderCase("case_phantasmagoria"));
		MinecraftForgeClient.registerItemRenderer(CCCRItems.caseSepulcher.field_77779_bT, new RenderCase("case_sepulcher"));

		ModelAK47 gunDisplayModel = new ModelAK47();
		MinecraftForgeClient.registerItemRenderer(CCCRItems.gunDisplayLapis.field_77779_bT, new RenderGunDisplay(gunDisplayModel, "gundisplaymodel_lapis"));
		MinecraftForgeClient.registerItemRenderer(CCCRItems.gunDisplayGold.field_77779_bT, new RenderGunDisplay(gunDisplayModel, "gundisplaymodel_gold"));
		MinecraftForgeClient.registerItemRenderer(CCCRItems.gunDisplayDiamond.field_77779_bT, new RenderGunDisplay(gunDisplayModel, "gundisplaymodel_diamond"));
		MinecraftForgeClient.registerItemRenderer(CCCRItems.gunDisplayObsidan.field_77779_bT, new RenderGunDisplay(gunDisplayModel, "gundisplaymodel_obsidian"));
	}

	private static class RenderGunDisplay extends RenderAK47 {
		private final String texture;

		public RenderGunDisplay(ModelGun model, String texture) {
			super(model);
			this.texture = texture;
		}

		@Override
		public String getTexture() {
			return texture;
		}
	}
}
