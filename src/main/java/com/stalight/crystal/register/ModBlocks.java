package com.stalight.crystal.register;

import com.stalight.crystal.CrystalMod;
import com.stalight.crystal.block.BlockList;
import com.stalight.crystal.block.CrystalGrassBlock;
import com.stalight.crystal.block.SaplingGenerators;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static Block whiteDirt = registerBlocks("white_dirt", Blocks.DIRT);
    public static Block lightGrayDirt = registerBlocks("light_gray_dirt", Blocks.DIRT);
    public static Block grayDirt = registerBlocks("gray_dirt", Blocks.DIRT);
    public static Block blackDirt = registerBlocks("black_dirt", Blocks.DIRT);
    public static Block brownDirt = registerBlocks("brown_dirt", Blocks.DIRT);
    public static Block redDirt = registerBlocks("red_dirt", Blocks.DIRT);
    public static Block orangeDirt = registerBlocks("orange_dirt", Blocks.DIRT);
    public static Block yellowDirt = registerBlocks("yellow_dirt", Blocks.DIRT);
    public static Block limeDirt = registerBlocks("lime_dirt", Blocks.DIRT);
    public static Block greenDirt = registerBlocks("green_dirt", Blocks.DIRT);
    public static Block cyanDirt = registerBlocks("cyan_dirt", Blocks.DIRT);
    public static Block lightBlueDirt = registerBlocks("light_blue_dirt", Blocks.DIRT);
    public static Block blueDirt = registerBlocks("blue_dirt", Blocks.DIRT);
    public static Block purpleDirt = registerBlocks("purple_dirt", Blocks.DIRT);
    public static Block magentaDirt = registerBlocks("magenta_dirt", Blocks.DIRT);
    public static Block pinkDirt = registerBlocks("pink_dirt", Blocks.DIRT);

    public static Block whiteStone = registerBlocks("white_stone", Blocks.STONE);
    public static Block lightGrayStone = registerBlocks("light_gray_stone", Blocks.STONE);
    public static Block grayStone = registerBlocks("gray_stone", Blocks.STONE);
    public static Block blackStone = registerBlocks("black_stone", Blocks.STONE);
    public static Block brownStone = registerBlocks("brown_stone", Blocks.STONE);
    public static Block redStone = registerBlocks("red_stone", Blocks.STONE);
    public static Block orangeStone = registerBlocks("orange_stone", Blocks.STONE);
    public static Block yellowStone = registerBlocks("yellow_stone", Blocks.STONE);
    public static Block limeStone = registerBlocks("lime_stone", Blocks.STONE);
    public static Block greenStone = registerBlocks("green_stone", Blocks.STONE);
    public static Block cyanStone = registerBlocks("cyan_stone", Blocks.STONE);
    public static Block lightBlueStone = registerBlocks("light_blue_stone", Blocks.STONE);
    public static Block blueStone = registerBlocks("blue_stone", Blocks.STONE);
    public static Block purpleStone = registerBlocks("purple_stone", Blocks.STONE);
    public static Block magentaStone = registerBlocks("magenta_stone", Blocks.STONE);
    public static Block pinkStone = registerBlocks("pink_stone", Blocks.STONE);

    public static Block whiteGrassBlock = registerGrassBlock("white_grass", ModBlocks.whiteDirt);
    public static Block lightGrayGrassBlock = registerGrassBlock("light_gray_grass", ModBlocks.lightGrayDirt);
    public static Block grayGrassBlock = registerGrassBlock("gray_grass", ModBlocks.grayDirt);
    public static Block blackGrassBlock = registerGrassBlock("black_grass", ModBlocks.blackDirt);
    public static Block brownGrassBlock = registerGrassBlock("brown_grass", ModBlocks.brownDirt);
    public static Block redGrassBlock = registerGrassBlock("red_grass", ModBlocks.redDirt);
    public static Block orangeGrassBlock = registerGrassBlock("orange_grass", ModBlocks.orangeDirt);
    public static Block yellowGrassBlock = registerGrassBlock("yellow_grass", ModBlocks.yellowDirt);
    public static Block limeGrassBlock = registerGrassBlock("lime_grass", ModBlocks.limeDirt);
    public static Block greenGrassBlock = registerGrassBlock("green_grass", ModBlocks.greenDirt);
    public static Block cyanGrassBlock = registerGrassBlock("cyan_grass", ModBlocks.cyanDirt);
    public static Block lightBlueGrassBlock = registerGrassBlock("light_blue_grass", ModBlocks.lightBlueDirt);
    public static Block blueGrassBlock = registerGrassBlock("blue_grass", ModBlocks.blueDirt);
    public static Block purpleGrassBlock = registerGrassBlock("purple_grass", ModBlocks.purpleDirt);
    public static Block magentaGrassBlock = registerGrassBlock("magenta_grass", ModBlocks.magentaDirt);
    public static Block pinkGrassBlock = registerGrassBlock("pink_grass", ModBlocks.pinkDirt);

    public static void registerBlocks() {

        BlockList.whiteStoneBrick = registerBlocks("white_stone_brick", Blocks.STONE_BRICKS);
        BlockList.lightGrayStoneBrick = registerBlocks("light_gray_stone_brick", Blocks.STONE_BRICKS);
        BlockList.grayStoneBrick = registerBlocks("gray_stone_brick", Blocks.STONE_BRICKS);
        BlockList.blackStoneBrick = registerBlocks("black_stone_brick", Blocks.STONE_BRICKS);
        BlockList.brownStoneBrick = registerBlocks("brown_stone_brick", Blocks.STONE_BRICKS);
        BlockList.redStoneBrick = registerBlocks("red_stone_brick", Blocks.STONE_BRICKS);
        BlockList.orangeStoneBrick = registerBlocks("orange_stone_brick", Blocks.STONE_BRICKS);
        BlockList.yellowStoneBrick = registerBlocks("yellow_stone_brick", Blocks.STONE_BRICKS);
        BlockList.limeStoneBrick = registerBlocks("lime_stone_brick", Blocks.STONE_BRICKS);
        BlockList.greenStoneBrick = registerBlocks("green_stone_brick", Blocks.STONE_BRICKS);
        BlockList.cyanStoneBrick = registerBlocks("cyan_stone_brick", Blocks.STONE_BRICKS);
        BlockList.lightBlueStoneBrick = registerBlocks("light_blue_stone_brick", Blocks.STONE_BRICKS);
        BlockList.blueStoneBrick = registerBlocks("blue_stone_brick", Blocks.STONE_BRICKS);
        BlockList.purpleStoneBrick = registerBlocks("purple_stone_brick", Blocks.STONE_BRICKS);
        BlockList.magentaStoneBrick = registerBlocks("magenta_stone_brick", Blocks.STONE_BRICKS);
        BlockList.pinkStoneBrick = registerBlocks("pink_stone_brick", Blocks.STONE_BRICKS);

        BlockList.whiteLeaves = registerLeavesBlock("white_leaves");
        BlockList.lightGrayLeaves = registerLeavesBlock("light_gray_leaves");
        BlockList.grayLeaves = registerLeavesBlock("gray_leaves");
        BlockList.blackLeaves = registerLeavesBlock("black_leaves");
        BlockList.brownLeaves = registerLeavesBlock("brown_leaves");
        BlockList.redLeaves = registerLeavesBlock("red_leaves");
        BlockList.orangeLeaves = registerLeavesBlock("orange_leaves");
        BlockList.yellowLeaves = registerLeavesBlock("yellow_leaves");
        BlockList.limeLeaves = registerLeavesBlock("lime_leaves");
        BlockList.greenLeaves = registerLeavesBlock("green_leaves");
        BlockList.cyanLeaves = registerLeavesBlock("cyan_leaves");
        BlockList.lightBlueLeaves = registerLeavesBlock("light_blue_leaves");
        BlockList.blueLeaves = registerLeavesBlock("blue_leaves");
        BlockList.purpleLeaves = registerLeavesBlock("purple_leaves");
        BlockList.magentaLeaves = registerLeavesBlock("magenta_leaves");
        BlockList.pinkLeaves = registerLeavesBlock("pink_leaves");

        BlockList.whiteSapling = registerSaplingBlocks("white_sapling", SaplingGenerators.WHITE);
        BlockList.lightGraySapling = registerSaplingBlocks("light_gray_sapling", SaplingGenerators.LIGHT_GRAY);
        BlockList.graySapling = registerSaplingBlocks("gray_sapling", SaplingGenerators.GRAY);
        BlockList.blackSapling = registerSaplingBlocks("black_sapling", SaplingGenerators.BLACK);
        BlockList.brownSapling = registerSaplingBlocks("brown_sapling", SaplingGenerators.BROWN);
        BlockList.redSapling = registerSaplingBlocks("red_sapling", SaplingGenerators.RED);
        BlockList.orangeSapling = registerSaplingBlocks("orange_sapling", SaplingGenerators.ORANGE);
        BlockList.yellowSapling = registerSaplingBlocks("yellow_sapling", SaplingGenerators.YELLOW);
        BlockList.limeSapling = registerSaplingBlocks("lime_sapling", SaplingGenerators.LIME);
        BlockList.greenSapling = registerSaplingBlocks("green_sapling", SaplingGenerators.GREEN);
        BlockList.cyanSapling = registerSaplingBlocks("cyan_sapling", SaplingGenerators.CYAN);
        BlockList.lightBlueSapling = registerSaplingBlocks("light_blue_sapling", SaplingGenerators.LIGHT_BLUE);
        BlockList.blueSapling = registerSaplingBlocks("blue_sapling", SaplingGenerators.BLUE);
        BlockList.purpleSapling = registerSaplingBlocks("purple_sapling", SaplingGenerators.PURPLE);
        BlockList.magentaSapling = registerSaplingBlocks("magenta_sapling", SaplingGenerators.MAGENTA);
        BlockList.pinkSapling = registerSaplingBlocks("pink_sapling", SaplingGenerators.PINK);

        BlockList.whiteLog = registerPillarBlocks("white_log");
        BlockList.lightGrayLog = registerPillarBlocks("light_gray_log");
        BlockList.grayLog = registerPillarBlocks("gray_log");
        BlockList.blackLog = registerPillarBlocks("black_log");
        BlockList.brownLog = registerPillarBlocks("brown_log");
        BlockList.redLog = registerPillarBlocks("red_log");
        BlockList.orangeLog = registerPillarBlocks("orange_log");
        BlockList.yellowLog = registerPillarBlocks("yellow_log");
        BlockList.limeLog = registerPillarBlocks("lime_log");
        BlockList.greenLog = registerPillarBlocks("green_log");
        BlockList.cyanLog = registerPillarBlocks("cyan_log");
        BlockList.lightBlueLog = registerPillarBlocks("light_blue_log");
        BlockList.blueLog = registerPillarBlocks("blue_log");
        BlockList.purpleLog = registerPillarBlocks("purple_log");
        BlockList.magentaLog = registerPillarBlocks("magenta_log");
        BlockList.pinkLog = registerPillarBlocks("pink_log");
    }

    private static Block registerBlocks(String id, Block block) {
        return registerBlock(id, new Block(FabricBlockSettings.copyOf(block)));
    }

    private static Block registerPillarBlocks(String id) {
        return registerBlock(id, new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    }

    private static Block registerSaplingBlocks(String id, SaplingGenerator saplingGenerator) {
        return registerBlock(id, new SaplingBlock(saplingGenerator, FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    }

    private static Block registerLeavesBlock(String id) {
        return registerBlock(id, new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    }

    private static Block registerGrassBlock(String id, Block dirt) {
        return registerBlock(id, new CrystalGrassBlock(dirt));
    }

    private static Block registerBlock(String id, Block block) {
        registerItems(id, block);
        return Registry.register(Registries.BLOCK, new Identifier(CrystalMod.MODID, id), block);
    }

    private static void registerItems(String id, Block block) {
        Item item = Registry.register(Registries.ITEM, new Identifier(CrystalMod.MODID, id), new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(ModItemGroup.GROUP).register(entries -> entries.add(item));
    }
}
