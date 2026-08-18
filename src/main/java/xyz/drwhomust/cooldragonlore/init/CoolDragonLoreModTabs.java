/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package xyz.drwhomust.cooldragonlore.init;

import xyz.drwhomust.cooldragonlore.CoolDragonLoreMod;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;

public class CoolDragonLoreModTabs {
	public static ResourceKey<CreativeModeTab> TAB_DRAGONS_LORE_STUFF = ResourceKey.create(Registries.CREATIVE_MODE_TAB, Identifier.fromNamespaceAndPath(CoolDragonLoreMod.MODID, "dragons_lore_stuff"));

	public static void load() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_DRAGONS_LORE_STUFF,
				CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0).title(Component.translatable("item_group.cool_dragon_lore.dragons_lore_stuff")).icon(() -> new ItemStack(Items.DRAGON_HEAD)).displayItems((parameters, tabData) -> {
					tabData.accept(CoolDragonLoreModItems.THE_OTHER_WORLD_OF_DRAGONS);
					tabData.accept(CoolDragonLoreModBlocks.DRAGONITE.asItem());
					tabData.accept(CoolDragonLoreModItems.DRAGON_ITEM);
					tabData.accept(CoolDragonLoreModBlocks.DRAGON_BLOCKS.asItem());
				}).build());
		CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.REDSTONE_BLOCKS).register(tabData -> {
			tabData.accept(CoolDragonLoreModItems.THE_OTHER_WORLD_OF_DRAGONS);
		});
		CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(tabData -> {
			tabData.accept(CoolDragonLoreModItems.THE_OTHER_WORLD_OF_DRAGONS);
		});
	}
}