package com.ziyue.diamond.world.biome;

import com.ziyue.diamond.events.RegistryEvents;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

/**
 * @author ZiYueCommentary
 */

public class DiamondLandBiome extends Biome {
    public DiamondLandBiome() {
        super(new Biome.Builder()
        .surfaceBuilder(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(Blocks.GRASS_BLOCK.getDefaultState(), Blocks.DIAMOND_ORE.getDefaultState(), Blocks.DIAMOND_ORE.getDefaultState()))
        .precipitation(RainType.RAIN)
                .category(Category.PLAINS)
                .downfall(0.3F)
                .depth(0.125F)
                .temperature(0.5F)
                .scale(0.1F)
                .waterColor(0x4bedcf)
                .waterFogColor(0x4bedcf)
                .parent(null)
        );
        DefaultBiomeFeatures.addCarvers(this);
        DefaultBiomeFeatures.addOceanCarvers(this);
        DefaultBiomeFeatures.addStructures(this);
        DefaultBiomeFeatures.addLakes(this);
        DefaultBiomeFeatures.addOres(this);
        DefaultBiomeFeatures.addExtraGoldOre(this);
        DefaultBiomeFeatures.addOakTreesFlowersGrass(this);
        DefaultBiomeFeatures.addForestTrees(this);

        this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.COW, 100, 5, 10));
        this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.CHICKEN, 100, 5, 10));
        this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.SHEEP, 100, 5, 10));
        this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.PIG, 100, 5, 10));
        this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.BEE, 100, 5, 10));

        this.setRegistryName(RegistryEvents.location("diamond_land"));
    }
}
