package com.stalight.crystal.datagen;

import com.stalight.crystal.block.BlockList;
import com.stalight.crystal.register.ModBlockRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class ModLanguageGenerator extends FabricLanguageProvider {
    public ModLanguageGenerator(FabricDataOutput dataOutput) {
        super(dataOutput, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        // 添加你的翻译在这里
        translationBuilder.add(BlockList.whiteStoneBrick, "White Stone Brick");
        translationBuilder.add(BlockList.lightGrayStoneBrick, "Light Gray Stone Brick");
        translationBuilder.add(BlockList.grayStoneBrick, "Gray Stone Brick");
        translationBuilder.add(BlockList.blackStoneBrick, "Black Stone Brick");
        translationBuilder.add(BlockList.brownStoneBrick, "Brown Stone Brick");
        translationBuilder.add(BlockList.redStoneBrick, "Red Stone Brick");
        translationBuilder.add(BlockList.orangeStoneBrick, "Orange Stone Brick");
        translationBuilder.add(BlockList.yellowStoneBrick, "Yellow Stone Brick");
        translationBuilder.add(BlockList.limeStoneBrick, "Lime Stone Brick");
        translationBuilder.add(BlockList.greenStoneBrick, "Green Stone Brick");
        translationBuilder.add(BlockList.cyanStoneBrick, "Cyan Stone Brick");
        translationBuilder.add(BlockList.lightBlueStoneBrick, "Light Blue Stone Brick");
        translationBuilder.add(BlockList.blueStoneBrick, "Blue Stone Brick");
        translationBuilder.add(BlockList.magentaStoneBrick, "Magenta Stone Brick");
        translationBuilder.add(BlockList.purpleStoneBrick, "Purple Stone Brick");
        translationBuilder.add(BlockList.pinkStoneBrick, "Pink Stone Brick");

        translationBuilder.add(ModBlockRegistry.whiteStone, "White Stone");
        translationBuilder.add(ModBlockRegistry.lightGrayStone, "Light Gray Stone");
        translationBuilder.add(ModBlockRegistry.grayStone, "Gray Stone");
        translationBuilder.add(ModBlockRegistry.blackStone, "Black Stone");
        translationBuilder.add(ModBlockRegistry.brownStone, "Brown Stone");
        translationBuilder.add(ModBlockRegistry.redStone, "Red Stone");
        translationBuilder.add(ModBlockRegistry.orangeStone, "Orange Stone");
        translationBuilder.add(ModBlockRegistry.yellowStone, "Yellow Stone");
        translationBuilder.add(ModBlockRegistry.limeStone, "Lime Stone");
        translationBuilder.add(ModBlockRegistry.greenStone, "Green Stone");
        translationBuilder.add(ModBlockRegistry.cyanStone, "Cyan Stone");
        translationBuilder.add(ModBlockRegistry.lightBlueStone, "Light Blue Stone");
        translationBuilder.add(ModBlockRegistry.blueStone, "Blue Stone");
        translationBuilder.add(ModBlockRegistry.magentaStone, "Magenta Stone");
        translationBuilder.add(ModBlockRegistry.purpleStone, "Purple Stone");
        translationBuilder.add(ModBlockRegistry.pinkStone, "Pink Stone");

        translationBuilder.add(ModBlockRegistry.whiteDirt, "White Dirt");
        translationBuilder.add(ModBlockRegistry.lightGrayDirt, "Light Gray Dirt");
        translationBuilder.add(ModBlockRegistry.grayDirt, "Gray Dirt");
        translationBuilder.add(ModBlockRegistry.blackDirt, "Black Dirt");
        translationBuilder.add(ModBlockRegistry.brownDirt, "Brown dirt");
        translationBuilder.add(ModBlockRegistry.redDirt, "Red Dirt");
        translationBuilder.add(ModBlockRegistry.orangeDirt, "Orange Dirt");
        translationBuilder.add(ModBlockRegistry.yellowDirt, "Yellow Dirt");
        translationBuilder.add(ModBlockRegistry.limeDirt, "Lime Dirt");
        translationBuilder.add(ModBlockRegistry.greenDirt, "Green Dirt");
        translationBuilder.add(ModBlockRegistry.cyanDirt, "Cyan Dirt");
        translationBuilder.add(ModBlockRegistry.lightBlueDirt, "Light Blue Dirt");
        translationBuilder.add(ModBlockRegistry.blueDirt, "Blue Dirt");
        translationBuilder.add(ModBlockRegistry.magentaDirt, "Magenta Dirt");
        translationBuilder.add(ModBlockRegistry.purpleDirt, "Purple Dirt");
        translationBuilder.add(ModBlockRegistry.pinkDirt, "Pink Dirt");

        translationBuilder.add(BlockList.whiteLog, "White Log");
        translationBuilder.add(BlockList.lightGrayLog, "Light Gray Log");
        translationBuilder.add(BlockList.grayLog, "Gray Log");
        translationBuilder.add(BlockList.blackLog, "Black Log");
        translationBuilder.add(BlockList.brownLog, "Brown Log");
        translationBuilder.add(BlockList.redLog, "Red Log");
        translationBuilder.add(BlockList.orangeLog, "Orange Log");
        translationBuilder.add(BlockList.yellowLog, "Yellow Log");
        translationBuilder.add(BlockList.limeLog, "Lime Log");
        translationBuilder.add(BlockList.greenLog, "Green Log");
        translationBuilder.add(BlockList.cyanLog, "Cyan Log");
        translationBuilder.add(BlockList.lightBlueLog, "Light Blue Log");
        translationBuilder.add(BlockList.blueLog, "Blue Log");
        translationBuilder.add(BlockList.magentaLog, "Magenta Log");
        translationBuilder.add(BlockList.purpleLog, "Purple Log");
        translationBuilder.add(BlockList.pinkLog, "Pink Log");

        translationBuilder.add(BlockList.whiteLeaves, "White Leaves");
        translationBuilder.add(BlockList.lightGrayLeaves, "Light Gray Leaves");
        translationBuilder.add(BlockList.grayLeaves, "Gray Leaves");
        translationBuilder.add(BlockList.blackLeaves, "Black Leaves");
        translationBuilder.add(BlockList.brownLeaves, "Brown Leaves");
        translationBuilder.add(BlockList.redLeaves, "Red Leaves");
        translationBuilder.add(BlockList.orangeLeaves, "Orange Leaves");
        translationBuilder.add(BlockList.yellowLeaves, "Yellow Leaves");
        translationBuilder.add(BlockList.limeLeaves, "Lime Leaves");
        translationBuilder.add(BlockList.greenLeaves, "Green Leaves");
        translationBuilder.add(BlockList.cyanLeaves, "Cyan Leaves");
        translationBuilder.add(BlockList.lightBlueLeaves, "Light Blue Leaves");
        translationBuilder.add(BlockList.blueLeaves, "Blue Leaves");
        translationBuilder.add(BlockList.purpleLeaves, "Purple Leaves");
        translationBuilder.add(BlockList.magentaLeaves, "Magenta Leaves");
        translationBuilder.add(BlockList.pinkLeaves, "Pink Leaves");

        translationBuilder.add(BlockList.whiteSapling, "White Sapling");
        translationBuilder.add(BlockList.lightGraySapling, "Light Gray Sapling");
        translationBuilder.add(BlockList.graySapling, "Gray Sapling");
        translationBuilder.add(BlockList.blackSapling, "Black Sapling");
        translationBuilder.add(BlockList.brownSapling, "Brown Sapling");
        translationBuilder.add(BlockList.redSapling, "Red Sapling");
        translationBuilder.add(BlockList.orangeSapling, "Orange Sapling");
        translationBuilder.add(BlockList.yellowSapling, "Yellow Sapling");
        translationBuilder.add(BlockList.limeSapling, "Lime Sapling");
        translationBuilder.add(BlockList.greenSapling, "Green Sapling");
        translationBuilder.add(BlockList.cyanSapling, "Cyan Sapling");
        translationBuilder.add(BlockList.lightBlueSapling, "Light Blue Sapling");
        translationBuilder.add(BlockList.blueSapling, "Blue Sapling");
        translationBuilder.add(BlockList.purpleSapling, "Purple Sapling");
        translationBuilder.add(BlockList.magentaSapling, "Magenta Sapling");
        translationBuilder.add(BlockList.pinkSapling, "Pink Sapling");

        translationBuilder.add("biome.crystal.frost_forest", "Frost Forest");

        translationBuilder.add("itemGroup.crystal.group", "Crystal");
    }
}
