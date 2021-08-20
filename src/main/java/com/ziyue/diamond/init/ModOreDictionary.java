package com.ziyue.diamond.init;

import net.minecraftforge.oredict.OreDictionary;

public class ModOreDictionary {
    public static void registerOres(){
        OreDictionary.registerOre("oreDryDiamond", ModBlocks.DRY_DIAMOND_ORE);
        OreDictionary.registerOre("ingotDryDiamond", ModItems.DRY_DIAMOND);
    }
}
