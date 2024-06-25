package io.github.poisonsheep.wishingfountain.client.model;// Made with Blockbench 4.10.3
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

public class WishingFountainModel extends EntityModel<net.minecraft.world.entity.Entity> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(WishingFountain.MODID, "main"), "wishing_fountain");
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

	public WishingFountainModel(ModelPart root) {
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
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(-19, -15).addBox(-5.0F, -29.0F, 24.0F, 10.0F, 4.0F, 17.0F, new CubeDeformation(0.0F))
		.texOffs(-8, -17).addBox(5.0F, -29.0F, 24.0F, 3.0F, 4.0F, 19.0F, new CubeDeformation(0.0F))
		.texOffs(2, -7).addBox(5.0F, -25.0F, 24.0F, 3.0F, 11.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(4, -5).addBox(-8.0F, -25.0F, 24.0F, 3.0F, 11.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(2, -7).addBox(-8.0F, -15.0F, 24.0F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(-1, -10).addBox(5.0F, -15.0F, 24.0F, 3.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(-4, -14).addBox(-8.0F, -29.0F, 24.0F, 3.0F, 4.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(-9, -5).addBox(-5.0F, -25.0F, 24.0F, 10.0F, 11.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(-12, -8).addBox(-5.0F, -15.0F, 24.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(-16.0F, 37.0F, 0.0F));

		PartDefinition bone9 = partdefinition.addOrReplaceChild("bone9", CubeListBuilder.create().texOffs(-3, -12).addBox(-8.0F, -15.0F, 24.0F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(-26, -21).addBox(-6.0F, -31.0F, 24.0F, 12.0F, 6.0F, 23.0F, new CubeDeformation(0.0F))
		.texOffs(-9, -19).addBox(6.0F, -31.0F, 24.0F, 2.0F, 6.0F, 21.0F, new CubeDeformation(0.0F))
		.texOffs(0, -9).addBox(5.0F, -25.0F, 24.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(0, -9).addBox(-8.0F, -25.0F, 24.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(-2, -12).addBox(6.0F, -15.0F, 24.0F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(-9, -19).addBox(-8.0F, -31.0F, 24.0F, 2.0F, 6.0F, 21.0F, new CubeDeformation(0.0F))
		.texOffs(-8, -17).addBox(-11.0F, -31.0F, 24.0F, 3.0F, 2.0F, 19.0F, new CubeDeformation(0.0F))
		.texOffs(-7, -17).mirror().addBox(8.0F, -31.0F, 24.0F, 3.0F, 2.0F, 19.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(-15, -11).addBox(-5.0F, -25.0F, 24.0F, 10.0F, 11.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(-19, -14).addBox(-6.0F, -15.0F, 24.0F, 12.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 37.0F, 0.0F));

		PartDefinition bone2 = partdefinition.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(-18, -14).addBox(-8.0F, -31.0F, 24.0F, 16.0F, 6.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(0, -5).addBox(1.0F, -25.0F, 24.0F, 7.0F, 11.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(-4, -7).addBox(-1.0F, -15.0F, 24.0F, 9.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(-32.0F, 37.0F, 0.0F));

		PartDefinition bone3 = partdefinition.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(-19, -15).mirror().addBox(-5.0F, -29.0F, 24.0F, 10.0F, 4.0F, 17.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(-8, -17).mirror().addBox(-8.0F, -29.0F, 24.0F, 3.0F, 4.0F, 19.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(2, -7).mirror().addBox(-8.0F, -25.0F, 24.0F, 3.0F, 11.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(4, -5).mirror().addBox(5.0F, -25.0F, 24.0F, 3.0F, 11.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(2, -7).mirror().addBox(5.0F, -15.0F, 24.0F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(-1, -10).mirror().addBox(-8.0F, -15.0F, 24.0F, 3.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(-4, -14).mirror().addBox(5.0F, -29.0F, 24.0F, 3.0F, 4.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(-9, -5).mirror().addBox(-5.0F, -25.0F, 24.0F, 10.0F, 11.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(-12, -8).mirror().addBox(-5.0F, -15.0F, 24.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(16.0F, 37.0F, 0.0F));

		PartDefinition bone5 = partdefinition.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(-19, -15).addBox(-37.0F, -29.0F, -9.0F, 10.0F, 4.0F, 17.0F, new CubeDeformation(0.0F))
		.texOffs(-8, -17).addBox(-27.0F, -29.0F, -11.0F, 3.0F, 4.0F, 19.0F, new CubeDeformation(0.0F))
		.texOffs(2, -7).addBox(-27.0F, -25.0F, -1.0F, 3.0F, 11.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(4, -5).addBox(-40.0F, -25.0F, 1.0F, 3.0F, 11.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(2, -7).addBox(-40.0F, -15.0F, -1.0F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(-1, -10).addBox(-27.0F, -15.0F, -4.0F, 3.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(-4, -14).addBox(-40.0F, -29.0F, -8.0F, 3.0F, 4.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(-9, -5).addBox(-37.0F, -25.0F, 1.0F, 10.0F, 11.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(-12, -8).addBox(-37.0F, -15.0F, -2.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-32.0F, 37.0F, -16.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition bone4 = partdefinition.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(-18, -14).mirror().addBox(-8.0F, -31.0F, 24.0F, 16.0F, 6.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, -5).mirror().addBox(-8.0F, -25.0F, 24.0F, 7.0F, 11.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(-4, -7).mirror().addBox(-8.0F, -15.0F, 24.0F, 9.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(32.0F, 37.0F, 0.0F));

		PartDefinition bone6 = partdefinition.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(-18, -14).mirror().addBox(-8.0F, -31.0F, 24.0F, 16.0F, 6.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, -5).mirror().addBox(-8.0F, -25.0F, 33.0F, 7.0F, 11.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(-4, -7).mirror().addBox(-8.0F, -15.0F, 31.0F, 9.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(32.0F, 37.0F, -64.0F));

		PartDefinition bone7 = partdefinition.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(-18, -14).addBox(-8.0F, -31.0F, 24.0F, 16.0F, 6.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(0, -5).addBox(1.0F, -25.0F, 33.0F, 7.0F, 11.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(-4, -7).addBox(-1.0F, -15.0F, 31.0F, 9.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(-32.0F, 37.0F, -64.0F));

		PartDefinition bone8 = partdefinition.addOrReplaceChild("bone8", CubeListBuilder.create().texOffs(-19, -15).mirror().addBox(27.0F, -29.0F, -9.0F, 10.0F, 4.0F, 17.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(-8, -17).mirror().addBox(24.0F, -29.0F, -11.0F, 3.0F, 4.0F, 19.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(2, -7).mirror().addBox(24.0F, -25.0F, -1.0F, 3.0F, 11.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(4, -5).mirror().addBox(37.0F, -25.0F, 1.0F, 3.0F, 11.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(2, -7).mirror().addBox(37.0F, -15.0F, -1.0F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(-1, -10).mirror().addBox(24.0F, -15.0F, -4.0F, 3.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(-4, -14).mirror().addBox(37.0F, -29.0F, -8.0F, 3.0F, 4.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(-9, -5).mirror().addBox(27.0F, -25.0F, 1.0F, 10.0F, 11.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(-12, -8).mirror().addBox(27.0F, -15.0F, -2.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(32.0F, 37.0F, -16.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition bone10 = partdefinition.addOrReplaceChild("bone10", CubeListBuilder.create().texOffs(-3, -12).addBox(-8.0F, -15.0F, 26.0F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(-26, -21).addBox(-6.0F, -31.0F, 17.0F, 12.0F, 6.0F, 23.0F, new CubeDeformation(0.0F))
		.texOffs(-9, -19).addBox(6.0F, -31.0F, 19.0F, 2.0F, 6.0F, 21.0F, new CubeDeformation(0.0F))
		.texOffs(0, -9).addBox(5.0F, -25.0F, 29.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(0, -9).addBox(-8.0F, -25.0F, 29.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(-2, -12).addBox(6.0F, -15.0F, 26.0F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(-9, -19).addBox(-8.0F, -31.0F, 19.0F, 2.0F, 6.0F, 21.0F, new CubeDeformation(0.0F))
		.texOffs(-8, -17).addBox(-11.0F, -31.0F, 21.0F, 3.0F, 2.0F, 19.0F, new CubeDeformation(0.0F))
		.texOffs(-7, -17).mirror().addBox(8.0F, -31.0F, 21.0F, 3.0F, 2.0F, 19.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(-15, -11).addBox(-5.0F, -25.0F, 27.0F, 10.0F, 11.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(-19, -14).addBox(-6.0F, -15.0F, 24.0F, 12.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 37.0F, -64.0F));

		PartDefinition bone11 = partdefinition.addOrReplaceChild("bone11", CubeListBuilder.create().texOffs(-3, -12).addBox(24.0F, -15.0F, -6.0F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(-26, -21).addBox(26.0F, -31.0F, -15.0F, 12.0F, 6.0F, 23.0F, new CubeDeformation(0.0F))
		.texOffs(-9, -19).addBox(38.0F, -31.0F, -13.0F, 2.0F, 6.0F, 21.0F, new CubeDeformation(0.0F))
		.texOffs(0, -9).addBox(37.0F, -25.0F, -3.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(0, -9).addBox(24.0F, -25.0F, -3.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(-2, -12).addBox(38.0F, -15.0F, -6.0F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(-9, -19).addBox(24.0F, -31.0F, -13.0F, 2.0F, 6.0F, 21.0F, new CubeDeformation(0.0F))
		.texOffs(-8, -17).addBox(21.0F, -31.0F, -11.0F, 3.0F, 2.0F, 19.0F, new CubeDeformation(0.0F))
		.texOffs(-7, -17).mirror().addBox(40.0F, -31.0F, -11.0F, 3.0F, 2.0F, 19.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(-15, -11).addBox(27.0F, -25.0F, -5.0F, 10.0F, 11.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(-19, -14).addBox(26.0F, -15.0F, -8.0F, 12.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(32.0F, 37.0F, -32.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition bone12 = partdefinition.addOrReplaceChild("bone12", CubeListBuilder.create().texOffs(-3, -12).mirror().addBox(-26.0F, -15.0F, -6.0F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(-26, -21).mirror().addBox(-38.0F, -31.0F, -15.0F, 12.0F, 6.0F, 23.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(-9, -19).mirror().addBox(-40.0F, -31.0F, -13.0F, 2.0F, 6.0F, 21.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, -9).mirror().addBox(-40.0F, -25.0F, -3.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, -9).mirror().addBox(-27.0F, -25.0F, -3.0F, 3.0F, 11.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(-2, -12).mirror().addBox(-40.0F, -15.0F, -6.0F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(-9, -19).mirror().addBox(-26.0F, -31.0F, -13.0F, 2.0F, 6.0F, 21.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(-8, -17).mirror().addBox(-24.0F, -31.0F, -11.0F, 3.0F, 2.0F, 19.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(-7, -17).addBox(-43.0F, -31.0F, -11.0F, 3.0F, 2.0F, 19.0F, new CubeDeformation(0.0F))
		.texOffs(-15, -11).mirror().addBox(-37.0F, -25.0F, -5.0F, 10.0F, 11.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(-19, -14).mirror().addBox(-38.0F, -15.0F, -8.0F, 12.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-32.0F, 37.0F, -32.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition bone13 = partdefinition.addOrReplaceChild("bone13", CubeListBuilder.create().texOffs(-19, -15).mirror().addBox(-37.0F, -29.0F, -8.0F, 10.0F, 4.0F, 17.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(-8, -17).mirror().addBox(-40.0F, -29.0F, -8.0F, 3.0F, 4.0F, 19.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(2, -7).mirror().addBox(-40.0F, -25.0F, -8.0F, 3.0F, 11.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(4, -5).mirror().addBox(-27.0F, -25.0F, -8.0F, 3.0F, 11.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(2, -7).mirror().addBox(-27.0F, -15.0F, -8.0F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(-1, -10).mirror().addBox(-40.0F, -15.0F, -8.0F, 3.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(-4, -14).mirror().addBox(-27.0F, -29.0F, -8.0F, 3.0F, 4.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(-9, -5).mirror().addBox(-37.0F, -25.0F, -8.0F, 10.0F, 11.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(-12, -8).mirror().addBox(-37.0F, -15.0F, -8.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(32.0F, 37.0F, -48.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition bone14 = partdefinition.addOrReplaceChild("bone14", CubeListBuilder.create().texOffs(-19, -15).addBox(27.0F, -29.0F, -8.0F, 10.0F, 4.0F, 17.0F, new CubeDeformation(0.0F))
		.texOffs(-8, -17).addBox(37.0F, -29.0F, -8.0F, 3.0F, 4.0F, 19.0F, new CubeDeformation(0.0F))
		.texOffs(2, -7).addBox(37.0F, -25.0F, -8.0F, 3.0F, 11.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(4, -5).addBox(24.0F, -25.0F, -8.0F, 3.0F, 11.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(2, -7).addBox(24.0F, -15.0F, -8.0F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(-1, -10).addBox(37.0F, -15.0F, -8.0F, 3.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(-4, -14).addBox(24.0F, -29.0F, -8.0F, 3.0F, 4.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(-9, -5).addBox(27.0F, -25.0F, -8.0F, 10.0F, 11.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(-12, -8).addBox(27.0F, -15.0F, -8.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-32.0F, 37.0F, -48.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition bone15 = partdefinition.addOrReplaceChild("bone15", CubeListBuilder.create().texOffs(-19, -15).mirror().addBox(-5.0F, -29.0F, 23.0F, 10.0F, 4.0F, 17.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(-8, -17).mirror().addBox(-8.0F, -29.0F, 21.0F, 3.0F, 4.0F, 19.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(2, -7).mirror().addBox(-8.0F, -25.0F, 31.0F, 3.0F, 11.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(4, -5).mirror().addBox(5.0F, -25.0F, 33.0F, 3.0F, 11.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(2, -7).mirror().addBox(5.0F, -15.0F, 31.0F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(-1, -10).mirror().addBox(-8.0F, -15.0F, 28.0F, 3.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(-4, -14).mirror().addBox(5.0F, -29.0F, 24.0F, 3.0F, 4.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(-9, -5).mirror().addBox(-5.0F, -25.0F, 33.0F, 10.0F, 11.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(-12, -8).mirror().addBox(-5.0F, -15.0F, 30.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(16.0F, 37.0F, -64.0F));

		PartDefinition bone16 = partdefinition.addOrReplaceChild("bone16", CubeListBuilder.create().texOffs(-19, -15).addBox(-5.0F, -29.0F, 23.0F, 10.0F, 4.0F, 17.0F, new CubeDeformation(0.0F))
		.texOffs(-8, -17).addBox(5.0F, -29.0F, 21.0F, 3.0F, 4.0F, 19.0F, new CubeDeformation(0.0F))
		.texOffs(2, -7).addBox(5.0F, -25.0F, 31.0F, 3.0F, 11.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(4, -5).addBox(-8.0F, -25.0F, 33.0F, 3.0F, 11.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(2, -7).addBox(-8.0F, -15.0F, 31.0F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(-1, -10).addBox(5.0F, -15.0F, 28.0F, 3.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(-4, -14).addBox(-8.0F, -29.0F, 24.0F, 3.0F, 4.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(-9, -5).addBox(-5.0F, -25.0F, 33.0F, 10.0F, 11.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(-12, -8).addBox(-5.0F, -15.0F, 30.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(-16.0F, 37.0F, -64.0F));

		PartDefinition bone17 = partdefinition.addOrReplaceChild("bone17", CubeListBuilder.create().texOffs(-9, -9).addBox(-4.0F, -47.0F, 26.0F, 9.0F, 9.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(3, -1).addBox(-11.0F, -40.0F, 33.0F, 5.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(2, 0).addBox(-13.0F, -39.0F, 33.7F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-15.0F, -38.2F, 34.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(5, 1).addBox(-11.0F, -38.0F, 32.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(-8, -9).addBox(-6.0F, -50.0F, 26.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(3, 1).addBox(-5.0F, -50.0F, 25.0F, 11.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(3, 1).addBox(-5.0F, -50.0F, 37.0F, 11.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(-8, -9).addBox(6.0F, -50.0F, 26.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(3, 1).addBox(-5.0F, -51.0F, 25.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(3, 1).addBox(-5.0F, -52.0F, 25.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(3, 1).addBox(-5.0F, -52.0F, 37.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(3, 1).addBox(-5.0F, -51.0F, 37.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(3, 1).addBox(-1.0F, -51.0F, 37.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(3, 1).addBox(-1.0F, -51.0F, 25.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, -1).addBox(-6.0F, -51.0F, 33.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(1, 0).addBox(-6.0F, -52.0F, 33.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, -1).addBox(-6.0F, -51.0F, 27.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(1, 0).addBox(-6.0F, -52.0F, 28.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(-18, -12).addBox(-7.0F, 5.0F, 25.0F, 14.0F, 15.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(-21, -14).addBox(-8.0F, 18.0F, 24.0F, 16.0F, 18.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(-21, -14).addBox(-8.0F, 3.0F, 24.0F, 16.0F, 2.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(-26, -16).addBox(-11.0F, 0.0F, 23.0F, 22.0F, 3.0F, 18.0F, new CubeDeformation(0.0F))
		.texOffs(-4, -4).addBox(-7.0F, -4.0F, 26.0F, 6.0F, 4.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(-6, -16).addBox(9.0F, -3.0F, 23.0F, 2.0F, 3.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -12.0F, -32.0F));

		PartDefinition cube_r1 = bone17.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(-10, -2).addBox(-9.0F, -1.5F, -2.0F, 20.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.5F, 22.0F, 0.0F, -0.5672F, 0.0F));

		PartDefinition cube_r2 = bone17.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(-12, -2).addBox(-11.0F, -1.5F, -2.0F, 22.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5F, 24.0F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r3 = bone17.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(-10, -2).addBox(-9.0F, -1.5F, -2.0F, 20.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.5F, 42.0F, 0.0F, 0.5672F, 0.0F));

		PartDefinition cube_r4 = bone17.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(-12, -2).addBox(-11.0F, -1.5F, -2.0F, 22.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5F, 40.0F, 0.0F, 0.3054F, 0.0F));

		PartDefinition cube_r5 = bone17.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -4.5F, -1.0F, 5.0F, 6.2F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, -2).addBox(0.3F, -4.5F, -3.0F, 7.7F, 4.4F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(4, 0).addBox(3.0F, -14.5F, -1.0F, 6.0F, 16.2F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.0F, -4.5F, -1.0F, 5.0F, 6.2F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -25.9067F, 26.75F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r6 = bone17.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -3.5F, -2.5F, 7.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1983F, -26.497F, 37.2044F, 0.0037F, 0.0653F, 0.1135F));

		PartDefinition cube_r7 = bone17.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(-5, -5).mirror().addBox(-1.0F, 0.5F, -3.0F, 1.2F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.9963F, -30.3247F, 32.3821F, -0.0399F, -0.0653F, -0.1135F));

		PartDefinition cube_r8 = bone17.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(-1, 0).addBox(-4.0F, -4.5F, -2.5F, 8.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1983F, -21.497F, 38.5044F, 0.2215F, 0.0227F, 0.1039F));

		PartDefinition cube_r9 = bone17.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(-2, -3).addBox(0.0F, -5.5F, -5.0F, 4.0F, 9.2F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -30.9067F, 30.75F, -1.5939F, -0.0294F, -0.623F));

		PartDefinition cube_r10 = bone17.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(-5, -5).mirror().addBox(-1.0F, -11.0F, -5.0F, 2.0F, 17.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.8F, -16.0F, 32.0F, -0.0455F, -0.0616F, -0.0262F));

		PartDefinition cube_r11 = bone17.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(-2, -2).addBox(-1.0F, -11.0F, -1.0F, 2.0F, 17.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8F, -16.0F, 32.0F, -0.0507F, 0.0574F, -0.0612F));

		PartDefinition cube_r12 = bone17.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(-2, -2).addBox(-1.0F, -5.0F, -1.0F, 2.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, -27.0F, 32.0F, -0.389F, 0.0653F, 0.1135F));

		PartDefinition cube_r13 = bone17.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(-1, -2).addBox(-0.75F, 0.0F, -2.0F, 1.5F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.75F, -33.366F, 31.634F, -0.5232F, 0.0218F, 0.0378F));

		PartDefinition cube_r14 = bone17.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, -32.0F, 32.0F, -0.5199F, 0.0653F, 0.1135F));

		PartDefinition cube_r15 = bone17.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(-1, -1).mirror().addBox(-1.0F, -3.0F, -2.0F, 2.0F, 17.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.0F, -41.0F, 26.0F, -2.7159F, -0.2492F, 2.5342F));

		PartDefinition cube_r16 = bone17.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(-1, -1).mirror().addBox(-1.0F, -3.0F, -1.0F, 2.0F, 18.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.0F, -40.0F, 36.0F, 0.2182F, 0.0F, -0.3927F));

		PartDefinition cube_r17 = bone17.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(-7, -7).mirror().addBox(-1.0F, -2.0F, -5.0F, 2.0F, 20.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.2602F, -41.1849F, 32.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r18 = bone17.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(-9, -9).mirror().addBox(-1.0F, 1.0F, -6.0F, 2.4F, 10.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.7398F, -49.1849F, 32.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r19 = bone17.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(-2, -2).mirror().addBox(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -46.0F, 25.0F, -1.6097F, -1.1023F, 1.4256F));

		PartDefinition cube_r20 = bone17.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(-2, -2).mirror().addBox(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, -46.0F, 38.0F, 1.6113F, -1.1224F, -1.7871F));

		PartDefinition cube_r21 = bone17.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(-1, -1).mirror().addBox(-1.0F, -3.0F, -2.0F, 2.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.0F, -47.0F, 26.0F, -2.7159F, -0.2492F, 2.5342F));

		PartDefinition cube_r22 = bone17.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-1.0F, -3.0F, -3.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.0F, -47.0F, 30.0F, -0.1309F, 0.0F, -0.3927F));

		PartDefinition cube_r23 = bone17.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(-5, -5).mirror().addBox(-1.0F, -2.0F, -4.0F, 2.0F, 13.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.2602F, -48.1849F, 32.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r24 = bone17.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(-1, -1).mirror().addBox(-1.0F, -3.0F, -1.0F, 2.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.0F, -47.0F, 34.0F, 0.2182F, 0.0F, -0.3927F));

		PartDefinition cube_r25 = bone17.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(-1, -1).mirror().addBox(-1.0F, -3.0F, -2.0F, 2.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.0F, -47.0F, 37.0F, 0.4363F, -0.3927F, -0.3927F));

		PartDefinition cube_r26 = bone17.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(-3, -3).addBox(-1.0F, -3.0F, -3.0F, 2.0F, 17.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -40.0F, 38.0F, 1.2479F, -1.3142F, -1.273F));

		PartDefinition cube_r27 = bone17.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(-2, -2).addBox(-1.0F, -3.0F, -3.0F, 2.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -46.0F, 38.0F, 1.3915F, -1.1023F, -1.4256F));

		PartDefinition cube_r28 = bone17.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(-3, -3).addBox(-1.0F, -3.0F, -2.0F, 2.0F, 17.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -40.0F, 25.0F, -1.2722F, 1.3552F, -1.2082F));

		PartDefinition cube_r29 = bone17.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(-2, -2).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -46.0F, 25.0F, -1.3915F, 1.1023F, -1.4256F));

		PartDefinition cube_r30 = bone17.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(0, 0).addBox(-1.8815F, -5.3597F, -1.3058F, 3.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -39.0F, 37.0F, 3.1241F, 0.4376F, -2.8994F));

		PartDefinition cube_r31 = bone17.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(1, 0).addBox(0.0F, -2.0F, 0.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0F, -43.0F, 36.4F, -0.1745F, 0.5672F, -0.1745F));

		PartDefinition cube_r32 = bone17.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(1, 0).addBox(0.0F, -2.0F, -2.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0F, -43.0F, 26.6F, 0.1745F, -0.5672F, -0.1745F));

		PartDefinition cube_r33 = bone17.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(0, 0).addBox(-1.8815F, -7.3597F, -0.6942F, 3.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -39.0F, 26.0F, -3.1241F, -0.4376F, -2.8994F));

		PartDefinition cube_r34 = bone17.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(-2, -2).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -46.0F, 38.0F, 1.6113F, 1.1224F, 1.7871F));

		PartDefinition cube_r35 = bone17.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(-2, -2).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -46.0F, 25.0F, -1.6097F, 1.1023F, -1.4256F));

		PartDefinition cube_r36 = bone17.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(-2, -2).addBox(-1.0F, -2.0F, -3.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0F, -44.0F, 32.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition cube_r37 = bone17.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(-1, -1).addBox(-1.0F, -3.0F, -2.0F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -47.0F, 26.0F, -2.7159F, 0.2492F, -2.5342F));

		PartDefinition cube_r38 = bone17.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(-1, -1).addBox(-1.0F, -3.0F, -2.0F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -47.0F, 37.0F, 0.4363F, 0.3927F, 0.3927F));

		PartDefinition cube_r39 = bone17.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(-1, -1).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, -47.0F, 34.0F, 0.2182F, 0.0F, 0.3927F));

		PartDefinition cube_r40 = bone17.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -3.0F, -3.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, -47.0F, 30.0F, -0.1309F, 0.0F, 0.3927F));

		PartDefinition cube_r41 = bone17.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(-2, -2).addBox(-1.0F, -2.0F, -3.0F, 2.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.2602F, -48.1849F, 32.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r42 = bone17.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(-1, -1).addBox(-1.0F, 14.0F, 2.0F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -22.3F, 22.0F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r43 = bone17.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(-1, -1).addBox(-1.0F, 14.0F, 2.0F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -18.0F, 13.0F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r44 = bone17.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(1, 1).addBox(-1.0F, 14.0F, 5.0F, 2.0F, 3.0F, 1.4F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -18.051F, 19.1406F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r45 = bone17.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -11.4F, -1.0F, 2.0F, 4.4F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.0F, -14.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -25.6232F, 16.3005F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r46 = bone17.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -12.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -30.1548F, 14.1874F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r47 = bone17.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(1, 1).addBox(-1.0F, 14.0F, 5.0F, 2.0F, 3.0F, 1.4F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -15.6843F, 14.0652F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r48 = bone17.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(-2, -2).addBox(-1.0F, 14.0F, 4.0F, 2.0F, 3.0F, 4.2F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -15.0F, 17.0F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r49 = bone17.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(-5, -5).addBox(-1.0F, 14.0F, 1.0F, 2.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -21.0F, 16.0F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r50 = bone17.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -12.0F, -1.0F, 2.0F, 36.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -31.0F, 16.0F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r51 = bone17.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(-8, -2).addBox(-14.8391F, -1.9972F, -2.811F, 8.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6904F, -35.0393F, 27.0172F, 1.5249F, -0.9255F, -1.5245F));

		PartDefinition cube_r52 = bone17.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(-9, -2).addBox(-7.4439F, -1.7446F, -0.4558F, 9.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6904F, -35.0393F, 27.0172F, 1.8918F, -0.8915F, -2.0945F));

		PartDefinition cube_r53 = bone17.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(-10, -2).addBox(-9.59F, 3.9976F, -2.0F, 10.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4771F, -34.3321F, 38.0F, 0.2729F, -0.286F, 0.7895F));

		PartDefinition cube_r54 = bone17.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(-10, -2).addBox(-7.8049F, -2.2074F, -2.0F, 10.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4771F, -34.3321F, 38.0F, 0.3361F, 0.2071F, -0.532F));

		PartDefinition cube_r55 = bone17.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(-3, -3).addBox(-9.1459F, 5.9041F, -2.5F, 5.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8826F, -21.6255F, 27.5F, 0.0865F, 0.0114F, -0.1304F));

		PartDefinition cube_r56 = bone17.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(-3, -3).addBox(-3.2111F, -1.5983F, -2.5F, 5.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8826F, -21.6255F, 27.5F, 0.0737F, -0.0468F, 0.5655F));

		PartDefinition cube_r57 = bone17.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(-3, -3).addBox(-2.5F, -10.5F, -2.5F, 5.0F, 21.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -10.5F, 34.5F, -0.0873F, 0.0F, -0.0873F));

		PartDefinition cube_r58 = bone17.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(-9, -7).addBox(-3.0F, -9.0F, -5.0F, 6.0F, 18.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -29.0F, 32.0F, 0.0F, 0.0F, 0.0873F));

		return LayerDefinition.create(meshdefinition, 16, 16);
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
	}

	@Override
	public void setupAnim(net.minecraft.world.entity.Entity p_102618_, float p_102619_, float p_102620_, float p_102621_, float p_102622_, float p_102623_) {

	}
}