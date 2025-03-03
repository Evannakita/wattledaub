package evannakita.wattledaub.block;

import evannakita.wattledaub.ModBlocks;
import evannakita.wattledaub.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.PaneBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

public class WattleBlock extends PaneBlock {

    public WattleBlock(Settings settings) {
        super(settings);
    }

	public BlockState getPlacementState(World world, BlockPos blockPos) {
		BlockPos blockPos2 = blockPos.north();
		BlockPos blockPos3 = blockPos.south();
		BlockPos blockPos4 = blockPos.west();
		BlockPos blockPos5 = blockPos.east();
		BlockState blockState = world.getBlockState(blockPos2);
		BlockState blockState2 = world.getBlockState(blockPos3);
		BlockState blockState3 = world.getBlockState(blockPos4);
		BlockState blockState4 = world.getBlockState(blockPos5);
		return this.getDefaultState()
			.with(NORTH, Boolean.valueOf(this.connectsTo(blockState, blockState.isSideSolidFullSquare(world, blockPos2, Direction.SOUTH))))
			.with(SOUTH, Boolean.valueOf(this.connectsTo(blockState2, blockState2.isSideSolidFullSquare(world, blockPos3, Direction.NORTH))))
			.with(WEST, Boolean.valueOf(this.connectsTo(blockState3, blockState3.isSideSolidFullSquare(world, blockPos4, Direction.EAST))))
			.with(EAST, Boolean.valueOf(this.connectsTo(blockState4, blockState4.isSideSolidFullSquare(world, blockPos5, Direction.WEST))));
	}

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!world.isClient) {
            ItemStack itemStack = player.getStackInHand(hand);
            Block newBlock = this;
            if (itemStack.isOf(ModItems.CLAY_DAUB_BALL)) {
                newBlock = ModBlocks.SCATTERED_CLAY_DAUB;
            } else if (itemStack.isOf(ModItems.COARSE_CLAY_DAUB_BALL)) {
                newBlock = ModBlocks.SCATTERED_CLAY_DAUB;
            } else if (itemStack.isOf(ModItems.MUD_DAUB_BALL)) {
                newBlock = ModBlocks.SCATTERED_CLAY_DAUB;
            } else if (itemStack.isOf(ModItems.PACKED_MUD_DAUB_BALL)) {
                newBlock = ModBlocks.SCATTERED_CLAY_DAUB;
            } else if (itemStack.isOf(ModItems.SAND_DAUB_BALL)) {
                newBlock = ModBlocks.SCATTERED_CLAY_DAUB;
            }
            if (newBlock != this) {
                world.setBlockState(pos, newBlock.getDefaultState(), Block.NOTIFY_ALL);
                world.playSound(null, pos, SoundEvents.BLOCK_MUD_PLACE, SoundCategory.BLOCKS, 0.75f, 1.0f);
                if (!player.isCreative()) {
                    itemStack.decrement(1);
                }
				player.incrementStat(Stats.USED.getOrCreateStat(itemStack.getItem()));
                return ActionResult.success(world.isClient);
            }
        }
        return ActionResult.PASS;
    }
}
