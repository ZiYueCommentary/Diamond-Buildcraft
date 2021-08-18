package com.ziyue.diamond.world.gen;

/*
    �ò��ֽ��������½��������
    ���޸Ŀ������������ʱ����Ӧ����ʱ�ο�ԭ����Ϸ����������
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
            if(biome == Biomes.NETHER){//��� ����Ⱥϵ Ϊ �½�
                biome.addFeature(Decoration.UNDERGROUND_DECORATION,//���� ����װ�Σ�UNDERGROUND_DECORATION��
                        Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK,//��� �½��ң�NETHERRACK��
                                BlockList.dry_diamond_ore.getDefaultState(), 14))//���Ϊ ����ʯ��dry_diamond_ore��
                                .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(16 , 10 , 20 ,128))));//����������ֵ����ʯӢ��һ�£�
            }
        }
    }
    public static void generate(){
        setupOreGeneration();
    }
}