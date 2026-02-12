package cccr_inject;

import com.ferullogaming.countercraft.client.render.RenderCase;
import net.minecraftforge.client.MinecraftForgeClient;

@SuppressWarnings("unused")
public final class CCCRClientProxy {
	private CCCRClientProxy() {
	}

	public static void load() {
		MinecraftForgeClient.registerItemRenderer(CCCRItems.casePrealpha.field_77779_bT, new RenderCase("case_prealpha"));
	}
}
