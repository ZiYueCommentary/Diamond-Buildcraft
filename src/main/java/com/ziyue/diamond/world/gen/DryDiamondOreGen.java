package com.ziyue.diamond.world.gen;

/*
    该部分仅适用于下界矿物生成
    在修改矿物的生成数据时，你应该随时参考原版游戏的生成数据
*/

import com.ziyue.diamond.lists.BlockList;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage.Decoration;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * @author ZiYueCommentary
 */

public class DryDiamondOreGen{
    private static void setupOreGeneration(){
        for(Biome biome : ForgeRegistries.BIOMES){
            if(biome == Biomes.NETHER){//如果 生物群系 为 下界
                biome.addFeature(Decoration.UNDERGROUND_DECORATION,//生成 地下装饰（UNDERGROUND_DECORATION）
                        Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK,//替代 下界岩（NETHERRACK）
                                BlockList.dry_diamond_ore.getDefaultState(), 14))//替代为 干钻石矿（dry_diamond_ore）
                                .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(16 , 10 , 20 ,128))));//矿物生成数值（与石英矿一致）
            }
        }
    }
    public static void generate(){
        setupOreGeneration();
    }
}