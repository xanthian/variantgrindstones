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
        VariantGrindstoneBlock MANGROVE_GRINDSTONE = new VariantGrindstoneBlock();
        registergrindstoneBlock("mangrove_grindstone", MANGROVE_GRINDSTONE);
        VariantGrindstoneBlock SPRUCE_GRINDSTONE = new VariantGrindstoneBlock();
        registergrindstoneBlock("spruce_grindstone", SPRUCE_GRINDSTONE);
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