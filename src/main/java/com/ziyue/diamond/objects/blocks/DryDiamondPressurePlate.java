package com.ziyue.diamond.objects.blocks;

/*
    ����ʯѹ��������ľ��ѹ���壬��ζ�������Ա������Ｄ��
    �������Ҫ������ʯѹ�����Ϊ����ѹ���壨�޷��������Ｄ�������Ҫ�������Sensitivity.EVERYTHING��ΪSensitivity.MOBS
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
