package com.ziyue.diamond.objects.blocks.slab;

import com.ziyue.diamond.objects.blocks.slab.BlockSlabBase;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

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
}