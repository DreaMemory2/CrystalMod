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

public class TreePlacedFeatures {

    public static final RegistryKey<PlacedFeature> WHITE_CHECKED = registry("white_checked");
    public static final RegistryKey<PlacedFeature> LIGHT_GRAY_CHECKED = registry("light_gray_checked");
    public static final RegistryKey<PlacedFeature> GRAY_CHECKED = registry("gray_checked");
    public static final RegistryKey<PlacedFeature> BLACK_CHECKED = registry("black_checked");
    public static final RegistryKey<PlacedFeature> BROWN_CHECKED = registry("brown_checked");
    public static final RegistryKey<PlacedFeature> RED_CHECKED = registry("red_checked");
    public static final RegistryKey<PlacedFeature> ORANGE_CHECKED = registry("orange_checked");
    public static final RegistryKey<PlacedFeature> YELLOW_CHECKED = registry("yellow_checked");
    public static final RegistryKey<PlacedFeature> LIME_CHECKED = registry("lime_checked");
    public static final RegistryKey<PlacedFeature> GREEN_CHECKED = registry("green_checked");
    public static final RegistryKey<PlacedFeature> CYAN_CHECKED = registry("cyan_checked");
    public static final RegistryKey<PlacedFeature> LIGHT_BLUE_CHECKED = registry("light_blue_checked");
    public static final RegistryKey<PlacedFeature> BLUE_CHECKED = registry("blue_checked");
    public static final RegistryKey<PlacedFeature> PURPLE_CHECKED = registry("purple_checked");
    public static final RegistryKey<PlacedFeature> MAGENTA_CHECKED = registry("magenta_checked");
    public static final RegistryKey<PlacedFeature> PINK_CHECKED = registry("pink_checked");

    public static void bootstrap(Registerable<PlacedFeature> featureRegisterable) {
        RegistryEntryLookup<ConfiguredFeature<?, ?>> registryEntryLookup = featureRegisterable.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);
        RegistryEntry.Reference<ConfiguredFeature<?, ?>> whiteTree = registryEntryLookup.getOrThrow(TreeConfiguredFeatures.WHITE_TREE);
        RegistryEntry.Reference<ConfiguredFeature<?, ?>> lightGrayTree = registryEntryLookup.getOrThrow(TreeConfiguredFeatures.LIGHT_GRAY_TREE);
        RegistryEntry.Reference<ConfiguredFeature<?, ?>> grayTree = registryEntryLookup.getOrThrow(TreeConfiguredFeatures.GRAY_TREE);
        RegistryEntry.Reference<ConfiguredFeature<?, ?>> blackTree = registryEntryLookup.getOrThrow(TreeConfiguredFeatures.BLACK_TREE);
        RegistryEntry.Reference<ConfiguredFeature<?, ?>> brownTree = registryEntryLookup.getOrThrow(TreeConfiguredFeatures.BROWN_TREE);
        RegistryEntry.Reference<ConfiguredFeature<?, ?>> redTree = registryEntryLookup.getOrThrow(TreeConfiguredFeatures.RED_TREE);
        RegistryEntry.Reference<ConfiguredFeature<?, ?>> orangeTree = registryEntryLookup.getOrThrow(TreeConfiguredFeatures.ORANGE_TREE);
        RegistryEntry.Reference<ConfiguredFeature<?, ?>> yellowTree = registryEntryLookup.getOrThrow(TreeConfiguredFeatures.YELLOW_TREE);
        RegistryEntry.Reference<ConfiguredFeature<?, ?>> limeTree = registryEntryLookup.getOrThrow(TreeConfiguredFeatures.LIME_TREE);
        RegistryEntry.Reference<ConfiguredFeature<?, ?>> greenTree = registryEntryLookup.getOrThrow(TreeConfiguredFeatures.GREEN_TREE);
        RegistryEntry.Reference<ConfiguredFeature<?, ?>> cyanTree = registryEntryLookup.getOrThrow(TreeConfiguredFeatures.CYAN_TREE);
        RegistryEntry.Reference<ConfiguredFeature<?, ?>> lightBlueTree = registryEntryLookup.getOrThrow(TreeConfiguredFeatures.LIGHT_BLUE_TREE);
        RegistryEntry.Reference<ConfiguredFeature<?, ?>> blueTree = registryEntryLookup.getOrThrow(TreeConfiguredFeatures.BLUE_TREE);
        RegistryEntry.Reference<ConfiguredFeature<?, ?>> purpleTree = registryEntryLookup.getOrThrow(TreeConfiguredFeatures.PURPLE_TREE);
        RegistryEntry.Reference<ConfiguredFeature<?, ?>> magentaTree = registryEntryLookup.getOrThrow(TreeConfiguredFeatures.MAGENTA_TREE);
        RegistryEntry.Reference<ConfiguredFeature<?, ?>> pinkTree = registryEntryLookup.getOrThrow(TreeConfiguredFeatures.PINK_TREE);

