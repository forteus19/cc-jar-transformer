package cccr_inject;

import com.ferullogaming.countercraft.client.cloud.item.CloudItem;
import com.ferullogaming.countercraft.client.cloud.item.CloudItemCase;
import com.ferullogaming.countercraft.client.cloud.item.CloudItemGun;
import com.ferullogaming.countercraft.client.cloud.item.CloudItemKey;
import com.ferullogaming.countercraft.client.cloud.item.CloudItemKnife;
import com.ferullogaming.countercraft.client.cloud.item.CloudItemRarity;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static com.ferullogaming.countercraft.client.cloud.item.CloudItem.*;

@SuppressWarnings("unused")
public final class CCCRCloudItems {
	public static final CloudItem M4A4_CYREX = new CloudItemGun(108, 4000, "M4A4").setSuffix("Cyrex").setValue(CloudItemRarity.TIER2).setCollection("Vectorized").setFilterMT("rifle");
	public static final CloudItem M4A4_LURKER = new CloudItemGun(109, 4000, "M4A4").setSuffix("Lurker").setValue(CloudItemRarity.TIER2).setCollection("Revolution").setFilterMT("rifle").setAuthor("njfsea");
	public static final CloudItem M4A4_ASMO = new CloudItemGun(110, 4000, "M4A4").setSuffix("Asmo").setValue(CloudItemRarity.TIER5).setCollection("Alpha").setFilterMT("rifle");
	public static final CloudItem M4A4_DESERT = new CloudItemGun(111, 4000, "M4A4").setSuffix("Desert").setValue(CloudItemRarity.TIER1).setCollection("Oasis").setFilterMT("rifle");
	public static final CloudItem M4A4_DESOLATE_SPACE = new CloudItemGun(112, 4000, "M4A4").setSuffix("Desolate Space").setValue(CloudItemRarity.TIER6).setCollection("Mythic").setFilterMT("rifle");
	public static final CloudItem M4A4_SPORT = new CloudItemGun(113, 4000, "M4A4").setSuffix("Sport").setValue(CloudItemRarity.TIER4).setCollection("Delta").setFilterMT("rifle");
	public static final CloudItem M4A4_VERTEX = new CloudItemGun(114, 4000, "M4A4").setSuffix("Vertex").setValue(CloudItemRarity.TIER3).setCollection("Delta").setFilterMT("rifle");
	public static final CloudItem M4A4_GOLDEN_COIL = new CloudItemGun(115, 4000, "M4A4").setSuffix("Golden Coil").setValue(CloudItemRarity.TIER4).setCollection("Biomech").setFilterMT("rifle");
	public static final CloudItem M4A4_DAYBREAK = new CloudItemGun(116, 4000, "M4A4").setSuffix("Daybreak").setValue(CloudItemRarity.TIER2).setCollection("Biomech").setFilterMT("rifle");

	public static final CloudItem AK47_VULCAN = new CloudItemGun(207, 4001, "AK47").setSuffix("Vulcan").setValue(CloudItemRarity.TIER5).setCollection("Alpha").setFilterMT("rifle");
	public static final CloudItem AK47_FUEL = new CloudItemGun(208, 4001, "AK47").setSuffix("Fuel").setValue(CloudItemRarity.TIER2).setCollection("Beta").setFilterMT("rifle").setAuthor("Luigi_MC");
	public static final CloudItem AK47_SHIKARI = new CloudItemGun(209, 4001, "AK47").setSuffix("Shikari").setValue(CloudItemRarity.TIER2).setCollection("Biomech").setFilterMT("rifle");
	public static final CloudItem AK47_HORUS = new CloudItemGun(210, 4001, "AK47").setSuffix("Horus").setValue(CloudItemRarity.TIER6).setCollection("Oasis").setFilterMT("rifle");
	public static final CloudItem AK47_FRONTSIDE = new CloudItemGun(211, 4001, "AK47").setSuffix("Frontside").setValue(CloudItemRarity.TIER5).setCollection("Chronical").setFilterMT("rifle");
	public static final CloudItem AK47_IRON_BEAST = new CloudItemGun(212, 4001, "AK47").setSuffix("Iron Beast").setValue(CloudItemRarity.TIER4).setCollection("Gamma").setFilterMT("rifle");
	public static final CloudItem AK47_GRAFFITI = new CloudItemGun(213, 4001, "AK47").setSuffix("Graffiti").setValue(CloudItemRarity.TIER3).setCollection("Delta").setFilterMT("rifle");
	public static final CloudItem AK47_STRIPE = new CloudItemGun(214, 4001, "AK47").setSuffix("Stripe").setValue(CloudItemRarity.TIER2).setCollection("Epsilon").setFilterMT("rifle");
	public static final CloudItem AK47_MACAW = new CloudItemGun(215, 4001, "AK47").setSuffix("Macaw").setValue(CloudItemRarity.TIER3).setCollection("Clash").setFilterMT("rifle");
	public static final CloudItem AK47_XRAY = new CloudItemGun(216, 4001, "AK47").setSuffix("X-Ray").setValue(CloudItemRarity.TIER3).setCollection("Revolution").setFilterMT("rifle");
	public static final CloudItem AK47_CREEP = new CloudItemGun(217, 4001, "AK47").setSuffix("Creep").setValue(CloudItemRarity.TIER6).setCollection("Phantom").setFilterMT("rifle");
	public static final CloudItem AK47_BONES = new CloudItemGun(218, 4001, "AK47").setSuffix("Bones").setValue(CloudItemRarity.TIER3).setCollection("Sepulcher").setFilterMT("rifle");

	public static final CloudItem FAMAS_PULSE = new CloudItemGun(304, 4002, "Famas").setSuffix("Pulse").setValue(CloudItemRarity.TIER1).setCollection("Beta").setFilterMT("rifle");
	public static final CloudItem FAMAS_NUCLEAR = new CloudItemGun(305, 4002, "Famas").setSuffix("Nuclear").setValue(CloudItemRarity.TIER3).setCollection("Elemental").setFilterMT("rifle").setAuthor("DarkMatterShark");
	public static final CloudItem FAMAS_SANDSTORM = new CloudItemGun(306, 4002, "Famas").setSuffix("Sandstorm").setValue(CloudItemRarity.TIER1).setCollection("Oasis").setFilterMT("rifle");
	public static final CloudItem FAMAS_VULCAN = new CloudItemGun(307, 4002, "Famas").setSuffix("Vulcan").setValue(CloudItemRarity.TIER4).setCollection("Chronical").setFilterMT("rifle");
	public static final CloudItem FAMAS_RYBUS = new CloudItemGun(308, 4002, "Famas").setSuffix("Rybus").setValue(CloudItemRarity.TIER2).setCollection("Mythic").setFilterMT("rifle");
	public static final CloudItem FAMAS_COBALT = new CloudItemGun(309, 4002, "Famas").setSuffix("Cobalt").setValue(CloudItemRarity.TIER1).setCollection("Clash").setFilterMT("rifle");

	public static final CloudItem FNFAL_STAIN = new CloudItemGun(403, 4003, "FN FAL").setSuffix("Stain").setValue(CloudItemRarity.TIER1).setCollection("Clash").setFilterMT("rifle");
	public static final CloudItem FNFAL_REBEL = new CloudItemGun(404, 4003, "FN FAL").setSuffix("Rebel").setValue(CloudItemRarity.TIER3).setCollection("Beta").setFilterMT("rifle").setAuthor("njfsea");
	public static final CloudItem FNFAL_VENOM = new CloudItemGun(405, 4003, "FN FAL").setSuffix("Venom").setValue(CloudItemRarity.TIER3).setCollection("Alpha").setFilterMT("rifle");
	public static final CloudItem FNFAL_RACE = new CloudItemGun(406, 4003, "FN FAL").setSuffix("Race").setValue(CloudItemRarity.TIER2).setCollection("Gamma").setFilterMT("rifle");
	public static final CloudItem FNFAL_SHOCKER = new CloudItemGun(407, 4003, "FN FAL").setSuffix("Shocker").setValue(CloudItemRarity.TIER2).setCollection("Chronical").setFilterMT("rifle");

