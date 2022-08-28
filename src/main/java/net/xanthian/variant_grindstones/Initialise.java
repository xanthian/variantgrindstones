package net.xanthian.variant_grindstones;

import com.google.common.collect.Lists;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import net.xanthian.variant_grindstones.blocks.Grindstones;
import net.xanthian.variant_grindstones.blocks.Slab;
import org.apache.commons.lang3.tuple.Pair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class Initialise implements ModInitializer {

    public static final String MOD_ID = "variant_grindstones";

    public static Identifier ID(String path) {
        return new Identifier(MOD_ID, path);
    }

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static final ItemGroup VARIANT_GRINDSTONES = FabricItemGroupBuilder.build(new Identifier(Initialise.MOD_ID, "variant_grindstones"),
            () -> new ItemStack(Blocks.GRINDSTONE));
    public static List<Pair<String, String[]>> woodTypes = Lists.newArrayList();
    public static List<Pair<String, String[]>> netherwoodTypes = Lists.newArrayList();
    public static List<Pair<String, String[]>> endwoodTypes = Lists.newArrayList();

    @Override
    public void onInitialize() {

            Slab.registerSlabBlocks();
        if (!FabricLoader.getInstance().isModLoaded("vsas")) {
            woodTypes.add(Pair.of("acacia", new String[0]));
            woodTypes.add(Pair.of("birch", new String[0]));
            woodTypes.add(Pair.of("jungle", new String[0]));
            woodTypes.add(Pair.of("oak", new String[0]));
            woodTypes.add(Pair.of("mangrove", new String[0]));
            woodTypes.add(Pair.of("spruce", new String[0]));
            netherwoodTypes.add(Pair.of("crimson", new String[0]));
            netherwoodTypes.add(Pair.of("warped", new String[0]));
            Grindstones.registerVanillaGrindstones();
            Grindstones.registerNetherGrindstones();
        }
        if (FabricLoader.getInstance().isModLoaded("techreborn")) {
            woodTypes.add(Pair.of("rubber", new String[]{"techreborn"}));
            Grindstones.registerTRGrindstones();
        }
        if (FabricLoader.getInstance().isModLoaded("ecologics")) {
            woodTypes.add(Pair.of("azalea", new String[]{"ecologics"}));
            woodTypes.add(Pair.of("coconut", new String[]{"ecologics"}));
            woodTypes.add(Pair.of("flowering_azalea", new String[]{"ecologics"}));
            woodTypes.add(Pair.of("walnut", new String[]{"ecologics"}));
            Grindstones.registerEcologicsGrindstones();
        }
        if (FabricLoader.getInstance().isModLoaded("croptopia")) {
            woodTypes.add(Pair.of("cinnamon", new String[]{"croptopia"}));
            Grindstones.registerCroptopiaGrindstones();
        }
        if (FabricLoader.getInstance().isModLoaded("arclight")) {
            woodTypes.add(Pair.of("jade", new String[]{"arclight"}));
            woodTypes.add(Pair.of("moon", new String[]{"arclight"}));
            woodTypes.add(Pair.of("shadow", new String[]{"arclight"}));
            Grindstones.registerArclightGrindstones();
        }
        if (FabricLoader.getInstance().isModLoaded("simplemango")) {
            woodTypes.add(Pair.of("mango", new String[]{"simplemango"}));
            Grindstones.registerSimpleMangoGrindstones();
        }
        if (FabricLoader.getInstance().isModLoaded("traverse")) {
            woodTypes.add(Pair.of("fir", new String[]{"traverse"}));
            Grindstones.registerTraverseGrindstones();
        }
        if (FabricLoader.getInstance().isModLoaded("betterend")) {
            endwoodTypes.add(Pair.of("dragon_tree", new String[]{"betterend"}));
            endwoodTypes.add(Pair.of("end_lotus", new String[]{"betterend"}));
            endwoodTypes.add(Pair.of("helix_tree", new String[]{"betterend"}));
            endwoodTypes.add(Pair.of("jellyshroom", new String[]{"betterend"}));
            endwoodTypes.add(Pair.of("lacugrove", new String[]{"betterend"}));
            endwoodTypes.add(Pair.of("lucernia", new String[]{"betterend"}));
            endwoodTypes.add(Pair.of("mossy_glowshroom", new String[]{"betterend"}));
            endwoodTypes.add(Pair.of("pythadendron", new String[]{"betterend"}));
            endwoodTypes.add(Pair.of("tenanea", new String[]{"betterend"}));
            endwoodTypes.add(Pair.of("umbrella_tree", new String[]{"betterend"}));
            Grindstones.registerBetterEndGrindstones();
        }
        if (FabricLoader.getInstance().isModLoaded("betternether")) {
            netherwoodTypes.add(Pair.of("anchor_tree", new String[]{"betternether"}));
            netherwoodTypes.add(Pair.of("mushroom_fir", new String[]{"betternether"}));
            netherwoodTypes.add(Pair.of("nether_mushroom", new String[]{"betternether"}));
            netherwoodTypes.add(Pair.of("nether_reed", new String[]{"betternether"}));
            netherwoodTypes.add(Pair.of("nether_sakura", new String[]{"betternether"}));
            netherwoodTypes.add(Pair.of("rubeus", new String[]{"betternether"}));
            netherwoodTypes.add(Pair.of("stalagnate", new String[]{"betternether"}));
            netherwoodTypes.add(Pair.of("wart", new String[]{"betternether"}));
            netherwoodTypes.add(Pair.of("willow", new String[]{"betternether"}));
            Grindstones.registerBetterNetherGrindstones();
        }

    }
}