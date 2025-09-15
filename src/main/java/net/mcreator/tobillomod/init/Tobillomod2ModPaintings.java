/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tobillomod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import net.mcreator.tobillomod.Tobillomod2Mod;

public class Tobillomod2ModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, Tobillomod2Mod.MODID);
	public static final RegistryObject<PaintingVariant> LIZARDMAN_PAINTING = REGISTRY.register("lizardman_painting", () -> new PaintingVariant(32, 32));
	public static final RegistryObject<PaintingVariant> BOAR_PAINTING = REGISTRY.register("boar_painting", () -> new PaintingVariant(32, 32));
}