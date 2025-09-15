/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tobillomod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.tobillomod.client.renderer.PolishCowRenderer;
import net.mcreator.tobillomod.client.renderer.BoarRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class Tobillomod2ModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(Tobillomod2ModEntities.POLISH_COW.get(), PolishCowRenderer::new);
		event.registerEntityRenderer(Tobillomod2ModEntities.BOAR.get(), BoarRenderer::new);
	}
}