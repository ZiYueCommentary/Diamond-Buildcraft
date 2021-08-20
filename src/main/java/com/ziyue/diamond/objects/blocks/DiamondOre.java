package com.ziyue.diamond.objects.blocks;

import com.ziyue.diamond.init.ModBlocks;
import net.minecraft.block.BlockOre;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import java.util.Random;

/**
 * @author ZiYueCommentary
 */

public class DiamondOre extends BlockBase{
    public DiamondOre(String name, Material material){
        super(name, material);
        setSoundType(SoundType.METAL);
        setHardness(5.0F);
        setResistance(6.0F);
        setHarvestLevel("pickaxe", 2);
        setLightLevel(10);
    }
    /*
        下面是物品掉落
        其中第一个是挖钻石矿掉落钻石
        因为模组对钻石块进行了修改，所以需要特殊声明掉落物
        需要一个返回值，这个返回值可以随便写，不会影响到其他方块
    */
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        if (this == ModBlocks.DIAMOND_ORE_VANILA)
        {
            return Items.DIAMOND;
        } else {
            return this == Blocks.QUARTZ_ORE ? Items.QUARTZ : Item.getItemFromBlock(this);
        }
    }
}
