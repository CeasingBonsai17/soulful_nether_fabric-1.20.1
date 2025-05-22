package net.bon.soulfulnether.block.type;

import net.bon.soulfulnether.block.SoulfulBlocks;
import net.bon.soulfulnether.util.SoulfulBlockTags;
import net.minecraft.block.*;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.state.property.Property;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.Nullable;

public class EmberRootsBlock  extends Block {
    public static final BooleanProperty HANGING;
    protected static final VoxelShape SHAPE;
    protected static final VoxelShape HANGING_SHAPE;

    public EmberRootsBlock(AbstractBlock.Settings properties) {
        super(properties);
        this.setDefaultState((BlockState)((BlockState)this.getDefaultState()).with(HANGING, false));
    }

    @Nullable
    public BlockState getPlacementState(ItemPlacementContext context) {
        Direction[] var3 = context.getPlacementDirections();
        int var4 = var3.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            Direction $$2 = var3[var5];
            if ($$2.getAxis() == Direction.Axis.Y) {
                BlockState $$3 = (BlockState)this.getDefaultState().with(HANGING, $$2 == Direction.UP);
                if ($$3.canPlaceAt(context.getWorld(), context.getBlockPos()));
                return (BlockState)$$3.with(HANGING, $$2 == Direction.UP);
            }
        }

        return null;
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView blockGetter, BlockPos pos, ShapeContext context) {
        return (Boolean)state.get(HANGING) ? HANGING_SHAPE : SHAPE;
    }

    public boolean canPlaceAt(BlockState state, WorldView level, BlockPos pos) {
        Direction $$3 = getConnectedDirection(state).getOpposite();
        return canPlantOnTop(level, pos.offset($$3), $$3.getOpposite());
    }

    public static boolean canPlantOnTop(WorldView level, BlockPos pos, Direction direction) {
        BlockState blockstate = level.getBlockState(pos);
        return direction == Direction.DOWN && blockstate.isOf(Blocks.BASALT) || blockstate.isOf(SoulfulBlocks.FRIGHT_WART_BLOCK) ||
                blockstate.isIn(SoulfulBlockTags.VALID_ROOT_BASES) || blockstate.isIn(BlockTags.DIRT) || blockstate.isOf(Blocks.FARMLAND);
    }

    protected static Direction getConnectedDirection(BlockState state) {
        return (Boolean)state.get(HANGING) ? Direction.DOWN : Direction.UP;
    }

    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState blockState, WorldAccess level, BlockPos pos, BlockPos blockPos) {
        return getConnectedDirection(state).getOpposite() == direction && !state.canPlaceAt(level, pos) ? Blocks.AIR.getDefaultState() : super.getStateForNeighborUpdate(state, direction, blockState, level, pos, blockPos);
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> state) {
        state.add(new Property[]{HANGING});
    }

    static {
        HANGING = Properties.HANGING;
        SHAPE = Block.createCuboidShape(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);
        HANGING_SHAPE = Block.createCuboidShape(2.0, 3.0, 2.0, 14.0, 16.0, 14.0);
    }
}