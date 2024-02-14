package com.stalight.crystal.register;

import com.stalight.crystal.world.feature.TreePlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;

public class ModGeneration {

    public static void registerGeneration() {
        ModGeneration.generateTrees();
    }

    private static void generateTrees() {
        // 枫树只生成在森林生态群系
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.frostForest),
                GenerationStep.Feature.VEGETAL_DECORATION, TreePlacedFeatures.WHITE_CHECKED);
    }

    /*
    data\minecraft\worldgen\placed_feature\trees_taiga.json
     */
}
