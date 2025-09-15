package net.mcreator.tobillomod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.CowModel;

import net.mcreator.tobillomod.entity.PolishCowEntity;
import net.mcreator.tobillomod.client.model.animations.aggressivemodeanimationAnimation;
import net.mcreator.tobillomod.client.model.animations.VakacaminandoAnimation;

public class PolishCowRenderer extends MobRenderer<PolishCowEntity, CowModel<PolishCowEntity>> {
	public PolishCowRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(ModelLayers.COW)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PolishCowEntity entity) {
		return ResourceLocation.parse("tobillomod_2:textures/entities/textura_vaca_polaca_2.png");
	}

	private static final class AnimatedModel extends CowModel<PolishCowEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<PolishCowEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(PolishCowEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animateWalk(VakacaminandoAnimation.walkanimation, limbSwing, limbSwingAmount, 1f, 1f);
				this.animate(entity.animationState1, aggressivemodeanimationAnimation.animation, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(PolishCowEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}