	public static final CloudItem M1911_RAIN = new CloudItemGun(503, 4010, "M1911").setSuffix("Rain").setValue(CloudItemRarity.TIER1).setCollection("Epsilon").setFilterMT("pistol");
	public static final CloudItem M1911_OLDWEST = new CloudItemGun(504, 4010, "M1911").setSuffix("OldWest").setValue(CloudItemRarity.TIER1).setCollection("Revolution").setFilterMT("pistol").setAuthor("Zoot4gamez");
	public static final CloudItem M1911_SHOCK = new CloudItemGun(505, 4010, "M1911").setSuffix("Shock").setValue(CloudItemRarity.TIER2).setCollection("Chronical").setFilterMT("pistol").setAuthor("Mario_MC");
	public static final CloudItem M1911_VENOM = new CloudItemGun(506, 4010, "M1911").setSuffix("Venom").setValue(CloudItemRarity.TIER3).setCollection("Beta").setFilterMT("pistol");
	public static final CloudItem M1911_TRIARK = new CloudItemGun(507, 4010, "M1911").setSuffix("Triark").setValue(CloudItemRarity.TIER4).setCollection("Oasis").setFilterMT("pistol");
	public static final CloudItem M1911_BLAZE = new CloudItemGun(508, 4010, "M1911").setSuffix("Blaze").setValue(CloudItemRarity.TIER3).setCollection("Mythic").setFilterMT("pistol");
	public static final CloudItem M1911_GOLD = new CloudItemGun(509, 4010, "M1911").setSuffix("Gold").setValue(CloudItemRarity.TIER3).setCollection("Elemental").setFilterMT("pistol");
	public static final CloudItem M1911_INDIRECT = new CloudItemGun(510, 4010, "M1911").setSuffix("Indirect").setValue(CloudItemRarity.TIER2).setCollection("Revolution").setFilterMT("pistol");
	public static final CloudItem M1911_MUMMY = new CloudItemGun(511, 4010, "M1911").setSuffix("Mummy").setValue(CloudItemRarity.TIER1).setCollection("Sepulcher").setFilterMT("pistol");

	public static final CloudItem G18_FADE = new CloudItemGun(604, 4011, "G18").setSuffix("Fade").setValue(CloudItemRarity.TIER4).setCollection("Beta").setFilterMT("pistol");
	public static final CloudItem G18_URBAN = new CloudItemGun(605, 4011, "G18").setSuffix("Urban").setValue(CloudItemRarity.TIER1).setCollection("Epsilon").setFilterMT("pistol").setAuthor("VernSyth");
	public static final CloudItem G18_CYREX = new CloudItemGun(606, 4011, "G18").setSuffix("Cyrex").setValue(CloudItemRarity.TIER2).setCollection("Alpha").setFilterMT("pistol");
	public static final CloudItem G18_HORNET = new CloudItemGun(607, 4011, "G18").setSuffix("Hornet").setValue(CloudItemRarity.TIER2).setCollection("Oasis").setFilterMT("pistol");
	public static final CloudItem G18_VULCAN = new CloudItemGun(608, 4011, "G18").setSuffix("Vulcan").setValue(CloudItemRarity.TIER3).setCollection("Vectorized").setFilterMT("pistol");
	public static final CloudItem G18_CANDY_APPLE = new CloudItemGun(609, 4011, "G18").setSuffix("Candy Apple").setValue(CloudItemRarity.TIER1).setCollection("Vectorized").setFilterMT("pistol");
	public static final CloudItem G18_MOONRISE = new CloudItemGun(610, 4011, "G18").setSuffix("Moonrise").setValue(CloudItemRarity.TIER3).setCollection("Biomech").setFilterMT("pistol");
	public static final CloudItem G18_CIRCUIT = new CloudItemGun(611, 4011, "G18").setSuffix("Circuit").setValue(CloudItemRarity.TIER1).setCollection("Biomech").setFilterMT("pistol");
	public static final CloudItem G18_GHOUL = new CloudItemGun(612, 4011, "G18").setSuffix("Ghoul").setValue(CloudItemRarity.TIER1).setCollection("Phantom").setFilterMT("pistol");
	public static final CloudItem G18_GHOST = new CloudItemGun(613, 4011, "G18").setSuffix("Ghost").setValue(CloudItemRarity.TIER1).setCollection("Sepulcher").setFilterMT("pistol");

	public static final CloudItem TEC9_TORQUE = new CloudItemGun(654, 4014, "TEC9").setSuffix("Torque").setValue(CloudItemRarity.TIER3).setCollection("Mythic").setFilterMT("pistol");
	public static final CloudItem TEC9_HORNET = new CloudItemGun(655, 4014, "TEC9").setSuffix("Hornet").setValue(CloudItemRarity.TIER2).setCollection("Delta").setFilterMT("pistol");
	public static final CloudItem TEC9_FUEL = new CloudItemGun(656, 4014, "TEC9").setSuffix("Fuel").setValue(CloudItemRarity.TIER2).setCollection("Clash").setFilterMT("pistol");
	public static final CloudItem TEC9_CHERRY = new CloudItemGun(657, 4014, "TEC9").setSuffix("Cherry").setValue(CloudItemRarity.TIER4).setCollection("Elemental").setFilterMT("pistol");

	public static final CloudItem DEAGLE_NAVY = new CloudItemGun(704, 4012, "Deagle").setSuffix("Navy").setValue(CloudItemRarity.TIER1).setCollection("Vectorized").setFilterMT("pistol");
	public static final CloudItem DEAGLE_WATERMELON = new CloudItemGun(705, 4012, "Deagle").setSuffix("Watermelon").setValue(CloudItemRarity.TIER4).setCollection("Alpha").setFilterMT("pistol").setAuthor("Luigi_MC");
	public static final CloudItem DEAGLE_MYSTIC = new CloudItemGun(706, 4012, "Deagle").setSuffix("Mystic").setValue(CloudItemRarity.TIER1).setCollection("Mythic").setFilterMT("pistol");
	public static final CloudItem DEAGLE_BLOODSPORT = new CloudItemGun(707, 4012, "Deagle").setSuffix("Bloodsport").setValue(CloudItemRarity.TIER4).setCollection("Gamma").setFilterMT("pistol");
	public static final CloudItem DEAGLE_FLATLINE = new CloudItemGun(708, 4012, "Deagle").setSuffix("Flatline").setValue(CloudItemRarity.TIER3).setCollection("Gamma").setFilterMT("pistol");
	public static final CloudItem DEAGLE_CIRCUIT = new CloudItemGun(709, 4012, "Deagle").setSuffix("Circuit").setValue(CloudItemRarity.TIER1).setCollection("Delta").setFilterMT("pistol");
	public static final CloudItem DEAGLE_FADE = new CloudItemGun(710, 4012, "Deagle").setSuffix("Fade").setValue(CloudItemRarity.TIER4).setCollection("Epsilon").setFilterMT("pistol");
	public static final CloudItem DEAGLE_KUMICHO_DRAGON = new CloudItemGun(711, 4012, "Deagle").setSuffix("Kumicho Dragon").setValue(CloudItemRarity.TIER3).setCollection("Epsilon").setFilterMT("pistol");
	public static final CloudItem DEAGLE_COBALT = new CloudItemGun(712, 4012, "Deagle").setSuffix("Cobalt").setValue(CloudItemRarity.TIER2).setCollection("Clash").setFilterMT("pistol");
	public static final CloudItem DEAGLE_GOLD = new CloudItemGun(713, 4012, "Deagle").setSuffix("Gold").setValue(CloudItemRarity.TIER3).setCollection("Elemental").setFilterMT("pistol");
	public static final CloudItem DEAGLE_DEVI = new CloudItemGun(714, 4012, "Deagle").setSuffix("Devi").setValue(CloudItemRarity.TIER1).setCollection("Revolution").setFilterMT("pistol");
	public static final CloudItem DEAGLE_MECHAINDUSTRIES = new CloudItemGun(715, 4012, "Deagle").setSuffix("Mechaindustries").setValue(CloudItemRarity.TIER3).setCollection("Biomech").setFilterMT("pistol");

	public static final CloudItem P250_ARCTIC = new CloudItemGun(755, 4013, "P250").setSuffix("Arctic").setValue(CloudItemRarity.TIER1).setCollection("Biomech").setFilterMT("pistol");
	public static final CloudItem P250_DUNE = new CloudItemGun(756, 4013, "P250").setSuffix("Dune").setValue(CloudItemRarity.TIER1).setCollection("Oasis").setFilterMT("pistol");
	public static final CloudItem P250_NIPPON = new CloudItemGun(757, 4013, "P250").setSuffix("Nippon").setValue(CloudItemRarity.TIER3).setCollection("Epsilon").setFilterMT("pistol");
	public static final CloudItem P250_HAUNTED = new CloudItemGun(758, 4013, "P250").setSuffix("Haunted").setValue(CloudItemRarity.TIER3).setCollection("Sepulcher").setFilterMT("pistol");

