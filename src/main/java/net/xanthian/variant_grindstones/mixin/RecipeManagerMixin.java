package net.xanthian.variant_grindstones.mixin;

import com.google.gson.JsonElement;
import net.minecraft.recipe.RecipeManager;
import net.minecraft.resource.ResourceManager;
import net.minecraft.util.Identifier;
import net.minecraft.util.profiler.Profiler;
import net.xanthian.variant_grindstones.Initialise;
import net.xanthian.variant_grindstones.util.Recipes;
import org.apache.commons.lang3.tuple.Pair;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Map;

@Mixin(RecipeManager.class)
public abstract class RecipeManagerMixin {

    @Inject(method = "apply", at = @At("HEAD"))
    public void interceptApply(Map<Identifier, JsonElement> map, ResourceManager resourceManager, Profiler profiler, CallbackInfo info) {
        for (Pair<String, String[]> woodType : Initialise.woodTypes) {
            map.put(new Identifier(Initialise.MOD_ID, woodType.getLeft() + "_grindstone"), Recipes.createGrindstoneRecipeJson(woodType.getLeft(), woodType.getRight()));
        }
        for (Pair<String, String[]> woodType : Initialise.netherwoodTypes) {
            map.put(new Identifier(Initialise.MOD_ID, woodType.getLeft() + "_grindstone"), Recipes.createNetherGrindstoneRecipeJson(woodType.getLeft(), woodType.getRight()));
        }
        for (Pair<String, String[]> woodType : Initialise.endwoodTypes) {
            map.put(new Identifier(Initialise.MOD_ID, woodType.getLeft() + "_grindstone"), Recipes.createEndGrindstoneRecipeJson(woodType.getLeft(), woodType.getRight()));
        }
    }
}