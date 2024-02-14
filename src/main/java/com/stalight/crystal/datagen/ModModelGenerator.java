package com.stalight.crystal.datagen;

import com.stalight.crystal.block.BlockList;
import com.stalight.crystal.register.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.*;
import net.minecraft.data.client.BlockStateModelGenerator.TintType;

public class ModModelGenerator extends FabricModelProvider {
    public ModModelGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator block) {

        block.registerSimpleCubeAll(BlockList.whiteStoneBrick);
        block.registerSimpleCubeAll(BlockList.lightGrayStoneBrick);
        block.registerSimpleCubeAll(BlockList.grayStoneBrick);
        block.registerSimpleCubeAll(BlockList.blackStoneBrick);
        block.registerSimpleCubeAll(BlockList.brownStoneBrick);
        block.registerSimpleCubeAll(BlockList.redStoneBrick);
        block.registerSimpleCubeAll(BlockList.orangeStoneBrick);
        block.registerSimpleCubeAll(BlockList.yellowStoneBrick);
        block.registerSimpleCubeAll(BlockList.limeStoneBrick);
        block.registerSimpleCubeAll(BlockList.greenStoneBrick);
        block.registerSimpleCubeAll(BlockList.cyanStoneBrick);
        block.registerSimpleCubeAll(BlockList.lightBlueStoneBrick);
        block.registerSimpleCubeAll(BlockList.blueStoneBrick);
        block.registerSimpleCubeAll(BlockList.magentaStoneBrick);
        block.registerSimpleCubeAll(BlockList.purpleStoneBrick);
        block.registerSimpleCubeAll(BlockList.pinkStoneBrick);

        block.registerSimpleCubeAll(ModBlocks.whiteStone);
        block.registerSimpleCubeAll(ModBlocks.lightGrayStone);
        block.registerSimpleCubeAll(ModBlocks.grayStone);
        block.registerSimpleCubeAll(ModBlocks.blackStone);
        block.registerSimpleCubeAll(ModBlocks.brownStone);
        block.registerSimpleCubeAll(ModBlocks.redStone);
        block.registerSimpleCubeAll(ModBlocks.orangeStone);
        block.registerSimpleCubeAll(ModBlocks.yellowStone);
        block.registerSimpleCubeAll(ModBlocks.limeStone);
        block.registerSimpleCubeAll(ModBlocks.greenStone);
        block.registerSimpleCubeAll(ModBlocks.cyanStone);
        block.registerSimpleCubeAll(ModBlocks.lightBlueStone);
        block.registerSimpleCubeAll(ModBlocks.blueStone);
        block.registerSimpleCubeAll(ModBlocks.magentaStone);
        block.registerSimpleCubeAll(ModBlocks.purpleStone);
        block.registerSimpleCubeAll(ModBlocks.pinkStone);

        block.registerSimpleCubeAll(ModBlocks.whiteDirt);
        block.registerSimpleCubeAll(ModBlocks.lightGrayDirt);
        block.registerSimpleCubeAll(ModBlocks.grayDirt);
        block.registerSimpleCubeAll(ModBlocks.blackDirt);
        block.registerSimpleCubeAll(ModBlocks.brownDirt);
        block.registerSimpleCubeAll(ModBlocks.redDirt);
        block.registerSimpleCubeAll(ModBlocks.orangeDirt);
        block.registerSimpleCubeAll(ModBlocks.yellowDirt);
        block.registerSimpleCubeAll(ModBlocks.limeDirt);
        block.registerSimpleCubeAll(ModBlocks.greenDirt);
        block.registerSimpleCubeAll(ModBlocks.cyanDirt);
        block.registerSimpleCubeAll(ModBlocks.lightBlueDirt);
        block.registerSimpleCubeAll(ModBlocks.blueDirt);
        block.registerSimpleCubeAll(ModBlocks.magentaDirt);
        block.registerSimpleCubeAll(ModBlocks.purpleDirt);
        block.registerSimpleCubeAll(ModBlocks.pinkDirt);

        block.registerSimpleCubeAll(BlockList.whiteLeaves);
        block.registerSimpleCubeAll(BlockList.lightGrayLeaves);
        block.registerSimpleCubeAll(BlockList.grayLeaves);
        block.registerSimpleCubeAll(BlockList.blackLeaves);
        block.registerSimpleCubeAll(BlockList.brownLeaves);
        block.registerSimpleCubeAll(BlockList.redLeaves);
        block.registerSimpleCubeAll(BlockList.orangeLeaves);
        block.registerSimpleCubeAll(BlockList.yellowLeaves);
        block.registerSimpleCubeAll(BlockList.limeLeaves);
        block.registerSimpleCubeAll(BlockList.greenLeaves);
        block.registerSimpleCubeAll(BlockList.cyanLeaves);
        block.registerSimpleCubeAll(BlockList.lightBlueLeaves);
        block.registerSimpleCubeAll(BlockList.blueLeaves);
        block.registerSimpleCubeAll(BlockList.magentaLeaves);
        block.registerSimpleCubeAll(BlockList.purpleLeaves);
        block.registerSimpleCubeAll(BlockList.pinkLeaves);

        block.registerLog(BlockList.whiteLog).log(BlockList.whiteLog);
        block.registerLog(BlockList.lightGrayLog).log(BlockList.lightGrayLog);
        block.registerLog(BlockList.grayLog).log(BlockList.grayLog);
        block.registerLog(BlockList.blackLog).log(BlockList.blackLog);
        block.registerLog(BlockList.brownLog).log(BlockList.brownLog);
        block.registerLog(BlockList.redLog).log(BlockList.redLog);
        block.registerLog(BlockList.orangeLog).log(BlockList.orangeLog);
        block.registerLog(BlockList.yellowLog).log(BlockList.yellowLog);
        block.registerLog(BlockList.limeLog).log(BlockList.limeLog);
        block.registerLog(BlockList.greenLog).log(BlockList.greenLog);
        block.registerLog(BlockList.cyanLog).log(BlockList.cyanLog);
        block.registerLog(BlockList.lightBlueLog).log(BlockList.lightBlueLog);
        block.registerLog(BlockList.blueLog).log(BlockList.blueLog);
        block.registerLog(BlockList.magentaLog).log(BlockList.magentaLog);
        block.registerLog(BlockList.purpleLog).log(BlockList.purpleLog);
        block.registerLog(BlockList.pinkLog).log(BlockList.pinkLog);

        block.registerTintableCross(BlockList.whiteSapling, TintType.NOT_TINTED);
        block.registerTintableCross(BlockList.lightGraySapling, TintType.NOT_TINTED);
        block.registerTintableCross(BlockList.graySapling, TintType.NOT_TINTED);
        block.registerTintableCross(BlockList.blackSapling, TintType.NOT_TINTED);
        block.registerTintableCross(BlockList.brownSapling, TintType.NOT_TINTED);
        block.registerTintableCross(BlockList.redSapling, TintType.NOT_TINTED);
        block.registerTintableCross(BlockList.orangeSapling, TintType.NOT_TINTED);
        block.registerTintableCross(BlockList.yellowSapling, TintType.NOT_TINTED);
        block.registerTintableCross(BlockList.limeSapling, TintType.NOT_TINTED);
        block.registerTintableCross(BlockList.greenSapling, TintType.NOT_TINTED);
        block.registerTintableCross(BlockList.cyanSapling, TintType.NOT_TINTED);
        block.registerTintableCross(BlockList.lightBlueSapling, TintType.NOT_TINTED);
        block.registerTintableCross(BlockList.blueSapling, TintType.NOT_TINTED);
        block.registerTintableCross(BlockList.magentaSapling, TintType.NOT_TINTED);
        block.registerTintableCross(BlockList.purpleSapling, TintType.NOT_TINTED);
        block.registerTintableCross(BlockList.pinkSapling, TintType.NOT_TINTED);

        registerGrassBlock(block, ModBlocks.whiteGrassBlock, ModBlocks.whiteDirt);
        registerGrassBlock(block, ModBlocks.lightGrayGrassBlock, ModBlocks.lightGrayDirt);
        registerGrassBlock(block, ModBlocks.grayGrassBlock, ModBlocks.grayDirt);
        registerGrassBlock(block, ModBlocks.blackGrassBlock, ModBlocks.blackDirt);
        registerGrassBlock(block, ModBlocks.brownGrassBlock, ModBlocks.brownDirt);
        registerGrassBlock(block, ModBlocks.redGrassBlock, ModBlocks.redDirt);
        registerGrassBlock(block, ModBlocks.orangeGrassBlock, ModBlocks.orangeDirt);
        registerGrassBlock(block, ModBlocks.yellowGrassBlock, ModBlocks.yellowDirt);
        registerGrassBlock(block, ModBlocks.limeGrassBlock, ModBlocks.limeDirt);
        registerGrassBlock(block, ModBlocks.greenGrassBlock, ModBlocks.greenDirt);
        registerGrassBlock(block, ModBlocks.cyanGrassBlock, ModBlocks.cyanDirt);
        registerGrassBlock(block, ModBlocks.lightBlueGrassBlock, ModBlocks.lightBlueDirt);
        registerGrassBlock(block, ModBlocks.blueGrassBlock, ModBlocks.blueDirt);
        registerGrassBlock(block, ModBlocks.purpleGrassBlock, ModBlocks.purpleDirt);
        registerGrassBlock(block, ModBlocks.magentaGrassBlock, ModBlocks.magentaDirt);
        registerGrassBlock(block, ModBlocks.pinkGrassBlock, ModBlocks.pinkDirt);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }

    private void registerGrassBlock(BlockStateModelGenerator block, Block grassBlock, Block dirt) {
        TextureMap texture = new TextureMap()
                // 加入粒子材质: 粒子效果为泥土破坏粒子
                .put(TextureKey.PARTICLE, TextureMap.getId(dirt))
                // 底部为泥土材质
                .put(TextureKey.BOTTOM, TextureMap.getId(dirt))
                // 顶部为草方块材质
                .put(TextureKey.TOP, TextureMap.getSubId(grassBlock, "_top"))
                // 侧面为带泥土的草方块
                .put(TextureKey.SIDE, TextureMap.getSubId(grassBlock, "_side"));
        BlockStateVariant model = BlockStateVariant.create()
                .put(VariantSettings.MODEL, Models.CUBE_BOTTOM_TOP.upload(grassBlock, texture, block.modelCollector));
        block.blockStateCollector.accept(VariantsBlockStateSupplier.create(grassBlock, model));
    }
}
