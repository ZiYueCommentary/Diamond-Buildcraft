package com.ziyue.diamond.lists;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeManager;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;

import static net.minecraftforge.common.BiomeManager.addSpawnBiome;

/**
 * @author ZiYueCommentary
 */

//由于莫名其妙的问题，生物群系弄成了世界类型

public class BiomeList {
    public static Biome diamond_land;

    public static void registerBiomes(){
        registerBiome(diamond_land, Type.PLAINS);
    }

    public static void registerBiome(Biome biome, Type... type){
        BiomeDictionary.addTypes(biome, type);
        addSpawnBiome(biome);
    }
}
