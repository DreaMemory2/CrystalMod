package com.stalight.crystal.datagen;

import com.stalight.crystal.CrystalMod;
import com.stalight.crystal.block.BlockList;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.SimpleFabricLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.*;
import net.minecraft.loot.context.LootContextTypes;
import net.minecraft.loot.entry.AlternativeEntry;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.ExplosionDecayLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.predicate.NumberRange;
import net.minecraft.predicate.item.EnchantmentPredicate;
import net.minecraft.predicate.item.ItemPredicate;
import net.minecraft.util.Identifier;

import java.util.function.BiConsumer;

public class ModBlockLootTables extends SimpleFabricLootTableProvider {
    public ModBlockLootTables(FabricDataOutput output) {
        super(output, LootContextTypes.BLOCK);
    }

    @Override
    public void accept(BiConsumer<Identifier, LootTable.Builder> exporter) {
        // 添加你的方块掉落到这里
        exporter.accept(registerLootTables("white_log"),
                createBlockLootTables(BlockList.whiteLog));
        exporter.accept(registerLootTables("light_gray_log"),
                createBlockLootTables(BlockList.lightGrayLog));
        exporter.accept(registerLootTables("gray_log"),
                createBlockLootTables(BlockList.grayLog));
        exporter.accept(registerLootTables("black_log"),
                createBlockLootTables(BlockList.blackLog));
        exporter.accept(registerLootTables("brown_log"),
                createBlockLootTables(BlockList.brownLog));
        exporter.accept(registerLootTables("red_log"),
                createBlockLootTables(BlockList.redLog));
        exporter.accept(registerLootTables("orange_log"),
                createBlockLootTables(BlockList.orangeLog));
        exporter.accept(registerLootTables("yellow_log"),
                createBlockLootTables(BlockList.yellowLog));
        exporter.accept(registerLootTables("lime_log"),
                createBlockLootTables(BlockList.limeLog));
        exporter.accept(registerLootTables("green_log"),
                createBlockLootTables(BlockList.greenLog));
        exporter.accept(registerLootTables("cyan_log"),
                createBlockLootTables(BlockList.cyanLog));
        exporter.accept(registerLootTables("light_blue_log"),
                createBlockLootTables(BlockList.lightBlueLog));
        exporter.accept(registerLootTables("blue_log"),
                createBlockLootTables(BlockList.blueLog));
        exporter.accept(registerLootTables("magenta_log"),
                createBlockLootTables(BlockList.magentaLog));
        exporter.accept(registerLootTables("purple_log"),
                createBlockLootTables(BlockList.purpleLog));
        exporter.accept(registerLootTables("pink_log"),
                createBlockLootTables(BlockList.pinkLog));

        exporter.accept(registerLootTables("white_dirt"),
                createBlockLootTables(BlockList.whiteDirt));
        exporter.accept(registerLootTables("light_gray_dirt"),
                createBlockLootTables(BlockList.lightGrayDirt));
        exporter.accept(registerLootTables("gray_dirt"),
                createBlockLootTables(BlockList.grayDirt));
        exporter.accept(registerLootTables("black_dirt"),
                createBlockLootTables(BlockList.blackDirt));
        exporter.accept(registerLootTables("brown_dirt"),
                createBlockLootTables(BlockList.brownDirt));
        exporter.accept(registerLootTables("red_dirt"),
                createBlockLootTables(BlockList.redDirt));
        exporter.accept(registerLootTables("orange_dirt"),
                createBlockLootTables(BlockList.orangeDirt));
        exporter.accept(registerLootTables("yellow_dirt"),
                createBlockLootTables(BlockList.yellowDirt));
        exporter.accept(registerLootTables("lime_dirt"),
                createBlockLootTables(BlockList.limeDirt));
        exporter.accept(registerLootTables("green_dirt"),
                createBlockLootTables(BlockList.greenDirt));
        exporter.accept(registerLootTables("cyan_dirt"),
                createBlockLootTables(BlockList.cyanDirt));
        exporter.accept(registerLootTables("light_blue_dirt"),
                createBlockLootTables(BlockList.lightBlueDirt));
        exporter.accept(registerLootTables("blue_dirt"),
                createBlockLootTables(BlockList.blueDirt));
        exporter.accept(registerLootTables("magenta_dirt"),
                createBlockLootTables(BlockList.magentaDirt));
        exporter.accept(registerLootTables("purple_dirt"),
                createBlockLootTables(BlockList.purpleDirt));
        exporter.accept(registerLootTables("pink_dirt"),
                createBlockLootTables(BlockList.pinkDirt));

        exporter.accept(registerLootTables("white_stone"),
                createStoneLootTables(BlockList.whiteStone, BlockList.whiteStone));
        exporter.accept(registerLootTables("light_gray_stone"),
                createStoneLootTables(BlockList.lightGrayStone, BlockList.lightGrayStone));
        exporter.accept(registerLootTables("gray_stone"),
                createStoneLootTables(BlockList.grayStone, BlockList.grayStone));
        exporter.accept(registerLootTables("black_stone"),
                createStoneLootTables(BlockList.blackStone, BlockList.blackStone));
        exporter.accept(registerLootTables("brown_stone"),
                createStoneLootTables(BlockList.brownStone, BlockList.brownStone));
        exporter.accept(registerLootTables("red_stone"),
                createStoneLootTables(BlockList.redStone, BlockList.redStone));
        exporter.accept(registerLootTables("orange_stone"),
                createStoneLootTables(BlockList.orangeStone, BlockList.orangeStone));
        exporter.accept(registerLootTables("yellow_stone"),
                createStoneLootTables(BlockList.yellowStone, BlockList.yellowStone));
        exporter.accept(registerLootTables("lime_stone"),
                createStoneLootTables(BlockList.limeStone, BlockList.limeStone));
        exporter.accept(registerLootTables("green_stone"),
                createStoneLootTables(BlockList.greenStone, BlockList.greenStone));
        exporter.accept(registerLootTables("cyan_stone"),
                createStoneLootTables(BlockList.cyanStone, BlockList.cyanStone));
        exporter.accept(registerLootTables("light_blue_stone"),
                createStoneLootTables(BlockList.lightBlueStone, BlockList.lightBlueStone));
        exporter.accept(registerLootTables("blue_stone"),
                createStoneLootTables(BlockList.blueStone, BlockList.blueStone));
        exporter.accept(registerLootTables("magenta_stone"),
                createStoneLootTables(BlockList.magentaStone, BlockList.magentaStone));
        exporter.accept(registerLootTables("purple_stone"),
                createStoneLootTables(BlockList.purpleStone, BlockList.purpleStone));
        exporter.accept(registerLootTables("pink_stone"),
                createStoneLootTables(BlockList.pinkStone, BlockList.pinkStone));

        exporter.accept(registerLootTables("white_leaves"),
                createLeavesLootTables(BlockList.whiteLeaves, BlockList.whiteSapling, Items.WHITE_DYE));
        exporter.accept(registerLootTables("light_gray_leaves"),
                createLeavesLootTables(BlockList.lightGrayLeaves, BlockList.lightGraySapling, Items.LIGHT_GRAY_DYE));
        exporter.accept(registerLootTables("gray_leaves"),
                createLeavesLootTables(BlockList.grayLeaves, BlockList.graySapling, Items.GRAY_DYE));
        exporter.accept(registerLootTables("black_leaves"),
                createLeavesLootTables(BlockList.blackLeaves, BlockList.graySapling, Items.BLACK_DYE));
        exporter.accept(registerLootTables("brown_leaves"),
                createLeavesLootTables(BlockList.brownLeaves, BlockList.brownSapling, Items.COCOA_BEANS));
        exporter.accept(registerLootTables("red_leaves"),
                createLeavesLootTables(BlockList.redLeaves, BlockList.redSapling, Items.REDSTONE));
        exporter.accept(registerLootTables("orange_leaves"),
                createLeavesLootTables(BlockList.orangeLeaves, BlockList.orangeSapling, Items.ORANGE_DYE));
        exporter.accept(registerLootTables("yellow_leaves"),
                createLeavesLootTables(BlockList.yellowLeaves, BlockList.yellowSapling, Items.YELLOW_DYE));
        exporter.accept(registerLootTables("lime_leaves"),
                createLeavesLootTables(BlockList.limeLeaves, BlockList.limeSapling, Items.LIME_DYE));
        exporter.accept(registerLootTables("green_leaves"),
                createLeavesLootTables(BlockList.greenLeaves, BlockList.greenSapling, Items.GREEN_DYE));
        exporter.accept(registerLootTables("cyan_leaves"),
                createLeavesLootTables(BlockList.cyanLeaves, BlockList.cyanSapling, Items.CYAN_DYE));
        exporter.accept(registerLootTables("light_blue_leaves"),
                createLeavesLootTables(BlockList.lightBlueLeaves, BlockList.lightBlueSapling, Items.LIGHT_BLUE_DYE));
        exporter.accept(registerLootTables("blue_leaves"),
                createLeavesLootTables(BlockList.blueLeaves, BlockList.blueSapling, Items.BLUE_DYE));
        exporter.accept(registerLootTables("purple_leaves"),
                createLeavesLootTables(BlockList.purpleLeaves, BlockList.purpleSapling, Items.PURPLE_DYE));
        exporter.accept(registerLootTables("magenta_leaves"),
                createLeavesLootTables(BlockList.magentaLeaves, BlockList.magentaSapling, Items.MAGENTA_DYE));
        exporter.accept(registerLootTables("pink_leaves"),
                createLeavesLootTables(BlockList.pinkLeaves, BlockList.pinkSapling, Items.PINK_DYE));

        exporter.accept(registerLootTables("white_sapling"), createBlockLootTables(BlockList.whiteSapling));
        exporter.accept(registerLootTables("light_gray_sapling"), createBlockLootTables(BlockList.lightGraySapling));
        exporter.accept(registerLootTables("gray_sapling"), createBlockLootTables(BlockList.graySapling));
        exporter.accept(registerLootTables("black_sapling"), createBlockLootTables(BlockList.blackSapling));
        exporter.accept(registerLootTables("brown_sapling"), createBlockLootTables(BlockList.brownSapling));
        exporter.accept(registerLootTables("red_sapling"), createBlockLootTables(BlockList.redSapling));
        exporter.accept(registerLootTables("orange_sapling"), createBlockLootTables(BlockList.orangeSapling));
        exporter.accept(registerLootTables("yellow_sapling"), createBlockLootTables(BlockList.yellowSapling));
        exporter.accept(registerLootTables("lime_sapling"), createBlockLootTables(BlockList.limeSapling));
        exporter.accept(registerLootTables("green_sapling"), createBlockLootTables(BlockList.greenSapling));
        exporter.accept(registerLootTables("cyan_sapling"), createBlockLootTables(BlockList.cyanSapling));
        exporter.accept(registerLootTables("light_blue_sapling"), createBlockLootTables(BlockList.lightBlueSapling));
        exporter.accept(registerLootTables("blue_sapling"), createBlockLootTables(BlockList.blueSapling));
        exporter.accept(registerLootTables("purple_sapling"), createBlockLootTables(BlockList.purpleSapling));
        exporter.accept(registerLootTables("magenta_sapling"), createBlockLootTables(BlockList.magentaSapling));
        exporter.accept(registerLootTables("pink_sapling"), createBlockLootTables(BlockList.pinkSapling));
    }

