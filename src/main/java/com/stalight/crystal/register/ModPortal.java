package com.stalight.crystal.register;

import com.stalight.crystal.CrystalMod;
import com.stalight.crystal.block.BlockList;
import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class ModPortal {
    public static void registerPortals() {
        registerPortal(BlockList.whiteStoneBrick, Items.WHITE_DYE, "white_dimension", 231, 243, 255);
        registerPortal(BlockList.lightGrayStoneBrick, Items.LIGHT_GRAY_DYE, "light_gray_dimension", 211,211,211);
        registerPortal(BlockList.grayStoneBrick, Items.GRAY_DYE, "gray_dimension", 105,105,105);
        registerPortal(BlockList.blackStoneBrick, Items.BLACK_DYE, "black_dimension", 0, 0, 0);
    }

    public static void registerPortal(Block block, Item item, String dimension, int r, int g, int b) {
        CustomPortalBuilder.beginPortal().frameBlock(block).lightWithItem(item)
                .destDimID(new Identifier(CrystalMod.MODID, dimension)).tintColor(r, g, b).registerPortal();
    }
}
