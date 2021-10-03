package com.ziyue.diamond.init;

import com.ziyue.diamond.objects.items.ArmorBase;
import com.ziyue.diamond.objects.items.ItemBase;
import com.ziyue.diamond.util.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ZiYueCommentary
 */

public class ModItems extends Item {
    public static final List<Item> ITEMS = new ArrayList<Item>();
    //干钻石
    public static final Item DRY_DIAMOND = new ItemBase("dry_diamond").setCreativeTab(CreativeTabs.MISC);
    //钻石棍
    public static final Item DIAMOND_STICK = new ItemBase("diamond_stick").setCreativeTab(CreativeTabs.MISC);
    //干钻石棍
    public static final Item DRY_DIAMOND_STICK = new ItemBase("dry_diamond_stick").setCreativeTab(CreativeTabs.MISC);

    /*装备*/
    public static final ArmorBase.ArmorMaterial DRY_DIAMOND_ARMOR = EnumHelper.addArmorMaterial("dry_diaond_armor", Reference.MOD_ID + ":dry_diamond_armor", 15, new int[]{1, 4, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
    //干钻石头盔
    public static final Item DRY_DIAMOND_HELMET = new ArmorBase("dry_diamond_helmet", DRY_DIAMOND_ARMOR, 1, EntityEquipmentSlot.HEAD);
    //干钻石胸甲
    public static final Item DRY_DIAMOND_CHESTPLATE = new ArmorBase("dry_diamond_chestplate", DRY_DIAMOND_ARMOR, 1, EntityEquipmentSlot.CHEST);
    //干钻石护腿
    public static final Item DRY_DIAMOND_LEGGINGS = new ArmorBase("dry_diamond_leggings", DRY_DIAMOND_ARMOR, 2, EntityEquipmentSlot.LEGS);
    //干钻石靴子
    public static final Item DRY_DIAMOND_BOOTS = new ArmorBase("dry_diamond_boots", DRY_DIAMOND_ARMOR, 1, EntityEquipmentSlot.FEET);
}