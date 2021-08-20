package com.ziyue.diamond.objects.items;

import com.ziyue.diamond.Diamond;
import com.ziyue.diamond.init.ModItems;
import com.ziyue.diamond.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {
    public ItemBase(String name){
        setUnlocalizedName(name);
        setRegistryName(name);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels(){
        Diamond.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
