package com.ziyue.diamond.objects.items;

import com.ziyue.diamond.Diamond;
import com.ziyue.diamond.init.ModItems;
import com.ziyue.diamond.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class SwordBase extends ItemSword implements IHasModel {
    public SwordBase(String name, ToolMaterial material){
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.COMBAT);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels(){
        Diamond.proxy.registerItemRenderer(this, 0, "inventory");
    }
}