    private Identifier registerLootTables(String id) {
        return new Identifier(CrystalMod.MODID, id);
    }

    private LootTable.Builder createBlockLootTables(Block block) {
        return LootTable.builder().pool(LootPool.builder()
                .bonusRolls(ConstantLootNumberProvider.create(0.0F))
                .conditionally(SurvivesExplosionLootCondition.builder())
                .with(ItemEntry.builder(block.asItem()))
                .rolls(ConstantLootNumberProvider.create(1.0F)));
    }

    private LootTable.Builder createStoneLootTables(Block stone, Block cobblestone) {
        return LootTable.builder().pool(LootPool.builder()
                .bonusRolls(ConstantLootNumberProvider.create(0.0F))
                .with(AlternativeEntry.builder(
                        // 使用精准采集镐子挖掘石头，掉落石头
                        ItemEntry.builder(stone.asItem())
                                .conditionally(MatchToolLootCondition.builder(
                                ItemPredicate.Builder.create().enchantment(
                                        new EnchantmentPredicate(Enchantments.SILK_TOUCH, NumberRange.IntRange.atLeast(1))))),
                        // 使用普通镐子挖掘石头，掉落圆石
                        ItemEntry.builder(cobblestone.asItem())
                                .conditionally(SurvivesExplosionLootCondition.builder())))
                .rolls(ConstantLootNumberProvider.create(1.0F)));
    }