	public static final CloudItem P90_RUBY = new CloudItemGun(803, 4020, "P90").setSuffix("Ruby").setValue(CloudItemRarity.TIER1).setCollection("Chronical").setFilterMT("smg");
	public static final CloudItem P90_ARROW = new CloudItemGun(804, 4020, "P90").setSuffix("Arrow").setValue(CloudItemRarity.TIER2).setCollection("Alpha").setFilterMT("smg");
	public static final CloudItem P90_MEDICINE = new CloudItemGun(805, 4020, "P90").setSuffix("Medicine").setValue(CloudItemRarity.TIER4).setCollection("Delta").setFilterMT("smg");
	public static final CloudItem P90_MODULE = new CloudItemGun(806, 4020, "P90").setSuffix("Module").setValue(CloudItemRarity.TIER2).setCollection("Revolution").setFilterMT("smg");
	public static final CloudItem P90_GRIM = new CloudItemGun(807, 4020, "P90").setSuffix("Grim").setValue(CloudItemRarity.TIER5).setCollection("Phantom").setFilterMT("smg");

	public static final CloudItem MAC10_VIOLET = new CloudItemGun(903, 4021, "MAC10").setSuffix("Violet").setValue(CloudItemRarity.TIER1).setCollection("Revolution").setFilterMT("smg");
	public static final CloudItem MAC10_CHICKEN = new CloudItemGun(904, 4021, "MAC10").setSuffix("Chicken").setValue(CloudItemRarity.TIER5).setCollection("Oasis").setFilterMT("smg").setAuthor("batson83");
	public static final CloudItem MAC10_CANDY_APPLE = new CloudItemGun(905, 4021, "MAC10").setSuffix("Candy Apple").setValue(CloudItemRarity.TIER1).setCollection("Gamma").setFilterMT("smg");
	public static final CloudItem MAC10_CIRCUIT = new CloudItemGun(906, 4021, "MAC10").setSuffix("Circuit").setValue(CloudItemRarity.TIER1).setCollection("Delta").setFilterMT("smg");
	public static final CloudItem MAC10_NEON = new CloudItemGun(907, 4021, "MAC10").setSuffix("Neon").setValue(CloudItemRarity.TIER5).setCollection("Clash").setFilterMT("smg");
	public static final CloudItem MAC10_FADE = new CloudItemGun(908, 4021, "MAC10").setSuffix("Fade").setValue(CloudItemRarity.TIER4).setCollection("Elemental").setFilterMT("smg");
	public static final CloudItem MAC10_ASMO = new CloudItemGun(909, 4021, "MAC10").setSuffix("Asmo").setValue(CloudItemRarity.TIER4).setCollection("Vectorized").setFilterMT("smg");
	public static final CloudItem MAC10_SPIDER = new CloudItemGun(910, 4021, "MAC10").setSuffix("Spider").setValue(CloudItemRarity.TIER4).setCollection("Phantom").setFilterMT("smg");
	public static final CloudItem MAC10_SWARM = new CloudItemGun(911, 4021, "MAC10").setSuffix("Swarm").setValue(CloudItemRarity.TIER2).setCollection("Sepulcher").setFilterMT("smg");

	public static final CloudItem VECTOR_ARCTIC = new CloudItemGun(1003, 4022, "Vector").setSuffix("Arctic").setValue(CloudItemRarity.TIER2).setCollection("Vectorized").setFilterMT("smg");
	public static final CloudItem VECTOR_SUNNY = new CloudItemGun(1004, 4022, "Vector").setSuffix("Sunny").setValue(CloudItemRarity.TIER1).setCollection("Elemental").setFilterMT("smg").setAuthor("Hisse");
	public static final CloudItem VECTOR_SLIME = new CloudItemGun(1005, 4022, "Vector").setSuffix("Slime").setValue(CloudItemRarity.TIER2).setCollection("Mythic").setFilterMT("smg");
	public static final CloudItem VECTOR_EXTINCT = new CloudItemGun(1006, 4022, "Vector").setSuffix("Extinct").setValue(CloudItemRarity.TIER5).setCollection("Vectorized").setFilterMT("smg");
	public static final CloudItem VECTOR_ORTHUS = new CloudItemGun(1007, 4022, "Vector").setSuffix("Orthus").setValue(CloudItemRarity.TIER3).setCollection("Phantom").setFilterMT("smg");

	public static final CloudItem AWP_LIGHTNING = new CloudItemGun(1107, 4030, "AWP").setSuffix("Lightning").setValue(CloudItemRarity.TIER5).setCollection("Elemental").setFilterMT("sniper");
	public static final CloudItem AWP_BEAST = new CloudItemGun(1108, 4030, "AWP").setSuffix("Beast").setValue(CloudItemRarity.TIER4).setCollection("Mythic").setFilterMT("sniper").setAuthor("njfsea");
	public static final CloudItem AWP_MECHA_DRAGON = new CloudItemGun(1109, 4030, "AWP").setSuffix("Mecha Dragon").setValue(CloudItemRarity.TIER6).setCollection("Alpha").setFilterMT("sniper").setAuthor("ABrokenHeart");
	public static final CloudItem AWP_ELECTRIC_ARCHIVE = new CloudItemGun(1110, 4030, "AWP").setSuffix("Electric Archive").setValue(CloudItemRarity.TIER3).setCollection("Gamma").setFilterMT("sniper");
	public static final CloudItem AWP_OCEANDEPTH = new CloudItemGun(1111, 4030, "AWP").setSuffix("Ocean-Depth").setValue(CloudItemRarity.TIER5).setCollection("Delta").setFilterMT("sniper");
	public static final CloudItem AWP_AKARI = new CloudItemGun(1112, 4030, "AWP").setSuffix("Akari").setValue(CloudItemRarity.TIER3).setCollection("Delta").setFilterMT("sniper");
	public static final CloudItem AWP_CROWD = new CloudItemGun(1113, 4030, "AWP").setSuffix("Crowd").setValue(CloudItemRarity.TIER4).setCollection("Epsilon").setFilterMT("sniper");
	public static final CloudItem AWP_FOREST = new CloudItemGun(1114, 4030, "AWP").setSuffix("Forest").setValue(CloudItemRarity.TIER1).setCollection("Vectorized").setFilterMT("sniper");
	public static final CloudItem AWP_STEAMPUNK = new CloudItemGun(1115, 4030, "AWP").setSuffix("Steampunk").setValue(CloudItemRarity.TIER4).setCollection("Biomech").setFilterMT("sniper");
	public static final CloudItem AWP_PUMPKIN = new CloudItemGun(1116, 4030, "AWP").setSuffix("Pumpkin").setValue(CloudItemRarity.TIER4).setCollection("Sepulcher").setFilterMT("sniper");

	public static final CloudItem DRAGUNOV_JUNGLE = new CloudItemGun(1203, 4031, "Dragunov").setSuffix("Jungle").setValue(CloudItemRarity.TIER1).setCollection("Alpha").setFilterMT("sniper");
	public static final CloudItem DRAGUNOV_WORMGOD = new CloudItemGun(1204, 4031, "Dragunov").setSuffix("Wormgod").setValue(CloudItemRarity.TIER5).setCollection("Mythic").setFilterMT("sniper");
	public static final CloudItem DRAGUNOV_ELITE = new CloudItemGun(1205, 4031, "Dragunov").setSuffix("Elite").setValue(CloudItemRarity.TIER1).setCollection("Clash").setFilterMT("sniper");
	public static final CloudItem DRAGUNOV_GHOST = new CloudItemGun(1206, 4031, "Dragunov").setSuffix("Ghost").setValue(CloudItemRarity.TIER1).setCollection("Sepulcher").setFilterMT("sniper");

