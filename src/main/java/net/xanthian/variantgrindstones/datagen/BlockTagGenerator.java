package net.xanthian.variantgrindstones.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.xanthian.variantgrindstones.block.Grindstones;

import java.util.concurrent.CompletableFuture;

import static net.xanthian.variantgrindstones.Initialise.MOD_ID;

public class BlockTagGenerator extends FabricTagProvider.BlockTagProvider {
    public BlockTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    private static final TagKey<Block> GRINDSTONES = TagKey.of(Registries.BLOCK.getKey(), new Identifier(MOD_ID,"grindstones"));
    private static final TagKey<Block> MINEABLE_PICKAXE = TagKey.of(Registries.BLOCK.getKey(), new Identifier("minecraft:mineable/pickaxe"));
    private static final TagKey<Block> JOB_SITE = TagKey.of(Registries.BLOCK.getKey(), new Identifier("c:villager_job_sites"));


    @Override
    protected void configure (RegistryWrapper.WrapperLookup arg){

        getOrCreateTagBuilder(GRINDSTONES)
                .add(Grindstones.ACACIA_GRINDSTONE)
                .add(Grindstones.BAMBOO_GRINDSTONE)
                .add(Grindstones.BIRCH_GRINDSTONE)
                .add(Grindstones.CHERRY_GRINDSTONE)
                .add(Grindstones.CRIMSON_GRINDSTONE)
                .add(Grindstones.JUNGLE_GRINDSTONE)
                .add(Grindstones.MANGROVE_GRINDSTONE)
                .add(Grindstones.OAK_GRINDSTONE)
                .add(Grindstones.SPRUCE_GRINDSTONE)
                .add(Grindstones.WARPED_GRINDSTONE);

        getOrCreateTagBuilder(MINEABLE_PICKAXE)
                .addTag(GRINDSTONES);

        getOrCreateTagBuilder(JOB_SITE)
                .addTag(GRINDSTONES);

    }
}