    private LootTable.Builder createLeavesLootTables(Block leaves, Block saplings, Item fruit) {
        return LootTable.builder().pool(LootPool.builder()
                // 树苗和树叶掉落物配置
                .bonusRolls(ConstantLootNumberProvider.create(0.0F))

                .with(AlternativeEntry.builder(
                                ItemEntry.builder(leaves.asItem())
                                        .conditionally(AllOfLootCondition.builder(

                                                MatchToolLootCondition.builder(ItemPredicate.Builder.create().items(Items.SHEARS)),

                                                MatchToolLootCondition.builder(ItemPredicate.Builder.create().enchantment(
                                                        new EnchantmentPredicate(Enchantments.SILK_TOUCH, NumberRange.IntRange.atLeast(1))))
                                        )),

                                ItemEntry.builder(saplings.asItem())

                                        .conditionally(SurvivesExplosionLootCondition.builder())

                                        .conditionally(TableBonusLootCondition.builder(Enchantments.FORTUNE, 0.05F, 0.0625F, 0.083333336F, 0.1F))
                ))

                .rolls(ConstantLootNumberProvider.create(1.0F))

        ).pool(LootPool.builder()
                // 木棍战利品设置，如橡木树叶中掉落树枝
                .bonusRolls(ConstantLootNumberProvider.create(0.0F))
                .conditionally(InvertedLootCondition.builder(
                        AllOfLootCondition.builder(

                                MatchToolLootCondition.builder(ItemPredicate.Builder.create().items(Items.SHEARS)),

                                MatchToolLootCondition.builder(ItemPredicate.Builder.create().enchantment(
                                        new EnchantmentPredicate(Enchantments.SILK_TOUCH, NumberRange.IntRange.atLeast(1))))
                        )
                ))

                .with(ItemEntry.builder(Items.STICK)

                        .conditionally(TableBonusLootCondition.builder(Enchantments.FORTUNE, 0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F))

                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 2.0F), false))

                        .apply(ExplosionDecayLootFunction.builder())
                )
                .rolls(ConstantLootNumberProvider.create(1.0F))
        ).pool(LootPool.builder()
                // 果实战利品设置，如橡木树叶中掉落苹果
                .bonusRolls(ConstantLootNumberProvider.create(0.0F))
                .conditionally(InvertedLootCondition.builder(
                        AllOfLootCondition.builder(

                                MatchToolLootCondition.builder(ItemPredicate.Builder.create().items(Items.SHEARS)),

                                MatchToolLootCondition.builder(ItemPredicate.Builder.create().enchantment(
                                        new EnchantmentPredicate(Enchantments.SILK_TOUCH, NumberRange.IntRange.atLeast(1))))
                        )
                ))

                .with(ItemEntry.builder(fruit)

                        .conditionally(TableBonusLootCondition.builder(Enchantments.FORTUNE, 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F))

                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 2.0F), false))

                        .apply(ExplosionDecayLootFunction.builder())
                )
                .rolls(ConstantLootNumberProvider.create(1.0F))
        );
    }
}
