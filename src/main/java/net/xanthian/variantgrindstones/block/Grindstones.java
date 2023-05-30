package net.xanthian.variantgrindstones.block;

import com.google.common.collect.Maps;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.loader.api.FabricLoader;

import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import net.xanthian.variantgrindstones.Initialise;

import java.util.Map;

public class Grindstones {

    public static Map<Identifier, Block> MOD_GRINDSTONES = Maps.newHashMap();

    public static final VariantGrindstoneBlock ACACIA_GRINDSTONE = new VariantGrindstoneBlock();
    public static final VariantGrindstoneBlock BAMBOO_GRINDSTONE = new VariantGrindstoneBlock();
    public static final VariantGrindstoneBlock BIRCH_GRINDSTONE = new VariantGrindstoneBlock();
    public static final VariantGrindstoneBlock CHERRY_GRINDSTONE = new VariantGrindstoneBlock();
    public static final VariantGrindstoneBlock CRIMSON_GRINDSTONE = new VariantGrindstoneBlock();
    // Vanilla Grindstone is made from Dark Oak
    public static final VariantGrindstoneBlock JUNGLE_GRINDSTONE = new VariantGrindstoneBlock();
    public static final VariantGrindstoneBlock MANGROVE_GRINDSTONE = new VariantGrindstoneBlock();
    public static final VariantGrindstoneBlock OAK_GRINDSTONE = new VariantGrindstoneBlock();
    public static final VariantGrindstoneBlock SPRUCE_GRINDSTONE = new VariantGrindstoneBlock();
    public static final VariantGrindstoneBlock WARPED_GRINDSTONE = new VariantGrindstoneBlock();

    public static void registerVanillaGrindstones() {
        registerGrindstoneBlock("acacia_grindstone", ACACIA_GRINDSTONE);
        registerGrindstoneBlock("bamboo_grindstone", BAMBOO_GRINDSTONE);
        registerGrindstoneBlock("birch_grindstone", BIRCH_GRINDSTONE);
        registerGrindstoneBlock("cherry_grindstone", CHERRY_GRINDSTONE);
        registerGrindstoneBlock("crimson_grindstone", CRIMSON_GRINDSTONE);
        registerGrindstoneBlock("jungle_grindstone", JUNGLE_GRINDSTONE);
        registerGrindstoneBlock("mangrove_grindstone", MANGROVE_GRINDSTONE);
        registerGrindstoneBlock("oak_grindstone", OAK_GRINDSTONE);
        registerGrindstoneBlock("spruce_grindstone", SPRUCE_GRINDSTONE);
        registerGrindstoneBlock("warped_grindstone", WARPED_GRINDSTONE);
    }
    
    private static void registerGrindstoneBlock(String Id, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, Id.toLowerCase());
        Registry.register(Registries.BLOCK, identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
        MOD_GRINDSTONES.put(identifier, block);

        if (FabricLoader.getInstance().getEnvironmentType() == EnvType.CLIENT)
            RegisterBlockRenderLayerMap(block);
}
    @Environment(EnvType.CLIENT)
    private static void RegisterBlockRenderLayerMap(Block block) {
        BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getCutout());

    }
}