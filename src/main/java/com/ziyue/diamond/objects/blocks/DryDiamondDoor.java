package com.ziyue.diamond.objects.blocks;

import com.ziyue.diamond.Diamond;
import com.ziyue.diamond.init.ModBlocks;
import com.ziyue.diamond.init.ModItems;
import com.ziyue.diamond.util.IHasModel;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.Random;

public class DryDiamondDoor extends BlockDoor implements IHasModel {
        protected static final AxisAlignedBB SOUTH_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 0.1875D);
        protected static final AxisAlignedBB NORTH_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.8125D, 1.0D, 1.0D, 1.0D);
        protected static final AxisAlignedBB WEST_AABB = new AxisAlignedBB(0.8125D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
        protected static final AxisAlignedBB EAST_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 0.1875D, 1.0D, 1.0D);

        public DryDiamondDoor(String name)
        {
            super(Material.WOOD);
            setUnlocalizedName(name);
            setRegistryName(name);
            setHardness(4.0F);
            setResistance(5.0F);
            setLightLevel(1);
            setCreativeTab(CreativeTabs.REDSTONE);

            this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH).withProperty(OPEN, Boolean.valueOf(false)).withProperty(HINGE, EnumHingePosition.LEFT).withProperty(POWERED, Boolean.valueOf(false)).withProperty(HALF, EnumDoorHalf.LOWER));

            ModBlocks.BLOCKS.add(this);
            ModItems.ITEMS.add(new ItemDoor(this).setRegistryName(this.getRegistryName()));
        }

        @Override
        public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
        {
            state = state.getActualState(source, pos);
            EnumFacing enumfacing = (EnumFacing)state.getValue(FACING);
            boolean flag = !((Boolean)state.getValue(OPEN)).booleanValue();
            boolean flag1 = state.getValue(HINGE) == EnumHingePosition.RIGHT;
            switch(enumfacing)
            {
                case EAST:
                default:
                    return flag ? EAST_AABB : (flag1 ? NORTH_AABB : SOUTH_AABB);
                case SOUTH:
                    return flag ? SOUTH_AABB : (flag1 ? EAST_AABB : WEST_AABB);
                case WEST:
                    return flag ? WEST_AABB : (flag1 ? SOUTH_AABB : NORTH_AABB);
                case NORTH:
                    return flag ? NORTH_AABB : (flag1 ? WEST_AABB : EAST_AABB);
            }
        }

        @Override
        public boolean isFullCube(IBlockState state)
        {
            return false;
        }

        @Override
        public boolean isOpaqueCube(IBlockState state)
        {
            return false;
        }

        @Override
        public Item getItemDropped(IBlockState state, Random rand, int fortune)
        {
            return Item.getItemFromBlock(this);
        }

        @Override
        public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player)
        {
            return new ItemStack(Item.getItemFromBlock(this));
        }

    @Override
    public void registerModels() {
            Diamond.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
