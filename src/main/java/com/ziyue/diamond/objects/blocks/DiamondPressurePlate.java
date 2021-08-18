package com.ziyue.diamond.objects.blocks;

/*
    钻石压力板属于测重压力板，意味着它无法被掉落物激活
    如果你想要将钻石压力板改为木质压力板（可以被掉落物激活），你需要将下面的Sensitivity.MOBS改为Sensitivity.EVERYTHING
*/

import net.minecraft.block.PressurePlateBlock;

/**
 * @author ZiYueCommentary
 */

public class DiamondPressurePlate extends PressurePlateBlock {
    public DiamondPressurePlate(Sensitivity sensitivityIn, Properties propertiesIn) {
        super(Sensitivity.MOBS, propertiesIn);
    }
}
