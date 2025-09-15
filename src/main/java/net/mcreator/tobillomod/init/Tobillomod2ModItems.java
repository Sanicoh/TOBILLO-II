/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tobillomod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.tobillomod.item.TulamagicaItem;
import net.mcreator.tobillomod.item.PurifiedFleshItem;
import net.mcreator.tobillomod.item.MandarinaItem;
import net.mcreator.tobillomod.Tobillomod2Mod;

public class Tobillomod2ModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, Tobillomod2Mod.MODID);
	public static final RegistryObject<Item> POLISH_COW_SPAWN_EGG = REGISTRY.register("polish_cow_spawn_egg", () -> new ForgeSpawnEggItem(Tobillomod2ModEntities.POLISH_COW, -1, -16777216, new Item.Properties()));
	public static final RegistryObject<Item> PURIFIED_FLESH = REGISTRY.register("purified_flesh", () -> new PurifiedFleshItem());
	public static final RegistryObject<Item> BOAR_SPAWN_EGG = REGISTRY.register("boar_spawn_egg", () -> new ForgeSpawnEggItem(Tobillomod2ModEntities.BOAR, -12636126, -11713236, new Item.Properties()));
	public static final RegistryObject<Item> MANDARINA = REGISTRY.register("mandarina", () -> new MandarinaItem());
	public static final RegistryObject<Item> TULAMAGICA = REGISTRY.register("tulamagica", () -> new TulamagicaItem());
	// Start of user code block custom items
	// End of user code block custom items
}