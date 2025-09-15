package net.mcreator.tobillomod.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelJabaliTobilloDossssssshhh<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("tobillomod_2", "model_jabali_tobillo_dossssssshhh"), "main");
	public final ModelPart root;
	public final ModelPart head;
	public final ModelPart Orejaderecha;
	public final ModelPart OrejaIzquierda;
	public final ModelPart body;
	public final ModelPart Colinha;
	public final ModelPart Pelinho;
	public final ModelPart Pelinhodosh;
	public final ModelPart pelinhotresh;
	public final ModelPart piernatraseraderecha;
	public final ModelPart Piernadelanteraizquierda;
	public final ModelPart piernadelanteraderecha;
	public final ModelPart piernatraseraizquierda;
	public final ModelPart bb_main;

	public ModelJabaliTobilloDossssssshhh(ModelPart root) {
		this.root = root.getChild("root");
		this.head = this.root.getChild("head");
		this.Orejaderecha = this.head.getChild("Orejaderecha");
		this.OrejaIzquierda = this.head.getChild("OrejaIzquierda");
		this.body = this.root.getChild("body");
		this.Colinha = root.getChild("Colinha");
		this.Pelinho = root.getChild("Pelinho");
		this.Pelinhodosh = root.getChild("Pelinhodosh");
		this.pelinhotresh = root.getChild("pelinhotresh");
		this.piernatraseraderecha = root.getChild("piernatraseraderecha");
		this.Piernadelanteraizquierda = root.getChild("Piernadelanteraizquierda");
		this.piernadelanteraderecha = root.getChild("piernadelanteraderecha");
		this.piernatraseraizquierda = root.getChild("piernatraseraizquierda");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, 22.0F, 0.0F));
		PartDefinition head = root.addOrReplaceChild("head", CubeListBuilder.create().texOffs(38, 28).addBox(-5.0F, -5.0F, -9.0F, 10.0F, 10.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(44, 0)
				.addBox(-4.0F, 0.0F, -14.0F, 8.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(44, 23).addBox(-4.0F, 0.0F, -15.0F, 8.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -12.0F, -10.0F));
		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(20, 59).addBox(0.0F, -4.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 4.0F, -11.0F, 3.1416F, 0.0F, 2.9671F));
		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(32, 55).addBox(-1.0F, -4.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 4.0F, -11.0F, 3.1416F, 0.0F, -2.9671F));
		PartDefinition Orejaderecha = head.addOrReplaceChild("Orejaderecha", CubeListBuilder.create(), PartPose.offset(-4.0F, -5.0F, -3.0F));
		PartDefinition cube_r3 = Orejaderecha.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(26, 55).addBox(0.2136F, -3.1373F, -0.2848F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.0485F, 0.1137F, 2.7629F));
		PartDefinition OrejaIzquierda = head.addOrReplaceChild("OrejaIzquierda", CubeListBuilder.create(), PartPose.offset(5.0F, -5.0F, -3.0F));
		PartDefinition cube_r4 = OrejaIzquierda.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(20, 55).addBox(-2.0F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, -2.017F, -0.1932F, -2.865F));
		PartDefinition body = root.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, -11.0F, 9.0F));
		PartDefinition body_r1 = body.addOrReplaceChild("body_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -19.0F, -5.0F, 12.0F, 18.0F, 10.0F, new CubeDeformation(0.5F)).texOffs(0, 28).addBox(-5.0F, -19.0F, -5.0F, 10.0F, 18.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));
		PartDefinition Colinha = partdefinition.addOrReplaceChild("Colinha", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 11.0F, 8.0F, 0.5236F, 0.0F, 0.0F));
		PartDefinition cube_r5 = Colinha.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(82, 26).addBox(-2.0F, 0.1955F, -1.4242F, 4.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.1699F, 0.2942F, 0.6545F, 0.0F, 0.0F));
		PartDefinition Pelinho = partdefinition.addOrReplaceChild("Pelinho", CubeListBuilder.create(), PartPose.offset(5.0F, 22.0F, 0.0F));
		PartDefinition Pelinhodosh = partdefinition.addOrReplaceChild("Pelinhodosh", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition pelinhotresh = partdefinition.addOrReplaceChild("pelinhotresh", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition piernatraseraderecha = partdefinition.addOrReplaceChild("piernatraseraderecha", CubeListBuilder.create().texOffs(0, 55).addBox(-2.0F, 0.0F, -2.0F, 5.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.0F, 16.0F, 6.0F));
		PartDefinition Piernadelanteraizquierda = partdefinition.addOrReplaceChild("Piernadelanteraizquierda", CubeListBuilder.create().texOffs(0, 55).addBox(-3.0F, -1.0F, -2.0F, 5.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.0F, 17.0F, -6.0F));
		PartDefinition piernadelanteraderecha = partdefinition.addOrReplaceChild("piernadelanteraderecha", CubeListBuilder.create().texOffs(0, 55).addBox(-2.0F, 0.0F, -3.0F, 5.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.0F, 16.0F, -5.0F));
		PartDefinition piernatraseraizquierda = partdefinition.addOrReplaceChild("piernatraseraizquierda", CubeListBuilder.create().texOffs(0, 55).addBox(-2.0F, 0.0F, -2.0F, 5.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.0F, 16.0F, 6.0F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(77, 37).addBox(0.0F, -20.0F, -9.0F, 0.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(77, 37).addBox(1.0F, -20.0F, -9.0F, 0.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(77, 37)
						.addBox(-1.0F, -20.0F, -9.0F, 0.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(77, 37).addBox(1.0F, -20.0F, -3.0F, 0.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(77, 37)
						.addBox(0.0F, -20.0F, -3.0F, 0.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(77, 37).addBox(-1.0F, -20.0F, -3.0F, 0.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r6 = bb_main.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(82, 58).addBox(-1.0F, -2.0F, -4.0F, 0.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(82, 58)
				.addBox(0.0F, -2.0F, -4.0F, 0.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(82, 58).addBox(1.0F, -2.0F, -4.0F, 0.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -18.0F, -13.0F, 0.1309F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		root.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Colinha.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Pelinho.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Pelinhodosh.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		pelinhotresh.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		piernatraseraderecha.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Piernadelanteraizquierda.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		piernadelanteraderecha.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		piernatraseraizquierda.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.piernatraseraizquierda.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.piernatraseraderecha.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.piernadelanteraderecha.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.Piernadelanteraizquierda.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}