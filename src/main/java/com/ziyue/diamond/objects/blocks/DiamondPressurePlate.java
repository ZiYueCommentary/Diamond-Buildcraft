package com.ziyue.diamond.objects.blocks;

/*
    ��ʯѹ�������ڲ���ѹ���壬��ζ�����޷��������Ｄ��
    �������Ҫ����ʯѹ�����Ϊľ��ѹ���壨���Ա������Ｄ�������Ҫ�������Sensitivity.MOBS��ΪSensitivity.EVERYTHING
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
