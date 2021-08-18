package com.ziyue.diamond.events;

import com.ziyue.diamond.Main;
import com.ziyue.diamond.lists.BiomeList;
import com.ziyue.diamond.lists.BlockList;
import com.ziyue.diamond.lists.ItemList;
import com.ziyue.diamond.objects.blocks.*;
import com.ziyue.diamond.world.biome.DiamondLandBiome;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import org.apache.logging.log4j.Logger;
import net.minecraftforge.fml.common.Mod;

import java.util.function.Supplier;

/**
 * @author ZiYueCommentary
 */
@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class RegistryEvents {
    public static final Logger LOGGER = Main.LOGGER;
    public static final String MOD_ID = Main.MOD_ID;

    /*
        干钻石压力板实质上属于木质压力板，可以被掉落物激活
        钻石压力板实质上属于石质压力板，不能被掉落物激活

        干钻石按钮实质上属于木质按钮，可以被箭激活
        钻石按钮实质上属于石质按钮，不能被箭激活
    */

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event)//物品需要在ItemList.java中注册
    {
        event.getRegistry().registerAll//注册物品，可分配创造栏
                (
                        //干钻石
                        ItemList.dry_diamond = new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName(location("dry_diamond")),
                        //干钻石块
                        ItemList.dry_diamond_block = new BlockItem(BlockList.dry_diamond_block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(BlockList.dry_diamond_block.getRegistryName()),
                        //干钻石台阶
                        ItemList.dry_diamond_slab = new BlockItem(BlockList.dry_diamond_slab, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(BlockList.dry_diamond_slab.getRegistryName()),
                        //干钻石楼梯
                        ItemList.dry_diamond_stairs = new BlockItem(BlockList.dry_diamond_stairs, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(BlockList.dry_diamond_stairs.getRegistryName()),
                        //干钻石棍
                        ItemList.dry_diamond_stick = new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName(location("dry_diamond_stick")),
                        //干钻石按钮
                        ItemList.dry_diamond_button = new BlockItem(BlockList.dry_diamond_button, new Item.Properties().group(ItemGroup.REDSTONE)).setRegistryName(BlockList.dry_diamond_button.getRegistryName()),
                        //干钻石栅栏
                        ItemList.dry_diamond_fence = new BlockItem(BlockList.dry_diamond_fence, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(BlockList.dry_diamond_fence.getRegistryName()),
                        //干钻石压力板
                        ItemList.dry_diamond_pressure_plate = new BlockItem(BlockList.dry_diamond_pressure_plate, new Item.Properties().group(ItemGroup.REDSTONE)).setRegistryName(BlockList.dry_diamond_pressure_plate.getRegistryName()),
                        //干钻石矿
                        ItemList.dry_diamond_ore = new BlockItem(BlockList.dry_diamond_ore, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(BlockList.dry_diamond_ore.getRegistryName()),
                        //干钻石墙
                        ItemList.dry_diamond_wall = new BlockItem(BlockList.dry_diamond_wall, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(BlockList.dry_diamond_wall.getRegistryName()),
                        //干钻石门
                        ItemList.dry_diamond_door = new BlockItem(BlockList.dry_diamond_door, new Item.Properties().group(ItemGroup.REDSTONE)).setRegistryName(BlockList.dry_diamond_door.getRegistryName()),
                        //干钻石栅栏门
                        ItemList.dry_diamond_fence_gate = new BlockItem(BlockList.dry_diamond_fence_gate, new Item.Properties().group(ItemGroup.REDSTONE)).setRegistryName(BlockList.dry_diamond_fence_gate.getRegistryName()),
                        //干钻石梯子
                        ItemList.dry_diamond_ladder = new BlockItem(BlockList.dry_diamond_ladder, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(BlockList.dry_diamond_ladder.getRegistryName()),
                        //钻石楼梯
                        ItemList.diamond_stairs = new BlockItem(BlockList.diamond_stairs, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(BlockList.diamond_stairs.getRegistryName()),
                        //钻石台阶
                        ItemList.diamond_slab = new BlockItem(BlockList.diamond_slab, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(BlockList.diamond_slab.getRegistryName()),
                        //钻石墙
                        ItemList.diamond_wall = new BlockItem(BlockList.diamond_wall, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(BlockList.diamond_wall.getRegistryName()),
                        //钻石棍
                        ItemList.diamond_stick = new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName(location("diamond_stick")),
                        //钻石栅栏
                        ItemList.diamond_fence = new BlockItem(BlockList.diamond_fence, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(BlockList.diamond_fence.getRegistryName()),
                        //钻石按钮
                        ItemList.diamond_button = new BlockItem(BlockList.diamond_button, new Item.Properties().group(ItemGroup.REDSTONE)).setRegistryName(BlockList.diamond_button.getRegistryName()),
                        //钻石压力板
                        ItemList.diamond_pressure_plate = new BlockItem(BlockList.diamond_pressure_plate, new Item.Properties().group(ItemGroup.REDSTONE)).setRegistryName(BlockList.diamond_pressure_plate.getRegistryName()),
                        //钻石门
                        ItemList.diamond_door = new BlockItem(BlockList.diamond_door, new Item.Properties().group(ItemGroup.REDSTONE)).setRegistryName(BlockList.diamond_door.getRegistryName()),
                        //钻石梯子
                        ItemList.diamond_ladder = new BlockItem(BlockList.diamond_ladder, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(BlockList.diamond_ladder.getRegistryName()),
                        //钻石栅栏门
                        ItemList.diamond_fence_gate = new BlockItem(BlockList.diamond_fence_gate, new Item.Properties().group(ItemGroup.REDSTONE)).setRegistryName(BlockList.diamond_fence_gate.getRegistryName()),
                        //原版钻石块
                        ItemList.diamond_block_vanila = new BlockItem(BlockList.diamond_block_vanila, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(BlockList.diamond_block_vanila.getRegistryName()),
                        //原版钻石矿
                        ItemList.diamond_ore_vanila = new BlockItem(BlockList.diamond_ore_vanila, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(BlockList.diamond_ore_vanila.getRegistryName()),

                        /*装备*/
                        //干钻石头盔
                        ItemList.dry_diamond_helmet = new ArmorItem(DryDiamondMaterial.MATERIAL, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT)).setRegistryName("dry_diamond_helmet"),
                        //干钻石胸甲
                        ItemList.dry_diamond_chestplate = new ArmorItem(DryDiamondMaterial.MATERIAL, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT)).setRegistryName("dry_diamond_chestplate"),
                        //干钻石护腿
                        ItemList.dry_diamond_leggings = new ArmorItem(DryDiamondMaterial.MATERIAL, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT)).setRegistryName("dry_diamond_leggings"),
                        //干钻石靴子
                        ItemList.dry_diamond_boots = new ArmorItem(DryDiamondMaterial.MATERIAL, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT)).setRegistryName("dry_diamond_boots")
                );
    }

    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event)//方块需要在ItemList.java及BlockList.java注册
    {
        event.getRegistry().registerAll//注册方块
                (
                        //干钻石块
                        BlockList.dry_diamond_block = new Block(Block.Properties.create(Material.IRON, MaterialColor.DIAMOND).hardnessAndResistance(3.0F, 4.0F).sound(SoundType.METAL)).setRegistryName(location("dry_diamond_block")),
                        //干钻石台阶
                        BlockList.dry_diamond_slab = new SlabBlock(Block.Properties.from(BlockList.dry_diamond_block)).setRegistryName(location("dry_diamond_slab")),
                        //干钻石楼梯
                        BlockList.dry_diamond_stairs = new DryDiamondStairs(BlockList.dry_diamond_block.getDefaultState(), Block.Properties.from(BlockList.dry_diamond_block)).setRegistryName("dry_diamond_stairs"),
                        //干钻石栅栏
                        BlockList.dry_diamond_fence = new FenceBlock(Block.Properties.from(BlockList.dry_diamond_block)).setRegistryName(location("dry_diamond_fence")),
                        //干钻石按钮
                        BlockList.dry_diamond_button = new DryDiamondButton(Block.Properties.create(Material.IRON, MaterialColor.DIAMOND)).setRegistryName(location("dry_diamond_button")),
                        //干钻石压力板
                        BlockList.dry_diamond_pressure_plate = new DryDiamondPressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.create(Material.IRON, MaterialColor.DIAMOND)).setRegistryName(location("dry_diamond_pressure_plate")),
                        //干钻石墙
                        BlockList.dry_diamond_wall = new WallBlock(Block.Properties.from(BlockList.dry_diamond_block)).setRegistryName(location("dry_diamond_wall")),
                        //干钻石矿
                        BlockList.dry_diamond_ore = new DryDiamondOre(Block.Properties.from(Blocks.IRON_ORE)).setRegistryName(location("dry_diamond_ore")),
                        //干钻石门
                        BlockList.dry_diamond_door = new DryDiamondDoor(Block.Properties.from(Blocks.OAK_DOOR)).setRegistryName(location("dry_diamond_door")),
                        //干钻石栅栏门
                        BlockList.dry_diamond_fence_gate = new FenceGateBlock(Block.Properties.from(BlockList.dry_diamond_block)).setRegistryName(location("dry_diamond_fence_gate")),
                        //干钻石梯子
                        BlockList.dry_diamond_ladder = new DryDiamondLadder(Block.Properties.from(Blocks.LADDER)).setRegistryName("dry_diamond_ladder"),
                        //钻石楼梯
                        BlockList.diamond_stairs = new DiamondStairs(Blocks.DIAMOND_BLOCK.getDefaultState(), Block.Properties.from(Blocks.DIAMOND_BLOCK).lightValue(14)).setRegistryName("diamond_stairs"),
                        //钻石台阶
                        BlockList.diamond_slab = new SlabBlock(Block.Properties.from(Blocks.DIAMOND_BLOCK).lightValue(14)).setRegistryName(location("diamond_slab")),
                        //钻石墙
                        BlockList.diamond_wall = new WallBlock(Block.Properties.from(Blocks.DIAMOND_BLOCK).lightValue(14)).setRegistryName(location("diamond_wall")),
                        //钻石栅栏
                        BlockList.diamond_fence = new FenceBlock(Block.Properties.from(Blocks.DIAMOND_BLOCK).lightValue(14)).setRegistryName(location("diamond_fence")),
                        //钻石按钮
                        BlockList.diamond_button = new DryDiamondButton(Block.Properties.create(Material.IRON, MaterialColor.DIAMOND).lightValue(14)).setRegistryName(location("diamond_button")),
                        //钻石压力板
                        BlockList.diamond_pressure_plate = new DryDiamondPressurePlate(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.IRON, MaterialColor.DIAMOND).lightValue(14)).setRegistryName(location("diamond_pressure_plate")),
                        //钻石门
                        BlockList.diamond_door = new DiamondDoor(Block.Properties.from(Blocks.IRON_DOOR).lightValue(14)).setRegistryName(location("diamond_door")),
                        //钻石栅栏门
                        BlockList.diamond_fence_gate = new FenceGateBlock(Block.Properties.from(Blocks.DIAMOND_BLOCK).lightValue(14)).setRegistryName("diamond_fence_gate"),
                        //钻石梯子
                        BlockList.diamond_ladder = new DiamondLadder(Block.Properties.from(Blocks.LADDER).lightValue(14)).setRegistryName("diamond_ladder"),
                        //原版钻石块
                        BlockList.diamond_block_vanila = new Block(Block.Properties.from(Blocks.DIAMOND_BLOCK).lightValue(14)).setRegistryName("minecraft:diamond_block"),
                        //原版钻石矿
                        BlockList.diamond_ore_vanila = new Block(Block.Properties.from(Blocks.DIAMOND_ORE).lightValue(5)).setRegistryName("minecraft:diamond_ore")
                );
    }
/*
  原版钻石块：
  Block.Properties.from(Blocks.DIAMOND_BLOCK)
  加载游戏原版钻石块数据，由于模组在原版游戏之后加载，所以为先调用原版数据后添加lightValue再覆盖（可简单理解为修改原版内容）

  lightValue(14)
  添加亮度值为14，与火把一致

  setRegistryName("minecraft:diamond_block")
  设置注册名称，特别指明minecraft命名空间，覆盖原版minecraft空间方块 钻石块（理论上也可以直接覆盖其他模组方块，指定命名空间即可）

  在其他方块上也大致相同，在属性后加上.lightValue()即可
  例：Block.Properties.from(Blocks.IRON_BLOCK).lightValue(14)
*/

    public static ResourceLocation location(String name) {
        return new ResourceLocation(MOD_ID, name);
    }

    @SubscribeEvent
    public static void registerBiomes(final RegistryEvent.Register<Biome> event) {
        event.getRegistry().registerAll(
                BiomeList.diamond_land = new DiamondLandBiome()
        );

        BiomeList.registerBiomes();
    }

    //干钻石装备 数据
    //2.1版本开始，干钻石装备将使用锁链数据，以下内容基于锁链数据
    public enum DryDiamondMaterial implements IArmorMaterial {
        MATERIAL(Main.MOD_ID + ":dry_diamond_armor", 5, new int[] {1, 4, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 6.9F, () -> {
            return Ingredient.fromItems(ItemList.dry_diamond);
        });

        private static final int[] MAX_DAMAGE_ARRAY = new int[] {13, 15 ,16 ,11};
        private final String name;
        private final int maxDamageFactor;
        private final int[] damageReductionAmountArray;
        private final int enchantability;
        private final SoundEvent soundEvent;
        private final float toughness;
        private final LazyValue<Ingredient> repairMaterial;

        private DryDiamondMaterial(String nameIn, int maxDamageFactorIn, int[] damageReductionAmountArrayIn, int enchantabilityIn, SoundEvent soundEventIn, float toughnessIn, Supplier<Ingredient>repairMaterialIn){
            this.name = nameIn;
            this.maxDamageFactor = maxDamageFactorIn;
            this.damageReductionAmountArray = damageReductionAmountArrayIn;
            this.enchantability = enchantabilityIn;
            this.toughness = toughnessIn;
            this.repairMaterial = new LazyValue<>(repairMaterialIn);
            this.soundEvent = soundEventIn;
        }

        @Override
        public int getDurability(EquipmentSlotType slotIn) {
            return this.MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
        }

        @Override
        public int getDamageReductionAmount(EquipmentSlotType slotIn) {
            return this.damageReductionAmountArray[slotIn.getIndex()];
        }

        @Override
        public int getEnchantability() {
            return this.enchantability;
        }

        @Override
        public SoundEvent getSoundEvent() {
            return this.soundEvent;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return this.repairMaterial.getValue();
        }
        @OnlyIn(Dist.CLIENT)
        @Override
        public String getName() {
            return this.name;
        }

        @Override
        public float getToughness() {
            return this.toughness;
        }
    }
}
