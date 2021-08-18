package com.ziyue.diamond.lists;

import com.ziyue.diamond.Main;
import net.minecraft.entity.item.PaintingType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * @author ZiYueCommentary
 */

public class PaintingList {
    public static final DeferredRegister<PaintingType> PAINTING_TYPE = new DeferredRegister<PaintingType>(ForgeRegistries.PAINTING_TYPES, Main.MOD_ID);
    public static final RegistryObject<PaintingType> MONA_DIAMOND = PAINTING_TYPE.register("mona_diamond", () -> new PaintingType(64, 64));
}