package com.stalight.crystal.world.feature;

import com.stalight.crystal.CrystalMod;
import com.stalight.crystal.block.BlockList;
import com.stalight.crystal.register.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

import java.util.List;

public class VegetationConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> WHITE_FOREST_VEGETATION = registerConfiguredFeatures("white_forest_vegetation");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LIGHT_GRAY_DESERT = registerConfiguredFeatures("light_gray_desert");
    public static final RegistryKey<ConfiguredFeature<?, ?>> GRAY_PLAINS =  registerConfiguredFeatures("gray_plains");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DARK_TREE = registerConfiguredFeatures("dark_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PATCH_FROST_MELON = registerConfiguredFeatures("patch_frost_melon");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WHITE_GRASS = registerConfiguredFeatures("white_grass");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> featureRegisterable) {
        RegistryEntryLookup<ConfiguredFeature<?, ?>> registryEntryLookup = featureRegisterable.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);
        RegistryEntry.Reference<ConfiguredFeature<?, ?>> lightGrayChecked = registryEntryLookup.getOrThrow(TreeConfiguredFeatures.LIGHT_GRAY_TREE);
        RegistryEntry.Reference<ConfiguredFeature<?, ?>> grayTreeChecked = registryEntryLookup.getOrThrow(TreeConfiguredFeatures.GRAY_TREE);
        // 灰烬灌木
        RegistryEntry.Reference<ConfiguredFeature<?, ?>> emberBush = registryEntryLookup.getOrThrow(TreeConfiguredFeatures.EMBER_BUSH);
        //
        ConfiguredFeatures.register(featureRegisterable, WHITE_GRASS, Feature.RANDOM_PATCH,
                VegetationConfiguredFeatures.createRandomPatchFeatureConfig(BlockStateProvider.of(ModBlocks.whiteShortGrassBlock), 32));
        RegistryEntryLookup<PlacedFeature> registryEntryLookup2 = featureRegisterable.getRegistryLookup(RegistryKeys.PLACED_FEATURE);
        RegistryEntry.Reference<PlacedFeature> whiteTree = registryEntryLookup2.getOrThrow(TreePlacedFeatures.WHITE_CHECKED);
        RegistryEntry.Reference<PlacedFeature> lightGrayTree = registryEntryLookup2.getOrThrow(TreePlacedFeatures.LIGHT_GRAY_CHECKED);
        RegistryEntry.Reference<PlacedFeature> grayTree = registryEntryLookup2.getOrThrow(TreePlacedFeatures.GRAY_CHECKED);
        RegistryEntry.Reference<PlacedFeature> blackTree = registryEntryLookup2.getOrThrow(TreePlacedFeatures.BLACK_CHECKED);
        // 冰霜森林配置
        ConfiguredFeatures.register(featureRegisterable, WHITE_FOREST_VEGETATION, Feature.RANDOM_SELECTOR,
                new RandomFeatureConfig(List.of(new RandomFeatureEntry(lightGrayTree, 0.1f)), whiteTree));
        // 冰霜西瓜堆配置
        RandomPatchFeatureConfig frostMelon = ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(BlockList.frostMelon)), List.of(ModBlocks.whiteGrassBlock));
        ConfiguredFeatures.register(featureRegisterable, PATCH_FROST_MELON, Feature.RANDOM_PATCH, frostMelon);
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
        ConfiguredFeatures.register(featureRegisterable, DARK_TREE, Feature.RANDOM_SELECTOR,
                new RandomFeatureConfig(List.of(new RandomFeatureEntry(blackTree, 0.6666667f)), grayTree));
    }

    private static RandomPatchFeatureConfig createRandomPatchFeatureConfig(BlockStateProvider block, int tries) {
        return ConfiguredFeatures.createRandomPatchFeatureConfig(tries, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(block)));
    }

    private static RegistryKey<ConfiguredFeature<?, ?>> registerConfiguredFeatures(String id) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(CrystalMod.MODID, id));
    }
}
