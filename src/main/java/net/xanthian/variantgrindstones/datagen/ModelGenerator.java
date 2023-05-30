package net.xanthian.variantgrindstones.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.TextureMap;
import net.xanthian.variantgrindstones.block.Grindstones;

public class ModelGenerator extends FabricModelProvider {
    public ModelGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeWithCustomTextures(Grindstones.ACACIA_GRINDSTONE, Blocks.ACACIA_PLANKS, TextureMap::frontTopSide);
        blockStateModelGenerator.registerCubeWithCustomTextures(Grindstones.BAMBOO_GRINDSTONE, Blocks.BAMBOO_PLANKS, TextureMap::frontTopSide);
        blockStateModelGenerator.registerCubeWithCustomTextures(Grindstones.BIRCH_GRINDSTONE, Blocks.BIRCH_PLANKS, TextureMap::frontTopSide);
        blockStateModelGenerator.registerCubeWithCustomTextures(Grindstones.CHERRY_GRINDSTONE, Blocks.CHERRY_PLANKS, TextureMap::frontTopSide);
        blockStateModelGenerator.registerCubeWithCustomTextures(Grindstones.CRIMSON_GRINDSTONE, Blocks.CRIMSON_PLANKS, TextureMap::frontTopSide);
        blockStateModelGenerator.registerCubeWithCustomTextures(Grindstones.JUNGLE_GRINDSTONE, Blocks.JUNGLE_PLANKS, TextureMap::frontTopSide);
        blockStateModelGenerator.registerCubeWithCustomTextures(Grindstones.MANGROVE_GRINDSTONE, Blocks.MANGROVE_PLANKS, TextureMap::frontTopSide);
        blockStateModelGenerator.registerCubeWithCustomTextures(Grindstones.OAK_GRINDSTONE, Blocks.OAK_PLANKS, TextureMap::frontTopSide);
        blockStateModelGenerator.registerCubeWithCustomTextures(Grindstones.SPRUCE_GRINDSTONE, Blocks.SPRUCE_PLANKS, TextureMap::frontTopSide);
        blockStateModelGenerator.registerCubeWithCustomTextures(Grindstones.WARPED_GRINDSTONE, Blocks.WARPED_PLANKS, TextureMap::frontTopSide);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }
}