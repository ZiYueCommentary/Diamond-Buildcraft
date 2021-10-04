package com.ziyue.diamond.init;

import com.ziyue.diamond.objects.blocks.*;
import com.ziyue.diamond.objects.blocks.slab.*;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ZiYueCommentary
 */

public class ModBlocks {
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block DRY_DIAMOND_ORE = new BlockBase("dry_diamond_ore", Material.ROCK).setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    //原版钻石块
    public static final Block DIAMOND_BLOCK_VANILA = new DiamondBlock("minecraft:diamond_block", Material.IRON).setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    //原版钻石矿
    public static final Block DIAMOND_ORE_VANILA = new DiamondOre("minecraft:diamond_ore", Material.IRON).setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    //完整钻石台阶
    public static final BlockSlab DIAMOND_SLAB_DOUBLE = new BlockDoubleSlabBaseLight("diamond_slab_double", Material.IRON, CreativeTabs.BUILDING_BLOCKS, ModBlocks.DIAMOND_SLAB_HALF);
    //半个钻石台阶
    public static final BlockSlab DIAMOND_SLAB_HALF = new BlockHalfSlabBaseLight("diamond_slab_half", Material.IRON, CreativeTabs.BUILDING_BLOCKS, ModBlocks.DIAMOND_SLAB_HALF, ModBlocks.DIAMOND_SLAB_DOUBLE);
    //完整干钻石台阶
    public static final BlockSlab DRY_DIAMOND_SLAB_DOUBLE = new BlockDoubleSlabBase("dry_diamond_slab_double", Material.IRON, CreativeTabs.BUILDING_BLOCKS, ModBlocks.DRY_DIAMOND_SLAB_HALF);
    //半个干钻石台阶
    public static final BlockSlab DRY_DIAMOND_SLAB_HALF = new BlockHalfSlabBase("dry_diamond_slab_half", Material.IRON, CreativeTabs.BUILDING_BLOCKS, ModBlocks.DRY_DIAMOND_SLAB_HALF, ModBlocks.DRY_DIAMOND_SLAB_DOUBLE);
    //干钻石块
    public static final Block DRY_DIAMOND_BLOCK = new DryDiamondBlock("dry_diamond_block", Material.IRON).setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    //钻石楼梯
    public static final Block DIAMOND_STAIRS = new BlockStairBase("diamond_stairs", Blocks.DIAMOND_BLOCK.getDefaultState(), CreativeTabs.BUILDING_BLOCKS, 5.0F, 6.0F, 1, SoundType.METAL);
    //钻石栅栏
    public static final Block DIAMOND_FENCE = new DiamondFence("diamond_fence");
    //钻石压力板
    public static final Block DIAMOND_PRESSURE_PLATE = new DiamondPressurePlate("diamond_pressure_plate");
    //钻石按钮
    public static final Block DIAMOND_BUTTON = new DiamondButton("diamond_button");
    //干钻石楼梯
    public static final Block DRY_DIAMOND_STAIRS = new BlockStairBase("dry_diamond_stairs", Blocks.DIAMOND_BLOCK.getDefaultState(), CreativeTabs.BUILDING_BLOCKS, 4.0F, 6.0F, 0, SoundType.METAL);
    //干钻石按钮
    public static final Block DRY_DIAMOND_BUTTON = new DryDiamondButton("dry_diamond_button");
    //干钻石栅栏
    public static final Block DRY_DIAMOND_FENCE = new DryDiamondFence("dry_diamond_fence");
    //干钻石压力板
    public static final Block DRY_DIAMOND_PRESSURE_PLATE = new DryDiamondPressurePlate("dry_diamond_pressure_plate");
    //压缩钻石块
    public static final Block COMPRESS_DIAMOND_BLOCK = new CompressDiamondBlock("compress_diamond_block", Material.IRON).setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    //压缩干钻石块
    public static final Block COMPRESS_DRY_DIAMOND_BLOCK = new CompressDryDiamondBlock("compress_dry_diamond_block", Material.IRON).setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    //钻石门
    public static final Block DIAMOND_DOOR = new DiamondDoor("diamond_door");
    //干钻石门
    public static final Block DRY_DIAMOND_DOOR = new DryDiamondDoor("dry_diamond_door");
    //钻石梯子
    public static final Block DIAMOND_LADDER = new DiamondLadder("diamond_ladder");
    //干钻石梯子
    public static final Block DRY_DIAMOND_LADDER = new DryDiamondLadder("dry_diamond_ladder");
    //钻石栅栏门
    public static final Block DIAMOND_FENCE_GATE = new DiamondFenceGate("diamond_fence_gate");
    //干钻石栅栏门
    public static final Block DRY_DIAMOND_FENCE_GATE = new DryDiamondFenceGate("dry_diamond_fence_gate");
}
/*
    台阶由于有多重情况，所以在写配方时注明data
    例如钻石台阶，那么id就为diamond_slab_half，data为0
    这一点非常重要，如果不写data那么配方文件就无法正常读取
                              子悦用了一个小时得到的教训
*/
/*
    因为钻石台阶会发光，所以钻石台阶所使用的文件与干钻石台阶不一致
    钻石台阶使用BlockDoubleSlabBaseLight和BlockHalfSlabBaseLight，文件内设置了亮度
    干钻石台阶使用BlockDoubleSlabBase和BlockHalfSlabBase，没有设置亮度
    但这两种文件都继承BlockSlabBase
    因为每个方块都需要爆炸抗性和硬度，所以这两种文件内都设置了爆炸抗性、硬度和开采等级
    如果你需要一个与这些数值不符的台阶，你需要自己复制文件并设置
*/
/*
    楼梯部分做了优化，因此你可以在这个文件中设置硬度、爆炸抗性、亮度和声音类型
    你可以根据钻石楼梯和干钻石楼梯的写法来创建新方块
    如果你不希望方块放光，需要将lightValue设为0
*/
/*
    栅栏、压力板和按钮的设置都在com.ziyue.diamond.objects.blocks里
*/