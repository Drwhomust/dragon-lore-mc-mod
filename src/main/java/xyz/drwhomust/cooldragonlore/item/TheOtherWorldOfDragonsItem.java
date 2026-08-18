package xyz.drwhomust.cooldragonlore.item;

import xyz.drwhomust.cooldragonlore.block.TheOtherWorldOfDragonsPortalBlock;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;
import net.minecraft.core.BlockPos;

public class TheOtherWorldOfDragonsItem extends Item {
	public TheOtherWorldOfDragonsItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC).durability(64));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		Player entity = context.getPlayer();
		BlockPos pos = context.getClickedPos().relative(context.getClickedFace());
		ItemStack itemstack = context.getItemInHand();
		Level world = context.getLevel();
		if (!entity.mayUseItemAt(pos, context.getClickedFace(), itemstack)) {
			return InteractionResult.FAIL;
		} else {
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			boolean success = false;
			if (world.isEmptyBlock(pos) && true) {
				TheOtherWorldOfDragonsPortalBlock.portalSpawn(world, pos);
				itemstack.hurtAndBreak(1, entity, context.getHand().asEquipmentSlot());
				success = true;
			}
			return success ? InteractionResult.SUCCESS : InteractionResult.FAIL;
		}
	}
}