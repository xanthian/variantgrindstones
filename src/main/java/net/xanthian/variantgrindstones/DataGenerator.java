package net.xanthian.variantgrindstones;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.xanthian.variantgrindstones.datagen.*;

public class DataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        //pack.addProvider(LootTableGenerator::new);
        pack.addProvider(RecipeGenerator::new);
        //pack.addProvider(ModelGenerator::new);
        pack.addProvider(BlockTagGenerator::new);
        pack.addProvider(ItemTagGenerator::new);

    }
}