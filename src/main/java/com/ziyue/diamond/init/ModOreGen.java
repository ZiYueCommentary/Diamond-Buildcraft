package com.ziyue.diamond.init;

import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

/**
 * @author ZiYueCommentary
 */

public class ModOreGen implements IWorldGenerator {
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        if(world.provider.getDimension() == -1){
            generateNether(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
        }
    }

    private void generateNether(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider){
        generateOre(ModBlocks.DRY_DIAMOND_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 256, random.nextInt(5) + 9, 88);
    }

    private void generateOre(IBlockState blockState, World world, Random random, int x, int z, int minY, int maxY, int size, int chances){
        int deltaY = maxY - minY;
        for(int i = 0; i < chances; i++){
            BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z+ random.nextInt(16));
            WorldGenMinable generator = new WorldGenMinable(blockState, size, BlockMatcher.forBlock(Blocks.NETHERRACK)); //我特么终于修好了！！！！！！
            generator.generate(world, random, pos);
        }
    }
}