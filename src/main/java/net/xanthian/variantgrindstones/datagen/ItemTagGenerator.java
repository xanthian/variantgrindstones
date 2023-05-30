package net.xanthian.variantgrindstones.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.xanthian.variantgrindstones.block.Grindstones;

import java.util.concurrent.CompletableFuture;

import static net.xanthian.variantgrindstones.Initialise.MOD_ID;

public class ItemTagGenerator extends FabricTagProvider.ItemTagProvider {
    public ItemTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

        private static final TagKey<Item> GRINDSTONES = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID,"grindstones"));
        private static final TagKey<Item> JOB_SITE = TagKey.of(Registries.ITEM.getKey(), new Identifier("c:villager_job_sites"));

        @Override
        protected void configure (RegistryWrapper.WrapperLookup arg){

            getOrCreateTagBuilder(GRINDSTONES)
                    .add(Item.fromBlock(Grindstones.ACACIA_GRINDSTONE))
                    .add(Item.fromBlock(Grindstones.BAMBOO_GRINDSTONE))
                    .add(Item.fromBlock(Grindstones.BIRCH_GRINDSTONE))
                    .add(Item.fromBlock(Grindstones.CHERRY_GRINDSTONE))
                    .add(Item.fromBlock(Grindstones.CRIMSON_GRINDSTONE))
                    .add(Item.fromBlock(Grindstones.JUNGLE_GRINDSTONE))
                    .add(Item.fromBlock(Grindstones.MANGROVE_GRINDSTONE))
                    .add(Item.fromBlock(Grindstones.OAK_GRINDSTONE))
                    .add(Item.fromBlock(Grindstones.SPRUCE_GRINDSTONE))
                    .add(Item.fromBlock(Grindstones.WARPED_GRINDSTONE));

            getOrCreateTagBuilder(JOB_SITE)
                    .addTag(GRINDSTONES);
        }
    }