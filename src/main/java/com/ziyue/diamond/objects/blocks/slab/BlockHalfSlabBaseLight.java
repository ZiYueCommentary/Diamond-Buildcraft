package com.ziyue.diamond.objects.blocks.slab;

import com.ziyue.diamond.init.ModBlocks;
import com.ziyue.diamond.init.ModItems;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSlab;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class BlockHalfSlabBaseLight extends BlockSlabBase
{
    public BlockHalfSlabBaseLight(String name, Material material, CreativeTabs tab, BlockSlab half, BlockSlab doubleSlab)
    {
        super(name, material, half);
        setCreativeTab(tab);
        ModItems.ITEMS.add(new ItemSlab(this, this, doubleSlab).setRegistryName(name));
        setLightLevel(1);
        setHardness(5.0F);
        setResistance(6.0F);
        setSoundType(SoundType.METAL);
        setHarvestLevel("pickaxe", 2);
    }

    @Override
    public boolean isDouble()
    {
        return false;
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(ModBlocks.DIAMOND_SLAB_HALF);
    }
    @Override
    public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state)
    {
        return new ItemStack(ModBlocks.DIAMOND_SLAB_HALF, 1);
    }
}