package com.stalight.crystal.world.feature;

import com.stalight.crystal.CrystalMod;
import com.stalight.crystal.block.BlockList;
import com.stalight.crystal.register.ModBlockRegistry;
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

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> featureRegisterable) {
        ConfiguredFeatures.register(featureRegisterable, WHITE_TREE, Feature.TREE,
                TreeConfiguredFeatures.tree(BlockList.whiteLog, ModBlockRegistry.whiteDirt, BlockList.whiteLeaves).build());
        ConfiguredFeatures.register(featureRegisterable, LIGHT_GRAY_TREE, Feature.TREE,
                TreeConfiguredFeatures.tree(BlockList.lightGrayLog, ModBlockRegistry.lightGrayDirt, BlockList.lightGrayLeaves).build());
        ConfiguredFeatures.register(featureRegisterable, GRAY_TREE, Feature.TREE,
                TreeConfiguredFeatures.tree(BlockList.grayLog, ModBlockRegistry.grayDirt, BlockList.grayLeaves).build());
        ConfiguredFeatures.register(featureRegisterable, BLACK_TREE, Feature.TREE,
                TreeConfiguredFeatures.tree(BlockList.blackLog, ModBlockRegistry.blackDirt, BlockList.blackLeaves).build());
        ConfiguredFeatures.register(featureRegisterable, BROWN_TREE, Feature.TREE,
                TreeConfiguredFeatures.tree(BlockList.brownLog, ModBlockRegistry.brownDirt, BlockList.brownLeaves).build());
        ConfiguredFeatures.register(featureRegisterable, RED_TREE, Feature.TREE,
                TreeConfiguredFeatures.tree(BlockList.redLog, ModBlockRegistry.redDirt, BlockList.redLeaves).build());
        ConfiguredFeatures.register(featureRegisterable, ORANGE_TREE, Feature.TREE,
                TreeConfiguredFeatures.tree(BlockList.orangeLog, ModBlockRegistry.orangeDirt, BlockList.orangeLeaves).build());
        ConfiguredFeatures.register(featureRegisterable, YELLOW_TREE, Feature.TREE,
                TreeConfiguredFeatures.tree(BlockList.yellowLog, ModBlockRegistry.yellowDirt, BlockList.yellowLeaves).build());
        ConfiguredFeatures.register(featureRegisterable, LIME_TREE, Feature.TREE,
                TreeConfiguredFeatures.tree(BlockList.limeLog, ModBlockRegistry.limeDirt, BlockList.limeLeaves).build());
        ConfiguredFeatures.register(featureRegisterable, GREEN_TREE, Feature.TREE,
                TreeConfiguredFeatures.tree(BlockList.greenLog, ModBlockRegistry.greenDirt, BlockList.greenLeaves).build());
        ConfiguredFeatures.register(featureRegisterable, CYAN_TREE, Feature.TREE,
                TreeConfiguredFeatures.tree(BlockList.cyanLog, ModBlockRegistry.cyanDirt, BlockList.cyanLeaves).build());
        ConfiguredFeatures.register(featureRegisterable, LIGHT_BLUE_TREE, Feature.TREE,
                TreeConfiguredFeatures.tree(BlockList.lightBlueLog, ModBlockRegistry.lightBlueDirt, BlockList.lightBlueLeaves).build());
        ConfiguredFeatures.register(featureRegisterable, BLUE_TREE, Feature.TREE,
                TreeConfiguredFeatures.tree(BlockList.blueLog, ModBlockRegistry.blueDirt, BlockList.blueLeaves).build());
        ConfiguredFeatures.register(featureRegisterable, PURPLE_TREE, Feature.TREE,
                TreeConfiguredFeatures.tree(BlockList.purpleLog, ModBlockRegistry.purpleDirt, BlockList.purpleLeaves).build());
        ConfiguredFeatures.register(featureRegisterable, MAGENTA_TREE, Feature.TREE,
                TreeConfiguredFeatures.tree(BlockList.magentaLog, ModBlockRegistry.magentaDirt, BlockList.magentaLeaves).build());
        ConfiguredFeatures.register(featureRegisterable, PINK_TREE, Feature.TREE,
                TreeConfiguredFeatures.tree(BlockList.pinkLog, ModBlockRegistry.pinkDirt, BlockList.pinkLeaves).build());
    }

    private static TreeFeatureConfig.Builder tree(Block log, Block leaves, Block dirt) {
        return new TreeFeatureConfig.Builder(
                BlockStateProvider.of(log),
                new StraightTrunkPlacer(4, 2, 0),
                BlockStateProvider.of(dirt),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                new TwoLayersFeatureSize(1, 0, 1))
                .dirtProvider(BlockStateProvider.of(leaves)).ignoreVines();
    }

    private static RegistryKey<ConfiguredFeature<?, ?>> registry(String id) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(CrystalMod.MODID, id));
    }
}
