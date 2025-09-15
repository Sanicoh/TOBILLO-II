/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tobillomod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.tobillomod.Tobillomod2Mod;

public class Tobillomod2ModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Tobillomod2Mod.MODID);
	public static final RegistryObject<SoundEvent> POLISHCOWDEATH = REGISTRY.register("polishcowdeath", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("tobillomod_2", "polishcowdeath")));
	public static final RegistryObject<SoundEvent> POLISHCOWAMBIENT = REGISTRY.register("polishcowambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("tobillomod_2", "polishcowambient")));
	public static final RegistryObject<SoundEvent> POLISHCOWHURT = REGISTRY.register("polishcowhurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("tobillomod_2", "polishcowhurt")));
	public static final RegistryObject<SoundEvent> VACAPOLACASONIDODEMUERTE = REGISTRY.register("vacapolacasonidodemuerte", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("tobillomod_2", "vacapolacasonidodemuerte")));
	public static final RegistryObject<SoundEvent> VACAESNIFFE = REGISTRY.register("vacaesniffe", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("tobillomod_2", "vacaesniffe")));
	public static final RegistryObject<SoundEvent> POLISHCOWHURT2 = REGISTRY.register("polishcowhurt2", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("tobillomod_2", "polishcowhurt2")));
	public static final RegistryObject<SoundEvent> MANDARINA = REGISTRY.register("mandarina", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("tobillomod_2", "mandarina")));
}