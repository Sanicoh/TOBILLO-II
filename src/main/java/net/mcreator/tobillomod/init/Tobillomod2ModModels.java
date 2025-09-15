/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tobillomod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.tobillomod.client.model.ModeloDeLaVakonciaPolaca;
import net.mcreator.tobillomod.client.model.ModelJabaliTobilloDossssssshhhh;
import net.mcreator.tobillomod.client.model.ModelJabaliTobilloDossssssshhh;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class Tobillomod2ModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelJabaliTobilloDossssssshhhh.LAYER_LOCATION, ModelJabaliTobilloDossssssshhhh::createBodyLayer);
		event.registerLayerDefinition(ModeloDeLaVakonciaPolaca.LAYER_LOCATION, ModeloDeLaVakonciaPolaca::createBodyLayer);
		event.registerLayerDefinition(ModelJabaliTobilloDossssssshhh.LAYER_LOCATION, ModelJabaliTobilloDossssssshhh::createBodyLayer);
	}
}