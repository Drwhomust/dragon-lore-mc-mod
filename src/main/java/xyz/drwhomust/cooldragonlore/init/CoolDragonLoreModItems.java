/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package xyz.drwhomust.cooldragonlore.init;

import xyz.drwhomust.cooldragonlore.item.TheOtherWorldOfDragonsItem;
import xyz.drwhomust.cooldragonlore.item.DragonItemItem;
import xyz.drwhomust.cooldragonlore.CoolDragonLoreMod;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import java.util.function.Function;

public class CoolDragonLoreModItems {
	public static Item THE_OTHER_WORLD_OF_DRAGONS;
	public static Item DRAGONITE;
	public static Item DRAGON_ITEM;
	public static Item DRAGON_BLOCKS;

	public static void load() {
		THE_OTHER_WORLD_OF_DRAGONS = register("the_other_world_of_dragons", TheOtherWorldOfDragonsItem::new);
		DRAGONITE = block(CoolDragonLoreModBlocks.DRAGONITE, "dragonite", new Item.Properties().rarity(Rarity.UNCOMMON));
		DRAGON_ITEM = register("dragon_item", DragonItemItem::new);
		DRAGON_BLOCKS = block(CoolDragonLoreModBlocks.DRAGON_BLOCKS, "dragon_blocks", new Item.Properties().rarity(Rarity.UNCOMMON));
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> I register(String name, Function<Item.Properties, ? extends I> supplier) {
		return (I) Items.registerItem(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(CoolDragonLoreMod.MODID, name)), (Function<Item.Properties, Item>) supplier);
	}

	private static Item block(Block block, String name) {
		return block(block, name, new Item.Properties());
	}

	private static Item block(Block block, String name, Item.Properties properties) {
		return Items.registerItem(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(CoolDragonLoreMod.MODID, name)), prop -> new BlockItem(block, prop), properties);
	}
}