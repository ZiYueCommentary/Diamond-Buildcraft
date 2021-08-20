package com.ziyue.diamond.objects.blocks;

import com.ziyue.diamond.Diamond;
import com.ziyue.diamond.init.ModBlocks;
import com.ziyue.diamond.init.ModItems;
import com.ziyue.diamond.util.IHasModel;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockStairBase extends BlockStairs implements IHasModel {
    @Override
    public void registerModels()
    {
        Diamond.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
    public BlockStairBase(String name, IBlockState modelState, CreativeTabs tab, float hardness, float resistance, float lightValue, SoundType sound){
        super(modelState);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);
        setHardness(hardness);
        setResistance(resistance);
        setSoundType(sound);
        setLightLevel(lightValue);
        setHarvestLevel("pickaxe", 2);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }
}
