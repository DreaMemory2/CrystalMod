package com.stalight.crystal.world.feature;

import com.stalight.crystal.block.BlockList;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.BiomePlacementModifier;
import net.minecraft.world.gen.placementmodifier.CountPlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;
import net.minecraft.world.gen.placementmodifier.SurfaceWaterDepthFilterPlacementModifier;

public class VegetationPlacedFeatures {
    public static final RegistryKey<PlacedFeature> WHITE_FOREST_VEGETATION = PlacedFeatures.of("white_forest_vegetation");
    public static final RegistryKey<PlacedFeature> LIGHT_GRAY_DESERT = PlacedFeatures.of("light_gray_desert");
    public static final RegistryKey<PlacedFeature> GRAY_PLAINS = PlacedFeatures.of("gray_plains");
    public static final RegistryKey<PlacedFeature> DARK_FOREST = PlacedFeatures.of("dark_forest");

    public static void bootstrap(Registerable<PlacedFeature> featureRegisterable) {
        RegistryEntryLookup<ConfiguredFeature<?, ?>> registryEntryLookup = featureRegisterable.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);
        SurfaceWaterDepthFilterPlacementModifier placementModifier = SurfaceWaterDepthFilterPlacementModifier.of(0);

        RegistryEntry.Reference<ConfiguredFeature<?, ?>> whiteForest = registryEntryLookup.getOrThrow(VegetationConfiguredFeatures.WHITE_FOREST_VEGETATION);
        RegistryEntry.Reference<ConfiguredFeature<?, ?>> lightGrayDesert = registryEntryLookup.getOrThrow(VegetationConfiguredFeatures.LIGHT_GRAY_DESERT);
        RegistryEntry.Reference<ConfiguredFeature<?, ?>> grayPlains = registryEntryLookup.getOrThrow(VegetationConfiguredFeatures.GRAY_PLAINS);
        RegistryEntry.Reference<ConfiguredFeature<?, ?>> darkForest = registryEntryLookup.getOrThrow(VegetationConfiguredFeatures.DARK_FOREST);

        PlacedFeatures.register(featureRegisterable, WHITE_FOREST_VEGETATION, whiteForest, net.minecraft.world.gen.feature.VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                PlacedFeatures.createCountExtraModifier(10, 0.1F, 1), BlockList.whiteSapling));
        PlacedFeatures.register(featureRegisterable, LIGHT_GRAY_DESERT, lightGrayDesert, net.minecraft.world.gen.feature.VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                PlacedFeatures.createCountExtraModifier(0, 0.1F, 1), BlockList.lightGraySapling));
        PlacedFeatures.register(featureRegisterable, GRAY_PLAINS, grayPlains, net.minecraft.world.gen.feature.VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                PlacedFeatures.createCountExtraModifier(0, 0.1F, 1), BlockList.graySapling));
        PlacedFeatures.register(featureRegisterable, DARK_FOREST, darkForest, CountPlacementModifier.of(16),
                SquarePlacementModifier.of(), placementModifier, PlacedFeatures.OCEAN_FLOOR_HEIGHTMAP, BiomePlacementModifier.of());
    }
}
