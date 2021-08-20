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

public class DiamondPressurePlate extends BlockPressurePlate implements IHasModel {
    public DiamondPressurePlate(String name){
        super(Material.IRON, Sensitivity.MOBS);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.REDSTONE);
        setSoundType(SoundType.METAL);
        setResistance(6.0F);
        setHardness(5.0F);
        setLightLevel(1);
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
