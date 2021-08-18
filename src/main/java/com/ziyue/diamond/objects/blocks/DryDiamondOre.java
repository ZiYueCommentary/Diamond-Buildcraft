package com.ziyue.diamond.objects.blocks;

import net.minecraft.block.OreBlock;
import net.minecraft.util.math.MathHelper;

import java.util.Random;

/**
 * @author ZiYueCommentary
 */

public class DryDiamondOre extends OreBlock
{
    public DryDiamondOre(Properties properties)
    {
        super(properties);
    }
    @Override
    protected int getExperience(Random random)
    {
        return MathHelper.nextInt(random, 2, 10);
    }
}
