package io.github.poisonsheep.wishingfountain.client.model.tileentity;// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import io.github.poisonsheep.wishingfountain.WishingFountain;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class WFNepModel extends EntityModel<Entity> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(WishingFountain.MODID, "main"), "wishing_fountain_nep_model");
	private final ModelPart bone;
	private final ModelPart bone9;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart bone5;
	private final ModelPart bone4;
	private final ModelPart bone6;
	private final ModelPart bone7;
	private final ModelPart bone8;
	private final ModelPart bone10;
	private final ModelPart bone11;
	private final ModelPart bone12;
	private final ModelPart bone13;
	private final ModelPart bone14;
	private final ModelPart bone15;
	private final ModelPart bone16;
	private final ModelPart bone17;
	private final ModelPart bone18;
	private final ModelPart bone21;
	private final ModelPart bone20;
	private final ModelPart bone19;
	private final ModelPart bone22;
	private final ModelPart bone23;
	private final ModelPart bone24;

	public WFNepModel(ModelPart root) {
		this.bone = root.getChild("bone");
		this.bone9 = root.getChild("bone9");
		this.bone2 = root.getChild("bone2");
		this.bone3 = root.getChild("bone3");
		this.bone5 = root.getChild("bone5");
		this.bone4 = root.getChild("bone4");
		this.bone6 = root.getChild("bone6");
		this.bone7 = root.getChild("bone7");
		this.bone8 = root.getChild("bone8");
		this.bone10 = root.getChild("bone10");
		this.bone11 = root.getChild("bone11");
		this.bone12 = root.getChild("bone12");
		this.bone13 = root.getChild("bone13");
		this.bone14 = root.getChild("bone14");
		this.bone15 = root.getChild("bone15");
		this.bone16 = root.getChild("bone16");
		this.bone17 = root.getChild("bone17");
		this.bone18 = root.getChild("bone18");
		this.bone21 = root.getChild("bone21");
		this.bone20 = root.getChild("bone20");
		this.bone19 = root.getChild("bone19");
		this.bone22 = root.getChild("bone22");
		this.bone23 = root.getChild("bone23");
		this.bone24 = root.getChild("bone24");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(176, 0).addBox(-5.0F, -29.0F, 24.0F, 10.0F, 4.0F, 17.0F, new CubeDeformation(0.0F))
		.texOffs(227, 2).addBox(5.0F, -29.0F, 24.0F, 3.0F, 4.0F, 19.0F, new CubeDeformation(0.0F))
		.texOffs(246, 282).addBox(5.0F, -25.0F, 24.0F, 3.0F, 11.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(270, 288).addBox(-8.0F, -25.0F, 24.0F, 3.0F, 11.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(0, 290).addBox(-8.0F, -15.0F, 24.0F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(43, 279).addBox(5.0F, -15.0F, 24.0F, 3.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(44, 237).addBox(-8.0F, -29.0F, 24.0F, 3.0F, 4.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(184, 255).addBox(-5.0F, -25.0F, 24.0F, 10.0F, 11.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(254, 25).addBox(-5.0F, -15.0F, 24.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(-16.0F, 37.0F, 0.0F));

		PartDefinition bone9 = partdefinition.addOrReplaceChild("bone9", CubeListBuilder.create().texOffs(215, 235).addBox(-8.0F, -15.0F, 24.0F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(70, 69).addBox(-6.0F, -29.0F, 24.0F, 12.0F, 4.0F, 23.0F, new CubeDeformation(0.0F))
		.texOffs(203, 111).addBox(6.0F, -29.0F, 24.0F, 2.0F, 4.0F, 21.0F, new CubeDeformation(0.0F))
		.texOffs(85, 261).addBox(5.0F, -25.0F, 24.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(258, 174).addBox(-8.0F, -25.0F, 24.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(213, 0).addBox(6.0F, -15.0F, 24.0F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(0, 203).addBox(-8.0F, -29.0F, 24.0F, 2.0F, 4.0F, 21.0F, new CubeDeformation(0.0F))
		.texOffs(212, 172).addBox(-5.0F, -25.0F, 24.0F, 10.0F, 11.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(0, 185).addBox(-6.0F, -15.0F, 24.0F, 12.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 37.0F, 0.0F));

		PartDefinition bone2 = partdefinition.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(112, 157).addBox(-8.0F, -29.0F, 24.0F, 16.0F, 4.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(271, 130).addBox(1.0F, -25.0F, 24.0F, 7.0F, 11.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(263, 246).addBox(-1.0F, -15.0F, 24.0F, 9.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(-32.0F, 37.0F, 0.0F));

		PartDefinition bone3 = partdefinition.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(172, 65).addBox(-5.0F, -29.0F, 24.0F, 10.0F, 4.0F, 17.0F, new CubeDeformation(0.0F))
		.texOffs(165, 224).addBox(-8.0F, -29.0F, 24.0F, 3.0F, 4.0F, 19.0F, new CubeDeformation(0.0F))
		.texOffs(19, 279).addBox(-8.0F, -25.0F, 24.0F, 3.0F, 11.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(285, 107).addBox(5.0F, -25.0F, 24.0F, 3.0F, 11.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(289, 207).addBox(5.0F, -15.0F, 24.0F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(225, 277).addBox(-8.0F, -15.0F, 24.0F, 3.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(231, 235).addBox(5.0F, -29.0F, 24.0F, 3.0F, 4.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(253, 228).addBox(-5.0F, -25.0F, 24.0F, 10.0F, 11.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(0, 253).addBox(-5.0F, -15.0F, 24.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(16.0F, 37.0F, 0.0F));

		PartDefinition bone5 = partdefinition.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(171, 87).addBox(-37.0F, -29.0F, -9.0F, 10.0F, 4.0F, 17.0F, new CubeDeformation(0.0F))
		.texOffs(121, 222).addBox(-27.0F, -29.0F, -11.0F, 3.0F, 4.0F, 19.0F, new CubeDeformation(0.0F))
		.texOffs(277, 187).addBox(-27.0F, -25.0F, -1.0F, 3.0F, 11.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(152, 283).addBox(-40.0F, -25.0F, 1.0F, 3.0F, 11.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(287, 235).addBox(-40.0F, -15.0F, -1.0F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(274, 75).addBox(-27.0F, -15.0F, -4.0F, 3.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(193, 235).addBox(-40.0F, -29.0F, -8.0F, 3.0F, 4.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(252, 0).addBox(-37.0F, -25.0F, 1.0F, 10.0F, 11.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(245, 162).addBox(-37.0F, -15.0F, -2.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-32.0F, 37.0F, -16.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition bone4 = partdefinition.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(64, 144).addBox(-8.0F, -29.0F, 24.0F, 16.0F, 4.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(267, 270).addBox(-8.0F, -25.0F, 24.0F, 7.0F, 11.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(113, 263).addBox(-8.0F, -15.0F, 24.0F, 9.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(32.0F, 37.0F, 0.0F));

		PartDefinition bone6 = partdefinition.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(0, 144).addBox(-8.0F, -29.0F, 24.0F, 16.0F, 4.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(149, 265).addBox(-8.0F, -25.0F, 33.0F, 7.0F, 11.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(255, 64).addBox(-8.0F, -15.0F, 31.0F, 9.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(32.0F, 37.0F, -64.0F));

		PartDefinition bone7 = partdefinition.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(142, 24).addBox(-8.0F, -29.0F, 24.0F, 16.0F, 4.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(0, 265).addBox(1.0F, -25.0F, 33.0F, 7.0F, 11.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(254, 37).addBox(-1.0F, -15.0F, 31.0F, 9.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(-32.0F, 37.0F, -64.0F));

		PartDefinition bone8 = partdefinition.addOrReplaceChild("bone8", CubeListBuilder.create().texOffs(170, 111).addBox(27.0F, -29.0F, -9.0F, 10.0F, 4.0F, 17.0F, new CubeDeformation(0.0F))
		.texOffs(77, 220).addBox(24.0F, -29.0F, -11.0F, 3.0F, 4.0F, 19.0F, new CubeDeformation(0.0F))
		.texOffs(276, 165).addBox(24.0F, -25.0F, -1.0F, 3.0F, 11.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(227, 25).addBox(37.0F, -25.0F, 1.0F, 3.0F, 11.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(287, 148).addBox(37.0F, -15.0F, -1.0F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(274, 6).addBox(24.0F, -15.0F, -4.0F, 3.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(233, 120).addBox(37.0F, -29.0F, -8.0F, 3.0F, 4.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(150, 247).addBox(27.0F, -25.0F, 1.0F, 10.0F, 11.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(243, 208).addBox(27.0F, -15.0F, -2.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(32.0F, 37.0F, -16.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition bone10 = partdefinition.addOrReplaceChild("bone10", CubeListBuilder.create().texOffs(190, 21).addBox(-8.0F, -15.0F, 26.0F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(0, 69).addBox(-6.0F, -29.0F, 17.0F, 12.0F, 4.0F, 23.0F, new CubeDeformation(0.0F))
		.texOffs(202, 23).addBox(6.0F, -29.0F, 19.0F, 2.0F, 4.0F, 21.0F, new CubeDeformation(0.0F))
		.texOffs(257, 108).addBox(5.0F, -25.0F, 29.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(257, 83).addBox(-8.0F, -25.0F, 29.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(37, 164).addBox(6.0F, -15.0F, 26.0F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(177, 199).addBox(-8.0F, -29.0F, 19.0F, 2.0F, 4.0F, 21.0F, new CubeDeformation(0.0F))
		.texOffs(210, 211).addBox(-5.0F, -25.0F, 27.0F, 10.0F, 11.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(172, 181).addBox(-6.0F, -15.0F, 24.0F, 12.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 37.0F, -64.0F));

		PartDefinition bone11 = partdefinition.addOrReplaceChild("bone11", CubeListBuilder.create().texOffs(160, 0).addBox(24.0F, -15.0F, -6.0F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(65, 8).addBox(26.0F, -29.0F, -15.0F, 12.0F, 4.0F, 23.0F, new CubeDeformation(0.0F))
		.texOffs(131, 197).addBox(38.0F, -29.0F, -13.0F, 2.0F, 4.0F, 21.0F, new CubeDeformation(0.0F))
		.texOffs(57, 257).addBox(37.0F, -25.0F, -3.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(29, 257).addBox(24.0F, -25.0F, -3.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(48, 144).addBox(38.0F, -15.0F, -6.0F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(85, 195).addBox(24.0F, -29.0F, -13.0F, 2.0F, 4.0F, 21.0F, new CubeDeformation(0.0F))
		.texOffs(209, 52).addBox(27.0F, -25.0F, -5.0F, 10.0F, 11.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(132, 179).addBox(26.0F, -15.0F, -8.0F, 12.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(32.0F, 37.0F, -32.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition bone12 = partdefinition.addOrReplaceChild("bone12", CubeListBuilder.create().texOffs(48, 120).addBox(-26.0F, -15.0F, -6.0F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(41, 42).addBox(-38.0F, -29.0F, -15.0F, 12.0F, 4.0F, 23.0F, new CubeDeformation(0.0F))
		.texOffs(60, 189).addBox(-40.0F, -29.0F, -13.0F, 2.0F, 4.0F, 21.0F, new CubeDeformation(0.0F))
		.texOffs(246, 255).addBox(-40.0F, -25.0F, -3.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(218, 255).addBox(-27.0F, -25.0F, -3.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(48, 96).addBox(-40.0F, -15.0F, -6.0F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(35, 185).addBox(-26.0F, -29.0F, -13.0F, 2.0F, 4.0F, 21.0F, new CubeDeformation(0.0F))
		.texOffs(208, 148).addBox(-37.0F, -25.0F, -5.0F, 10.0F, 11.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(92, 177).addBox(-38.0F, -15.0F, -8.0F, 12.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-32.0F, 37.0F, -32.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition bone13 = partdefinition.addOrReplaceChild("bone13", CubeListBuilder.create().texOffs(167, 140).addBox(-37.0F, -29.0F, -8.0F, 10.0F, 4.0F, 17.0F, new CubeDeformation(0.0F))
		.texOffs(52, 214).addBox(-40.0F, -29.0F, -8.0F, 3.0F, 4.0F, 19.0F, new CubeDeformation(0.0F))
		.texOffs(128, 274).addBox(-40.0F, -25.0F, -8.0F, 3.0F, 11.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(0, 203).addBox(-27.0F, -25.0F, -8.0F, 3.0F, 11.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(286, 279).addBox(-27.0F, -15.0F, -8.0F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(273, 93).addBox(-40.0F, -15.0F, -8.0F, 3.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(22, 233).addBox(-27.0F, -29.0F, -8.0F, 3.0F, 4.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(116, 245).addBox(-37.0F, -25.0F, -8.0F, 10.0F, 11.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(242, 52).addBox(-37.0F, -15.0F, -8.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(32.0F, 37.0F, -48.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition bone14 = partdefinition.addOrReplaceChild("bone14", CubeListBuilder.create().texOffs(165, 44).addBox(27.0F, -29.0F, -8.0F, 10.0F, 4.0F, 17.0F, new CubeDeformation(0.0F))
		.texOffs(27, 210).addBox(37.0F, -29.0F, -8.0F, 3.0F, 4.0F, 19.0F, new CubeDeformation(0.0F))
		.texOffs(104, 274).addBox(37.0F, -25.0F, -8.0F, 3.0F, 11.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(60, 185).addBox(24.0F, -25.0F, -8.0F, 3.0F, 11.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(284, 20).addBox(24.0F, -15.0F, -8.0F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(272, 48).addBox(37.0F, -15.0F, -8.0F, 3.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(232, 32).addBox(24.0F, -29.0F, -8.0F, 3.0F, 4.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(82, 243).addBox(27.0F, -25.0F, -8.0F, 10.0F, 11.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(241, 140).addBox(27.0F, -15.0F, -8.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-32.0F, 37.0F, -48.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition bone15 = partdefinition.addOrReplaceChild("bone15", CubeListBuilder.create().texOffs(54, 164).addBox(-5.0F, -29.0F, 23.0F, 10.0F, 4.0F, 17.0F, new CubeDeformation(0.0F))
		.texOffs(208, 76).addBox(-8.0F, -29.0F, 21.0F, 3.0F, 4.0F, 19.0F, new CubeDeformation(0.0F))
		.texOffs(201, 273).addBox(-8.0F, -25.0F, 31.0F, 3.0F, 11.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(72, 69).addBox(5.0F, -25.0F, 33.0F, 3.0F, 11.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(282, 62).addBox(5.0F, -15.0F, 31.0F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(271, 208).addBox(-8.0F, -15.0F, 28.0F, 3.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(0, 228).addBox(5.0F, -29.0F, 24.0F, 3.0F, 4.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(233, 76).addBox(-5.0F, -25.0F, 33.0F, 10.0F, 11.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(232, 196).addBox(-5.0F, -15.0F, 30.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(16.0F, 37.0F, -64.0F));

		PartDefinition bone16 = partdefinition.addOrReplaceChild("bone16", CubeListBuilder.create().texOffs(0, 164).addBox(-5.0F, -29.0F, 23.0F, 10.0F, 4.0F, 17.0F, new CubeDeformation(0.0F))
		.texOffs(47, 69).addBox(5.0F, -29.0F, 21.0F, 3.0F, 4.0F, 19.0F, new CubeDeformation(0.0F))
		.texOffs(177, 273).addBox(5.0F, -25.0F, 31.0F, 3.0F, 11.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(66, 0).addBox(-8.0F, -25.0F, 33.0F, 3.0F, 11.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(245, 174).addBox(-8.0F, -15.0F, 31.0F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(269, 148).addBox(5.0F, -15.0F, 28.0F, 3.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(110, 195).addBox(-8.0F, -29.0F, 24.0F, 3.0F, 4.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(146, 222).addBox(-5.0F, -25.0F, 33.0F, 10.0F, 11.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(202, 199).addBox(-5.0F, -15.0F, 30.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(-16.0F, 37.0F, -64.0F));

		PartDefinition bone17 = partdefinition.addOrReplaceChild("bone17", CubeListBuilder.create().texOffs(128, 128).addBox(-7.0F, 5.0F, 25.0F, 14.0F, 15.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(0, 31).addBox(-8.0F, 18.0F, 24.0F, 16.0F, 18.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(160, 161).addBox(-8.0F, 3.0F, 24.0F, 16.0F, 2.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-11.0F, -6.0F, 21.0F, 22.0F, 9.0F, 22.0F, new CubeDeformation(0.0F))
		.texOffs(66, 144).addBox(-12.0F, -3.0F, 30.0F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 3).addBox(-12.8F, -2.7F, 32.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(4, 20).addBox(-11.4F, -3.7F, 38.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 20).addBox(-11.4F, -3.7F, 25.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(88, 35).addBox(-9.0F, -8.0F, 23.0F, 18.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -12.0F, -32.0F));

		PartDefinition cube_r1 = bone17.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 96).addBox(-1.0F, -2.8153F, -3.3548F, 2.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -7.0383F, 25.487F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r2 = bone17.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(112, 2).addBox(-1.0F, -3.0F, -4.0F, 2.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -7.5F, 39.8F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r3 = bone17.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 65).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-12.0F, -0.2F, 32.6F, 0.0F, 0.0F, 0.4712F));

		PartDefinition cube_r4 = bone17.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(47, 69).addBox(-2.0F, -8.5F, -2.5F, 4.0F, 13.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.0F, -1.5F, 27.5F, 0.0F, 0.0F, 0.3491F));

		PartDefinition bone18 = partdefinition.addOrReplaceChild("bone18", CubeListBuilder.create().texOffs(124, 80).addBox(-8.0F, -7.0F, 8.0F, 16.0F, 8.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(64, 120).addBox(-24.0F, -7.0F, 8.0F, 16.0F, 8.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(0, 120).addBox(8.0F, -7.0F, 8.0F, 16.0F, 8.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(117, 55).addBox(8.0F, -7.0F, -8.0F, 16.0F, 8.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(112, 104).addBox(8.0F, -7.0F, -24.0F, 16.0F, 8.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(112, 0).addBox(-8.0F, -7.0F, -24.0F, 16.0F, 8.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(64, 96).addBox(-24.0F, -7.0F, -24.0F, 16.0F, 8.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(0, 96).addBox(-24.0F, -7.0F, -8.0F, 16.0F, 8.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 23.0F, 0.0F));

		PartDefinition bone21 = partdefinition.addOrReplaceChild("bone21", CubeListBuilder.create().texOffs(228, 99).addBox(-4.0F, -24.0F, -5.0F, 9.0F, 9.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(101, 220).addBox(-3.0F, -29.0F, -5.0F, 8.0F, 5.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(273, 257).addBox(-2.0F, -29.9F, -4.0F, 6.0F, 4.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(49, 31).addBox(-2.0F, -15.0F, -3.0F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(111, 56).addBox(-0.1F, -0.2F, -4.5F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -44.0F, 0.0F));

		PartDefinition cube_r5 = bone21.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(161, 159).addBox(-0.5F, -6.5F, -0.5F, 1.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5208F, -4.9F, -3.0056F, -0.1279F, -0.6074F, 0.1014F));

		PartDefinition cube_r6 = bone21.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(112, 144).addBox(-0.5F, -6.5F, -1.5F, 1.0F, 13.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9591F, -0.4904F, -5.508F, -2.5052F, -0.9889F, 2.4874F));

		PartDefinition cube_r7 = bone21.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(119, 143).addBox(-0.5F, -7.5F, -2.0F, 1.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0035F, 0.4797F, -3.9415F, -2.8054F, -0.8429F, 2.6454F));

		PartDefinition cube_r8 = bone21.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 144).addBox(-0.5F, -4.5F, -2.0F, 1.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.255F, -0.9859F, -5.7124F, -1.384F, -1.0716F, 1.4347F));

		PartDefinition cube_r9 = bone21.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 164).addBox(-0.5F, -6.5F, -2.5F, 1.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2428F, -6.1F, -3.7679F, -0.9505F, -1.4172F, 0.9845F));

		PartDefinition cube_r10 = bone21.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(140, 177).addBox(-0.5F, -7.5F, -1.5F, 1.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6572F, 2.4F, 5.5679F, 2.1482F, 1.2316F, 2.2503F));

		PartDefinition cube_r11 = bone21.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(132, 177).addBox(-0.5F, -7.5F, -1.5F, 1.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3572F, 2.4F, 5.5679F, 2.2791F, 1.2316F, 2.2503F));

		PartDefinition cube_r12 = bone21.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(168, 161).addBox(-0.5F, -4.0F, -1.5F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4059F, 1.414F, -6.7836F, -0.6084F, -0.695F, 0.9329F));

		PartDefinition cube_r13 = bone21.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(160, 0).addBox(-0.5F, -3.5F, -1.5F, 1.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1477F, 0.7876F, -4.0605F, -0.2491F, -0.0548F, 0.8458F));

		PartDefinition cube_r14 = bone21.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(66, 120).addBox(-0.5F, -4.0F, -2.0F, 1.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.6761F, 1.4534F, -2.3002F, -0.0802F, 0.3736F, 0.5982F));

		PartDefinition cube_r15 = bone21.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(48, 96).addBox(-0.5F, -3.5F, -2.0F, 1.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2369F, 2.5725F, 0.3913F, -0.2234F, 0.6321F, 0.2601F));

		PartDefinition cube_r16 = bone21.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(172, 86).addBox(-0.5F, -4.0F, -1.5F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1707F, 4.1673F, 3.3081F, 0.139F, 0.1372F, 0.2702F));

		PartDefinition cube_r17 = bone21.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(48, 144).addBox(-0.5F, -5.0F, -1.5F, 1.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2194F, 2.0482F, 4.8586F, 0.3955F, 0.7276F, 0.412F));

		PartDefinition cube_r18 = bone21.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(16, 69).addBox(-0.5793F, -0.5F, -1.4391F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5151F, -4.4739F, 3.6679F, 0.0F, 0.9163F, 0.0F));

		PartDefinition cube_r19 = bone21.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(88, 35).addBox(0.0F, -11.0F, -2.0F, 1.0F, 13.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.7F, 0.0F, 0.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r20 = bone21.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(79, 0).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.1F, -7.9F, 5.5F, 0.0F, 0.0F, 0.2618F));

		PartDefinition cube_r21 = bone21.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(15, 0).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.1F, -8.2F, 5.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition cube_r22 = bone21.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(66, 0).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, -10.0F, 4.5F, 0.0F, 0.0F, 0.2618F));

		PartDefinition cube_r23 = bone21.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(60, 69).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0566F, -10.0157F, 2.9732F, 0.164F, 0.0382F, 0.0665F));

		PartDefinition cube_r24 = bone21.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(76, 19).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.4566F, -10.0157F, -0.2732F, -0.1745F, 0.3491F, 0.0F));

		PartDefinition cube_r25 = bone21.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(12, 31).addBox(-0.5F, -0.5F, 0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0132F, -10.5F, -0.7076F, -0.0873F, 0.1745F, 0.0F));

		PartDefinition cube_r26 = bone21.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 31).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.7377F, -9.5973F, 0.6206F, -1.0472F, 0.1745F, 0.0F));

		PartDefinition cube_r27 = bone21.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, 0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.8132F, -10.4F, 0.6924F, -0.0873F, 0.1745F, 0.0F));

		PartDefinition cube_r28 = bone21.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(48, 31).addBox(-0.5F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.6132F, -9.9F, 0.8924F, -0.0873F, 0.1745F, 0.0F));

		PartDefinition cube_r29 = bone21.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(280, 222).addBox(-4.5F, -4.0F, -2.5F, 8.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5182F, -9.7398F, -2.7969F, -0.2197F, 0.209F, -0.0848F));

		PartDefinition cube_r30 = bone21.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(73, 283).addBox(-1.0F, -5.0F, -2.0F, 8.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -8.0F, 3.0F, 0.0873F, 0.1745F, 0.0F));

		PartDefinition cube_r31 = bone21.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(109, 164).addBox(-1.0F, -1.0F, -2.5F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.9157F, -13.2459F, -1.3875F, -0.5132F, -0.0329F, -0.009F));

		PartDefinition cube_r32 = bone21.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(56, 164).addBox(-0.5F, -1.0F, -2.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.7728F, -12.85F, 3.3457F, 0.4016F, 0.2986F, 0.0349F));

		PartDefinition cube_r33 = bone21.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(117, 79).addBox(-3.0F, -4.0F, -2.5F, 6.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5384F, -9.1521F, -0.1307F, -0.0558F, 0.1711F, -0.0708F));

		PartDefinition cube_r34 = bone21.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(135, 24).addBox(-3.0F, -3.0F, -2.5F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6063F, -12.8774F, -6.5F, 0.3927F, 0.0F, -0.48F));

		PartDefinition cube_r35 = bone21.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(162, 109).addBox(-2.0F, -2.5F, -3.0F, 6.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4591F, -11.2988F, 8.1F, 0.1309F, 0.0F, -0.3491F));

		PartDefinition cube_r36 = bone21.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(156, 199).addBox(-3.5043F, -2.5653F, -6.0F, 8.0F, 5.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -12.5F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition cube_r37 = bone21.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(66, 96).addBox(-1.0F, -2.0F, -1.0F, 5.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, -18.0F, -6.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r38 = bone21.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(48, 120).addBox(-1.0F, -2.0F, -1.0F, 5.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, -18.0F, 7.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r39 = bone21.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(55, 171).addBox(-0.3301F, -2.3381F, -1.2775F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.4F, -13.9F, 6.3F, 0.0F, -0.3927F, 0.4363F));

		PartDefinition cube_r40 = bone21.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(37, 164).addBox(-2.0F, -2.0F, -1.0F, 4.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -18.0F, -5.0F, 0.0F, 0.0F, 0.4363F));

		PartDefinition cube_r41 = bone21.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(91, 173).addBox(-1.0F, -2.0F, -1.0F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, -19.0F, -5.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r42 = bone21.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(37, 171).addBox(-0.3301F, -2.3381F, -0.7225F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.4F, -14.9F, -4.3F, 0.0F, 0.3927F, 0.4363F));

		PartDefinition cube_r43 = bone21.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(165, 54).addBox(-2.0F, -2.0F, -1.0F, 4.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -17.0F, 7.0F, 0.0F, 0.0F, 0.4363F));

		PartDefinition cube_r44 = bone21.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(217, 100).addBox(-2.0F, -2.0F, -4.0F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8F, -23.8F, -4.5F, 1.1332F, -0.6082F, -0.05F));

		PartDefinition cube_r45 = bone21.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(202, 48).addBox(-2.0F, -2.0F, -4.0F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8F, -19.8F, -5.5F, 1.1332F, -0.6082F, -0.05F));

		PartDefinition cube_r46 = bone21.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(202, 211).addBox(0.0F, -2.0F, -4.0F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, -20.5F, -5.9F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r47 = bone21.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(91, 164).addBox(-2.0F, -2.0F, -4.0F, 5.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, -24.5F, -5.9F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r48 = bone21.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(160, 44).addBox(-1.5F, -1.0F, -3.0F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.2F, -23.2588F, -6.4066F, 1.2168F, 0.4275F, 0.0178F));

		PartDefinition cube_r49 = bone21.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(132, 197).addBox(-1.5F, -1.0F, -3.0F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.2F, -19.2588F, -6.4066F, 1.2168F, 0.4275F, 0.0178F));

		PartDefinition cube_r50 = bone21.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(235, 255).addBox(-2.0F, -2.0F, -4.0F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -24.0F, 6.0F, -1.1332F, 0.6082F, -0.05F));

		PartDefinition cube_r51 = bone21.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(46, 257).addBox(-1.5F, -1.0F, -5.0F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -23.4588F, 6.9066F, -1.2168F, -0.4275F, 0.0178F));

		PartDefinition cube_r52 = bone21.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(241, 152).addBox(-2.0F, -3.0F, -2.0F, 5.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -20.7F, 6.4F, -1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r53 = bone21.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(190, 224).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -20.0F, 6.2F, -1.1332F, 0.6082F, -0.05F));

		PartDefinition cube_r54 = bone21.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(208, 86).addBox(-1.5F, -1.0F, -3.0F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -19.4588F, 6.9066F, -1.2168F, -0.4275F, 0.0178F));

		PartDefinition cube_r55 = bone21.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(85, 185).addBox(-2.0F, -3.0F, -2.0F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -24.7F, 6.4F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r56 = bone21.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(48, 42).addBox(-3.5F, -1.0F, -2.0F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.5215F, -21.9025F, 0.6F, 0.0F, 0.0F, -1.8762F));

		PartDefinition cube_r57 = bone21.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(72, 35).addBox(-2.5F, -1.0F, -1.0F, 7.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.9F, -24.0F, -3.6F, 0.2478F, -0.4699F, -1.0822F));

		PartDefinition cube_r58 = bone21.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(12, 65).addBox(-2.5F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.7768F, -21.2232F, -3.7473F, 0.5178F, -0.1024F, -1.966F));

		PartDefinition cube_r59 = bone21.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(165, 65).addBox(-6.5F, -2.0F, -2.0F, 9.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.9F, -17.2F, 6.6F, -0.2621F, -0.2785F, 1.0185F));

		PartDefinition cube_r60 = bone21.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(112, 24).addBox(-6.5F, -2.0F, -1.0F, 9.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.9F, -17.2F, -5.6F, 0.231F, 0.3004F, 1.0376F));

		PartDefinition cube_r61 = bone21.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(204, 136).addBox(-6.5F, -1.0F, -5.0F, 9.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.5F, -17.4F, 0.6F, 0.0F, 0.0F, 1.1781F));

		PartDefinition cube_r62 = bone21.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(66, 243).addBox(-4.5F, -1.0F, -3.0F, 7.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.9F, -24.0F, 6.6F, -0.2621F, -0.2785F, 1.0185F));

		PartDefinition cube_r63 = bone21.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(88, 55).addBox(-4.5F, -1.0F, -4.0F, 8.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.5F, -24.2F, 0.6F, 0.0F, 0.0F, 0.829F));

		PartDefinition cube_r64 = bone21.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(240, 25).addBox(-4.5F, -1.0F, -1.0F, 7.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.9F, -24.0F, -5.6F, 0.231F, 0.3004F, 1.0376F));

		PartDefinition cube_r65 = bone21.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(202, 56).addBox(-2.5F, -1.0F, -2.0F, 7.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.9F, -24.0F, 4.6F, -0.2744F, 0.4047F, -1.0553F));

		PartDefinition cube_r66 = bone21.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(24, 65).addBox(-2.5F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.8445F, -21.3163F, 4.5159F, -0.4842F, 0.0218F, -1.964F));

		PartDefinition cube_r67 = bone21.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(66, 18).addBox(-2.5F, -1.0F, -0.5F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.8F, -24.8F, -1.8F, 0.0F, -0.2182F, -0.829F));

		PartDefinition cube_r68 = bone21.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(255, 130).addBox(-2.5F, -1.0F, -2.0F, 7.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.5F, -24.2F, 0.6F, 0.0F, 0.0F, -0.829F));

		PartDefinition cube_r69 = bone21.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(290, 290).addBox(-4.0201F, 6.4507F, -2.8486F, 6.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.8055F, 11.3703F, -4.0068F, -0.0226F, 0.0843F, -1.8336F));

		PartDefinition cube_r70 = bone21.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(290, 32).addBox(-3.0201F, -1.5493F, -2.8486F, 5.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.8055F, 11.6703F, -3.4068F, -0.0226F, 0.0843F, -1.8336F));

		PartDefinition cube_r71 = bone21.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(85, 195).addBox(-3.2111F, 4.4017F, -2.5F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4826F, 3.1745F, -4.5F, 0.0737F, -0.0468F, 0.5655F));

		PartDefinition cube_r72 = bone21.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(0, 31).addBox(-3.2111F, -1.5983F, -1.5F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1826F, 3.1745F, -5.0F, 0.0737F, -0.0468F, 0.5655F));

		PartDefinition cube_r73 = bone21.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(290, 49).addBox(-3.5F, 6.5F, -2.5F, 6.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 13.5F, 2.0F, -0.0865F, 0.0114F, 0.0431F));

		PartDefinition cube_r74 = bone21.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -4.5F, -2.5F, 5.0F, 15.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 13.5F, 2.5F, -0.0865F, 0.0114F, 0.0431F));

		PartDefinition cube_r75 = bone21.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(0, 65).addBox(-1.5F, -10.5F, -1.5F, 4.0F, 21.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 13.5F, 2.1F, -0.0865F, 0.0114F, 0.0431F));

		PartDefinition cube_r76 = bone21.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(112, 98).addBox(-2.0F, -3.0F, -3.0F, 2.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(170, 132).addBox(-4.0F, -2.0F, -2.0F, 8.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2846F, -23.0491F, -9.46F, -1.5994F, -0.4491F, 1.4265F));

		PartDefinition cube_r77 = bone21.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(142, 44).addBox(-7.4439F, -1.7446F, -0.4558F, 9.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6904F, -13.0393F, -4.9828F, -1.6067F, -0.3443F, 1.4322F));

		PartDefinition cube_r78 = bone21.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(0, 120).addBox(-5.5571F, -2.9948F, -4.0896F, 2.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(112, 128).addBox(-8.5571F, -1.9948F, -3.0896F, 10.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5953F, -5.7821F, 8.1215F, 0.2182F, 0.2735F, 0.2877F));

		PartDefinition cube_r79 = bone21.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(86, 0).addBox(-7.8049F, -2.2074F, -2.0F, 10.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3771F, -11.2321F, 6.6F, -0.347F, -0.0288F, -2.05F));

		PartDefinition bone20 = partdefinition.addOrReplaceChild("bone20", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.9967F, -69.4F, -5.0044F, -0.2701F, 0.3006F, 0.2944F));

		PartDefinition cube_r80 = bone20.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(36, 65).addBox(-1.0F, -1.0F, -2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3967F, 3.0F, 0.3044F, -1.5708F, -0.6545F, 0.0F));

		PartDefinition cube_r81 = bone20.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(47, 69).addBox(-1.0F, -1.0F, -2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3967F, 0.0F, 0.3044F, -1.5708F, -0.6545F, 0.0F));

		PartDefinition cube_r82 = bone20.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(12, 86).addBox(-1.0F, -2.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3967F, 1.0F, 0.3044F, 0.0F, -0.6545F, 0.0F));

		PartDefinition bone19 = partdefinition.addOrReplaceChild("bone19", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.9967F, -69.4F, 7.0044F, 0.1828F, -0.3006F, 0.2944F));

		PartDefinition cube_r83 = bone19.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(70, 35).addBox(-1.0F, -1.0F, 1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3967F, 3.0F, -0.3044F, 1.5708F, 0.6545F, 0.0F));

		PartDefinition cube_r84 = bone19.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(16, 78).addBox(-1.0F, -1.0F, 1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3967F, 0.0F, -0.3044F, 1.5708F, 0.6545F, 0.0F));

		PartDefinition cube_r85 = bone19.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(66, 104).addBox(-1.0F, -2.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3967F, 1.0F, -0.3044F, 0.0F, 0.6545F, 0.0F));

		PartDefinition bone22 = partdefinition.addOrReplaceChild("bone22", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.0294F, -52.617F, -2.5F, -0.2182F, 0.0F, 0.1745F));

		PartDefinition cube_r86 = bone22.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(79, 3).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0706F, 0.317F, 1.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition cube_r87 = bone22.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(64, 35).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0706F, 0.017F, 0.5F, 0.0F, 0.0F, 0.2618F));

		PartDefinition cube_r88 = bone22.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(72, 69).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5294F, -1.783F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition bone23 = partdefinition.addOrReplaceChild("bone23", CubeListBuilder.create(), PartPose.offsetAndRotation(3.6846F, -45.1F, 3.3709F, 0.0F, 0.0F, -0.1745F));

		PartDefinition cube_r89 = bone23.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(207, 108).addBox(-0.5F, -8.0F, -1.5F, 1.0F, 16.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9204F, -0.0057F, 1.1037F, 0.4191F, -0.9032F, -0.4152F));

		PartDefinition cube_r90 = bone23.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(77, 214).addBox(-0.5F, -8.0F, -1.5F, 1.0F, 15.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2796F, -0.0057F, -1.7963F, 0.1656F, -0.772F, -0.219F));

		PartDefinition cube_r91 = bone23.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(52, 210).addBox(-0.5F, -8.0F, -1.5F, 1.0F, 16.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2796F, -0.0057F, -0.5963F, 0.1656F, -0.772F, -0.219F));

		PartDefinition cube_r92 = bone23.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(25, 204).addBox(-0.5F, -7.0F, -3.0F, 1.0F, 14.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1142F, 0.1187F, -4.4863F, -0.016F, 0.1299F, -0.1232F));

		PartDefinition bone24 = partdefinition.addOrReplaceChild("bone24", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r93 = bone24.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(1, 1).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5967F, -63.0094F, -3.244F, -1.1805F, -0.5121F, 2.3954F));

		PartDefinition cube_r94 = bone24.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(1, 1).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5967F, -63.8094F, -5.644F, -1.5849F, -0.5183F, 2.5959F));

		PartDefinition cube_r95 = bone24.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(1, 1).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.2967F, -63.8094F, -7.744F, -2.2813F, -0.1082F, 2.5903F));

		PartDefinition cube_r96 = bone24.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(1, 1).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0033F, -63.2094F, -8.144F, -2.9008F, 0.1542F, 2.4479F));

		PartDefinition cube_r97 = bone24.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(1, 1).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2033F, -62.3094F, -7.044F, 2.9143F, 0.5024F, 2.1878F));

		PartDefinition cube_r98 = bone24.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(1, 1).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8033F, -62.3094F, -4.944F, 2.7606F, 0.614F, 2.1269F));

		PartDefinition cube_r99 = bone24.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(1, 1).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2F, -61.7F, -2.4F, 1.8429F, 0.826F, 1.559F));

		PartDefinition cube_r100 = bone24.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(1, 1).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.6F, -61.7F, -0.1F, 1.4346F, 0.8264F, 1.3011F));

		PartDefinition cube_r101 = bone24.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(1, 1).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.6F, -61.7F, 2.4F, 1.4346F, 0.8264F, 1.3011F));

		PartDefinition cube_r102 = bone24.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(1, 1).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7F, -61.0F, 6.1F, 0.4888F, 0.3875F, 0.6935F));

		PartDefinition cube_r103 = bone24.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(1, 1).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.4547F, -61.8356F, 3.9411F, 0.7581F, 0.4175F, 0.7296F));

		PartDefinition cube_r104 = bone24.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(1, 1).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, -60.8F, 5.6F, 0.0873F, 0.0F, 0.7854F));

		PartDefinition cube_r105 = bone24.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(1, 1).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.2F, -62.1F, -2.2F, -0.8118F, -0.4994F, 1.6302F));

		PartDefinition cube_r106 = bone24.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(1, 1).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, -61.3F, -0.2F, -0.9117F, -0.3678F, 1.4514F));

		PartDefinition cube_r107 = bone24.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(1, 1).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1F, -60.1F, 3.0F, -1.3306F, -0.9163F, 1.501F));

		PartDefinition cube_r108 = bone24.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(1, 1).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -60.3F, 5.0F, -0.4009F, -0.7638F, 1.0377F));

		PartDefinition cube_r109 = bone24.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(1, 1).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, -60.8F, 5.7F, 0.0869F, -0.0076F, 0.8723F));

		return LayerDefinition.create(meshdefinition, 512, 512);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone9.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone5.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone6.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone7.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone8.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone10.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone11.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone12.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone13.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone14.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone15.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone16.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone17.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone18.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone21.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone20.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone19.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone22.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone23.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone24.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}