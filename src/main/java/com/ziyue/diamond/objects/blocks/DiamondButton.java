package com.ziyue.diamond.objects.blocks;

/*
    钻石按钮属于石质按钮，意味着它无法被箭激活
    如果你想将钻石按钮改为木质按钮（可以被箭激活），你需要将下面的StoneButtonBlock改为WoodButtonBlock
*/

import net.minecraft.block.StoneButtonBlock;

/**
 * @author ZiYueCommentary
 */

public class DiamondButton extends StoneButtonBlock {
    protected DiamondButton(Properties properties) {
        super(properties);
    }
}
