package com.stalight.crystal.world.feature;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class VegetationConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> WHITE_FOREST_VEGETATION = ConfiguredFeatures.of("white_forest_vegetation");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LIGHT_GRAY_DESERT = ConfiguredFeatures.of("light_gray_desert");
    public static final RegistryKey<ConfiguredFeature<?, ?>> GRAY_PLAINS =  ConfiguredFeatures.of("gray_plains");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DARK_FOREST = ConfiguredFeatures.of("dark_forest");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> featureRegisterable) {
        RegistryEntryLookup<ConfiguredFeature<?, ?>> registryEntryLookup = featureRegisterable.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);
        RegistryEntry.Reference<ConfiguredFeature<?, ?>> lightGrayChecked = registryEntryLookup.getOrThrow(TreeConfiguredFeatures.LIGHT_GRAY_TREE);
        RegistryEntry.Reference<ConfiguredFeature<?, ?>> grayTreeChecked = registryEntryLookup.getOrThrow(TreeConfiguredFeatures.GRAY_TREE);
        // 灰烬灌木
        RegistryEntry.Reference<ConfiguredFeature<?, ?>> emberBush = registryEntryLookup.getOrThrow(TreeConfiguredFeatures.EMBER_BUSH);

        RegistryEntryLookup<PlacedFeature> registryEntryLookup2 = featureRegisterable.getRegistryLookup(RegistryKeys.PLACED_FEATURE);
        RegistryEntry.Reference<PlacedFeature> whiteTree = registryEntryLookup2.getOrThrow(TreePlacedFeatures.WHITE_CHECKED);
        RegistryEntry.Reference<PlacedFeature> lightGrayTree = registryEntryLookup2.getOrThrow(TreePlacedFeatures.LIGHT_GRAY_CHECKED);
        RegistryEntry.Reference<PlacedFeature> grayTree = registryEntryLookup2.getOrThrow(TreePlacedFeatures.GRAY_CHECKED);
        RegistryEntry.Reference<PlacedFeature> blackTree = registryEntryLookup2.getOrThrow(TreePlacedFeatures.BLACK_CHECKED);
        // 冰霜森林配置
        ConfiguredFeatures.register(featureRegisterable, WHITE_FOREST_VEGETATION, Feature.RANDOM_SELECTOR,
                new RandomFeatureConfig(List.of(new RandomFeatureEntry(lightGrayTree, 0.1f)), whiteTree));
        // 灰烬荒漠配置
        ConfiguredFeatures.register(featureRegisterable, LIGHT_GRAY_DESERT, Feature.RANDOM_SELECTOR,
                new RandomFeatureConfig(List.of(new RandomFeatureEntry(PlacedFeatures.createEntry(emberBush), 1.0f)),
                        PlacedFeatures.createEntry(emberBush)));
        // 灰烬草原配置
        ConfiguredFeatures.register(featureRegisterable, GRAY_PLAINS, Feature.RANDOM_SELECTOR,
                new RandomFeatureConfig(List.of(new RandomFeatureEntry(
                        PlacedFeatures.createEntry(lightGrayChecked), 0.33333334f)),
                        PlacedFeatures.createEntry(grayTreeChecked)));
        // 黑暗森林植被配置
        ConfiguredFeatures.register(featureRegisterable, DARK_FOREST, Feature.RANDOM_SELECTOR,
                new RandomFeatureConfig(List.of(new RandomFeatureEntry(blackTree, 0.6666667f)), grayTree));
    }
}
