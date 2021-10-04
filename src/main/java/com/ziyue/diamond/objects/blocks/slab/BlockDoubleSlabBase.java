package com.ziyue.diamond.objects.blocks.slab;

import com.ziyue.diamond.init.ModBlocks;
import com.ziyue.diamond.objects.blocks.slab.BlockSlabBase;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class BlockDoubleSlabBase extends BlockSlabBase
{
    public BlockDoubleSlabBase(String name, Material material, CreativeTabs tab, BlockSlab half)
    {
        super(name, material, half);
        setCreativeTab(tab);
        setHardness(4.0F);
        setResistance(5.0F);
        setSoundType(SoundType.METAL);
        setHarvestLevel("pickaxe", 2);
    }

    @Override
    public boolean isDouble()
    {
        return true;
    }

    /*
        拯救破坏台阶没有掉落的几行代码
        从mc源码里瞎找出来的
        谁能帮我解释解释这bug怎么修好的.jpg
    */
    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(ModBlocks.DRY_DIAMOND_SLAB_HALF);
    }
    @Override
    public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state)
    {
        return new ItemStack(ModBlocks.DRY_DIAMOND_SLAB_HALF, 1);
    }
}