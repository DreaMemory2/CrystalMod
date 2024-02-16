package com.stalight.crystal.datagen;

import com.stalight.crystal.block.BlockList;
import com.stalight.crystal.register.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class ModLanguageGenerator extends FabricLanguageProvider {
    public ModLanguageGenerator(FabricDataOutput dataOutput) {
        super(dataOutput, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder builder) {
        // 添加你的翻译在这里
        builder.add(BlockList.whiteStoneBrick, "White Stone Brick");
        builder.add(BlockList.lightGrayStoneBrick, "Light Gray Stone Brick");
        builder.add(BlockList.grayStoneBrick, "Gray Stone Brick");
        builder.add(BlockList.blackStoneBrick, "Black Stone Brick");
        builder.add(BlockList.brownStoneBrick, "Brown Stone Brick");
        builder.add(BlockList.redStoneBrick, "Red Stone Brick");
        builder.add(BlockList.orangeStoneBrick, "Orange Stone Brick");
        builder.add(BlockList.yellowStoneBrick, "Yellow Stone Brick");
        builder.add(BlockList.limeStoneBrick, "Lime Stone Brick");
        builder.add(BlockList.greenStoneBrick, "Green Stone Brick");
        builder.add(BlockList.cyanStoneBrick, "Cyan Stone Brick");
        builder.add(BlockList.lightBlueStoneBrick, "Light Blue Stone Brick");
        builder.add(BlockList.blueStoneBrick, "Blue Stone Brick");
        builder.add(BlockList.magentaStoneBrick, "Magenta Stone Brick");
        builder.add(BlockList.purpleStoneBrick, "Purple Stone Brick");
        builder.add(BlockList.pinkStoneBrick, "Pink Stone Brick");

        builder.add(ModBlocks.whiteStone, "White Stone");
        builder.add(ModBlocks.lightGrayStone, "Light Gray Stone");
        builder.add(ModBlocks.grayStone, "Gray Stone");
        builder.add(ModBlocks.blackStone, "Black Stone");
        builder.add(ModBlocks.brownStone, "Brown Stone");
        builder.add(ModBlocks.redStone, "Red Stone");
        builder.add(ModBlocks.orangeStone, "Orange Stone");
        builder.add(ModBlocks.yellowStone, "Yellow Stone");
        builder.add(ModBlocks.limeStone, "Lime Stone");
        builder.add(ModBlocks.greenStone, "Green Stone");
        builder.add(ModBlocks.cyanStone, "Cyan Stone");
        builder.add(ModBlocks.lightBlueStone, "Light Blue Stone");
        builder.add(ModBlocks.blueStone, "Blue Stone");
        builder.add(ModBlocks.magentaStone, "Magenta Stone");
        builder.add(ModBlocks.purpleStone, "Purple Stone");
        builder.add(ModBlocks.pinkStone, "Pink Stone");

        builder.add(ModBlocks.whiteDirt, "White Dirt");
        builder.add(ModBlocks.lightGrayDirt, "Light Gray Dirt");
        builder.add(ModBlocks.grayDirt, "Gray Dirt");
        builder.add(ModBlocks.blackDirt, "Black Dirt");
        builder.add(ModBlocks.brownDirt, "Brown dirt");
        builder.add(ModBlocks.redDirt, "Red Dirt");
        builder.add(ModBlocks.orangeDirt, "Orange Dirt");
        builder.add(ModBlocks.yellowDirt, "Yellow Dirt");
        builder.add(ModBlocks.limeDirt, "Lime Dirt");
        builder.add(ModBlocks.greenDirt, "Green Dirt");
        builder.add(ModBlocks.cyanDirt, "Cyan Dirt");
        builder.add(ModBlocks.lightBlueDirt, "Light Blue Dirt");
        builder.add(ModBlocks.blueDirt, "Blue Dirt");
        builder.add(ModBlocks.magentaDirt, "Magenta Dirt");
        builder.add(ModBlocks.purpleDirt, "Purple Dirt");
        builder.add(ModBlocks.pinkDirt, "Pink Dirt");

        builder.add(BlockList.whiteLog, "White Log");
        builder.add(BlockList.lightGrayLog, "Light Gray Log");
        builder.add(BlockList.grayLog, "Gray Log");
        builder.add(BlockList.blackLog, "Black Log");
        builder.add(BlockList.brownLog, "Brown Log");
        builder.add(BlockList.redLog, "Red Log");
        builder.add(BlockList.orangeLog, "Orange Log");
        builder.add(BlockList.yellowLog, "Yellow Log");
        builder.add(BlockList.limeLog, "Lime Log");
        builder.add(BlockList.greenLog, "Green Log");
        builder.add(BlockList.cyanLog, "Cyan Log");
        builder.add(BlockList.lightBlueLog, "Light Blue Log");
        builder.add(BlockList.blueLog, "Blue Log");
        builder.add(BlockList.magentaLog, "Magenta Log");
        builder.add(BlockList.purpleLog, "Purple Log");
        builder.add(BlockList.pinkLog, "Pink Log");

        builder.add(BlockList.whiteLeaves, "White Leaves");
        builder.add(BlockList.lightGrayLeaves, "Light Gray Leaves");
        builder.add(BlockList.grayLeaves, "Gray Leaves");
        builder.add(BlockList.blackLeaves, "Black Leaves");
        builder.add(BlockList.brownLeaves, "Brown Leaves");
        builder.add(BlockList.redLeaves, "Red Leaves");
        builder.add(BlockList.orangeLeaves, "Orange Leaves");
        builder.add(BlockList.yellowLeaves, "Yellow Leaves");
        builder.add(BlockList.limeLeaves, "Lime Leaves");
        builder.add(BlockList.greenLeaves, "Green Leaves");
        builder.add(BlockList.cyanLeaves, "Cyan Leaves");
        builder.add(BlockList.lightBlueLeaves, "Light Blue Leaves");
        builder.add(BlockList.blueLeaves, "Blue Leaves");
        builder.add(BlockList.purpleLeaves, "Purple Leaves");
        builder.add(BlockList.magentaLeaves, "Magenta Leaves");
        builder.add(BlockList.pinkLeaves, "Pink Leaves");

        builder.add(BlockList.whiteSapling, "White Sapling");
        builder.add(BlockList.lightGraySapling, "Light Gray Sapling");
        builder.add(BlockList.graySapling, "Gray Sapling");
        builder.add(BlockList.blackSapling, "Black Sapling");
        builder.add(BlockList.brownSapling, "Brown Sapling");
        builder.add(BlockList.redSapling, "Red Sapling");
        builder.add(BlockList.orangeSapling, "Orange Sapling");
        builder.add(BlockList.yellowSapling, "Yellow Sapling");
        builder.add(BlockList.limeSapling, "Lime Sapling");
        builder.add(BlockList.greenSapling, "Green Sapling");
        builder.add(BlockList.cyanSapling, "Cyan Sapling");
        builder.add(BlockList.lightBlueSapling, "Light Blue Sapling");
        builder.add(BlockList.blueSapling, "Blue Sapling");
        builder.add(BlockList.purpleSapling, "Purple Sapling");
        builder.add(BlockList.magentaSapling, "Magenta Sapling");
        builder.add(BlockList.pinkSapling, "Pink Sapling");

        builder.add(ModBlocks.whiteGrassBlock, "White Grass");
        builder.add(ModBlocks.lightGrayGrassBlock, "Light Gray Grass");
        builder.add(ModBlocks.grayGrassBlock, "Gray Grass");
        builder.add(ModBlocks.blackGrassBlock, "Black Grass");
        builder.add(ModBlocks.brownGrassBlock, "Brown Grass");
        builder.add(ModBlocks.redGrassBlock, "Red Grass");
        builder.add(ModBlocks.orangeGrassBlock, "Orange Grass");
        builder.add(ModBlocks.yellowGrassBlock, "Yellow Grass");
        builder.add(ModBlocks.limeGrassBlock, "Lime Grass");
        builder.add(ModBlocks.greenGrassBlock, "Green Grass");
        builder.add(ModBlocks.cyanGrassBlock, "Cyan Grass");
        builder.add(ModBlocks.lightBlueGrassBlock, "Light Blue Grass");
        builder.add(ModBlocks.blueGrassBlock, "Blue Grass");
        builder.add(ModBlocks.purpleGrassBlock, "Purple Grass");
        builder.add(ModBlocks.magentaGrassBlock, "Magenta Grass");
        builder.add(ModBlocks.pinkGrassBlock, "Pink Grass");
        
        builder.add(BlockList.frostMelon, "Frost Melon");
        builder.add(ModBlocks.whiteShortGrassBlock, "Frost Grass");

        builder.add("biome.crystal.frost_forest", "Frost Forest");
        builder.add("biome.crystal.frost.plain", "Frost Plain");
        builder.add("biome.crystal.ember_desert", "Ember Desert");
        builder.add("biome.crystal.ember_plain", "Ember Plain");
        builder.add("biome.crystal.dark_forest", "Dark Forest");

        builder.add("itemGroup.crystal.group", "Crystal");
    }
}
