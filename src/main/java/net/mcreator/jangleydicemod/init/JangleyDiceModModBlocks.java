
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jangleydicemod.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.jangleydicemod.block.DiceBlockBlock;
import net.mcreator.jangleydicemod.block.DiceBlock6Block;
import net.mcreator.jangleydicemod.block.DiceBlock5Block;
import net.mcreator.jangleydicemod.block.DiceBlock4Block;
import net.mcreator.jangleydicemod.block.DiceBlock3Block;
import net.mcreator.jangleydicemod.block.DiceBlock2Block;
import net.mcreator.jangleydicemod.JangleyDiceModMod;

public class JangleyDiceModModBlocks {
	public static Block DICE_BLOCK;
	public static Block DICE_BLOCK_2;
	public static Block DICE_BLOCK_3;
	public static Block DICE_BLOCK_4;
	public static Block DICE_BLOCK_5;
	public static Block DICE_BLOCK_6;

	public static void load() {
		DICE_BLOCK = register("dice_block", new DiceBlockBlock());
		DICE_BLOCK_2 = register("dice_block_2", new DiceBlock2Block());
		DICE_BLOCK_3 = register("dice_block_3", new DiceBlock3Block());
		DICE_BLOCK_4 = register("dice_block_4", new DiceBlock4Block());
		DICE_BLOCK_5 = register("dice_block_5", new DiceBlock5Block());
		DICE_BLOCK_6 = register("dice_block_6", new DiceBlock6Block());
	}

	public static void clientLoad() {
		DiceBlockBlock.clientInit();
		DiceBlock2Block.clientInit();
		DiceBlock3Block.clientInit();
		DiceBlock4Block.clientInit();
		DiceBlock5Block.clientInit();
		DiceBlock6Block.clientInit();
	}

	private static Block register(String registryName, Block block) {
		return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(JangleyDiceModMod.MODID, registryName), block);
	}
}
