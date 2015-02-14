package net.canarymod.api.world.blocks;

import com.google.common.collect.HashBiMap;

/**
 * An enumeration of "vanilla" Minecraft blocks
 *
 * @author Jason Jones (darkdiplomat)
 */
public enum VanillaBlock {

    AIR("air"),
    STONE("stone:0"),
    GRANITE("stone:1"),
    POLISHEDGRANITE("stone:2"),
    DIORITE("stone:3"),
    POLISHEDDIORITE("stone:4"),
    ANDESITE("stone:5"),
    POLISHEDANDESITE("stone:6"),
    GRASS("grass"),
    DIRT("dirt:0"),
    COARSEDIRT("dirt:1"),
    PODZOL("dirt:2"),
    COBBLE("cobblestone"),
    OAKPLANKS("planks:0"),
    SPRUCEPLANKS("planks:1"),
    BIRCHPLANKS("planks:2"),
    JUNGLEPLANKS("planks:3"),
    ACACIAPLANKS("planks:4"),
    DARKOAKPLANKS("planks:5"),
    OAKSAPLING("sapling:0"),
    SPRUCESAPLING("sapling:1"),
    BIRCHSAPLING("sapling:2"),
    JUNGLESAPLING("sapling:3"),
    ACACIASAPLING("sapling:4"),
    DARKOAKSAPLING("sapling:5"),
    BEDROCK("bedrock"),
    FLOWINGWATER("flowing_water"),
    WATER("water"),
    FLOWINGLAVA("flowing_lava"),
    LAVA("lava"),
    SAND("sand:0"),
    REDSAND("sand:1"),
    GRAVEL("gravel"),
    GOLDORE("gold_ore"),
    IRONORE("iron_ore"),
    COALORE("coal_ore"),
    OAKLOG("log:0"),
    SPRUCELOG("log:1"),
    BIRCHLOG("log:2"),
    JUNGLELOG("log:3"),
    OAKLEAVES("leaves:0"),
    SPRUCELEAVES("leaves:1"),
    BIRCHLEAVES("leaves:2"),
    JUNGLELEAVES("leaves:3"),
    SPONGE("sponge"),
    GLASS("glass"),
    LAPISORE("lapis_ore"),
    LAPISBLOCK("lapis_block"),
    DISPENSER("dispenser"),
    SANDSTONE("sandstone:0"),
    SANDSTONECHISELED("sandstone:1"),
    SANDSTONESMOOTH("sandstone:2"),
    NOTEBLOCK("noteblock"),
    BED("bed"),
    POWEREDRAIL("golden_rail"),
    DETECTORRAIL("detector_rail"),
    STICKYPISTON("sticky_piston"),
    WEB("web"),
    SHRUB("tallgrass:0"), // Dead Bush?
    TALLGRASS("tallgrass:1"),
    FERN("tallgrass:2"),
    DEADBUSH("deadbush"),
    PISTON("piston"),
    PISTONHEAD("piston_head"),
    WHITEWOOL("wool:0"),
    ORANGEWOOL("wool:1"),
    MAGENTAWOOL("wool:2"),
    LIGHTBLUEWOOL("wool:3"),
    YELLOWOOL("wool:4"),
    LIMEWOOL("wool:5"),
    PINKWOOL("wool:6"),
    GRAYWOOL("wool:7"),
    LIGHTGRAYWOOL("wool:8"),
    CYANWOOL("wool:9"),
    PURPLEWOOL("wool:10"),
    BLUEWOOL("wool:11"),
    BROWNWOOL("wool:12"),
    GREENWOOL("wool:13"),
    REDWOOL("wool:14"),
    BLACKWOOL("wool:15"),
    PISTONEXTENSION("piston_extension"),
    DANDELION("yellow_flower"),
    POPPY("red_flower:0"),
    BLUEORCHID("red_flower:1"),
    ALLIUM("red_flower:2"),
    AZUREBLUET("red_flower:3"),
    REDTULIP("red_flower:4"),
    ORANGETULIP("red_flower:5"),
    WHITETULIP("red_flower:6"),
    PINKTULIP("red_flower:7"),
    OXEYEDAISY("red_flower:8"),
    BROWNMUSHROOM("brown_mushroom"),
    REDMUSHROOM("red_mushroom"),
    GOLDBLOCK("gold_block"),
    IRONBLOCK("iron_block"),
    DOUBLESTONESLAB("double_stone_slab:0"),
    DOUBLESANDSTONESLAB("double_stone_slab:1"),
    DOUBLEWOODSLAB("double_stone_slab:2"),
    DOUBLECOBBLESLAB("double_stone_slab:3"),
    DOUBLEBRICKSLAB("double_stone_slab:4"),
    DOUBLESTONEBRICKSLAB("double_stone_slab:5"),
    DOUBLENETHERBRICKSLAB("double_stone_slab:6"),
    DOUBLEQUARTZSLAB("double_stone_slab:7"),
    STONESLAB("stone_slab:0"),
    SANDSTONESLAB("stone_slab:1"),
    WOODSLAB("stone_slab:2"),
    COBBLESLAB("stone_slab:3"),
    BRICKSLAB("stone_slab:4"),
    STONEBRICKSSLAB("stone_slab:5"),
    NETHERBRICKSSLAB("stone_slab:6"),
    QUARTZSLAB("stone_slab:7"),
    BRICKS("brick_block"),
    TNT("tnt"),
    BOOKSHELF("bookshelf"),
    MOSSYCOBBLE("mossy_cobblestone"),
    OBSIDIAN("obsidian"),
    TORCH("torch"),
    FIRE("fire"),
    MOBSPAWNER("mob_spawner"),
    OAKSTAIRS("oak_stairs"),
    CHEST("chest"),
    REDSTONEWIRE("redstone_wire"),
    DIAMONDORE("diamond_ore"),
    DIAMONDBLOCK("diamond_block"),
    WORKBENCH("crafting_table"),
    WHEAT("wheat"),
    FARMLAND("farmland"),
    FURNACE("furnace"),
    LITFURNACE("lit_furnace"),
    STANDINGSIGN("standing_sign"),
    WOODENDOOR("wooden_door"),
    LADDER("ladder"),
    RAIL("rail"),
    STONESTAIRS("stone_stairs"),
    WALLSIGN("wall_sign"),
    LEVER("lever"),
    STONEPRESSUREPLATE("stone_pressure_plate"),
    IRONDOOR("iron_door"),
    WOODENPRESSUREPLATE("wooden_pressure_plate"),
    REDSTONEORE("redstone_ore"),
    LITREDSTONEORE("lit_redstone_ore"),
    UNLITREDSTONETORCH("unlit_redstone_torch"),
    REDSTONETORCH("redstone_torch"),
    STONEBUTTON("stone_button"),
    SNOWLAYER("snow_layer"),
    ICE("ice"),
    SNOW("snow"),
    CACTUS("cactus"),
    CLAY("clay"),
    REED("reeds"),
    JUKEBOX("jukebox"),
    FENCE("fence"),
    PUMPKIN("pumpkin"),
    NETHERRACK("netherrack"),
    SOULSAND("soul_sand"),
    GLOWSTONE("glowstone"),
    PORTAL("portal"),
    JACKOLANTERN("lit_pumpkin"),
    CAKE("cake"),
    REDSTONEREPEATEROFF("unpowered_repeater"),
    REDSTONEREPEATERON("powered_repeater"),
    WHITESTAINEDGLASS("stained_glass:0"),
    ORANGESTAINEDGLASS("stained_glass:1"),
    MAGENTASTAINEDGLASS("stained_glass:2"),
    LIGHTBLUESTAINEDGLASS("stained_glass:3"),
    YELLOWSTAINEDGLASS("stained_glass:4"),
    LIMESTAINEDGLASS("stained_glass:5"),
    PINKSTAINEDGLASS("stained_glass:6"),
    GRAYSTAINEDGLASS("stained_glass:7"),
    LIGHTGRAYSTAINEDGLASS("stained_glass:8"),
    CYANSTAINEDGLASS("stained_glass:9"),
    PURPLESTAINEDGLASS("stained_glass:10"),
    BLUESTAINEDGLASS("stained_glass:11"),
    BROWNSTAINEDGLASS("stained_glass:12"),
    GREENSTAINEDGLASS("stained_glass:13"),
    REDSTAINEDGLASS("stained_glass:14"),
    BLACKSTAINEDGLASS("stained_glass:15"),
    TRAPDOOR("trapdoor"),
    STONEMONSTEREGG("monster_egg:0"),
    COBBLEMONSTEREGG("monster_egg:1"),
    STONEBRICKMONSTEREGG("monster_egg:2"),
    MOSSYSTONEBRICKMONSTEREGG("monster_egg:3"),
    CRACKEDSTONEBRICKMONSTEREGG("monster_egg:4"),
    CHISELEDSTONEBRICKMONSTEREGG("monster_egg:5"),
    STONEBRICK("stonebrick:0"),
    MOSSYSTONEBRICK("stonebrick:1"),
    CRACKEDSTONEBRICK("stonebrick:2"),
    CHISELEDSTONEBRICK("stonebrick:3"),
    HUGEBROWNMUSHROOM("brown_mushroom_block"),
    HUGEREDMUSHROOM("red_mushroom_block"),
    IRONBARS("iron_bars"),
    GLASSPANE("glass_pane"),
    MELON("melon_block"),
    PUMPKINSTEM("pumpkin_stem"),
    MELONSTEM("melon_stem"),
    VINE("vine"),
    FENCEGATE("fence_gate"),
    BRICKSTAIRS("brick_stairs"),
    STONEBRICKSTAIRS("stone_brick_stairs"),
    MYCELIUM("mycelium"),
    LILYPAD("waterlily"),
    NETHERBRICK("nether_brick"),
    NETHERBRICKFENCE("nether_brick_fence"),
    NETHERBRICKSTAIRS("nether_brick_stairs"),
    NETHERWART("nether_wart"),
    ENCHANTMENTTABLE("enchanting_table"),
    BREWINGSTAND("brewing_stand"),
    CAULDRON("cauldron"),
    ENDPORTAL("end_portal"),
    ENDPORTALFRAME("end_portal_frame"),
    ENDSTONE("end_stone"),
    ENDERDRAGONEGG("dragon_egg"),
    REDSTONELAMP("redstone_lamp"),
    LITREDSTONELAMP("lit_redstone_lamp"),
    DOUBLEOAKWOODSLAB("double_wooden_slab:0"),
    DOUBLESPRUCEWOODSLAB("double_wooden_slab:1"),
    DOUBLEBIRCHWOODSLAB("double_wooden_slab:2"),
    DOUBLEJUNGLEWOODSLAB("double_wooden_slab:3"),
    DOUBLEACACIAWOODSLAB("double_wooden_slab:4"),
    DOUBLEDARKOAKWOODSLAB("double_wooden_slab:5"),
    OAKWOODSLAB("wooden_slab:0"),
    SPRUCEWOODSLAB("wooden_slab:1"),
    BIRCHWOODSLAB("wooden_slab:2"),
    JUNGLEWOODSLAB("wooden_slab:3"),
    ACACIAWOODSLAB("wooden_slab:4"),
    DARKOAKWOODSLAB("wooden_slab:5"),
    COCOA("cocoa"),
    SANDSTONESTAIRS("sandstone_stairs"),
    EMERALDORE("emerald_ore"),
    ENDERCHEST("ender_chest"),
    TRIPWIREHOOK("tripwire_hook"),
    TRIPWIRE("tripwire"),
    EMERALDBLOCK("emerald_block"),
    SPRUCESTAIRS("spruce_stairs"),
    BIRCHSTAIRS("birch_stairs"),
    JUNGLESTAIRS("jungle_stairs"),
    COMMANDBLOCK("command_block"),
    BEACON("beacon"),
    COBBLESTONEWALL("cobblestone_wall:0"),
    MOSSYCOBBLESTONEWALL("cobblestone_wall:1"),
    FLOWERPOT("flower_pot"),
    CARROTS("carrots"),
    POTATOES("potatoes"),
    WOODENBUTTON("wooden_button"),
    SKULL("skull"),
    ANVIL("anvil"),
    TRAPPEDCHEST("trapped_chest"),
    LIGHTWEIGHTEDPRESSUREPLATE("light_weighted_pressure_plate"),
    HEAVEWEIGHTEDPRESSUREPLATE("heavy_weighted_pressure_plate"),
    REDSTONECOMPARATOR("unpowered_comparator"),
    REDSTONECOMPARATORPOWERED("powered_comparator"),
    DAYLIGHTDETECTOR("daylight_detector"),
    REDSTONEBLOCK("redstone_block"),
    QUARTZORE("quartz_ore"),
    HOPPER("hopper"),
    QUARTZBLOCK("quartz_block:0"),
    QUARTZBLOCKCHISELED("quartz_block:1"),
    QUARTZPILLARVERTICAL("quartz_block:2"),
    QUARTZPILLARHORIZONTAL("quartz_block:3"),
    QUARTZPILLARCAP("quartz_block:4"),
    QUARTZSTAIRS("quartz_stairs"),
    ACTIVATORRAIL("activator_rail"),
    DROPPER("dropper"),
    WHITESTAINEDCLAY("stained_hardened_clay:0"),
    ORANGESTAINEDCLAY("stained_hardened_clay:1"),
    MAGENTASTAINEDCLAY("stained_hardened_clay:2"),
    LIGHTBLUESTAINEDCLAY("stained_hardened_clay:3"),
    YELLOWSTAINEDCLAY("stained_hardened_clay:4"),
    LIMESTAINEDCLAY("stained_hardened_clay:5"),
    PINKSTAINEDCLAY("stained_hardened_clay:6"),
    GRAYSTAINEDCLAY("stained_hardened_clay:7"),
    LIGHTGRAYSTAINEDCLAY("stained_hardened_clay:8"),
    CYANSTAINEDCLAY("stained_hardened_clay:9"),
    PURPLESTAINEDCLAY("stained_hardened_clay:10"),
    BLUESTAINEDCLAY("stained_hardened_clay:11"),
    BROWNSTAINEDCLAY("stained_hardened_clay:12"),
    GREENSTAINEDCLAY("stained_hardened_clay:13"),
    REDSTAINEDCLAY("stained_hardened_clay:14"),
    BLACKSTAINEDCLAY("stained_hardened_clay:15"),
    WHITEGLASSPANE("stained_glass_pane:0"),
    ORANAGEGLASSPANE("stained_glass_pane:1"),
    MAGENTAGLASSPANE("stained_glass_pane:2"),
    LIGHTBLUEGLASSPANE("stained_glass_pane:3"),
    YELLOWGLASSPANE("stained_glass_pane:4"),
    LIMEGLASSPANE("stained_glass_pane:5"),
    PINKGLASSPANE("stained_glass_pane:6"),
    GRAYGLASSPANE("stained_glass_pane:7"),
    LIGHTGRAYGLASSPANE("stained_glass_pane:8"),
    CYANGLASSPANE("stained_glass_pane:9"),
    PURPLEGLASSPANE("stained_glass_pane:10"),
    BLUEGLASSPANE("stained_glass_pane:11"),
    BROWNGLASSPANE("stained_glass_pane:12"),
    GREENGLASSPANE("stained_glass_pane:13"),
    REDGLASSPANE("stained_glass_pane:14"),
    BLACKGLASSPANE("stained_glass_pane:15"),
    ACACIALEAVES("leaves2:0"),
    DARKOAKLEAVES("leaves2:1"),
    ACACIALOG("log2:0"),
    DARKOAKLOG("log2:1"),
    ACACIASTAIRS("acacia_stairs"),
    DARKOAKSTAIRS("dark_oak_stairs"),
    SLIME("slime"),
    BARRIER("barrier"),
    IRONTRAPDOOR("iron_trapdoor"),
    PRISMARINE("prismarine:0"),
    PRISMARINEBRICKS("prismarine:1"),
    DARKPRISMARINE("prismarine:2"),
    SEALANTERN("sea_lantern"),
    HAYBALE("hay_block"),
    WHITECARPET("carpet:0"),
    ORANGECARPET("carpet:1"),
    MAGENTACARPET("carpet:2"),
    LIGHTBLUECARPET("carpet:3"),
    YELLOWCARPET("carpet:4"),
    LIMECARPET("carpet:5"),
    PINKCARPET("carpet:6"),
    GRAYCARPET("carpet:7"),
    LIGHTGRAYCARPET("carpet:8"),
    CYANCARPET("carpet:9"),
    PURPLECARPET("carpet:10"),
    BLUECARPET("carpet:11"),
    BROWNCARPET("carpet:12"),
    GREENCARPET("carpet:13"),
    REDCARPET("carpet:14"),
    BLACKCARPET("carpet:15"),
    HARDENEDCLAY("hardened_clay"),
    COALBLOCK("coal_block"),
    PACKEDICE("packed_ice"),
    SUNFLOWER("double_plant:0"),
    LILAC("double_plant:1"),
    DOUBLEGRASS("double_plant:2"),
    LARGEFERN("double_plant:3"),
    ROSEBUSH("double_plant:4"),
    PEONY("double_plant:5"),
    STANDINGBANNER("standing_banner"),
    WALLBANNER("wall_banner"),
    DAYLIGHTDETECTEDINVERTED("daylight_detector_inverted"),
    REDSANDSTONE("red_sandstone:0"),
    REDSANDSTONECHISELED("red_sandstone:1"),
    REDSANDSTONESMOOTH("red_sandstone:2"),
    REDSANDSTONESTAIRS("red_sandstone_stairs"),
    REDSANDSTONESLAB("stone_slab2:0"),
    DOUBLEREDSANDSTONESLAB("double_stone_slab2:0"),
    SPRUCEFENCEGATE("spruce_fence_gate"),
    BIRCHFENCEGATE("birch_fence_gate"),
    JUNGLEFENCEGATE("jungle_fence_gate"),
    DARKOAKFENCEGATE("dark_oak_fence_gate"),
    ACACIAFENCEGATE("acacia_fence_gate"),
    SPRUCEFENCE("spruce_fence"),
    BIRCHFENCE("birch_fence"),
    JUNGLEFENCE("jungle_fence"),
    DARKOAKFENCE("dark_oak_fence"),
    ACACIAFENCE("acacia_fence"),
    SPRUCEDOOR("spruce_door"),
    BIRCHDOOR("birch_door"),
    JUNGLEDOOR("jungle_door"),
    ACACIADOOR("acacia_door"),
    DARKOAKDOOR("dark_oak_door"),

