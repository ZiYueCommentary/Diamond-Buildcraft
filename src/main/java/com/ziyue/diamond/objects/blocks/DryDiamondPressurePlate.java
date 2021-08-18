package com.ziyue.diamond.objects.blocks;

/*
    干钻石压力板属于木质压力板，意味着它可以被掉落物激活
    如果你想要将干钻石压力板改为测重压力板（无法被掉落物激活），你需要将下面的Sensitivity.EVERYTHING改为Sensitivity.MOBS
*/

import net.minecraft.block.PressurePlateBlock;

/**
 * @author ZiYueCommentary
 */

public class DryDiamondPressurePlate extends PressurePlateBlock {
    public DryDiamondPressurePlate(Sensitivity sensitivityIn, Properties propertiesIn) {
        super(Sensitivity.EVERYTHING, propertiesIn);
    }
}
