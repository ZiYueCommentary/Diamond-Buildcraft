package com.ziyue.diamond.objects.blocks.slab;

import com.ziyue.diamond.init.ModItems;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSlab;

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
}