package com.ziyue.diamond.recipes;

import com.ziyue.diamond.init.ModBlocks;
import com.ziyue.diamond.init.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * @author ZiYueCommentary
 */

public class SmeltingRecipes {
    public static void init(){
        /*
            该部分为冶炼配方
            所有冶炼配方基本一致，不需要做过多的单独讲解
        */

        GameRegistry.addSmelting(new ItemStack(Items.DIAMOND), new ItemStack(ModItems.DRY_DIAMOND), 0.4F);
        //ItemStack(Items.DIAMOND)为游戏原版物品，ItemStack(ModItems.DRY_DIAMOND)为模组物品
        //后面的0.4F为经验值，可随意填写
        //总结就是前面写烧的东西，后面写烧出来的东西
        GameRegistry.addSmelting(new ItemStack(Blocks.DIAMOND_BLOCK), new ItemStack(ModBlocks.DRY_DIAMOND_BLOCK), 0.4F);
        GameRegistry.addSmelting(new ItemStack(ModBlocks.DIAMOND_SLAB_HALF), new ItemStack(ModBlocks.DRY_DIAMOND_SLAB_HALF), 0.4F);
        GameRegistry.addSmelting(new ItemStack(ModBlocks.DRY_DIAMOND_ORE), new ItemStack(ModItems.DRY_DIAMOND), 0.4F);
        GameRegistry.addSmelting(new ItemStack(ModBlocks.DIAMOND_STAIRS), new ItemStack(ModBlocks.DRY_DIAMOND_STAIRS), 0.4F);
        GameRegistry.addSmelting(new ItemStack(ModBlocks.DIAMOND_BUTTON), new ItemStack(ModBlocks.DRY_DIAMOND_BUTTON), 0.4F);
        GameRegistry.addSmelting(new ItemStack(ModItems.DIAMOND_STICK), new ItemStack(ModItems.DRY_DIAMOND_STICK), 0.4F);
        GameRegistry.addSmelting(new ItemStack(ModBlocks.DIAMOND_FENCE), new ItemStack(ModBlocks.DRY_DIAMOND_FENCE), 0.4F);
        GameRegistry.addSmelting(new ItemStack(ModBlocks.DIAMOND_PRESSURE_PLATE), new ItemStack(ModBlocks.DRY_DIAMOND_PRESSURE_PLATE), 0.4F);
        GameRegistry.addSmelting(new ItemStack(ModBlocks.COMPRESS_DIAMOND_BLOCK), new ItemStack(ModBlocks.COMPRESS_DRY_DIAMOND_BLOCK), 0.4F);

        /*装备*/
        GameRegistry.addSmelting(new ItemStack(Items.DIAMOND_HELMET), new ItemStack(ModItems.DRY_DIAMOND_HELMET), 0.4F);
        GameRegistry.addSmelting(new ItemStack(Items.DIAMOND_CHESTPLATE), new ItemStack(ModItems.DRY_DIAMOND_CHESTPLATE), 0.4F);
        GameRegistry.addSmelting(new ItemStack(Items.DIAMOND_LEGGINGS), new ItemStack(ModItems.DRY_DIAMOND_LEGGINGS), 0.4F);
        GameRegistry.addSmelting(new ItemStack(Items.DIAMOND_BOOTS), new ItemStack(ModItems.DRY_DIAMOND_BOOTS), 0.4F);

        //ItemStack里面方块后加上 , 3 代表amount为3，也就是数量
    }
}

//1.12.2真的太麻烦了啊啊啊啊啊啊啊啊啊啊啊啊
//                      来自子悦的吐槽