	public static final CloudItem SCAR20_ELITE = new CloudItemGun(1303, 4032, "Scar20").setSuffix("Elite").setValue(CloudItemRarity.TIER1).setCollection("Mythic").setFilterMT("sniper");
	public static final CloudItem SCAR20_SHOCK = new CloudItemGun(1304, 4032, "Scar20").setSuffix("Shock").setValue(CloudItemRarity.TIER2).setCollection("Vectorized").setFilterMT("sniper").setAuthor("Mario_MC");
	public static final CloudItem SCAR20_SPORT = new CloudItemGun(1305, 4032, "Scar20").setSuffix("Sport").setValue(CloudItemRarity.TIER5).setCollection("Beta").setFilterMT("sniper");
	public static final CloudItem SCAR20_POWERCORE = new CloudItemGun(1306, 4032, "Scar20").setSuffix("Powercore").setValue(CloudItemRarity.TIER1).setCollection("Gamma").setFilterMT("sniper");
	public static final CloudItem SCAR20_ARCTIC = new CloudItemGun(1307, 4032, "Scar20").setSuffix("Arctic").setValue(CloudItemRarity.TIER1).setCollection("Chronical").setFilterMT("sniper");

	public static final CloudItem NOVA_JUNK = new CloudItemGun(1603, 4040, "Nova").setSuffix("Junk").setValue(CloudItemRarity.TIER1).setCollection("Beta").setFilterMT("heavy");
	public static final CloudItem NOVA_INFUSED = new CloudItemGun(1604, 4040, "Nova").setSuffix("Infused").setValue(CloudItemRarity.TIER3).setCollection("Clash").setFilterMT("heavy");
	public static final CloudItem NOVA_GHOST = new CloudItemGun(1605, 4040, "Nova").setSuffix("Ghost").setValue(CloudItemRarity.TIER3).setCollection("Phantom").setFilterMT("heavy");

	public static final CloudItem SAWEDOFF_JUNK = new CloudItemGun(1654, 4041, "Sawed-Off").setSuffix("Junk").setValue(CloudItemRarity.TIER1).setCollection("Mythic").setFilterMT("heavy");
	public static final CloudItem SAWEDOFF_SOUNDWAVE = new CloudItemGun(1655, 4041, "Sawed-Off").setSuffix("Soundwave").setValue(CloudItemRarity.TIER2).setCollection("Gamma").setFilterMT("heavy");
	public static final CloudItem SAWEDOFF_POTATO = new CloudItemGun(1656, 4041, "Sawed-Off").setSuffix("Potato").setValue(CloudItemRarity.TIER1).setCollection("Epsilon").setFilterMT("heavy");
	public static final CloudItem SAWEDOFF_ORANGE = new CloudItemGun(1657, 4041, "Sawed-Off").setSuffix("Orange").setValue(CloudItemRarity.TIER2).setCollection("Elemental").setFilterMT("heavy");

	public static final CloudItem MAG7_BULLDOZER = new CloudItemGun(1703, 4042, "Mag-7").setSuffix("Bulldozer").setValue(CloudItemRarity.TIER1).setCollection("Alpha").setFilterMT("heavy");
	public static final CloudItem MAG7_SEABIRD = new CloudItemGun(1704, 4042, "Mag-7").setSuffix("Seabird").setValue(CloudItemRarity.TIER1).setCollection("Gamma").setFilterMT("heavy");

	public static final CloudItem M249_HEATSYNC = new CloudItemGun(1753, 4043, "M249").setSuffix("Heatsync").setValue(CloudItemRarity.TIER1).setCollection("Alpha").setFilterMT("heavy");
	public static final CloudItem M249_LOUDMOUTH = new CloudItemGun(1754, 4043, "M249").setSuffix("Loudmouth").setValue(CloudItemRarity.TIER2).setCollection("Epsilon").setFilterMT("heavy");
	public static final CloudItem M249_TACTICAL_FOREST = new CloudItemGun(1755, 4043, "M249").setSuffix("Tactical Forest").setValue(CloudItemRarity.TIER3).setCollection("Gamma").setFilterMT("heavy");
	public static final CloudItem M249_COG_SYSTEM_SCHEME = new CloudItemGun(1756, 4043, "M249").setSuffix("Cog System Scheme").setValue(CloudItemRarity.TIER3).setCollection("Vectorized").setFilterMT("heavy");

	public static final CloudItem CZ75_GREEN = new CloudItemGun(1802, 4015, "CZ75").setSuffix("Green").setValue(CloudItemRarity.TIER1).setCollection("Beta").setFilterMT("pistol");
	public static final CloudItem CZ75_TIGER = new CloudItemGun(1803, 4015, "CZ75").setSuffix("Tiger").setValue(CloudItemRarity.TIER3).setCollection("Oasis").setFilterMT("pistol");
	public static final CloudItem CZ75_ASMO = new CloudItemGun(1804, 4015, "CZ75").setSuffix("Asmo").setValue(CloudItemRarity.TIER4).setCollection("Revolution").setFilterMT("pistol");
	public static final CloudItem CZ75_NEONPAW = new CloudItemGun(1805, 4015, "CZ75").setSuffix("Neonpaw").setValue(CloudItemRarity.TIER3).setCollection("Vectorized").setFilterMT("pistol");
	public static final CloudItem CZ75_GHOST = new CloudItemGun(1806, 4015, "CZ75").setSuffix("Ghost").setValue(CloudItemRarity.TIER2).setCollection("Phantom").setFilterMT("pistol");
	public static final CloudItem CZ75_AFTERLIFE = new CloudItemGun(1807, 4015, "CZ75").setSuffix("Afterlife").setValue(CloudItemRarity.TIER2).setCollection("Sepulcher").setFilterMT("pistol");

	public static final CloudItem UMP45_XERYC = new CloudItemGun(1853, 4023, "UMP-45").setSuffix("Xeryc").setValue(CloudItemRarity.TIER2).setCollection("Beta").setFilterMT("smg");

	public static final CloudItem GUN_DISPLAY_LAPIS = new CloudItemGun(5000, 6000, "Lapis").setSuffix("Collection").setValue(CloudItemRarity.TIER3)
		.disableTrading().disableSelling().disableShowcase().disableNameable().disableContracts();
	public static final CloudItem GUN_DISPLAY_GOLD = new CloudItemGun(5001, 6001, "Gold").setSuffix("Collection").setValue(CloudItemRarity.TIER4)
		.disableTrading().disableSelling().disableShowcase().disableNameable().disableContracts();
	public static final CloudItem GUN_DISPLAY_DIAMOND = new CloudItemGun(5002, 6002, "Diamond").setSuffix("Collection").setValue(CloudItemRarity.TIER5)
		.disableTrading().disableSelling().disableShowcase().disableNameable().disableContracts();
	public static final CloudItem GUN_DISPLAY_OBSIDIAN = new CloudItemGun(5003, 6003, "Obsidian").setSuffix("Collection").setValue(CloudItemRarity.TIER6)
		.disableTrading().disableSelling().disableShowcase().disableNameable().disableContracts();

	public static final CloudItem KNIFE_TAC_PRESTIGE = new CloudItemKnife(1508, 4208, "Tac Knife").setSuffix("Prestige").setValue(CloudItemRarity.TIER6).setFilterMT("knife").setAuthor("Thlrd_");
	public static final CloudItem KNIFE_TAC_AUTOTRONIC = new CloudItemKnife(1509, 4209, "Tac Knife").setSuffix("Autotronic").setValue(CloudItemRarity.TIER6).setFilterMT("knife");
	public static final CloudItem KNIFE_TAC_BLACKOUT = new CloudItemKnife(1540, 4240, "Tac Knife").setSuffix("Blackout").setValue(CloudItemRarity.TIER6).setFilterMT("knife");
	public static final CloudItem KNIFE_TAC_RUBY = new CloudItemKnife(1541, 4241, "Tac Knife").setSuffix("Ruby").setValue(CloudItemRarity.TIER6).setFilterMT("knife");
	public static final CloudItem KNIFE_TAC_FADE = new CloudItemKnife(1542, 4242, "Tac Knife").setSuffix("Fade").setValue(CloudItemRarity.TIER6).setFilterMT("knife");
	public static final CloudItem KNIFE_TAC_RUST = new CloudItemKnife(1543, 4243, "Tac Knife").setSuffix("Rust").setValue(CloudItemRarity.TIER6).setFilterMT("knife");
	public static final CloudItem KNIFE_TAC_ETHERFIRE = new CloudItemKnife(1544, 4244, "Tac Knife").setSuffix("Etherfire").setValue(CloudItemRarity.TIER6).setFilterMT("knife");
	public static final CloudItem KNIFE_TAC_WATERMELON = new CloudItemKnife(1545, 4245, "Tac Knife").setSuffix("Watermelon").setValue(CloudItemRarity.TIER6).setFilterMT("knife");
	public static final CloudItem KNIFE_TAC_INVERTED = new CloudItemKnife(1546, 4246, "Tac Knife").setSuffix("Inverted").setValue(CloudItemRarity.TIER6).setFilterMT("knife");

