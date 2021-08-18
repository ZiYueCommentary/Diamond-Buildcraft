package com.ziyue.diamond.world.biome;

import com.ziyue.diamond.lists.BiomeList;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.provider.SingleBiomeProvider;
import net.minecraft.world.biome.provider.SingleBiomeProviderSettings;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.OverworldChunkGenerator;
import net.minecraft.world.gen.OverworldGenSettings;

/**
 * @author ZiYueCommentary
 */

public class DiamondLandType extends WorldType {
    public DiamondLandType() {
        super("diamond_land");
    }
    @Override
    public ChunkGenerator<?> createChunkGenerator(World world)
    {
        OverworldGenSettings genSettings = new OverworldGenSettings();
        SingleBiomeProviderSettings singleSettings = new SingleBiomeProviderSettings(world.getWorldInfo());
        singleSettings.setBiome(BiomeList.diamond_land);
        return new OverworldChunkGenerator(world, new SingleBiomeProvider(singleSettings), genSettings);
    }
}
