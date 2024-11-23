package net.bon.soulfulnether.block.custom;

import net.bon.soulfulnether.util.SoulfulBlockTags;
import net.minecraft.block.*;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.state.property.Property;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.Nullable;

public class HangingEmberRootsBlock extends PlantBlock {
    public static final BooleanProperty HANGING;
    protected static final VoxelShape STANDING_SHAPE;
    protected static final VoxelShape HANGING_SHAPE;

    public HangingEmberRootsBlock(AbstractBlock.Settings settings) {
        super(settings);
        this.setDefaultState((BlockState)((BlockState)this.stateManager.getDefaultState()).with(HANGING, false));
    }

    @Nullable
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        Direction[] var3 = ctx.getPlacementDirections();
        int var4 = var3.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            Direction direction = var3[var5];
            if (direction.getAxis() == Direction.Axis.Y) {
                BlockState blockState = (BlockState)this.getDefaultState().with(HANGING, direction == Direction.UP);
                if (blockState.canPlaceAt(ctx.getWorld(), ctx.getBlockPos()));
                return (BlockState)blockState.with(HANGING, direction == Direction.UP);
            }
        }

        return null;
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return (Boolean)state.get(HANGING) ? HANGING_SHAPE : STANDING_SHAPE;
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{HANGING});
    }

    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        Direction direction = attachedDirection(state).getOpposite();
        BlockPos blockPos = pos.offset(direction);
        return Block.sideCoversSmallSquare(world, blockPos, direction.getOpposite()) && this.canPlantOnTop(world.getBlockState(blockPos), world, blockPos);
    }

    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isOf(Blocks.BASALT) || floor.isIn(SoulfulBlockTags.VALID_ROOT_BASES) || super.canPlantOnTop(floor, world, pos);
    }

    protected static Direction attachedDirection(BlockState state) {
        return (Boolean)state.get(HANGING) ? Direction.DOWN : Direction.UP;
    }

    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        return attachedDirection(state).getOpposite() == direction && !state.canPlaceAt(world, pos) ? Blocks.AIR.getDefaultState() : super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return true;
    }

    static {
        HANGING = Properties.HANGING;
        STANDING_SHAPE = Block.createCuboidShape(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);
        HANGING_SHAPE = Block.createCuboidShape(2.0, 3.0, 2.0, 14.0, 16.0, 14.0);
    }
}