	public static final CloudItem KNIFE_BAY_PRESTIGE = new CloudItemKnife(1518, 4218, "Bayonet").setSuffix("Prestige").setValue(CloudItemRarity.TIER6).setFilterMT("knife").setAuthor("Thlrd_");
	public static final CloudItem KNIFE_BAY_AUTOTRONIC = new CloudItemKnife(1519, 4219, "Bayonet").setSuffix("Autotronic").setValue(CloudItemRarity.TIER6).setFilterMT("knife");
	public static final CloudItem KNIFE_BAY_BLACKOUT = new CloudItemKnife(1550, 4250, "Bayonet").setSuffix("Blackout").setValue(CloudItemRarity.TIER6).setFilterMT("knife");
	public static final CloudItem KNIFE_BAY_RUBY = new CloudItemKnife(1551, 4251, "Bayonet").setSuffix("Ruby").setValue(CloudItemRarity.TIER6).setFilterMT("knife");
	public static final CloudItem KNIFE_BAY_FADE = new CloudItemKnife(1552, 4252, "Bayonet").setSuffix("Fade").setValue(CloudItemRarity.TIER6).setFilterMT("knife");
	public static final CloudItem KNIFE_BAY_RUST = new CloudItemKnife(1553, 4253, "Bayonet").setSuffix("Rust").setValue(CloudItemRarity.TIER6).setFilterMT("knife");
	public static final CloudItem KNIFE_BAY_ETHERFIRE = new CloudItemKnife(1554, 4254, "Bayonet").setSuffix("Etherfire").setValue(CloudItemRarity.TIER6).setFilterMT("knife");
	public static final CloudItem KNIFE_BAY_WATERMELON = new CloudItemKnife(1555, 4255, "Bayonet").setSuffix("Watermelon").setValue(CloudItemRarity.TIER6).setFilterMT("knife");
	public static final CloudItem KNIFE_BAY_INVERTED = new CloudItemKnife(1556, 4256, "Bayonet").setSuffix("Inverted").setValue(CloudItemRarity.TIER6).setFilterMT("knife");

	public static final CloudItem KNIFE_KAR_PRESTIGE = new CloudItemKnife(1528, 4228, "Karambit").setSuffix("Prestige").setValue(CloudItemRarity.TIER6).setFilterMT("knife").setAuthor("Thlrd_");
	public static final CloudItem KNIFE_KAR_AUTOTRONIC = new CloudItemKnife(1529, 4229, "Karambit").setSuffix("Autotronic").setValue(CloudItemRarity.TIER6).setFilterMT("knife");
	public static final CloudItem KNIFE_KAR_BLACKOUT = new CloudItemKnife(1560, 4260, "Karambit").setSuffix("Blackout").setValue(CloudItemRarity.TIER6).setFilterMT("knife");
	public static final CloudItem KNIFE_KAR_RUBY = new CloudItemKnife(1561, 4261, "Karambit").setSuffix("Ruby").setValue(CloudItemRarity.TIER6).setFilterMT("knife");
	public static final CloudItem KNIFE_KAR_FADE = new CloudItemKnife(1562, 4262, "Karambit").setSuffix("Fade").setValue(CloudItemRarity.TIER6).setFilterMT("knife");
	public static final CloudItem KNIFE_KAR_RUST = new CloudItemKnife(1563, 4263, "Karambit").setSuffix("Rust").setValue(CloudItemRarity.TIER6).setFilterMT("knife");
	public static final CloudItem KNIFE_KAR_ETHERFIRE = new CloudItemKnife(1564, 4264, "Karambit").setSuffix("Etherfire").setValue(CloudItemRarity.TIER6).setFilterMT("knife");
	public static final CloudItem KNIFE_KAR_WATERMELON = new CloudItemKnife(1565, 4265, "Karambit").setSuffix("Watermelon").setValue(CloudItemRarity.TIER6).setFilterMT("knife");
	public static final CloudItem KNIFE_KAR_INVERTED = new CloudItemKnife(1566, 4266, "Karambit").setSuffix("Inverted").setValue(CloudItemRarity.TIER6).setFilterMT("knife");

	public static final CloudItem KNIFE_BFL_MARBLE = new CloudItemKnife(1531, 4231, "Butterfly").setSuffix("Marble").setValue(CloudItemRarity.TIER6).setFilterMT("knife");
	public static final CloudItem KNIFE_BFL_TIGER = new CloudItemKnife(1532, 4232, "Butterfly").setSuffix("Tiger").setValue(CloudItemRarity.TIER6).setFilterMT("knife");
	public static final CloudItem KNIFE_BFL_STEEL = new CloudItemKnife(1533, 4233, "Butterfly").setSuffix("Steel").setValue(CloudItemRarity.TIER6).setFilterMT("knife");
	public static final CloudItem KNIFE_BFL_DOPPLER = new CloudItemKnife(1534, 4234, "Butterfly").setSuffix("Doppler").setValue(CloudItemRarity.TIER6).setFilterMT("knife");
	public static final CloudItem KNIFE_BFL_LORE = new CloudItemKnife(1535, 4235, "Butterfly").setSuffix("Lore").setValue(CloudItemRarity.TIER6).setFilterMT("knife");
	public static final CloudItem KNIFE_BFL_GAMMA = new CloudItemKnife(1536, 4236, "Butterfly").setSuffix("Gamma").setValue(CloudItemRarity.TIER6).setFilterMT("knife");
	public static final CloudItem KNIFE_BFL_PRESTIGE = new CloudItemKnife(1538, 4238, "Butterfly").setSuffix("Prestige").setValue(CloudItemRarity.TIER6).setFilterMT("knife").setAuthor("Thlrd_");
	public static final CloudItem KNIFE_BFL_AUTOTRONIC = new CloudItemKnife(1539, 4239, "Butterfly").setSuffix("Autotronic").setValue(CloudItemRarity.TIER6).setFilterMT("knife");
	public static final CloudItem KNIFE_BFL_BLACKOUT = new CloudItemKnife(1570, 4270, "Butterfly").setSuffix("Blackout").setValue(CloudItemRarity.TIER6).setFilterMT("knife");
	public static final CloudItem KNIFE_BFL_RUBY = new CloudItemKnife(1571, 4271, "Butterfly").setSuffix("Ruby").setValue(CloudItemRarity.TIER6).setFilterMT("knife");
	public static final CloudItem KNIFE_BFL_FADE = new CloudItemKnife(1572, 4272, "Butterfly").setSuffix("Fade").setValue(CloudItemRarity.TIER6).setFilterMT("knife");
	public static final CloudItem KNIFE_BFL_RUST = new CloudItemKnife(1573, 4273, "Butterfly").setSuffix("Rust").setValue(CloudItemRarity.TIER6).setFilterMT("knife");
	public static final CloudItem KNIFE_BFL_ETHERFIRE = new CloudItemKnife(1574, 4274, "Butterfly").setSuffix("Etherfire").setValue(CloudItemRarity.TIER6).setFilterMT("knife");
	public static final CloudItem KNIFE_BFL_WATERMELON = new CloudItemKnife(1575, 4275, "Butterfly").setSuffix("Watermelon").setValue(CloudItemRarity.TIER6).setFilterMT("knife");
	public static final CloudItem KNIFE_BFL_INVERTED = new CloudItemKnife(1576, 4276, "Butterfly").setSuffix("Inverted").setValue(CloudItemRarity.TIER6).setFilterMT("knife");

