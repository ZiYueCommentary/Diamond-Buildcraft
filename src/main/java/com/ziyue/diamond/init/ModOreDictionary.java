package com.ziyue.diamond.init;

import net.minecraftforge.oredict.OreDictionary;

public class ModOreDictionary {
    public static void registerOres(){
        //干钻石矿
        OreDictionary.registerOre("oreDryDiamond", ModBlocks.DRY_DIAMOND_ORE);
        //干钻石
        OreDictionary.registerOre("gemDryDiamond", ModItems.DRY_DIAMOND);
    }
}
