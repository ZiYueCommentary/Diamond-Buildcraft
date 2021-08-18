package com.ziyue.diamond.objects.blocks;

/*
    干钻石按钮属于木质按钮，意味着它可以被箭激活
    如果你想将干钻石按钮改为石质按钮（不可以被箭激活），你需要将下面的WoodButtonBlock改为StoneButtonBlock
*/

import net.minecraft.block.WoodButtonBlock;

/**
 * @author ZiYueCommentary
 */

public class DryDiamondButton extends WoodButtonBlock {
    public DryDiamondButton(Properties properties) {
        super(properties);
    }
}
