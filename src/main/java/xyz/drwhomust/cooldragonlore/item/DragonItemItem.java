package xyz.drwhomust.cooldragonlore.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class DragonItemItem extends Item {
	public DragonItemItem(Item.Properties properties) {
		super(properties);
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}