	public static final CloudItem CASE_KEY_PRESTIGE = new CloudItemKey(4500, 5500, "Key").setSuffix("Prestige").setValue(CloudItemRarity.TIER1);
	public static final CloudItem CASE_KEY_ALPHA = new CloudItemKey(4501, 5501, "Key").setSuffix("Alpha").setValue(CloudItemRarity.TIER1);
	public static final CloudItem CASE_KEY_BETA = new CloudItemKey(4502, 5502, "Key").setSuffix("Beta").setValue(CloudItemRarity.TIER1);
	public static final CloudItem CASE_KEY_GAMMA = new CloudItemKey(4503, 5503, "Key").setSuffix("Gamma").setValue(CloudItemRarity.TIER1);
	public static final CloudItem CASE_KEY_DELTA = new CloudItemKey(4504, 5504, "Key").setSuffix("Delta").setValue(CloudItemRarity.TIER1);
	public static final CloudItem CASE_KEY_EPSILON = new CloudItemKey(4505, 5505, "Key").setSuffix("Epsilon").setValue(CloudItemRarity.TIER1);
	public static final CloudItem CASE_KEY_CHRONICAL = new CloudItemKey(4506, 5506, "Key").setSuffix("Chronical").setValue(CloudItemRarity.TIER1);
	public static final CloudItem CASE_KEY_MYTHIC = new CloudItemKey(4507, 5507, "Key").setSuffix("Mythic").setValue(CloudItemRarity.TIER1);
	public static final CloudItem CASE_KEY_OASIS = new CloudItemKey(4508, 5508, "Key").setSuffix("Oasis").setValue(CloudItemRarity.TIER1);
	public static final CloudItem CASE_KEY_CLASH = new CloudItemKey(4509, 5509, "Key").setSuffix("Clash").setValue(CloudItemRarity.TIER1);
	public static final CloudItem CASE_KEY_ELEMENTAL = new CloudItemKey(4510, 5510, "Key").setSuffix("Elemental").setValue(CloudItemRarity.TIER1);
	public static final CloudItem CASE_KEY_REVOLUTION = new CloudItemKey(4511, 5511, "Key").setSuffix("Revolution").setValue(CloudItemRarity.TIER1);
	public static final CloudItem CASE_KEY_VECTORIZED = new CloudItemKey(4512, 5512, "Key").setSuffix("Vectorized").setValue(CloudItemRarity.TIER1);
	public static final CloudItem CASE_KEY_BIOMECHANIC = new CloudItemKey(4513, 5513, "Key").setSuffix("Biomech").setValue(CloudItemRarity.TIER1);
	public static final CloudItem CASE_KEY_PHANTASMAGORIA = new CloudItemKey(4514, 5514, "Key").setSuffix("Phantom").setValue(CloudItemRarity.TIER1);
	public static final CloudItem CASE_KEY_SEPULCHER = new CloudItemKey(4515, 5515, "Key").setSuffix("Sepulcher").setValue(CloudItemRarity.TIER1);

