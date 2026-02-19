package cccr_inject;

import com.ferullogaming.countercraft.item.ItemCase;
import com.ferullogaming.countercraft.item.ItemKey;
import net.minecraft.item.Item;

@SuppressWarnings("unused")
public final class CCCRItems {
	public static Item casePrealpha;
	public static Item casePrestige;
	public static Item keyCasePrealpha;
	public static Item keyCasePrestige;

	private CCCRItems() {
	}

	public static void getData() {
		casePrealpha = (new ItemCase(4106)).setCCItemDisplayName("Prealpha Case").setCCItemTextureName("caseprealpha");
		casePrestige = (new ItemCase(4107)).setCCItemDisplayName("Prestige Case").setCCItemTextureName("caseprestige");
		keyCasePrealpha = (new ItemKey(5506)).setCCItemDisplayName("Key").setCCItemTextureName("casekey_prealpha");
		keyCasePrestige = (new ItemKey(5507)).setCCItemDisplayName("Key").setCCItemTextureName("casekey_prestige");
	}
}
