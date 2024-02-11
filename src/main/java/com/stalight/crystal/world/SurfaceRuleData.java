package com.stalight.crystal.world;

import com.google.common.collect.ImmutableList;
import com.stalight.crystal.register.ModBiomes;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;

public class SurfaceRuleData {
    private static final MaterialRules.MaterialRule DIRT = makeStateRule(Blocks.DIRT);
    private static final MaterialRules.MaterialRule GRASS_BLOCK = makeStateRule(Blocks.GRASS_BLOCK);
    private static final MaterialRules.MaterialRule RED_TERRACOTTA = makeStateRule(Blocks.RED_TERRACOTTA);
    private static final MaterialRules.MaterialRule BLUE_TERRACOTTA = makeStateRule(Blocks.BLUE_TERRACOTTA);

    public static MaterialRules.MaterialRule m() {
        MaterialRules.MaterialCondition isAtOrAboveWaterLevel = MaterialRules.water(-1, 0);
        MaterialRules.MaterialRule grassSurface = MaterialRules.sequence(MaterialRules.condition(isAtOrAboveWaterLevel, GRASS_BLOCK), DIRT);

        return MaterialRules.sequence(
                MaterialRules.condition(MaterialRules.biome(ModBiomes.frostForest), BLUE_TERRACOTTA),

                // Default to a grass and dirt surface
                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, grassSurface)
        );
    }

    public static MaterialRules.MaterialRule makeRules() {
        ImmutableList.Builder<MaterialRules.MaterialRule> builder = ImmutableList.builder();
        // 基岩层
        builder.add(MaterialRules.condition(MaterialRules.verticalGradient("bedrock_roof",
                YOffset.getBottom(), YOffset.aboveBottom(5)),
                MaterialRules.block(Blocks.BEDROCK.getDefaultState())));

        builder.add(MaterialRules.condition(
                // 地表
                MaterialRules.surface(),

                MaterialRules.sequence(
                        // 地表设置
                        withoutWaterSafe(MaterialRules.sequence(MaterialRules.condition(
                                MaterialRules.water(0, 0), GRASS_BLOCK), DIRT)),

                        // 地表厚度
                        MaterialRules.condition(MaterialRules.aboveY(YOffset.fixed(70), 1), DIRT))
        ));

        // 基础方块
        builder.add(MaterialRules.block(Blocks.SNOW_BLOCK.getDefaultState()));


        // 深板岩层
        builder.add(MaterialRules.condition(MaterialRules.verticalGradient("minecraft:deepslate",
                        YOffset.fixed(0), YOffset.fixed(8)),
                MaterialRules.block(Blocks.DEEPSLATE.getDefaultState())));

        return MaterialRules.sequence(builder.build().toArray(MaterialRules.MaterialRule[]::new));
    }

    private static MaterialRules.MaterialRule makeStateRule(Block block) {
        return MaterialRules.block(block.getDefaultState());
    }

    private static MaterialRules.MaterialRule withoutWaterSafe(MaterialRules.MaterialRule sequence) {
         return MaterialRules.condition(MaterialRules.surface(),
                 MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR,
                         MaterialRules.condition(MaterialRules.water(-1, 0), sequence)));
    }
}
