package com.stalight.crystal.world.feature;

import com.stalight.crystal.CrystalMod;
import com.stalight.crystal.block.BlockList;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;

public class VegetationPlacedFeatures {
    public static final RegistryKey<PlacedFeature> WHITE_FOREST_VEGETATION = registerPlacedFeatures("white_forest_vegetation");
    public static final RegistryKey<PlacedFeature> LIGHT_GRAY_DESERT = registerPlacedFeatures("light_gray_desert");
    public static final RegistryKey<PlacedFeature> GRAY_PLAINS = registerPlacedFeatures("gray_plains");
    public static final RegistryKey<PlacedFeature> DART_TREE = registerPlacedFeatures("dark_tree");
    public static final RegistryKey<PlacedFeature> PATCH_FROST_MELON = registerPlacedFeatures("patch_frost_melon");
    public static final RegistryKey<PlacedFeature> PATCH_WHITE_GRASS_FOREST = registerPlacedFeatures("patch_white_grass_forest");
    public static final RegistryKey<PlacedFeature> PATCH_WHITE_GRASS_PLAIN = registerPlacedFeatures("patch_white_grass_plain");

    public static void bootstrap(Registerable<PlacedFeature> featureRegisterable) {
        RegistryEntryLookup<ConfiguredFeature<?, ?>> registryEntryLookup = featureRegisterable.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);
        SurfaceWaterDepthFilterPlacementModifier placementModifier = SurfaceWaterDepthFilterPlacementModifier.of(0);

        RegistryEntry.Reference<ConfiguredFeature<?, ?>> whiteForest = registryEntryLookup.getOrThrow(VegetationConfiguredFeatures.WHITE_FOREST_VEGETATION);
        RegistryEntry.Reference<ConfiguredFeature<?, ?>> lightGrayDesert = registryEntryLookup.getOrThrow(VegetationConfiguredFeatures.LIGHT_GRAY_DESERT);
        RegistryEntry.Reference<ConfiguredFeature<?, ?>> grayPlains = registryEntryLookup.getOrThrow(VegetationConfiguredFeatures.GRAY_PLAINS);
        RegistryEntry.Reference<ConfiguredFeature<?, ?>> darkForest = registryEntryLookup.getOrThrow(VegetationConfiguredFeatures.DARK_TREE);
        RegistryEntry.Reference<ConfiguredFeature<?, ?>> patchFrostMelon = registryEntryLookup.getOrThrow(VegetationConfiguredFeatures.PATCH_FROST_MELON);
        RegistryEntry.Reference<ConfiguredFeature<?, ?>> whiteGrass = registryEntryLookup.getOrThrow(VegetationConfiguredFeatures.WHITE_GRASS);

        PlacedFeatures.register(featureRegisterable, WHITE_FOREST_VEGETATION, whiteForest, net.minecraft.world.gen.feature.VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                PlacedFeatures.createCountExtraModifier(10, 0.1F, 1), BlockList.whiteSapling));
        PlacedFeatures.register(featureRegisterable, PATCH_WHITE_GRASS_PLAIN, whiteGrass, NoiseThresholdCountPlacementModifier.of(-0.8, 5, 10),
                SquarePlacementModifier.of(), PlacedFeatures.WORLD_SURFACE_WG_HEIGHTMAP, BiomePlacementModifier.of());
        PlacedFeatures.register(featureRegisterable, PATCH_WHITE_GRASS_FOREST, whiteGrass, net.minecraft.world.gen.feature.VegetationPlacedFeatures.modifiers(2));
        PlacedFeatures.register(featureRegisterable, LIGHT_GRAY_DESERT, lightGrayDesert, net.minecraft.world.gen.feature.VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                PlacedFeatures.createCountExtraModifier(0, 0.1F, 1), BlockList.lightGraySapling));
        PlacedFeatures.register(featureRegisterable, GRAY_PLAINS, grayPlains, net.minecraft.world.gen.feature.VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                PlacedFeatures.createCountExtraModifier(0, 0.1F, 1), BlockList.graySapling));
        PlacedFeatures.register(featureRegisterable, DART_TREE, darkForest, CountPlacementModifier.of(16),
                SquarePlacementModifier.of(), placementModifier, PlacedFeatures.OCEAN_FLOOR_HEIGHTMAP, BiomePlacementModifier.of());
        PlacedFeatures.register(featureRegisterable, PATCH_FROST_MELON, patchFrostMelon, RarityFilterPlacementModifier.of(300),
                SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
    }

    private static RegistryKey<PlacedFeature> registerPlacedFeatures(String id) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(CrystalMod.MODID, id));
    }
}
