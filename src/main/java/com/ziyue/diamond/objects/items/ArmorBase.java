package com.ziyue.diamond.objects.items;

import com.ziyue.diamond.Diamond;
import com.ziyue.diamond.init.ModItems;
import com.ziyue.diamond.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorBase extends ItemArmor implements IHasModel {
    public ArmorBase(String name, ArmorMaterial material, int renderIndexIn, EntityEquipmentSlot equipmentSlot){
        super(material, renderIndexIn, equipmentSlot);
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
