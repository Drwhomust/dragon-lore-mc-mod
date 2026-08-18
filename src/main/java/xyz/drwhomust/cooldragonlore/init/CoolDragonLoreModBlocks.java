/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package xyz.drwhomust.cooldragonlore.init;

import xyz.drwhomust.cooldragonlore.block.TheOtherWorldOfDragonsPortalBlock;
import xyz.drwhomust.cooldragonlore.block.DragoniteBlock;
import xyz.drwhomust.cooldragonlore.block.DragonBlocksBlock;
import xyz.drwhomust.cooldragonlore.CoolDragonLoreMod;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import java.util.function.Function;

public class CoolDragonLoreModBlocks {
	public static Block THE_OTHER_WORLD_OF_DRAGONS_PORTAL;
	public static Block DRAGONITE;
	public static Block DRAGON_BLOCKS;

	public static void load() {
		THE_OTHER_WORLD_OF_DRAGONS_PORTAL = register("the_other_world_of_dragons_portal", TheOtherWorldOfDragonsPortalBlock::new);
		DRAGONITE = register("dragonite", DragoniteBlock::new);
		DRAGON_BLOCKS = register("dragon_blocks", DragonBlocksBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> B register(String name, Function<BlockBehaviour.Properties, B> supplier) {
		return (B) Blocks.register(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(CoolDragonLoreMod.MODID, name)), (Function<BlockBehaviour.Properties, Block>) supplier, BlockBehaviour.Properties.of());
	}
}