	public static final CloudItem CASE_PRESTIGE = new CloudItemCase(2000, 4100, "Prestige", 4500)
		.addContent(KNIFE_TAC_DISPLAY, 0)
		.addContent(GUN_DISPLAY_OBSIDIAN, 0)
		.addContent(GUN_DISPLAY_DIAMOND, 0)
		.addContent(GUN_DISPLAY_GOLD, 0)
		.addContent(GUN_DISPLAY_LAPIS, 0)
		.setSuffix("Case").setValue(CloudItemRarity.TIER6).setFilterMT("case").disableNameable().disableShowcase().disableContracts();
	public static final CloudItem CASE_ALPHA = new CloudItemCase(2001, 4101, "Alpha", 4501)
		.addContent(KNIFE_TAC_DISPLAY, 0)
		.addContent(AWP_MECHA_DRAGON, 0)
		.addContent(AK47_VULCAN, 0)
		.addContent(M4A4_ASMO, 0)
		.addContent(DEAGLE_WATERMELON, 0)
		.addContent(UMP45_PRIMAL, 0)
		.addContent(SAWEDOFF_KRAKEN, 0)
		.addContent(M1911_DRAGON, 0)
		.addContent(FNFAL_VENOM, 0)
		.addContent(G18_CYREX, 0)
		.addContent(SCAR20_CYREX, 0)
		.addContent(P90_ARROW, 0)
		.addContent(MAG7_BULLDOZER, 0)
		.addContent(M249_HEATSYNC, 0)
		.addContent(DRAGUNOV_JUNGLE, 0)
		.setSuffix("Case").setValue(CloudItemRarity.TIER1).setFilterMT("case").disableNameable().disableShowcase().disableContracts();
	public static final CloudItem CASE_BETA = new CloudItemCase(2002, 4102, "Beta", 4502)
		.addContent(KNIFE_TAC_DISPLAY, 0)
		.addContent(G18_HIGHROLLER, 0)
		.addContent(SCAR20_SPORT, 0)
		.addContent(AWP_DRAGON, 0)
		.addContent(AK47_ASMO, 0)
		.addContent(G18_FADE, 0)
		.addContent(FNFAL_REBEL, 0)
		.addContent(M4A4_CAKEY, 0)
		.addContent(M1911_VENOM, 0)
		.addContent(AK47_FUEL, 0)
		.addContent(UMP45_XERYC, 0)
		.addContent(AWP_REDLINE, 0)
		.addContent(NOVA_JUNK, 0)
		.addContent(CZ75_GREEN, 0)
		.addContent(FAMAS_PULSE, 0)
		.setSuffix("Case").setValue(CloudItemRarity.TIER1).setFilterMT("case").disableNameable().disableShowcase().disableContracts();
	public static final CloudItem CASE_GAMMA = new CloudItemCase(2003, 4103, "Gamma", 4503)
		.addContent(KNIFE_TAC_DISPLAY, 0)
		.addContent(M4A4_EVILDAIMYO, 0)
		.addContent(DEAGLE_BLOODSPORT, 0)
		.addContent(AK47_IRON_BEAST, 0)
		.addContent(DEAGLE_FLATLINE, 0)
		.addContent(M249_TACTICAL_FOREST, 0)
		.addContent(AWP_ELECTRIC_ARCHIVE, 0)
		.addContent(SAWEDOFF_SOUNDWAVE, 0)
		.addContent(FNFAL_RACE, 0)
		.addContent(VECTOR_BLOODYEQUATION, 0)
		.addContent(MAC10_CANDY_APPLE, 0)
		.addContent(MAG7_SEABIRD, 0)
		.addContent(SCAR20_POWERCORE, 0)
		.setSuffix("Case").setValue(CloudItemRarity.TIER1).setFilterMT("case").disableNameable().disableShowcase().disableContracts();
	public static final CloudItem CASE_DELTA = new CloudItemCase(2004, 4104, "Delta", 4504)
		.addContent(KNIFE_TAC_DISPLAY, 0)
		.addContent(AWP_OCEANDEPTH, 0)
		.addContent(P90_MEDICINE, 0)
		.addContent(M4A4_SPORT, 0)
		.addContent(M4A4_VERTEX, 0)
		.addContent(AK47_GRAFFITI, 0)
		.addContent(AWP_AKARI, 0)
		.addContent(M249_NEON, 0)
		.addContent(TEC9_HORNET, 0)
		.addContent(P250_IRRADIATED, 0)
		.addContent(SAWEDOFF_MIDNIGHT, 0)
		.addContent(DEAGLE_CIRCUIT, 0)
		.addContent(MAC10_CIRCUIT, 0)
		.setSuffix("Case").setValue(CloudItemRarity.TIER1).setFilterMT("case").disableNameable().disableShowcase().disableContracts();
	public static final CloudItem CASE_EPSILON = new CloudItemCase(2005, 4105, "Epsilon", 4505)
		.addContent(KNIFE_TAC_DISPLAY, 0)
		.addContent(NOVA_HYPER_BEAST, 0)
		.addContent(DEAGLE_FADE, 0)
		.addContent(AWP_CROWD, 0)
		.addContent(P250_NIPPON, 0)
		.addContent(AK47_FOX, 0)
		.addContent(DEAGLE_KUMICHO_DRAGON, 0)
		.addContent(AK47_STRIPE, 0)
		.addContent(G18_RACE, 0)
		.addContent(M249_LOUDMOUTH, 0)
		.addContent(G18_URBAN, 0)
		.addContent(SAWEDOFF_POTATO, 0)
		.addContent(M1911_RAIN, 0)
		.setSuffix("Case").setValue(CloudItemRarity.TIER1).setFilterMT("case").disableNameable().disableShowcase().disableContracts();
	public static final CloudItem CASE_CHRONICAL = new CloudItemCase(2006, 4106, "Chronical", 4506)
		.addContent(KNIFE_TAC_DISPLAY, 0)
		.addContent(SCAR20_UNICORN, 0)
		.addContent(AK47_FRONTSIDE, 0)
		.addContent(P250_BEAST, 0)
		.addContent(FAMAS_VULCAN, 0)
		.addContent(AWP_BOOM, 0)
		.addContent(DEAGLE_DEADHORIZON, 0)
		.addContent(FNFAL_SHOCKER, 0)
		.addContent(DEAGLE_NIGHTRAZER, 0)
		.addContent(M1911_SHOCK, 0)
		.addContent(SCAR20_ARCTIC, 0)
		.addContent(P90_RUBY, 0)
		.addContent(TEC9_QUAKORONIC, 0)
		.setSuffix("Case").setValue(CloudItemRarity.TIER1).setFilterMT("case").disableNameable().disableShowcase().disableContracts();
	public static final CloudItem CASE_MYTHIC = new CloudItemCase(2007, 4107, "Mythic", 4507)
		.addContent(KNIFE_TAC_DISPLAY, 0)
		.addContent(M4A4_DESOLATE_SPACE, 0)
		.addContent(DRAGUNOV_WORMGOD, 0)
		.addContent(AWP_BEAST, 0)
		.addContent(FNFAL_ASMO, 0)
		.addContent(P90_KRAKEN, 0)
		.addContent(M1911_BLAZE, 0)
		.addContent(TEC9_TORQUE, 0)
		.addContent(VECTOR_SLIME, 0)
		.addContent(FAMAS_RYBUS, 0)
		.addContent(DRAGUNOV_STEAMPUNK, 0)
		.addContent(DEAGLE_MYSTIC, 0)
		.addContent(SAWEDOFF_JUNK, 0)
		.addContent(SCAR20_ELITE, 0)
		.setSuffix("Case").setValue(CloudItemRarity.TIER1).setFilterMT("case").disableNameable().disableShowcase().disableContracts();
	public static final CloudItem CASE_OASIS = new CloudItemCase(2008, 4108, "Oasis", 4508)
		.addContent(KNIFE_TAC_DISPLAY, 0)
		.addContent(AK47_HORUS, 0)
		.addContent(MAC10_CHICKEN, 0)
		.addContent(M1911_TRIARK, 0)
		.addContent(FNFAL_VAPORWAVE, 0)
		.addContent(CZ75_TIGER, 0)
		.addContent(AWP_MANOWAR, 0)
		.addContent(R8_GOLD, 0)
		.addContent(DRAGUNOV_SKY, 0)
		.addContent(MAG7_ROYALFIRE, 0)
		.addContent(G18_HORNET, 0)
		.addContent(M4A4_DESERT, 0)
		.addContent(P250_DUNE, 0)
		.addContent(FAMAS_SANDSTORM, 0)
		.setSuffix("Case").setValue(CloudItemRarity.TIER1).setFilterMT("case").disableNameable().disableShowcase().disableContracts();
	public static final CloudItem CASE_CLASH = new CloudItemCase(2009, 4109, "Clash", 4509)
		.addContent(KNIFE_TAC_DISPLAY, 0)
		.addContent(AK47_PROPAGANDA, 0)
		.addContent(MAC10_NEON, 0)
		.addContent(AWP_ASMO, 0)
		.addContent(R8_FADE, 0)
		.addContent(AK47_MACAW, 0)
		.addContent(NOVA_INFUSED, 0)
		.addContent(M4A4_NERFED, 0)
		.addContent(MAC10_RACE, 0)
		.addContent(TEC9_FUEL, 0)
		.addContent(DEAGLE_COBALT, 0)
		.addContent(FNFAL_STAIN, 0)
		.addContent(DRAGUNOV_ELITE, 0)
		.addContent(FAMAS_COBALT, 0)
		.setSuffix("Case").setValue(CloudItemRarity.TIER1).setFilterMT("case").disableNameable().disableShowcase().disableContracts();
	public static final CloudItem CASE_ELEMENTAL = new CloudItemCase(2010, 4110, "Elemental", 4510)
		.addContent(KNIFE_TAC_DISPLAY, 0)
		.addContent(M4A4_HOWL, 0)
		.addContent(AWP_LIGHTNING, 0)
		.addContent(TEC9_CHERRY, 0)
		.addContent(MAC10_FADE, 0)
		.addContent(FAMAS_NUCLEAR, 0)
		.addContent(M1911_GOLD, 0)
		.addContent(DEAGLE_GOLD, 0)
		.addContent(M4A4_WAVES, 0)
		.addContent(NOVA_OXIDEBLAZE, 0)
		.addContent(SAWEDOFF_ORANGE, 0)
		.addContent(P90_RUST, 0)
		.addContent(VECTOR_SUNNY, 0)
		.addContent(G18_DEEP_BLUE, 0)
		.setSuffix("Case").setValue(CloudItemRarity.TIER1).setFilterMT("case").disableNameable().disableShowcase().disableContracts();
	public static final CloudItem CASE_REVOLUTION = new CloudItemCase(2011, 4111, "Revolution", 4511)
		.addContent(KNIFE_TAC_DISPLAY, 0)
		.addContent(FAMAS_WARHAWK, 0)
		.addContent(SAWEDOFF_WASTELANDPRINCESS, 0)
		.addContent(CZ75_ASMO, 0)
		.addContent(AK47_XRAY, 0)
		.addContent(P250_CITY, 0)
		.addContent(TEC9_AQUARIUM, 0)
		.addContent(M4A4_LURKER, 0)
		.addContent(M1911_INDIRECT, 0)
		.addContent(P90_MODULE, 0)
		.addContent(MAC10_VIOLET, 0)
		.addContent(DEAGLE_DEVI, 0)
		.addContent(M1911_OLDWEST, 0)
		.setSuffix("Case").setValue(CloudItemRarity.TIER1).setFilterMT("case").disableNameable().disableShowcase().disableContracts();
	public static final CloudItem CASE_VECTORIZED = new CloudItemCase(2012, 4112, "Vectorized", 4512)
		.addContent(KNIFE_TAC_DISPLAY, 0)
		.addContent(VECTOR_EXTINCT, 0)
		.addContent(MAC10_ASMO, 0)
		.addContent(AK47_BLOODSPORT, 0)
		.addContent(G18_VULCAN, 0)
		.addContent(CZ75_NEONPAW, 0)
		.addContent(M249_COG_SYSTEM_SCHEME, 0)
		.addContent(M4A4_CYREX, 0)
		.addContent(VECTOR_ARCTIC, 0)
		.addContent(SCAR20_SHOCK, 0)
		.addContent(AWP_FOREST, 0)
		.addContent(DEAGLE_NAVY, 0)
		.addContent(G18_CANDY_APPLE, 0)
		.setSuffix("Case").setValue(CloudItemRarity.TIER1).setFilterMT("case").disableNameable().disableShowcase().disableContracts();
	public static final CloudItem CASE_BIOMECHANIC = new CloudItemCase(2013, 4113, "Biomech", 4513)
		.addContent(KNIFE_TAC_DISPLAY, 0)
		.addContent(P250_SEEYALATER, 0)
		.addContent(AWP_STEAMPUNK, 0)
		.addContent(M4A4_GOLDEN_COIL, 0)
		.addContent(G18_MOONRISE, 0)
		.addContent(TEC9_ECO, 0)
		.addContent(DEAGLE_MECHAINDUSTRIES, 0)
		.addContent(M4A4_DAYBREAK, 0)
		.addContent(FAMAS_AKARI, 0)
		.addContent(AK47_SHIKARI, 0)
		.addContent(VECTOR_CIRCUIT, 0)
		.addContent(G18_CIRCUIT, 0)
		.addContent(P250_ARCTIC, 0)
		.setSuffix("Case").setValue(CloudItemRarity.TIER1).setFilterMT("case").disableNameable().disableShowcase().disableContracts();
	public static final CloudItem CASE_PHANTASMAGORIA = new CloudItemCase(2014, 4114, "Phantom", 4514)
		.addContent(KNIFE_TAC_DISPLAY, 0)
		.addContent(AK47_CREEP, 0)
		.addContent(P90_GRIM, 0)
		.addContent(M4A4_PUMPKIN, 0)
		.addContent(MAC10_SPIDER, 0)
		.addContent(AWP_BONES, 0)
		.addContent(VECTOR_ORTHUS, 0)
		.addContent(NOVA_GHOST, 0)
		.addContent(MAC10_PUMPKIN, 0)
		.addContent(CZ75_GHOST, 0)
		.addContent(FAMAS_SPOOKY, 0)
		.addContent(G18_GHOUL, 0)
		.addContent(M249_GHOST, 0)
		.addContent(M1911_TUXEDO, 0)
		.setSuffix("Case").setValue(CloudItemRarity.TIER1).setFilterMT("case").disableNameable().disableShowcase().disableContracts();
	public static final CloudItem CASE_SEPULCHER = new CloudItemCase(2015, 4115, "Sepulcher", 4515)
		.addContent(KNIFE_TAC_DISPLAY, 0)
		.addContent(AK47_HAUNTED, 0)
		.addContent(MAG7_VAMPIRE, 0)
		.addContent(AWP_PUMPKIN, 0)
		.addContent(DEAGLE_GRIN, 0)
		.addContent(AK47_BONES, 0)
		.addContent(P250_HAUNTED, 0)
		.addContent(MAC10_SWARM, 0)
		.addContent(UMP45_EDIFICE, 0)
		.addContent(CZ75_AFTERLIFE, 0)
		.addContent(DRAGUNOV_GHOST, 0)
		.addContent(M1911_MUMMY, 0)
		.addContent(G18_GHOST, 0)
		.setSuffix("Case").setValue(CloudItemRarity.TIER1).setFilterMT("case").disableNameable().disableShowcase().disableContracts();

