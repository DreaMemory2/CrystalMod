package com.stalight.crystal.world.feature;

import com.stalight.crystal.CrystalMod;
import com.stalight.crystal.block.BlockList;
import com.stalight.crystal.register.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.ConfiguredFeatures;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.foliage.BushFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

public class TreeConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> WHITE_TREE = registry("white_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LIGHT_GRAY_TREE = registry("light_gray_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> GRAY_TREE = registry("gray_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BLACK_TREE = registry("black_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BROWN_TREE = registry("brown_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> RED_TREE = registry("red_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORANGE_TREE = registry("orange_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> YELLOW_TREE = registry("yellow_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LIME_TREE = registry("lime_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> GREEN_TREE = registry("green_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CYAN_TREE = registry("cyan_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LIGHT_BLUE_TREE = registry("light_blue_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BLUE_TREE = registry("blue_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PURPLE_TREE = registry("purple_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MAGENTA_TREE = registry("magenta_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PINK_TREE = registry("pink_tree");
    // 灰烬灌木
    public static final RegistryKey<ConfiguredFeature<?, ?>> EMBER_BUSH = registry("ember_bush");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> featureRegisterable) {
        ConfiguredFeatures.register(featureRegisterable, WHITE_TREE, Feature.TREE,
                TreeConfiguredFeatures.tree(BlockList.whiteLog, ModBlocks.whiteDirt, BlockList.whiteLeaves).build());
        ConfiguredFeatures.register(featureRegisterable, LIGHT_GRAY_TREE, Feature.TREE,
                TreeConfiguredFeatures.tree(BlockList.lightGrayLog, ModBlocks.lightGrayDirt, BlockList.lightGrayLeaves).build());
        ConfiguredFeatures.register(featureRegisterable, GRAY_TREE, Feature.TREE,
                TreeConfiguredFeatures.tree(BlockList.grayLog, ModBlocks.grayDirt, BlockList.grayLeaves).build());
        ConfiguredFeatures.register(featureRegisterable, BLACK_TREE, Feature.TREE,
                TreeConfiguredFeatures.tree(BlockList.blackLog, ModBlocks.blackDirt, BlockList.blackLeaves).build());
        ConfiguredFeatures.register(featureRegisterable, BROWN_TREE, Feature.TREE,
                TreeConfiguredFeatures.tree(BlockList.brownLog, ModBlocks.brownDirt, BlockList.brownLeaves).build());
        ConfiguredFeatures.register(featureRegisterable, RED_TREE, Feature.TREE,
                TreeConfiguredFeatures.tree(BlockList.redLog, ModBlocks.redDirt, BlockList.redLeaves).build());
        ConfiguredFeatures.register(featureRegisterable, ORANGE_TREE, Feature.TREE,
                TreeConfiguredFeatures.tree(BlockList.orangeLog, ModBlocks.orangeDirt, BlockList.orangeLeaves).build());
        ConfiguredFeatures.register(featureRegisterable, YELLOW_TREE, Feature.TREE,
                TreeConfiguredFeatures.tree(BlockList.yellowLog, ModBlocks.yellowDirt, BlockList.yellowLeaves).build());
        ConfiguredFeatures.register(featureRegisterable, LIME_TREE, Feature.TREE,
                TreeConfiguredFeatures.tree(BlockList.limeLog, ModBlocks.limeDirt, BlockList.limeLeaves).build());
        ConfiguredFeatures.register(featureRegisterable, GREEN_TREE, Feature.TREE,
                TreeConfiguredFeatures.tree(BlockList.greenLog, ModBlocks.greenDirt, BlockList.greenLeaves).build());
        ConfiguredFeatures.register(featureRegisterable, CYAN_TREE, Feature.TREE,
                TreeConfiguredFeatures.tree(BlockList.cyanLog, ModBlocks.cyanDirt, BlockList.cyanLeaves).build());
        ConfiguredFeatures.register(featureRegisterable, LIGHT_BLUE_TREE, Feature.TREE,
                TreeConfiguredFeatures.tree(BlockList.lightBlueLog, ModBlocks.lightBlueDirt, BlockList.lightBlueLeaves).build());
        ConfiguredFeatures.register(featureRegisterable, BLUE_TREE, Feature.TREE,
                TreeConfiguredFeatures.tree(BlockList.blueLog, ModBlocks.blueDirt, BlockList.blueLeaves).build());
        ConfiguredFeatures.register(featureRegisterable, PURPLE_TREE, Feature.TREE,
                TreeConfiguredFeatures.tree(BlockList.purpleLog, ModBlocks.purpleDirt, BlockList.purpleLeaves).build());
        ConfiguredFeatures.register(featureRegisterable, MAGENTA_TREE, Feature.TREE,
                TreeConfiguredFeatures.tree(BlockList.magentaLog, ModBlocks.magentaDirt, BlockList.magentaLeaves).build());
        ConfiguredFeatures.register(featureRegisterable, PINK_TREE, Feature.TREE,
                TreeConfiguredFeatures.tree(BlockList.pinkLog, ModBlocks.pinkDirt, BlockList.pinkLeaves).build());
        // Bush
        ConfiguredFeatures.register(featureRegisterable, EMBER_BUSH, Feature.TREE, new TreeFeatureConfig.Builder(
                        BlockStateProvider.of(BlockList.lightGrayLog),
                        new StraightTrunkPlacer(1, 0, 0), BlockStateProvider.of(BlockList.lightGrayLeaves),
                        new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
                        new TwoLayersFeatureSize(0, 0, 0))
                .dirtProvider(BlockStateProvider.of(ModBlocks.lightGrayDirt)).build());
    }

    private static TreeFeatureConfig.Builder tree(Block log, Block dirt, Block leaves) {
        return new TreeFeatureConfig.Builder(
                BlockStateProvider.of(log),
                new StraightTrunkPlacer(4, 2, 0),
                BlockStateProvider.of(leaves),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                new TwoLayersFeatureSize(1, 0, 1))
                .dirtProvider(BlockStateProvider.of(dirt)).ignoreVines();
    }

    private static RegistryKey<ConfiguredFeature<?, ?>> registry(String id) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(CrystalMod.MODID, "tree/" + id));
    }
}