        PlacedFeatures.register(featureRegisterable, WHITE_CHECKED, whiteTree, PlacedFeatures.wouldSurvive(BlockList.whiteSapling));
        PlacedFeatures.register(featureRegisterable, LIGHT_GRAY_CHECKED, lightGrayTree, PlacedFeatures.wouldSurvive(BlockList.lightGraySapling));
        PlacedFeatures.register(featureRegisterable, GRAY_CHECKED, grayTree, PlacedFeatures.wouldSurvive(BlockList.graySapling));
        PlacedFeatures.register(featureRegisterable, BLACK_CHECKED, blackTree, PlacedFeatures.wouldSurvive(BlockList.blackSapling));
        PlacedFeatures.register(featureRegisterable, BROWN_CHECKED, brownTree, PlacedFeatures.wouldSurvive(BlockList.brownSapling));
        PlacedFeatures.register(featureRegisterable, RED_CHECKED, redTree, PlacedFeatures.wouldSurvive(BlockList.redSapling));
        PlacedFeatures.register(featureRegisterable, ORANGE_CHECKED, orangeTree, PlacedFeatures.wouldSurvive(BlockList.orangeSapling));
        PlacedFeatures.register(featureRegisterable, YELLOW_CHECKED, yellowTree, PlacedFeatures.wouldSurvive(BlockList.yellowSapling));
        PlacedFeatures.register(featureRegisterable, LIME_CHECKED, limeTree, PlacedFeatures.wouldSurvive(BlockList.limeSapling));
        PlacedFeatures.register(featureRegisterable, GREEN_CHECKED, greenTree, PlacedFeatures.wouldSurvive(BlockList.greenSapling));
        PlacedFeatures.register(featureRegisterable, CYAN_CHECKED, cyanTree, PlacedFeatures.wouldSurvive(BlockList.cyanSapling));
        PlacedFeatures.register(featureRegisterable, LIGHT_BLUE_CHECKED, lightBlueTree, PlacedFeatures.wouldSurvive(BlockList.lightBlueSapling));
        PlacedFeatures.register(featureRegisterable, BLUE_CHECKED, blueTree, PlacedFeatures.wouldSurvive(BlockList.blueSapling));
        PlacedFeatures.register(featureRegisterable, PURPLE_CHECKED, purpleTree, PlacedFeatures.wouldSurvive(BlockList.purpleSapling));
        PlacedFeatures.register(featureRegisterable, MAGENTA_CHECKED, magentaTree, PlacedFeatures.wouldSurvive(BlockList.magentaSapling));
        PlacedFeatures.register(featureRegisterable, PINK_CHECKED, pinkTree, PlacedFeatures.wouldSurvive(BlockList.pinkSapling));
;    }

    private static RegistryKey<PlacedFeature> registry(String id) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(CrystalMod.MODID, id));
    }
}
