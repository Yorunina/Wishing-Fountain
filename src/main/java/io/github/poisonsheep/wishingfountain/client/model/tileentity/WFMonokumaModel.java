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

public class WFMonokumaModel extends EntityModel<Entity> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(WishingFountain.MODID, "main"), "wishing_fountain_monokuma_model");
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
	private final ModelPart bone19;
	private final ModelPart bone20;

	public WFMonokumaModel(ModelPart root) {
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
		this.bone19 = root.getChild("bone19");
		this.bone20 = root.getChild("bone20");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 176).addBox(-5.0F, -29.0F, 24.0F, 10.0F, 4.0F, 17.0F, new CubeDeformation(0.0F))
		.texOffs(221, 92).addBox(5.0F, -29.0F, 24.0F, 3.0F, 4.0F, 19.0F, new CubeDeformation(0.0F))
		.texOffs(287, 0).addBox(5.0F, -25.0F, 24.0F, 3.0F, 11.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(288, 135).addBox(-8.0F, -25.0F, 24.0F, 3.0F, 11.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(15, 295).addBox(-8.0F, -15.0F, 24.0F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(105, 285).addBox(5.0F, -15.0F, 24.0F, 3.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(242, 50).addBox(-8.0F, -29.0F, 24.0F, 3.0F, 4.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(34, 259).addBox(-5.0F, -25.0F, 24.0F, 10.0F, 11.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(257, 12).addBox(-5.0F, -15.0F, 24.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(-16.0F, 37.0F, 0.0F));

		PartDefinition bone9 = partdefinition.addOrReplaceChild("bone9", CubeListBuilder.create().texOffs(251, 270).addBox(-8.0F, -15.0F, 24.0F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(47, 63).addBox(-6.0F, -29.0F, 24.0F, 12.0F, 4.0F, 23.0F, new CubeDeformation(0.0F))
		.texOffs(0, 197).addBox(6.0F, -29.0F, 24.0F, 2.0F, 4.0F, 21.0F, new CubeDeformation(0.0F))
		.texOffs(267, 185).addBox(5.0F, -25.0F, 24.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(265, 248).addBox(-8.0F, -25.0F, 24.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(110, 269).addBox(6.0F, -15.0F, 24.0F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(83, 195).addBox(-8.0F, -29.0F, 24.0F, 2.0F, 4.0F, 21.0F, new CubeDeformation(0.0F))
		.texOffs(212, 123).addBox(-5.0F, -25.0F, 24.0F, 10.0F, 11.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(184, 93).addBox(-6.0F, -15.0F, 24.0F, 12.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 37.0F, 0.0F));

		PartDefinition bone2 = partdefinition.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(48, 146).addBox(-8.0F, -29.0F, 24.0F, 16.0F, 4.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(228, 281).addBox(1.0F, -25.0F, 24.0F, 7.0F, 11.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(0, 273).addBox(-1.0F, -15.0F, 24.0F, 9.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(-32.0F, 37.0F, 0.0F));

		PartDefinition bone3 = partdefinition.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(175, 144).addBox(-5.0F, -29.0F, 24.0F, 10.0F, 4.0F, 17.0F, new CubeDeformation(0.0F))
		.texOffs(221, 27).addBox(-8.0F, -29.0F, 24.0F, 3.0F, 4.0F, 19.0F, new CubeDeformation(0.0F))
		.texOffs(194, 284).addBox(-8.0F, -25.0F, 24.0F, 3.0F, 11.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(174, 287).addBox(5.0F, -25.0F, 24.0F, 3.0F, 11.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(138, 294).addBox(5.0F, -15.0F, 24.0F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(283, 118).addBox(-8.0F, -15.0F, 24.0F, 3.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(240, 174).addBox(5.0F, -29.0F, 24.0F, 3.0F, 4.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(152, 258).addBox(-5.0F, -25.0F, 24.0F, 10.0F, 11.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(208, 256).addBox(-5.0F, -15.0F, 24.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(16.0F, 37.0F, 0.0F));

		PartDefinition bone5 = partdefinition.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(174, 7).addBox(-37.0F, -29.0F, -9.0F, 10.0F, 4.0F, 17.0F, new CubeDeformation(0.0F))
		.texOffs(77, 220).addBox(-27.0F, -29.0F, -11.0F, 3.0F, 4.0F, 19.0F, new CubeDeformation(0.0F))
		.texOffs(284, 176).addBox(-27.0F, -25.0F, -1.0F, 3.0F, 11.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(0, 197).addBox(-40.0F, -25.0F, 1.0F, 3.0F, 11.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(293, 254).addBox(-40.0F, -15.0F, -1.0F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(282, 240).addBox(-27.0F, -15.0F, -4.0F, 3.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(238, 239).addBox(-40.0F, -29.0F, -8.0F, 3.0F, 4.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(0, 255).addBox(-37.0F, -25.0F, 1.0F, 10.0F, 11.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(252, 70).addBox(-37.0F, -15.0F, -2.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-32.0F, 37.0F, -16.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition bone4 = partdefinition.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(142, 55).addBox(-8.0F, -29.0F, 24.0F, 16.0F, 4.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(280, 24).addBox(-8.0F, -25.0F, 24.0F, 7.0F, 11.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(272, 107).addBox(-8.0F, -15.0F, 24.0F, 9.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(32.0F, 37.0F, 0.0F));

		PartDefinition bone6 = partdefinition.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(0, 138).addBox(-8.0F, -29.0F, 24.0F, 16.0F, 4.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(29, 277).addBox(-8.0F, -25.0F, 33.0F, 7.0F, 11.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(269, 270).addBox(-8.0F, -15.0F, 31.0F, 9.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(32.0F, 37.0F, -64.0F));

		PartDefinition bone7 = partdefinition.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(136, 35).addBox(-8.0F, -29.0F, 24.0F, 16.0F, 4.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(142, 276).addBox(1.0F, -25.0F, 33.0F, 7.0F, 11.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(260, 149).addBox(-1.0F, -15.0F, 31.0F, 9.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(-32.0F, 37.0F, -64.0F));

		PartDefinition bone8 = partdefinition.addOrReplaceChild("bone8", CubeListBuilder.create().texOffs(84, 170).addBox(27.0F, -29.0F, -9.0F, 10.0F, 4.0F, 17.0F, new CubeDeformation(0.0F))
		.texOffs(217, 52).addBox(24.0F, -29.0F, -11.0F, 3.0F, 4.0F, 19.0F, new CubeDeformation(0.0F))
		.texOffs(284, 84).addBox(24.0F, -25.0F, -1.0F, 3.0F, 11.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(83, 191).addBox(37.0F, -25.0F, 1.0F, 3.0F, 11.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(289, 292).addBox(37.0F, -15.0F, -1.0F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(282, 207).addBox(24.0F, -15.0F, -4.0F, 3.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(46, 239).addBox(37.0F, -29.0F, -8.0F, 3.0F, 4.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(118, 251).addBox(27.0F, -25.0F, 1.0F, 10.0F, 11.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(248, 137).addBox(27.0F, -15.0F, -2.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(32.0F, 37.0F, -16.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition bone10 = partdefinition.addOrReplaceChild("bone10", CubeListBuilder.create().texOffs(203, 268).addBox(-8.0F, -15.0F, 26.0F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(0, 59).addBox(-6.0F, -29.0F, 17.0F, 12.0F, 4.0F, 23.0F, new CubeDeformation(0.0F))
		.texOffs(58, 191).addBox(6.0F, -29.0F, 19.0F, 2.0F, 4.0F, 21.0F, new CubeDeformation(0.0F))
		.texOffs(175, 265).addBox(5.0F, -25.0F, 29.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(265, 163).addBox(-8.0F, -25.0F, 29.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(266, 91).addBox(6.0F, -15.0F, 26.0F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(182, 190).addBox(-8.0F, -29.0F, 19.0F, 2.0F, 4.0F, 21.0F, new CubeDeformation(0.0F))
		.texOffs(211, 0).addBox(-5.0F, -25.0F, 27.0F, 10.0F, 11.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(184, 28).addBox(-6.0F, -15.0F, 24.0F, 12.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 37.0F, -64.0F));

		PartDefinition bone11 = partdefinition.addOrReplaceChild("bone11", CubeListBuilder.create().texOffs(265, 119).addBox(24.0F, -15.0F, -6.0F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(57, 0).addBox(26.0F, -29.0F, -15.0F, 12.0F, 4.0F, 23.0F, new CubeDeformation(0.0F))
		.texOffs(190, 46).addBox(38.0F, -29.0F, -13.0F, 2.0F, 4.0F, 21.0F, new CubeDeformation(0.0F))
		.texOffs(264, 42).addBox(37.0F, -25.0F, -3.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(96, 261).addBox(24.0F, -25.0F, -3.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(264, 207).addBox(38.0F, -15.0F, -6.0F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(33, 187).addBox(24.0F, -29.0F, -13.0F, 2.0F, 4.0F, 21.0F, new CubeDeformation(0.0F))
		.texOffs(207, 186).addBox(27.0F, -25.0F, -5.0F, 10.0F, 11.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(122, 182).addBox(26.0F, -15.0F, -8.0F, 12.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(32.0F, 37.0F, -32.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition bone12 = partdefinition.addOrReplaceChild("bone12", CubeListBuilder.create().texOffs(104, 0).addBox(-26.0F, -15.0F, -6.0F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(41, 32).addBox(-38.0F, -29.0F, -15.0F, 12.0F, 4.0F, 23.0F, new CubeDeformation(0.0F))
		.texOffs(157, 186).addBox(-40.0F, -29.0F, -13.0F, 2.0F, 4.0F, 21.0F, new CubeDeformation(0.0F))
		.texOffs(68, 261).addBox(-40.0F, -25.0F, -3.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(237, 259).addBox(-27.0F, -25.0F, -3.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(22, 86).addBox(-40.0F, -15.0F, -6.0F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(179, 111).addBox(-26.0F, -29.0F, -13.0F, 2.0F, 4.0F, 21.0F, new CubeDeformation(0.0F))
		.texOffs(116, 207).addBox(-37.0F, -25.0F, -5.0F, 10.0F, 11.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(182, 75).addBox(-38.0F, -15.0F, -8.0F, 12.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-32.0F, 37.0F, -32.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition bone13 = partdefinition.addOrReplaceChild("bone13", CubeListBuilder.create().texOffs(169, 165).addBox(-37.0F, -29.0F, -8.0F, 10.0F, 4.0F, 17.0F, new CubeDeformation(0.0F))
		.texOffs(52, 216).addBox(-40.0F, -29.0F, -8.0F, 3.0F, 4.0F, 19.0F, new CubeDeformation(0.0F))
		.texOffs(0, 284).addBox(-40.0F, -25.0F, -8.0F, 3.0F, 11.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(58, 187).addBox(-27.0F, -25.0F, -8.0F, 3.0F, 11.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(291, 221).addBox(-27.0F, -15.0F, -8.0F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(282, 160).addBox(-40.0F, -15.0F, -8.0F, 3.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(238, 154).addBox(-27.0F, -29.0F, -8.0F, 3.0F, 4.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(246, 87).addBox(-37.0F, -25.0F, -8.0F, 10.0F, 11.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(245, 226).addBox(-37.0F, -15.0F, -8.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(32.0F, 37.0F, -48.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition bone14 = partdefinition.addOrReplaceChild("bone14", CubeListBuilder.create().texOffs(47, 166).addBox(27.0F, -29.0F, -8.0F, 10.0F, 4.0F, 17.0F, new CubeDeformation(0.0F))
		.texOffs(27, 212).addBox(37.0F, -29.0F, -8.0F, 3.0F, 4.0F, 19.0F, new CubeDeformation(0.0F))
		.texOffs(81, 283).addBox(37.0F, -25.0F, -8.0F, 3.0F, 11.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(182, 186).addBox(24.0F, -25.0F, -8.0F, 3.0F, 11.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(247, 290).addBox(24.0F, -15.0F, -8.0F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(280, 70).addBox(37.0F, -15.0F, -8.0F, 3.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(147, 238).addBox(24.0F, -29.0F, -8.0F, 3.0F, 4.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(246, 24).addBox(27.0F, -25.0F, -8.0F, 10.0F, 11.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(244, 0).addBox(27.0F, -15.0F, -8.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-32.0F, 37.0F, -48.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition bone15 = partdefinition.addOrReplaceChild("bone15", CubeListBuilder.create().texOffs(132, 161).addBox(-5.0F, -29.0F, 23.0F, 10.0F, 4.0F, 17.0F, new CubeDeformation(0.0F))
		.texOffs(209, 210).addBox(-8.0F, -29.0F, 21.0F, 3.0F, 4.0F, 19.0F, new CubeDeformation(0.0F))
		.texOffs(57, 283).addBox(-8.0F, -25.0F, 31.0F, 3.0F, 11.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(47, 59).addBox(5.0F, -25.0F, 33.0F, 3.0F, 11.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(123, 285).addBox(5.0F, -15.0F, 31.0F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(280, 52).addBox(-8.0F, -15.0F, 28.0F, 3.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(237, 194).addBox(5.0F, -29.0F, 24.0F, 3.0F, 4.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(245, 115).addBox(-5.0F, -25.0F, 33.0F, 10.0F, 11.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(234, 214).addBox(-5.0F, -15.0F, 30.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(16.0F, 37.0F, -64.0F));

		PartDefinition bone16 = partdefinition.addOrReplaceChild("bone16", CubeListBuilder.create().texOffs(95, 149).addBox(-5.0F, -29.0F, 23.0F, 10.0F, 4.0F, 17.0F, new CubeDeformation(0.0F))
		.texOffs(210, 147).addBox(5.0F, -29.0F, 21.0F, 3.0F, 4.0F, 19.0F, new CubeDeformation(0.0F))
		.texOffs(274, 281).addBox(5.0F, -25.0F, 31.0F, 3.0F, 11.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(0, 55).addBox(-8.0F, -25.0F, 33.0F, 3.0F, 11.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(0, 243).addBox(-8.0F, -15.0F, 31.0F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(273, 226).addBox(5.0F, -15.0F, 28.0F, 3.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(24, 235).addBox(-8.0F, -29.0F, 24.0F, 3.0F, 4.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(84, 243).addBox(-5.0F, -25.0F, 33.0F, 10.0F, 11.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(222, 75).addBox(-5.0F, -15.0F, 30.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(-16.0F, 37.0F, -64.0F));

		PartDefinition bone17 = partdefinition.addOrReplaceChild("bone17", CubeListBuilder.create().texOffs(136, 132).addBox(-7.0F, 5.0F, 25.0F, 14.0F, 15.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(0, 21).addBox(-8.0F, 18.0F, 24.0F, 16.0F, 18.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(0, 158).addBox(-8.0F, 3.0F, 24.0F, 16.0F, 2.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-11.0F, 0.0F, 23.0F, 22.0F, 3.0F, 18.0F, new CubeDeformation(0.0F))
		.texOffs(0, 222).addBox(9.0F, -3.0F, 23.0F, 2.0F, 3.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -12.0F, -32.0F));

		PartDefinition cube_r1 = bone17.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(175, 0).addBox(-9.0F, -1.5F, -2.0F, 20.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.5F, 22.0F, 0.0F, -0.5672F, 0.0F));

		PartDefinition cube_r2 = bone17.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(86, 90).addBox(-11.0F, -1.5F, -2.0F, 22.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5F, 24.0F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r3 = bone17.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(108, 200).addBox(-9.0F, -1.5F, -2.0F, 20.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.5F, 42.0F, 0.0F, 0.5672F, 0.0F));

		PartDefinition cube_r4 = bone17.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(136, 28).addBox(-11.0F, -1.5F, -2.0F, 22.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5F, 40.0F, 0.0F, 0.3054F, 0.0F));

		PartDefinition bone18 = partdefinition.addOrReplaceChild("bone18", CubeListBuilder.create().texOffs(134, 83).addBox(-8.0F, -7.0F, 8.0F, 16.0F, 8.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(127, 0).addBox(-24.0F, -7.0F, 8.0F, 16.0F, 8.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(86, 122).addBox(8.0F, -7.0F, 8.0F, 16.0F, 8.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(38, 114).addBox(8.0F, -7.0F, -8.0F, 16.0F, 8.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(86, 98).addBox(8.0F, -7.0F, -24.0F, 16.0F, 8.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(94, 59).addBox(-8.0F, -7.0F, -24.0F, 16.0F, 8.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(38, 90).addBox(-24.0F, -7.0F, -24.0F, 16.0F, 8.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(88, 27).addBox(-24.0F, -7.0F, -8.0F, 16.0F, 8.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 23.0F, 0.0F));

		PartDefinition bone19 = partdefinition.addOrReplaceChild("bone19", CubeListBuilder.create().texOffs(22, 86).addBox(-17.0F, 14.0F, -15.0F, 3.0F, 10.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(88, 27).addBox(-17.0F, 14.0F, -2.0F, 3.0F, 10.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 86).addBox(-3.0F, 14.0F, -15.0F, 3.0F, 10.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 21).addBox(-3.0F, 14.0F, -2.0F, 3.0F, 10.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(134, 107).addBox(-17.0F, 9.0F, -15.0F, 17.0F, 5.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(0, 86).addBox(-3.0F, -27.0F, -15.0F, 3.0F, 36.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(48, 138).addBox(-19.0F, 10.0F, 1.0F, 16.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 55).addBox(-6.0F, 3.0F, -16.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(32, 55).addBox(-11.0F, 3.0F, -16.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(47, 59).addBox(-16.0F, 3.0F, -16.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(62, 9).addBox(-16.0F, 6.0F, -17.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(72, 0).addBox(-11.0F, 6.0F, -17.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(72, 9).addBox(-6.0F, 6.0F, -17.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(204, 115).addBox(-19.0F, 1.0F, -19.0F, 19.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(48, 27).addBox(-19.0F, 10.0F, -18.0F, 16.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(206, 174).addBox(-19.0F, 1.0F, 1.0F, 19.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(46, 114).addBox(-6.0F, 6.0F, 1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(14, 73).addBox(-11.0F, 6.0F, 1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 73).addBox(-16.0F, 6.0F, 1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(47, 77).addBox(-16.0F, 3.0F, 1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(76, 59).addBox(-11.0F, 3.0F, 1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(70, 59).addBox(-6.0F, 3.0F, 1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(25, 197).addBox(-3.0F, -28.0F, -12.0F, 3.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(149, 211).addBox(-3.0F, -29.0F, -11.0F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(0, 73).addBox(-3.0F, -30.0F, -11.0F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(22, 55).addBox(-3.0F, -28.0F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 34).addBox(-3.0F, -28.0F, -15.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(94, 67).addBox(-4.0F, -31.0F, -1.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(40, 90).addBox(-4.0F, -31.0F, -16.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(170, 276).addBox(-4.0F, -28.0F, -1.0F, 1.0F, 37.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(192, 238).addBox(-4.0F, -28.0F, -14.0F, 1.0F, 37.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(102, 221).addBox(-5.0F, -26.0F, -12.0F, 1.0F, 3.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-5.0F, -28.0F, -11.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(196, 228).addBox(-5.0F, -21.0F, -12.0F, 1.0F, 28.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, -36.0F, 7.0F));

		PartDefinition cube_r5 = bone19.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 10).addBox(-0.5F, -0.5F, -4.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-17.5F, 11.5F, -10.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r6 = bone19.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(62, 0).addBox(-0.5F, -0.5F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-17.5F, 11.5F, -7.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r7 = bone19.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(94, 59).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-17.5F, 11.5F, -4.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r8 = bone19.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(62, 9).addBox(-0.5F, -0.5F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-17.5F, 11.5F, -7.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition bone20 = partdefinition.addOrReplaceChild("bone20", CubeListBuilder.create().texOffs(121, 231).addBox(-15.0F, 33.0F, -11.4F, 10.0F, 8.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(194, 215).addBox(-14.0F, 32.0F, -10.4F, 8.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(60, 59).addBox(-12.6F, 40.0F, -21.5F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(48, 32).addBox(-16.0F, 41.0F, -1.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(111, 51).addBox(-10.0F, 30.0F, -4.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(104, 16).addBox(-10.0F, 30.0F, -11.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(60, 21).addBox(-15.5F, 35.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(104, 6).addBox(-17.0F, 36.6F, -8.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(60, 35).addBox(-17.6F, 36.7F, -6.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(3, 60).addBox(-16.0F, 38.6F, -5.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(17, 59).addBox(-15.5F, 38.6F, -6.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(12, 27).addBox(-12.0F, 39.0F, -20.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(62, 0).addBox(-13.0F, 34.0F, -21.0F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(12, 21).addBox(-13.0F, 34.0F, -20.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 10).addBox(-11.0F, 34.0F, -20.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(48, 21).addBox(-13.0F, 34.0F, -19.0F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(13, 55).addBox(-13.0F, 44.0F, -21.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(104, 0).addBox(-21.7503F, 53.2F, -16.6769F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(86, 97).addBox(-25.4F, 57.2F, -11.2F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, -83.0F, 7.0F));

		PartDefinition cube_r9 = bone20.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(169, 238).addBox(-1.0F, -1.0F, -4.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-20.8F, 55.2F, -10.5F, 1.6307F, 0.0163F, 0.609F));

		PartDefinition cube_r10 = bone20.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(85, 261).addBox(-1.0F, -1.0F, -4.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-18.8F, 55.2F, -9.5F, 0.0F, 0.2182F, 0.0F));

		PartDefinition cube_r11 = bone20.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(3, 15).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-14.6F, 37.6835F, -9.699F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r12 = bone20.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(56, 21).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-14.7F, 38.2315F, -8.9164F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r13 = bone20.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 59).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-14.8F, 38.7092F, -8.0889F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r14 = bone20.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(13, 59).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-14.9F, 39.0036F, -7.2799F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r15 = bone20.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(10, 33).addBox(-1.0F, -0.0609F, -1.4792F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(57, 32).addBox(-1.0F, -0.9391F, -0.5208F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-14.5F, 35.5F, -8.65F, -0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r16 = bone20.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(215, 50).addBox(-2.0F, -3.5F, -3.5F, 3.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.2576F, 47.1627F, -6.8F, -0.2174F, 0.0189F, 0.7223F));

		PartDefinition cube_r17 = bone20.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(38, 114).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-13.5706F, 44.3661F, 0.4875F, 0.2385F, 0.1451F, -0.3186F));

		PartDefinition cube_r18 = bone20.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.1554F, 42.0344F, -18.6129F, 1.6272F, 0.1953F, 0.1137F));

		PartDefinition cube_r19 = bone20.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(9, 10).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.9F, 42.0F, -13.0F, 1.5849F, -0.1624F, 0.3591F));

		PartDefinition cube_r20 = bone20.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(10, 0).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-11.0F, 45.0F, 0.0F, 0.4068F, -0.1624F, 0.3591F));

		PartDefinition cube_r21 = bone20.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(162, 215).addBox(-5.0F, -9.5F, -5.5F, 10.0F, 11.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-15.8019F, 53.2081F, -8.5F, -0.1745F, 0.0F, 0.6981F));

		PartDefinition cube_r22 = bone20.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(218, 233).addBox(-5.4659F, -8.2412F, -3.5F, 9.0F, 13.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.5F, 46.5F, -7.9F, -0.1745F, 0.0F, 0.2618F));

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
		bone19.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone20.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}