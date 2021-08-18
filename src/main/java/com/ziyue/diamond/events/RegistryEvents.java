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
        ����ʯѹ����ʵ��������ľ��ѹ���壬���Ա������Ｄ��
        ��ʯѹ����ʵ��������ʯ��ѹ���壬���ܱ������Ｄ��

        ����ʯ��ťʵ��������ľ�ʰ�ť�����Ա�������
        ��ʯ��ťʵ��������ʯ�ʰ�ť�����ܱ�������
    */

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event)//��Ʒ��Ҫ��ItemList.java��ע��
    {
        event.getRegistry().registerAll//ע����Ʒ���ɷ��䴴����
                (
                        //����ʯ
                        ItemList.dry_diamond = new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName(location("dry_diamond")),
                        //����ʯ��
                        ItemList.dry_diamond_block = new BlockItem(BlockList.dry_diamond_block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(BlockList.dry_diamond_block.getRegistryName()),
                        //����ʯ̨��
                        ItemList.dry_diamond_slab = new BlockItem(BlockList.dry_diamond_slab, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(BlockList.dry_diamond_slab.getRegistryName()),
                        //����ʯ¥��
                        ItemList.dry_diamond_stairs = new BlockItem(BlockList.dry_diamond_stairs, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(BlockList.dry_diamond_stairs.getRegistryName()),
                        //����ʯ��
                        ItemList.dry_diamond_stick = new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName(location("dry_diamond_stick")),
                        //����ʯ��ť
                        ItemList.dry_diamond_button = new BlockItem(BlockList.dry_diamond_button, new Item.Properties().group(ItemGroup.REDSTONE)).setRegistryName(BlockList.dry_diamond_button.getRegistryName()),
                        //����ʯդ��
                        ItemList.dry_diamond_fence = new BlockItem(BlockList.dry_diamond_fence, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(BlockList.dry_diamond_fence.getRegistryName()),
                        //����ʯѹ����
                        ItemList.dry_diamond_pressure_plate = new BlockItem(BlockList.dry_diamond_pressure_plate, new Item.Properties().group(ItemGroup.REDSTONE)).setRegistryName(BlockList.dry_diamond_pressure_plate.getRegistryName()),
                        //����ʯ��
                        ItemList.dry_diamond_ore = new BlockItem(BlockList.dry_diamond_ore, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(BlockList.dry_diamond_ore.getRegistryName()),
                        //����ʯǽ
                        ItemList.dry_diamond_wall = new BlockItem(BlockList.dry_diamond_wall, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(BlockList.dry_diamond_wall.getRegistryName()),
                        //����ʯ��
                        ItemList.dry_diamond_door = new BlockItem(BlockList.dry_diamond_door, new Item.Properties().group(ItemGroup.REDSTONE)).setRegistryName(BlockList.dry_diamond_door.getRegistryName()),
                        //����ʯդ����
                        ItemList.dry_diamond_fence_gate = new BlockItem(BlockList.dry_diamond_fence_gate, new Item.Properties().group(ItemGroup.REDSTONE)).setRegistryName(BlockList.dry_diamond_fence_gate.getRegistryName()),
                        //����ʯ����
                        ItemList.dry_diamond_ladder = new BlockItem(BlockList.dry_diamond_ladder, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(BlockList.dry_diamond_ladder.getRegistryName()),
                        //��ʯ¥��
                        ItemList.diamond_stairs = new BlockItem(BlockList.diamond_stairs, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(BlockList.diamond_stairs.getRegistryName()),
                        //��ʯ̨��
                        ItemList.diamond_slab = new BlockItem(BlockList.diamond_slab, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(BlockList.diamond_slab.getRegistryName()),
                        //��ʯǽ
                        ItemList.diamond_wall = new BlockItem(BlockList.diamond_wall, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(BlockList.diamond_wall.getRegistryName()),
                        //��ʯ��
                        ItemList.diamond_stick = new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName(location("diamond_stick")),
                        //��ʯդ��
                        ItemList.diamond_fence = new BlockItem(BlockList.diamond_fence, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(BlockList.diamond_fence.getRegistryName()),
                        //��ʯ��ť
                        ItemList.diamond_button = new BlockItem(BlockList.diamond_button, new Item.Properties().group(ItemGroup.REDSTONE)).setRegistryName(BlockList.diamond_button.getRegistryName()),
                        //��ʯѹ����
                        ItemList.diamond_pressure_plate = new BlockItem(BlockList.diamond_pressure_plate, new Item.Properties().group(ItemGroup.REDSTONE)).setRegistryName(BlockList.diamond_pressure_plate.getRegistryName()),
                        //��ʯ��
                        ItemList.diamond_door = new BlockItem(BlockList.diamond_door, new Item.Properties().group(ItemGroup.REDSTONE)).setRegistryName(BlockList.diamond_door.getRegistryName()),
                        //��ʯ����
                        ItemList.diamond_ladder = new BlockItem(BlockList.diamond_ladder, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(BlockList.diamond_ladder.getRegistryName()),
                        //��ʯդ����
                        ItemList.diamond_fence_gate = new BlockItem(BlockList.diamond_fence_gate, new Item.Properties().group(ItemGroup.REDSTONE)).setRegistryName(BlockList.diamond_fence_gate.getRegistryName()),
                        //ԭ����ʯ��
                        ItemList.diamond_block_vanila = new BlockItem(BlockList.diamond_block_vanila, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(BlockList.diamond_block_vanila.getRegistryName()),
                        //ԭ����ʯ��
                        ItemList.diamond_ore_vanila = new BlockItem(BlockList.diamond_ore_vanila, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(BlockList.diamond_ore_vanila.getRegistryName()),

                        /*װ��*/
                        //����ʯͷ��
                        ItemList.dry_diamond_helmet = new ArmorItem(DryDiamondMaterial.MATERIAL, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT)).setRegistryName("dry_diamond_helmet"),
                        //����ʯ�ؼ�
                        ItemList.dry_diamond_chestplate = new ArmorItem(DryDiamondMaterial.MATERIAL, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT)).setRegistryName("dry_diamond_chestplate"),
                        //����ʯ����
                        ItemList.dry_diamond_leggings = new ArmorItem(DryDiamondMaterial.MATERIAL, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT)).setRegistryName("dry_diamond_leggings"),
                        //����ʯѥ��
                        ItemList.dry_diamond_boots = new ArmorItem(DryDiamondMaterial.MATERIAL, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT)).setRegistryName("dry_diamond_boots")
                );
    }

    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event)//������Ҫ��ItemList.java��BlockList.javaע��
    {
        event.getRegistry().registerAll//ע�᷽��
                (
                        //����ʯ��
                        BlockList.dry_diamond_block = new Block(Block.Properties.create(Material.IRON, MaterialColor.DIAMOND).hardnessAndResistance(3.0F, 4.0F).sound(SoundType.METAL)).setRegistryName(location("dry_diamond_block")),
                        //����ʯ̨��
                        BlockList.dry_diamond_slab = new SlabBlock(Block.Properties.from(BlockList.dry_diamond_block)).setRegistryName(location("dry_diamond_slab")),
                        //����ʯ¥��
                        BlockList.dry_diamond_stairs = new DryDiamondStairs(BlockList.dry_diamond_block.getDefaultState(), Block.Properties.from(BlockList.dry_diamond_block)).setRegistryName("dry_diamond_stairs"),
                        //����ʯդ��
                        BlockList.dry_diamond_fence = new FenceBlock(Block.Properties.from(BlockList.dry_diamond_block)).setRegistryName(location("dry_diamond_fence")),
                        //����ʯ��ť
                        BlockList.dry_diamond_button = new DryDiamondButton(Block.Properties.create(Material.IRON, MaterialColor.DIAMOND)).setRegistryName(location("dry_diamond_button")),
                        //����ʯѹ����
                        BlockList.dry_diamond_pressure_plate = new DryDiamondPressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.create(Material.IRON, MaterialColor.DIAMOND)).setRegistryName(location("dry_diamond_pressure_plate")),
                        //����ʯǽ
                        BlockList.dry_diamond_wall = new WallBlock(Block.Properties.from(BlockList.dry_diamond_block)).setRegistryName(location("dry_diamond_wall")),
                        //����ʯ��
                        BlockList.dry_diamond_ore = new DryDiamondOre(Block.Properties.from(Blocks.IRON_ORE)).setRegistryName(location("dry_diamond_ore")),
                        //����ʯ��
                        BlockList.dry_diamond_door = new DryDiamondDoor(Block.Properties.from(Blocks.OAK_DOOR)).setRegistryName(location("dry_diamond_door")),
                        //����ʯդ����
                        BlockList.dry_diamond_fence_gate = new FenceGateBlock(Block.Properties.from(BlockList.dry_diamond_block)).setRegistryName(location("dry_diamond_fence_gate")),
                        //����ʯ����
                        BlockList.dry_diamond_ladder = new DryDiamondLadder(Block.Properties.from(Blocks.LADDER)).setRegistryName("dry_diamond_ladder"),
                        //��ʯ¥��
                        BlockList.diamond_stairs = new DiamondStairs(Blocks.DIAMOND_BLOCK.getDefaultState(), Block.Properties.from(Blocks.DIAMOND_BLOCK).lightValue(14)).setRegistryName("diamond_stairs"),
                        //��ʯ̨��
                        BlockList.diamond_slab = new SlabBlock(Block.Properties.from(Blocks.DIAMOND_BLOCK).lightValue(14)).setRegistryName(location("diamond_slab")),
                        //��ʯǽ
                        BlockList.diamond_wall = new WallBlock(Block.Properties.from(Blocks.DIAMOND_BLOCK).lightValue(14)).setRegistryName(location("diamond_wall")),
                        //��ʯդ��
                        BlockList.diamond_fence = new FenceBlock(Block.Properties.from(Blocks.DIAMOND_BLOCK).lightValue(14)).setRegistryName(location("diamond_fence")),
                        //��ʯ��ť
                        BlockList.diamond_button = new DryDiamondButton(Block.Properties.create(Material.IRON, MaterialColor.DIAMOND).lightValue(14)).setRegistryName(location("diamond_button")),
                        //��ʯѹ����
                        BlockList.diamond_pressure_plate = new DryDiamondPressurePlate(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.IRON, MaterialColor.DIAMOND).lightValue(14)).setRegistryName(location("diamond_pressure_plate")),
                        //��ʯ��
                        BlockList.diamond_door = new DiamondDoor(Block.Properties.from(Blocks.IRON_DOOR).lightValue(14)).setRegistryName(location("diamond_door")),
                        //��ʯդ����
                        BlockList.diamond_fence_gate = new FenceGateBlock(Block.Properties.from(Blocks.DIAMOND_BLOCK).lightValue(14)).setRegistryName("diamond_fence_gate"),
                        //��ʯ����
                        BlockList.diamond_ladder = new DiamondLadder(Block.Properties.from(Blocks.LADDER).lightValue(14)).setRegistryName("diamond_ladder"),
                        //ԭ����ʯ��
                        BlockList.diamond_block_vanila = new Block(Block.Properties.from(Blocks.DIAMOND_BLOCK).lightValue(14)).setRegistryName("minecraft:diamond_block"),
                        //ԭ����ʯ��
                        BlockList.diamond_ore_vanila = new Block(Block.Properties.from(Blocks.DIAMOND_ORE).lightValue(5)).setRegistryName("minecraft:diamond_ore")
                );
    }
/*
  ԭ����ʯ�飺
  Block.Properties.from(Blocks.DIAMOND_BLOCK)
  ������Ϸԭ����ʯ�����ݣ�����ģ����ԭ����Ϸ֮����أ�����Ϊ�ȵ���ԭ�����ݺ����lightValue�ٸ��ǣ��ɼ����Ϊ�޸�ԭ�����ݣ�

  lightValue(14)
  �������ֵΪ14������һ��

  setRegistryName("minecraft:diamond_block")
  ����ע�����ƣ��ر�ָ��minecraft�����ռ䣬����ԭ��minecraft�ռ䷽�� ��ʯ�飨������Ҳ����ֱ�Ӹ�������ģ�鷽�飬ָ�������ռ伴�ɣ�

  ������������Ҳ������ͬ�������Ժ����.lightValue()����
  ����Block.Properties.from(Blocks.IRON_BLOCK).lightValue(14)
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

    //����ʯװ�� ����
    //2.1�汾��ʼ������ʯװ����ʹ���������ݣ��������ݻ�����������
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
