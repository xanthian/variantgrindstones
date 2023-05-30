package net.xanthian.variantgrindstones;


import net.fabricmc.api.ModInitializer;


import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import net.xanthian.variantgrindstones.block.Grindstones;
import net.xanthian.variantgrindstones.util.ModPOITypes;

public class Initialise implements ModInitializer {

    public static final String MOD_ID = "variantgrindstones";

    public static final RegistryKey<ItemGroup> ITEM_GROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MOD_ID, "variantgrindstones"));

    @Override
    public void onInitialize() {
        // Custom Item Group
        Registry.register(Registries.ITEM_GROUP, ITEM_GROUP, FabricItemGroup.builder()
                .displayName(Text.translatable("variantgrindstones.group.variantgrindstones"))
                .icon(() -> new ItemStack(Grindstones.MANGROVE_GRINDSTONE))
                .entries((context, entries) -> {
                    entries.add(Grindstones.ACACIA_GRINDSTONE);
                    entries.add(Grindstones.BAMBOO_GRINDSTONE);
                    entries.add(Grindstones.BIRCH_GRINDSTONE);
                    entries.add(Grindstones.CHERRY_GRINDSTONE);
                    entries.add(Grindstones.CRIMSON_GRINDSTONE);
                    entries.add(Blocks.GRINDSTONE); // Dark Oak
                    entries.add(Grindstones.JUNGLE_GRINDSTONE);
                    entries.add(Grindstones.MANGROVE_GRINDSTONE);
                    entries.add(Grindstones.OAK_GRINDSTONE);
                    entries.add(Grindstones.SPRUCE_GRINDSTONE);
                    entries.add(Grindstones.WARPED_GRINDSTONE);
                })
                .build());

        // Fletching Table Registration
        Grindstones.registerVanillaGrindstones();

        ModPOITypes.init();
    }
}