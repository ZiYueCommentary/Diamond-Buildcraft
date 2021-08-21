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
}