	private CCCRCloudItems() {
	}

	public static void init() {
		for (Field itemField : CloudItem.class.getFields()) {
			if (!(Modifier.isStatic(itemField.getModifiers()) && itemField.getType() == CloudItem.class)) {
				continue;
			}
			CloudItem item;
			try {
				item = (CloudItem) itemField.get(null);
			} catch (IllegalAccessException e) {
				throw new RuntimeException(e);
			}
			if (item.isDefault()) {
				continue;
			}
			if (item instanceof CloudItemKnife) {
				item.setValue(CloudItemRarity.TIER6);
			}
		}

		M4A4_WAVES.setValue(CloudItemRarity.TIER2).setCollection("Elemental");
		M4A4_EVILDAIMYO.setValue(CloudItemRarity.TIER5).setCollection("Gamma");
		M4A4_CAKEY.setValue(CloudItemRarity.TIER3).setCollection("Beta");
		M4A4_HOWL.setValue(CloudItemRarity.TIER6).setCollection("Elemental");
		M4A4_NERFED.setValue(CloudItemRarity.TIER3).setCollection("Clash");
		M4A4_PUMPKIN.setValue(CloudItemRarity.TIER4).setCollection("Phantom");
		M4A4_PATRIOT.setValue(CloudItemRarity.TIER3).setCollection("Cheats");
		AK47_PROPAGANDA.setValue(CloudItemRarity.TIER5).setCollection("Clash");
		AK47_ASMO.setValue(CloudItemRarity.TIER4).setCollection("Beta");
		AK47_NEONREVOLUTION.setValue(CloudItemRarity.TIER4).setCollection("Cheats");
		AK47_HAUNTED.setValue(CloudItemRarity.TIER5).setCollection("Sepulcher");
		AK47_BLOODSPORT.setValue(CloudItemRarity.TIER4).setCollection("Vectorized");
		AK47_FOX.setValue(CloudItemRarity.TIER3).setCollection("Epsilon");
		FAMAS_AKARI.setValue(CloudItemRarity.TIER2).setCollection("Biomech");
		FAMAS_WARHAWK.setValue(CloudItemRarity.TIER5).setCollection("Revolution");
		FAMAS_SPOOKY.setValue(CloudItemRarity.TIER2).setCollection("Phantom");
		FNFAL_VAPORWAVE.setValue(CloudItemRarity.TIER4).setCollection("Oasis");
		FNFAL_ASMO.setValue(CloudItemRarity.TIER4).setCollection("Mythic");
		M1911_DRAGON.setValue(CloudItemRarity.TIER3).setCollection("Alpha");
		M1911_TUXEDO.setValue(CloudItemRarity.TIER1).setCollection("Phantom");
		G18_RACE.setValue(CloudItemRarity.TIER2).setCollection("Epsilon");
		G18_HIGHROLLER.setValue(CloudItemRarity.TIER6).setCollection("Beta");
		G18_DEEP_BLUE.setValue(CloudItemRarity.TIER1).setCollection("Elemental");
		TEC9_QUAKORONIC.setValue(CloudItemRarity.TIER1).setCollection("Chronical");
		TEC9_ECO.setValue(CloudItemRarity.TIER3).setCollection("Biomech");
		TEC9_AQUARIUM.setValue(CloudItemRarity.TIER3).setCollection("Revolution");
		DEAGLE_NIGHTRAZER.setValue(CloudItemRarity.TIER2).setCollection("Chronical");
		DEAGLE_DEADHORIZON.setValue(CloudItemRarity.TIER3).setCollection("Chronical");
		DEAGLE_GRIN.setValue(CloudItemRarity.TIER3).setCollection("Sepulcher");
		P250_IRRADIATED.setValue(CloudItemRarity.TIER2).setCollection("Delta");
		P250_SEEYALATER.setValue(CloudItemRarity.TIER5).setCollection("Biomech");
		P250_CITY.setValue(CloudItemRarity.TIER3).setCollection("Revolution");
		P250_BEAST.setValue(CloudItemRarity.TIER4).setCollection("Chronical");
		P90_RUST.setValue(CloudItemRarity.TIER1).setCollection("Elemental");
		P90_KRAKEN.setValue(CloudItemRarity.TIER3).setCollection("Mythic");
		MAC10_RACE.setValue(CloudItemRarity.TIER2).setCollection("Clash");
		MAC10_PUMPKIN.setValue(CloudItemRarity.TIER2).setCollection("Phantom");
		VECTOR_CIRCUIT.setValue(CloudItemRarity.TIER1).setCollection("Biomech");
		VECTOR_BLOODYEQUATION.setValue(CloudItemRarity.TIER2).setCollection("Gamma");
		AWP_DRAGON.setValue(CloudItemRarity.TIER5).setCollection("Beta");
		AWP_MANOWAR.setValue(CloudItemRarity.TIER3).setCollection("Oasis");
		AWP_ASMO.setValue(CloudItemRarity.TIER4).setCollection("Clash");
		AWP_BONES.setValue(CloudItemRarity.TIER3).setCollection("Phantom");
		AWP_REDLINE.setValue(CloudItemRarity.TIER2).setCollection("Beta");
		AWP_BOOM.setValue(CloudItemRarity.TIER3).setCollection("Chronical");
		DRAGUNOV_SKY.setValue(CloudItemRarity.TIER2).setCollection("Oasis");
		DRAGUNOV_STEAMPUNK.setValue(CloudItemRarity.TIER2).setCollection("Mythic");
		SCAR20_CYREX.setValue(CloudItemRarity.TIER2).setCollection("Alpha");
		SCAR20_UNICORN.setValue(CloudItemRarity.TIER6).setCollection("Chronical");
		NOVA_OXIDEBLAZE.setValue(CloudItemRarity.TIER2).setCollection("Elemental");
		NOVA_HYPER_BEAST.setValue(CloudItemRarity.TIER5).setCollection("Epsilon");
		SAWEDOFF_WASTELANDPRINCESS.setValue(CloudItemRarity.TIER4).setCollection("Revolution");
		SAWEDOFF_KRAKEN.setValue(CloudItemRarity.TIER3).setCollection("Alpha");
		SAWEDOFF_MIDNIGHT.setValue(CloudItemRarity.TIER1).setCollection("Delta");
		MAG7_ROYALFIRE.setValue(CloudItemRarity.TIER2).setCollection("Oasis");
		MAG7_VAMPIRE.setValue(CloudItemRarity.TIER4).setCollection("Sepulcher");
		M249_NEON.setValue(CloudItemRarity.TIER2).setCollection("Delta");
		M249_GHOST.setValue(CloudItemRarity.TIER1).setCollection("Phantom");
		CZ75_PHANTOM.setValue(CloudItemRarity.TIER4).setCollection("Cheats");
		R8_FADE.setValue(CloudItemRarity.TIER4).setCollection("Clash");
		R8_GOLD.setValue(CloudItemRarity.TIER3).setCollection("Oasis");
		UMP45_PRIMAL.setValue(CloudItemRarity.TIER4).setCollection("Alpha");
		UMP45_EDIFICE.setValue(CloudItemRarity.TIER2).setCollection("Sepulcher");
	}
}
