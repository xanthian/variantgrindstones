package net.xanthian.variant_grindstones.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.GrindstoneBlock;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class VariantGrindstoneBlock extends GrindstoneBlock {
    public static final TagKey<Block> WEAPONSMITH_WORKSTATION = TagKey.of(Registry.BLOCK_KEY, new Identifier("c", "workstation/weaponsmith"));
    public VariantGrindstoneBlock() {
        super(FabricBlockSettings.copy(Blocks.GRINDSTONE));
    }
}
