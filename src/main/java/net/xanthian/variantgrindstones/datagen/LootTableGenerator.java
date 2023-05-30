package net.xanthian.variantgrindstones.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.xanthian.variantgrindstones.block.Grindstones;


public class LootTableGenerator extends FabricBlockLootTableProvider {
    public LootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(Grindstones.ACACIA_GRINDSTONE);
        addDrop(Grindstones.BAMBOO_GRINDSTONE);
        addDrop(Grindstones.BIRCH_GRINDSTONE);
        addDrop(Grindstones.CHERRY_GRINDSTONE);
        addDrop(Grindstones.CRIMSON_GRINDSTONE);
        addDrop(Grindstones.JUNGLE_GRINDSTONE);
        addDrop(Grindstones.MANGROVE_GRINDSTONE);
        addDrop(Grindstones.OAK_GRINDSTONE);
        addDrop(Grindstones.SPRUCE_GRINDSTONE);
        addDrop(Grindstones.WARPED_GRINDSTONE);
    }
}