/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jangleydicemod.init;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.client.renderer.item.ClampedItemPropertyFunction;

import net.mcreator.jangleydicemod.JangleyDiceModMod;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class JangleyDiceModModItems {
	public static Item DICE_BLOCK;
	public static Item DICE_BLOCK_2;
	public static Item DICE_BLOCK_3;
	public static Item DICE_BLOCK_4;
	public static Item DICE_BLOCK_5;
	public static Item DICE_BLOCK_6;

	public static void load() {
		DICE_BLOCK = register("dice_block", new BlockItem(JangleyDiceModModBlocks.DICE_BLOCK, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.REDSTONE_BLOCKS).register(content -> content.accept(DICE_BLOCK));
		DICE_BLOCK_2 = register("dice_block_2", new BlockItem(JangleyDiceModModBlocks.DICE_BLOCK_2, new Item.Properties()));
		DICE_BLOCK_3 = register("dice_block_3", new BlockItem(JangleyDiceModModBlocks.DICE_BLOCK_3, new Item.Properties()));
		DICE_BLOCK_4 = register("dice_block_4", new BlockItem(JangleyDiceModModBlocks.DICE_BLOCK_4, new Item.Properties()));
		DICE_BLOCK_5 = register("dice_block_5", new BlockItem(JangleyDiceModModBlocks.DICE_BLOCK_5, new Item.Properties()));
		DICE_BLOCK_6 = register("dice_block_6", new BlockItem(JangleyDiceModModBlocks.DICE_BLOCK_6, new Item.Properties()));
	}

	public static void clientLoad() {
	}

	private static Item register(String registryName, Item item) {
		return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(JangleyDiceModMod.MODID, registryName), item);
	}

	private static void registerBlockingProperty(Item item) {
		ItemProperties.register(item, new ResourceLocation("blocking"), (ClampedItemPropertyFunction) ItemProperties.getProperty(Items.SHIELD, new ResourceLocation("blocking")));
	}
}
