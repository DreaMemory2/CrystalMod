package com.stalight.crystal.world;

import com.google.common.collect.ImmutableList;
import com.stalight.crystal.register.ModBiomes;
import com.stalight.crystal.register.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.noise.NoiseParametersKeys;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;

public class SurfaceRuleData {

    public static MaterialRules.MaterialRule makeRules() {
        ImmutableList.Builder<MaterialRules.MaterialRule> builder = ImmutableList.builder();
        // 基岩层
        builder.add(MaterialRules.condition(MaterialRules.verticalGradient("bedrock_roof",
                YOffset.getBottom(), YOffset.aboveBottom(5)),
                MaterialRules.block(Blocks.BEDROCK.getDefaultState())));

        builder.add(MaterialRules.condition(MaterialRules.surface(), MaterialRules.sequence(

                // surface(ModBlocks.whiteGrassBlock, ModBlocks.whiteDirt, ModBiomes.frostForest),
                // surface(Blocks.POWDER_SNOW, Blocks.SNOW, ModBiomes.frostPlains),
                surface(ModBlocks.lightGrayGrassBlock, ModBlocks.lightGrayDirt, ModBiomes.emberDesert),
                surface(ModBlocks.grayGrassBlock, ModBlocks.grayDirt, ModBiomes.emberPlain),
                surface(ModBlocks.blackGrassBlock, ModBlocks.blackDirt, ModBiomes.darkTree)

        )));
        // 雪林表面为细雪和雪块
        builder.add(MaterialRules.condition(MaterialRules.biome(ModBiomes.frostForest, ModBiomes.frostPlains),
                MaterialRules.sequence(
                        // 偶尔生成Powder Snow
                        MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.POWDER_SNOW, 0.35, 0.6),
                                MaterialRules.condition(MaterialRules.water(0, 0), makeStateRule(Blocks.POWDER_SNOW))),
                        // 默认为White Grass
                        MaterialRules.condition(MaterialRules.water(0, 0), makeStateRule(ModBlocks.whiteGrassBlock)))));

        // builder.add(MaterialRules.condition(MaterialRules.condition()));

        // 雪林表面为细雪和雪块
        builder.add(MaterialRules.condition(MaterialRules.biome(ModBiomes.frostForest), MaterialRules.sequence(
                // 偶尔生成Powder Snow
                MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.POWDER_SNOW, 0.35, 0.6),
                        MaterialRules.condition(MaterialRules.water(0, 0), makeStateRule(Blocks.POWDER_SNOW))),
                // 默认为White Grass
                MaterialRules.condition(MaterialRules.water(0, 0), makeStateRule(ModBlocks.whiteGrassBlock))
        )));

        // builder.add(MaterialRules.condition(MaterialRules.biome(ModBiomes.frostForest), makeStateRule(ModBlocks.whiteStone)));
        builder.add(MaterialRules.condition(MaterialRules.biome(ModBiomes.emberDesert), makeStateRule(ModBlocks.lightGrayStone)));
        builder.add(MaterialRules.condition(MaterialRules.biome(ModBiomes.emberPlain), makeStateRule(ModBlocks.grayStone)));
        builder.add(MaterialRules.condition(MaterialRules.biome(ModBiomes.darkTree), makeStateRule(ModBlocks.blackStone)));

        return MaterialRules.sequence(builder.build().toArray(MaterialRules.MaterialRule[]::new));
    }

    @SafeVarargs
    private static MaterialRules.MaterialRule surface(Block grassBlock, Block dirt, RegistryKey<Biome> ... biomes) {
        return MaterialRules.condition(MaterialRules.biome(biomes), MaterialRules.sequence(
                        /*地表设置*/surfaceSetting(grassBlock, dirt),
                        /*地表厚度*/surfaceDepth(dirt)));
    }

    private static MaterialRules.MaterialRule surfaceSetting(Block grassBlock, Block dirt) {
        return MaterialRules.condition(MaterialRules.surface(),
                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR,
                        MaterialRules.condition(MaterialRules.water(-1, 0),
                                MaterialRules.sequence(MaterialRules.condition(
                                        MaterialRules.water(0, 0),
                                        makeStateRule(grassBlock)), makeStateRule(dirt)))));
    }

    private static MaterialRules.MaterialRule surfaceDepth(Block dirt) {
        return MaterialRules.condition(MaterialRules.aboveY(YOffset.fixed(70), 1), MaterialRules.sequence(
                makeStateRule(dirt)));
    }

    private static MaterialRules.MaterialRule makeStateRule(Block block) {
        return MaterialRules.block(block.getDefaultState());
    }
}
