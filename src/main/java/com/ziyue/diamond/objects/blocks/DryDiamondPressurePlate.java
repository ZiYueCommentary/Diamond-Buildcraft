package com.ziyue.diamond.objects.blocks;

import com.ziyue.diamond.Diamond;
import com.ziyue.diamond.init.ModBlocks;
import com.ziyue.diamond.init.ModItems;
import com.ziyue.diamond.util.IHasModel;
import net.minecraft.block.BlockPressurePlate;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class DryDiamondPressurePlate extends BlockPressurePlate implements IHasModel {
    public DryDiamondPressurePlate(String name){
        super(Material.IRON, Sensitivity.EVERYTHING);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.REDSTONE);
        setSoundType(SoundType.METAL);
        setResistance(5.0F);
        setHardness(4.0F);
        setHarvestLevel("pickaxe", 2);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }
    @Override
    public void registerModels()
    {
        Diamond.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
