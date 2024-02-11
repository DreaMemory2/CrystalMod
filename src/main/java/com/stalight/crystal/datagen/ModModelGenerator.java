package com.stalight.crystal.datagen;

import com.stalight.crystal.block.BlockList;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.BlockStateModelGenerator.TintType;
import net.minecraft.data.client.ItemModelGenerator;

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

        block.registerSimpleCubeAll(BlockList.whiteStone);
        block.registerSimpleCubeAll(BlockList.lightGrayStone);
        block.registerSimpleCubeAll(BlockList.grayStone);
        block.registerSimpleCubeAll(BlockList.blackStone);
        block.registerSimpleCubeAll(BlockList.brownStone);
        block.registerSimpleCubeAll(BlockList.redStone);
        block.registerSimpleCubeAll(BlockList.orangeStone);
        block.registerSimpleCubeAll(BlockList.yellowStone);
        block.registerSimpleCubeAll(BlockList.limeStone);
        block.registerSimpleCubeAll(BlockList.greenStone);
        block.registerSimpleCubeAll(BlockList.cyanStone);
        block.registerSimpleCubeAll(BlockList.lightBlueStone);
        block.registerSimpleCubeAll(BlockList.blueStone);
        block.registerSimpleCubeAll(BlockList.magentaStone);
        block.registerSimpleCubeAll(BlockList.purpleStone);
        block.registerSimpleCubeAll(BlockList.pinkStone);

        block.registerSimpleCubeAll(BlockList.whiteDirt);
        block.registerSimpleCubeAll(BlockList.lightGrayDirt);
        block.registerSimpleCubeAll(BlockList.grayDirt);
        block.registerSimpleCubeAll(BlockList.blackDirt);
        block.registerSimpleCubeAll(BlockList.brownDirt);
        block.registerSimpleCubeAll(BlockList.redDirt);
        block.registerSimpleCubeAll(BlockList.orangeDirt);
        block.registerSimpleCubeAll(BlockList.yellowDirt);
        block.registerSimpleCubeAll(BlockList.limeDirt);
        block.registerSimpleCubeAll(BlockList.greenDirt);
        block.registerSimpleCubeAll(BlockList.cyanDirt);
        block.registerSimpleCubeAll(BlockList.lightBlueDirt);
        block.registerSimpleCubeAll(BlockList.blueDirt);
        block.registerSimpleCubeAll(BlockList.magentaDirt);
        block.registerSimpleCubeAll(BlockList.purpleDirt);
        block.registerSimpleCubeAll(BlockList.pinkDirt);

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
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
