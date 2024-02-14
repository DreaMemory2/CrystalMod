package com.stalight.crystal.register;

import com.stalight.crystal.world.feature.VegetationPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;

public class ModGeneration {

    public static void registerGeneration() {
        ModGeneration.generateTrees();
    }

    private static void generateTrees() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.frostForest),
                GenerationStep.Feature.VEGETAL_DECORATION, VegetationPlacedFeatures.WHITE_FOREST_VEGETATION);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.emberDesert),
                GenerationStep.Feature.VEGETAL_DECORATION, VegetationPlacedFeatures.LIGHT_GRAY_DESERT);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.emberPlain),
                GenerationStep.Feature.VEGETAL_DECORATION, VegetationPlacedFeatures.GRAY_PLAINS);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.darkTree),
                GenerationStep.Feature.VEGETAL_DECORATION, VegetationPlacedFeatures.DART_TREE);
    }
}
