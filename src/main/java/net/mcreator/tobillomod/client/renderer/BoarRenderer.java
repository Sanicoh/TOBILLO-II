package net.mcreator.tobillomod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.tobillomod.entity.BoarEntity;
import net.mcreator.tobillomod.client.model.ModelJabaliTobilloDossssssshhhh;

public class BoarRenderer extends MobRenderer<BoarEntity, ModelJabaliTobilloDossssssshhhh<BoarEntity>> {
	public BoarRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelJabaliTobilloDossssssshhhh<BoarEntity>(context.bakeLayer(ModelJabaliTobilloDossssssshhhh.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BoarEntity entity) {
		return ResourceLocation.parse("tobillomod_2:textures/entities/textura_jabali_tobillo_dos_otra_vezzz.png");
	}
}