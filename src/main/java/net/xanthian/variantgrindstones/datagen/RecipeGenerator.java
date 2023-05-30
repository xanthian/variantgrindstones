package net.xanthian.variantgrindstones.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.xanthian.variantgrindstones.block.Grindstones;

import java.util.function.Consumer;


public class RecipeGenerator extends FabricRecipeProvider {
    public RecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Grindstones.ACACIA_GRINDSTONE)
                .input('I', Items.STICK)
                .input('-', Blocks.STONE_SLAB)
                .input('#', Blocks.ACACIA_PLANKS)
                .pattern("I-I")
                .pattern("# #")
                .criterion(FabricRecipeProvider.hasItem(Blocks.STONE_SLAB), FabricRecipeProvider.conditionsFromItem(Blocks.STONE_SLAB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Grindstones.ACACIA_GRINDSTONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Grindstones.BAMBOO_GRINDSTONE)
                .input('I', Items.STICK)
                .input('-', Blocks.STONE_SLAB)
                .input('#', Blocks.BAMBOO_PLANKS)
                .pattern("I-I")
                .pattern("# #")
                .criterion(FabricRecipeProvider.hasItem(Blocks.STONE_SLAB), FabricRecipeProvider.conditionsFromItem(Blocks.STONE_SLAB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Grindstones.BAMBOO_GRINDSTONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Grindstones.BIRCH_GRINDSTONE)
                .input('I', Items.STICK)
                .input('-', Blocks.STONE_SLAB)
                .input('#', Blocks.BIRCH_PLANKS)
                .pattern("I-I")
                .pattern("# #")
                .criterion(FabricRecipeProvider.hasItem(Blocks.STONE_SLAB), FabricRecipeProvider.conditionsFromItem(Blocks.STONE_SLAB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Grindstones.BIRCH_GRINDSTONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Grindstones.CHERRY_GRINDSTONE)
                .input('I', Items.STICK)
                .input('-', Blocks.STONE_SLAB)
                .input('#', Blocks.CHERRY_PLANKS)
                .pattern("I-I")
                .pattern("# #")
                .criterion(FabricRecipeProvider.hasItem(Blocks.STONE_SLAB), FabricRecipeProvider.conditionsFromItem(Blocks.STONE_SLAB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Grindstones.CHERRY_GRINDSTONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Grindstones.CRIMSON_GRINDSTONE)
                .input('I', Items.STICK)
                .input('-', Blocks.BLACKSTONE_SLAB)
                .input('#', Blocks.CRIMSON_PLANKS)
                .pattern("I-I")
                .pattern("# #")
                .criterion(FabricRecipeProvider.hasItem(Blocks.BLACKSTONE_SLAB), FabricRecipeProvider.conditionsFromItem(Blocks.BLACKSTONE_SLAB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Grindstones.CRIMSON_GRINDSTONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Grindstones.JUNGLE_GRINDSTONE)
                .input('I', Items.STICK)
                .input('-', Blocks.STONE_SLAB)
                .input('#', Blocks.JUNGLE_PLANKS)
                .pattern("I-I")
                .pattern("# #")
                .criterion(FabricRecipeProvider.hasItem(Blocks.STONE_SLAB), FabricRecipeProvider.conditionsFromItem(Blocks.STONE_SLAB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Grindstones.JUNGLE_GRINDSTONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Grindstones.MANGROVE_GRINDSTONE)
                .input('I', Items.STICK)
                .input('-', Blocks.STONE_SLAB)
                .input('#', Blocks.MANGROVE_PLANKS)
                .pattern("I-I")
                .pattern("# #")
                .criterion(FabricRecipeProvider.hasItem(Blocks.STONE_SLAB), FabricRecipeProvider.conditionsFromItem(Blocks.STONE_SLAB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Grindstones.MANGROVE_GRINDSTONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Grindstones.OAK_GRINDSTONE)
                .input('I', Items.STICK)
                .input('-', Blocks.STONE_SLAB)
                .input('#', Blocks.OAK_PLANKS)
                .pattern("I-I")
                .pattern("# #")
                .criterion(FabricRecipeProvider.hasItem(Blocks.STONE_SLAB), FabricRecipeProvider.conditionsFromItem(Blocks.STONE_SLAB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Grindstones.OAK_GRINDSTONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Grindstones.SPRUCE_GRINDSTONE)
                .input('I', Items.STICK)
                .input('-', Blocks.STONE_SLAB)
                .input('#', Blocks.SPRUCE_PLANKS)
                .pattern("I-I")
                .pattern("# #")
                .criterion(FabricRecipeProvider.hasItem(Blocks.STONE_SLAB), FabricRecipeProvider.conditionsFromItem(Blocks.STONE_SLAB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Grindstones.SPRUCE_GRINDSTONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Grindstones.WARPED_GRINDSTONE)
                .input('I', Items.STICK)
                .input('-', Blocks.BLACKSTONE_SLAB)
                .input('#', Blocks.WARPED_PLANKS)
                .pattern("I-I")
                .pattern("# #")
                .criterion(FabricRecipeProvider.hasItem(Blocks.BLACKSTONE_SLAB), FabricRecipeProvider.conditionsFromItem(Blocks.BLACKSTONE_SLAB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Grindstones.WARPED_GRINDSTONE)));
    }
}
