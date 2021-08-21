package com.ziyue.diamond.objects.blocks;

import com.ziyue.diamond.init.ModBlocks;
import com.ziyue.diamond.init.ModItems;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockDropItem extends BlockBase {
    public BlockDropItem(String name, Material material) {
        super(name, material);
    }
    /*
        下面是物品掉落
        因为模组的部分方块不能正常破坏后出现掉落物，所以需要特殊声明掉落物
    */
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        if (this == ModBlocks.DIAMOND_ORE_VANILA)
        {
            return Items.DIAMOND;
        }
            return this == ModBlocks.DRY_DIAMOND_ORE ? ModItems.DRY_DIAMOND : Item.getItemFromBlock(this);
    }
}
