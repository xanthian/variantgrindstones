package net.xanthian.variant_grindstones.util;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import static net.xanthian.variant_grindstones.Initialise.MOD_ID;

public class Recipes {

    // Vanilla
    public static JsonObject createGrindstoneRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();

        JsonObject json = new JsonObject();
        String modPrefix = "";

        if (modList.size() > 0) {
            modPrefix = mods[0] + ":";
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }

        json.addProperty("type", "minecraft:crafting_shaped");

        JsonArray pattern = new JsonArray();
        pattern.add("I-I");
        pattern.add("# #");
        json.add("pattern", pattern);

        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item",   modPrefix + material + "_planks");
        keyList.add("#", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item",   "minecraft:stick");
        keyList.add("I", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item",   "minecraft:stone_slab");
        keyList.add("-", iKey);
        json.add("key", keyList);

        JsonObject result = new JsonObject();
        result.addProperty("item", MOD_ID + ":" + material + "_grindstone");
        json.add("result", result);
        return json;
    }

    public static JsonObject createNetherGrindstoneRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();

        JsonObject json = new JsonObject();
        String modPrefix = "";

        if (modList.size() > 0) {
            modPrefix = mods[0] + ":";
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }

        json.addProperty("type", "minecraft:crafting_shaped");

        JsonArray pattern = new JsonArray();
        pattern.add("I-I");
        pattern.add("# #");
        json.add("pattern", pattern);

        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item",   modPrefix + material + "_planks");
        keyList.add("#", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item",   "minecraft:stick");
        keyList.add("I", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item",   "minecraft:blackstone_slab");
        keyList.add("-", iKey);
        json.add("key", keyList);

        JsonObject result = new JsonObject();
        result.addProperty("item", MOD_ID + ":" + material + "_grindstone");
        json.add("result", result);
        return json;
    }

    public static JsonObject createEndGrindstoneRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();

        JsonObject json = new JsonObject();
        String modPrefix = "";

        if (modList.size() > 0) {
            modPrefix = mods[0] + ":";
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }

        json.addProperty("type", "minecraft:crafting_shaped");

        JsonArray pattern = new JsonArray();
        pattern.add("I-I");
        pattern.add("# #");
        json.add("pattern", pattern);

        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item",   modPrefix + material + "_planks");
        keyList.add("#", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item",   "minecraft:stick");
        keyList.add("I", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item",   "variant_grindstones:end_stone_slab");
        keyList.add("-", iKey);
        json.add("key", keyList);

        JsonObject result = new JsonObject();
        result.addProperty("item", MOD_ID + ":" + material + "_grindstone");
        json.add("result", result);
        return json;
    }
}