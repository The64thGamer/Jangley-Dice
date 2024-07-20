
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jangleydicemod.init;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

public class JangleyDiceModModSounds {
	public static SoundEvent DICE_ROLL = SoundEvent.createVariableRangeEvent(new ResourceLocation("jangley_dice_mod", "dice_roll"));

	public static void load() {
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("jangley_dice_mod", "dice_roll"), DICE_ROLL);
	}
}
