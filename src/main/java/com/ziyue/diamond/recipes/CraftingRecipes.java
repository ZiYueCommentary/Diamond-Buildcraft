package com.ziyue.diamond.recipes;

import com.ziyue.diamond.init.ModBlocks;
import com.ziyue.diamond.init.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * @author ZiYueCommentary
 */

public class CraftingRecipes {
    public static void init(){
        /*
            这个地方是用来写无序配方的
            例如一个铁块放在工作台任意位置都可以得到9个铁锭
            由于该部分没搞懂就会很难写，所以下面将在每行代码下进行解释
            为了防止每个部分打架，最好一个配方单独一个大括号
        */
        {
            //干钻石块
            ItemStack dry_diamond_block = new ItemStack(ModBlocks.DRY_DIAMOND_BLOCK);
            /*
                dry_diamond_block可以随意填写，但要与下面一致
                ModBlocks.DRY_DIAMOND_BLOCK指在文件ModBlocks.java里的DRY_DIAMOND_BLOCK
                这一行没有填写amount，下一行干钻石则填写了amount
                amount不写默认为1
            */

            //干钻石
            ItemStack dry_diamond = new ItemStack(ModItems.DRY_DIAMOND, 9);
            /*
                dry_diamond可随意填写，要和下面一致
                ModItems.DRY_DIAMOND指ModItems.java里的DRY_DIAMOND
                ModItems.DRY_DIAMOND, 9 中的9为amount，可简记为数量
                amount理论来说可以随意填写，建议在ModItems加入setMaxStackSize
            */

            GameRegistry.addShapelessRecipe(new ResourceLocation("dry_diamond"), null, dry_diamond, Ingredient.fromStacks(dry_diamond_block));
            /*
                上面这一行是最魔幻的部分
                ResourceLocation("dry_diamond")里的dry_diamond是配方的名字，随便写就可以
                null后面的dry_diamond是指上部分的dry_diamond，代表干钻石（引用的东西可以乱写）
                最重要的部分！↓↓↓
                这个dry_diamond指 输出内容，上面amount的数字代表数量（例如amount为3，那么我在工作台放一个干钻石块就会得到3个干钻石）
                而后面Ingredient.fromStacks(dry_diamond_block)里的dry_diamond_block代表 输入内容，amount代表数量（例如amount为2，那么我在工作台放置2个干钻石块才能得到干钻石）
                简记为：前输出后输入
            */
        }
        {
            ItemStack diamond = new ItemStack(Items.DIAMOND);
            ItemStack diamond_button = new ItemStack(ModBlocks.DIAMOND_BUTTON);
            GameRegistry.addShapelessRecipe(new ResourceLocation("diamond_button_from_block"), null, diamond_button, Ingredient.fromStacks(diamond));
        }
        {
            ItemStack dry_diamond = new ItemStack(ModItems.DRY_DIAMOND);
            ItemStack dry_diamond_button = new ItemStack(ModBlocks.DRY_DIAMOND_BUTTON);
            GameRegistry.addShapelessRecipe(new ResourceLocation("dry_diamond_button_from_block"), null, dry_diamond_button, Ingredient.fromStacks(dry_diamond));
        }
        {
            ItemStack compress_diamond_block = new ItemStack(ModBlocks.COMPRESS_DIAMOND_BLOCK);
            ItemStack diamond_block = new ItemStack(ModBlocks.DIAMOND_BLOCK_VANILA, 9);
            GameRegistry.addShapelessRecipe(new ResourceLocation("diamond_block_from_compress"), null, diamond_block, Ingredient.fromStacks(compress_diamond_block));
        }
        {
            ItemStack compress_dry_diamond_block = new ItemStack(ModBlocks.COMPRESS_DRY_DIAMOND_BLOCK);
            ItemStack dry_diamond_block = new ItemStack(ModBlocks.DRY_DIAMOND_BLOCK, 9);
            GameRegistry.addShapelessRecipe(new ResourceLocation("dry_diamond_block_from_compress"), null, dry_diamond_block, Ingredient.fromStacks(compress_dry_diamond_block));
        }
    }
}