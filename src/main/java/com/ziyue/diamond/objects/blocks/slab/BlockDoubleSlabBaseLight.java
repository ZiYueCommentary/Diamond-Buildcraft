package com.ziyue.diamond.objects.blocks.slab;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockDoubleSlabBaseLight extends BlockSlabBase
{
    public BlockDoubleSlabBaseLight(String name, Material material, CreativeTabs tab, BlockSlab half)
    {
        super(name, material, half);
        setCreativeTab(tab);
        setLightLevel(1);
        setHardness(5.0F);
        setResistance(6.0F);
        setSoundType(SoundType.METAL);
        setHarvestLevel("pickaxe", 2);
    }

    @Override
    public boolean isDouble()
    {
        return true;
    }
}