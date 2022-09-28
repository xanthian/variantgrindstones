package net.xanthian.variant_grindstones.blocks;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.variant_grindstones.Initialise;

public class Grindstones {

    // Vanilla
    public static void registerVanillaGrindstones() {
        VariantGrindstoneBlock ACACIA_GRINDSTONE = new VariantGrindstoneBlock();
        registergrindstoneBlock("acacia_grindstone", ACACIA_GRINDSTONE);
        VariantGrindstoneBlock BIRCH_GRINDSTONE = new VariantGrindstoneBlock();
        registergrindstoneBlock("birch_grindstone", BIRCH_GRINDSTONE);
        VariantGrindstoneBlock JUNGLE_GRINDSTONE = new VariantGrindstoneBlock();
        registergrindstoneBlock("jungle_grindstone", JUNGLE_GRINDSTONE);
        VariantGrindstoneBlock OAK_GRINDSTONE = new VariantGrindstoneBlock();
        registergrindstoneBlock("oak_grindstone", OAK_GRINDSTONE);
        VariantGrindstoneBlock SPRUCE_GRINDSTONE = new VariantGrindstoneBlock();
        registergrindstoneBlock("spruce_grindstone", SPRUCE_GRINDSTONE);
    }
    public static void registerVanilla119Grindstone() {
        VariantGrindstoneBlock MANGROVE_GRINDSTONE = new VariantGrindstoneBlock();
        registergrindstoneBlock("mangrove_grindstone", MANGROVE_GRINDSTONE);
    }
    // Nether
    public static void registerNetherGrindstones() {
        VariantGrindstoneBlock CRIMSON_GRINDSTONE = new VariantGrindstoneBlock();
        registergrindstoneBlock("crimson_grindstone", CRIMSON_GRINDSTONE);
        VariantGrindstoneBlock WARPED_GRINDSTONE = new VariantGrindstoneBlock();
        registergrindstoneBlock("warped_grindstone", WARPED_GRINDSTONE);
    }
    // Tech Reborn
    public static void registerTRGrindstones() {
        VariantGrindstoneBlock RUBBER_GRINDSTONE = new VariantGrindstoneBlock();
        registergrindstoneBlock("rubber_grindstone", RUBBER_GRINDSTONE);
    }
    // Ecologics
    public static void registerEcologicsGrindstones() {
        VariantGrindstoneBlock AZALEA_GRINDSTONE = new VariantGrindstoneBlock();
        registergrindstoneBlock("azalea_grindstone", AZALEA_GRINDSTONE);
        VariantGrindstoneBlock COCONUT_GRINDSTONE = new VariantGrindstoneBlock();
        registergrindstoneBlock("coconut_grindstone", COCONUT_GRINDSTONE);
        VariantGrindstoneBlock FLOWERING_AZALEA_GRINDSTONE = new VariantGrindstoneBlock();
        registergrindstoneBlock("flowering_azalea_grindstone", FLOWERING_AZALEA_GRINDSTONE);
        VariantGrindstoneBlock WALNUT_GRINDSTONE = new VariantGrindstoneBlock();
        registergrindstoneBlock("walnut_grindstone", WALNUT_GRINDSTONE);
    }
    // Croptopia
    public static void registerCroptopiaGrindstones() {
        VariantGrindstoneBlock CINNAMON_GRINDSTONE = new VariantGrindstoneBlock();
        registergrindstoneBlock("cinnamon_grindstone", CINNAMON_GRINDSTONE);
    }
    // Epic Paladins (arclight)
    public static void registerArclightGrindstones() {
        VariantGrindstoneBlock JADE_GRINDSTONE = new VariantGrindstoneBlock();
        registergrindstoneBlock("jade_grindstone", JADE_GRINDSTONE);
        VariantGrindstoneBlock MOON_GRINDSTONE = new VariantGrindstoneBlock();
        registergrindstoneBlock("moon_grindstone", MOON_GRINDSTONE);
        VariantGrindstoneBlock SHADOW_GRINDSTONE = new VariantGrindstoneBlock(); 
        registergrindstoneBlock("shadow_grindstone", SHADOW_GRINDSTONE);
    }
    // Simple Mango
    public static void registerSimpleMangoGrindstones() {
        VariantGrindstoneBlock MANGO_GRINDSTONE = new VariantGrindstoneBlock();
        registergrindstoneBlock("mango_grindstone", MANGO_GRINDSTONE);
    }
    // Traverse
    public static void registerTraverseGrindstones() {
        VariantGrindstoneBlock FIR_GRINDSTONE = new VariantGrindstoneBlock();
        registergrindstoneBlock("fir_grindstone", FIR_GRINDSTONE);
    }
    // Better End
    public static void registerBetterEndGrindstones() {
        VariantGrindstoneBlock DRAGON_TREE_GRINDSTONE = new VariantGrindstoneBlock();
        registergrindstoneBlock("dragon_tree_grindstone", DRAGON_TREE_GRINDSTONE);
        VariantGrindstoneBlock END_LOTUS_GRINDSTONE = new VariantGrindstoneBlock();
        registergrindstoneBlock("end_lotus_grindstone", END_LOTUS_GRINDSTONE);
        VariantGrindstoneBlock HELIX_TREE_GRINDSTONE = new VariantGrindstoneBlock();
        registergrindstoneBlock("helix_tree_grindstone", HELIX_TREE_GRINDSTONE);
        VariantGrindstoneBlock JELLYSHROOM_GRINDSTONE = new VariantGrindstoneBlock();
        registergrindstoneBlock("jellyshroom_grindstone", JELLYSHROOM_GRINDSTONE);
        VariantGrindstoneBlock LACUGROVE_GRINDSTONE = new VariantGrindstoneBlock();
        registergrindstoneBlock("lacugrove_grindstone", LACUGROVE_GRINDSTONE);
        VariantGrindstoneBlock LUCERNIA_GRINDSTONE = new VariantGrindstoneBlock();
        registergrindstoneBlock("lucernia_grindstone", LUCERNIA_GRINDSTONE);
        VariantGrindstoneBlock MOSSY_GLOWSHROOM_GRINDSTONE = new VariantGrindstoneBlock();
        registergrindstoneBlock("mossy_glowshroom_grindstone", MOSSY_GLOWSHROOM_GRINDSTONE);
        VariantGrindstoneBlock PYTHADENDRON_GRINDSTONE = new VariantGrindstoneBlock();
        registergrindstoneBlock("pythadendron_grindstone", PYTHADENDRON_GRINDSTONE);
        VariantGrindstoneBlock TENANEA_GRINDSTONE = new VariantGrindstoneBlock();
        registergrindstoneBlock("tenanea_grindstone", TENANEA_GRINDSTONE);
        VariantGrindstoneBlock UMBRELLA_TREE_GRINDSTONE = new VariantGrindstoneBlock();
        registergrindstoneBlock("umbrella_tree_grindstone", UMBRELLA_TREE_GRINDSTONE);
    }
    // Better Nether
    public static void registerBetterNetherGrindstones() {
        VariantGrindstoneBlock ANCHOR_TREE_GRINDSTONE = new VariantGrindstoneBlock();
        registergrindstoneBlock("anchor_tree_grindstone", ANCHOR_TREE_GRINDSTONE);
        VariantGrindstoneBlock MUSHROOM_FIR_GRINDSTONE = new VariantGrindstoneBlock();
        registergrindstoneBlock("mushroom_fir_grindstone", MUSHROOM_FIR_GRINDSTONE);
        VariantGrindstoneBlock NETHER_MUSHROOM_GRINDSTONE = new VariantGrindstoneBlock();
        registergrindstoneBlock("nether_mushroom_grindstone", NETHER_MUSHROOM_GRINDSTONE);
        VariantGrindstoneBlock NETHER_REED_GRINDSTONE = new VariantGrindstoneBlock();
        registergrindstoneBlock("nether_reed_grindstone", NETHER_REED_GRINDSTONE);
        VariantGrindstoneBlock NETHER_SAKURA_GRINDSTONE = new VariantGrindstoneBlock();
        registergrindstoneBlock("nether_sakura_grindstone", NETHER_SAKURA_GRINDSTONE);
        VariantGrindstoneBlock RUBEUS_GRINDSTONE = new VariantGrindstoneBlock();
        registergrindstoneBlock("rubeus_grindstone", RUBEUS_GRINDSTONE);
        VariantGrindstoneBlock STALAGNATE_GRINDSTONE = new VariantGrindstoneBlock();
        registergrindstoneBlock("stalagnate_grindstone", STALAGNATE_GRINDSTONE);
        VariantGrindstoneBlock WART_GRINDSTONE = new VariantGrindstoneBlock();
        registergrindstoneBlock("wart_grindstone", WART_GRINDSTONE);
        VariantGrindstoneBlock WILLOW_GRINDSTONE = new VariantGrindstoneBlock();
        registergrindstoneBlock("willow_grindstone", WILLOW_GRINDSTONE);
    }
    // Terrestria
    public static void registerTerrestriaGrindstones() {
        VariantGrindstoneBlock CYPRESS_GRINDSTONE = new VariantGrindstoneBlock();
        registergrindstoneBlock("cypress_grindstone", CYPRESS_GRINDSTONE);
        VariantGrindstoneBlock HEMLOCK_GRINDSTONE = new VariantGrindstoneBlock();
        registergrindstoneBlock("hemlock_grindstone", HEMLOCK_GRINDSTONE);
        VariantGrindstoneBlock JAPANESE_MAPLE_GRINDSTONE = new VariantGrindstoneBlock();
        registergrindstoneBlock("japanese_maple_grindstone", JAPANESE_MAPLE_GRINDSTONE);
        VariantGrindstoneBlock RAINBOW_EUCALYPTUS_GRINDSTONE = new VariantGrindstoneBlock();
        registergrindstoneBlock("rainbow_eucalyptus_grindstone", RAINBOW_EUCALYPTUS_GRINDSTONE);
        VariantGrindstoneBlock REDWOOD_GRINDSTONE = new VariantGrindstoneBlock();
        registergrindstoneBlock("redwood_grindstone", REDWOOD_GRINDSTONE);
        VariantGrindstoneBlock RUBBER_GRINDSTONE2 = new VariantGrindstoneBlock();
        registergrindstoneBlock("rubber_grindstone2", RUBBER_GRINDSTONE2);
        VariantGrindstoneBlock SAKURA_GRINDSTONE = new VariantGrindstoneBlock();
        registergrindstoneBlock("sakura_grindstone", SAKURA_GRINDSTONE);
        VariantGrindstoneBlock WILLOW_GRINDSTONE2 = new VariantGrindstoneBlock();
        registergrindstoneBlock("willow_grindstone2", WILLOW_GRINDSTONE2);
        VariantGrindstoneBlock YUCCA_PALM_GRINDSTONE = new VariantGrindstoneBlock();
        registergrindstoneBlock("yucca_palm_grindstone", YUCCA_PALM_GRINDSTONE);
    }
    // Cinderscapes
    public static void registerCinderscapesGrindstones() {
        VariantGrindstoneBlock SCORCHED_GRINDSTONE = new VariantGrindstoneBlock();
        registergrindstoneBlock("scorched_grindstone", SCORCHED_GRINDSTONE);
        VariantGrindstoneBlock UMBRAL_GRINDSTONE = new VariantGrindstoneBlock();
        registergrindstoneBlock("umbral_grindstone", UMBRAL_GRINDSTONE);
    }

    // To-do : Updated Blockus,Promenade, Bewitchment, Biome Makeover, Enriched, Twigs, Wilder World
    // Not yet updated : Botania, Spectrum, Paradise Lost

    private static void registergrindstoneBlock(String Id, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, Id.toLowerCase());
        Registry.register(Registry.BLOCK, identifier, block);
        Registry.register(Registry.ITEM, identifier, new BlockItem(block, new FabricItemSettings().group(Initialise.VARIANT_GRINDSTONES)));

        if (FabricLoader.getInstance().getEnvironmentType() == EnvType.CLIENT)
    RegisterBlockRenderLayerMap(block);
}
    @Environment(EnvType.CLIENT)
    private static void RegisterBlockRenderLayerMap(Block block) {
        BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getCutout());

    }
}