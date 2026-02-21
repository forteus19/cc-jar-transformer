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
		MinecraftForgeClient.registerItemRenderer(CCCRItems.knifeBayonetPrestige.field_77779_bT, new RenderKnifeBayonet("bayonet_prestige"));
		MinecraftForgeClient.registerItemRenderer(CCCRItems.knifeKarambitPrestige.field_77779_bT, new RenderKnifeKarambit("karambit_prestige"));
		MinecraftForgeClient.registerItemRenderer(CCCRItems.knifeButterflyPrestige.field_77779_bT, new RenderKnifeButterfly("butterfly_prestige"));
		MinecraftForgeClient.registerItemRenderer(CCCRItems.casePrealpha.field_77779_bT, new RenderCase("case_prealpha"));
		MinecraftForgeClient.registerItemRenderer(CCCRItems.casePrestige.field_77779_bT, new RenderCase("case_prestige"));
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
