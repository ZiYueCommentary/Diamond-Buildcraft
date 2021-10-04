package com.ziyue.diamond.init;

import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class ModOreGen implements IWorldGenerator {
    private WorldGenerator nether, overworld, end;

    public ModOreGen(){
        overworld = new WorldGenMinable(ModBlocks.DRY_DIAMOND_ORE.getDefaultState(), 9);
        nether = new WorldGenMinable(ModBlocks.DRY_DIAMOND_ORE.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.NETHERRACK));
        end = new WorldGenMinable(ModBlocks.DRY_DIAMOND_ORE.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.END_STONE));
    }

    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider){
        switch (world.provider.getDimension()){
            case 0:
                runGenerator(overworld, world, random, chunkX, chunkZ, 50, 0, 50);
                break;
            case -1:
                runGenerator(nether, world, random, chunkX, chunkZ, 50, 0, 50);
                break;
            case 1:
                runGenerator(end, world,random,chunkX,chunkZ,50,0,50);
                break;
        }
    }

    private void runGenerator(WorldGenerator generator, World world, Random random, int chunkX, int chunkZ, int chance, int minY, int maxY){
        if(minY > maxY || minY < 0 || maxY > 256) throw new IllegalArgumentException("矿石生成超出世界");
        int heightDiff = maxY -minY + 1;

        for(int i = 0; i < chance; i++){
            int x = chunkX * 16 + random.nextInt(16);
            int y = minY + random.nextInt(heightDiff);
            int z = chunkZ * 16 + random.nextInt(16);

            generator.generate(world, random, new BlockPos(x, y, z));
        }
    }
}
