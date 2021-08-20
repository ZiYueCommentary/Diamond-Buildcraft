package com.ziyue.diamond.objects.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

/**
 * @author ZiYueCommentary
 */

public class CompressDiamondBlock extends BlockBase{
    public CompressDiamondBlock(String name, Material material){
        super(name, material);
        setSoundType(SoundType.METAL);
        setHardness(5.0F);
        setResistance(6.0F);
        setHarvestLevel("pickaxe", 2);
        setLightLevel(1);
    }
}