    /**
     * All NON-VANILLA blocks safety translation
     */
    NULL("NULL");

    private final String mapping;

    private VanillaBlock(String mapping) {
        this.mapping = "minecraft:".concat(mapping);
    }

    /**
     * Gets the matching {@link net.canarymod.api.world.blocks.BlockType} for the {@code VanillaBlock}
     *
     * @return matching {@code VanillaBlock} or {@code null} if not match is found
     */
    public BlockType getType() {
        if (this.equals(NULL)) {
            return null;
        }
        return mappings.inverse().get(this);
    }

    /**
     * Converts a {@link net.canarymod.api.world.blocks.BlockType} to a {@code VanillaBlocks}
     *
     * @param type
     *         the {@link net.canarymod.api.world.blocks.BlockType} to convert
     *
     * @return the matching {@code VanillaBlock}
     */
    public static VanillaBlock enumerate(BlockType type) {
        if (type == null) {
            return NULL;
        }
        VanillaBlock match = mappings.get(type);
        return match == null ? NULL : match;
    }

    /**
     * Mapping of BlockType to VanillaBlocks
     */
    private static final HashBiMap<BlockType, VanillaBlock> mappings = HashBiMap.create();

    /**
     * Initialize map
     */
    static {
        for (VanillaBlock value : values()) {
            if (value.equals(NULL)) {
                continue;
            }
            mappings.put(BlockType.fromString(value.mapping), value);
        }
    }
}
