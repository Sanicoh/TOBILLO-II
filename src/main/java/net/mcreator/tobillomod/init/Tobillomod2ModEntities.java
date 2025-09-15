/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tobillomod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.tobillomod.entity.PolishCowEntity;
import net.mcreator.tobillomod.entity.BoarEntity;
import net.mcreator.tobillomod.Tobillomod2Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Tobillomod2ModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Tobillomod2Mod.MODID);
	public static final RegistryObject<EntityType<PolishCowEntity>> POLISH_COW = register("polish_cow",
			EntityType.Builder.<PolishCowEntity>of(PolishCowEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PolishCowEntity::new)

					.sized(0.9f, 1.4f));
	public static final RegistryObject<EntityType<BoarEntity>> BOAR = register("boar",
			EntityType.Builder.<BoarEntity>of(BoarEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BoarEntity::new)

					.sized(0.6f, 1.8f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			PolishCowEntity.init();
			BoarEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(POLISH_COW.get(), PolishCowEntity.createAttributes().build());
		event.put(BOAR.get(), BoarEntity.createAttributes().build());
	}
}