package com.ziyue.diamond.objects.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

/**
 * @author ZiYueCommentary
 */

public class DryDiamondBlock extends BlockBase{
    public DryDiamondBlock(String name, Material material){
        super(name, material);
        setSoundType(SoundType.METAL);
        setHardness(4.0F);
        setResistance(5.0F);
        setHarvestLevel("pickaxe", 2);
    }
}
