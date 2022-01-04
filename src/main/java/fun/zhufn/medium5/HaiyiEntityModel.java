package fun.zhufn.medium5;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;

import java.util.ArrayList;
import java.util.List;

public class HaiyiEntityModel extends EntityModel<HaiyiEntity> {

    private final ModelPart waist;
    private final ModelPart shuimu;

    public HaiyiEntityModel(ModelPart modelPart) {

        this.waist = modelPart.getChild("waist");
        this.shuimu = modelPart.getChild("shuimu");
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();

        ModelPartData waist = modelPartData.addChild("waist", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 12.0F, 0.0F));

        ModelPartData body = waist.addChild("body", ModelPartBuilder.create().uv(0, 16).cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new Dilation(0.0F))
                .uv(16, 32).cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new Dilation(0.5F)), ModelTransform.pivot(0.0F, -12.0F, 0.0F));

        ModelPartData head = body.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.0F))
                .uv(32, 0).cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.5F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData rightLeg = body.addChild("rightLeg", ModelPartBuilder.create().uv(16, 48).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F))
                .uv(0, 48).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.2F)), ModelTransform.pivot(-1.9F, 12.0F, 0.0F));

        ModelPartData rightArm = body.addChild("rightArm", ModelPartBuilder.create().uv(40, 16).cuboid(-2.0F, -1.5F, -2.0F, 3.0F, 12.0F, 4.0F, new Dilation(0.0F))
                .uv(40, 32).cuboid(-2.0F, -1.0F, -2.0F, 3.0F, 12.0F, 4.0F, new Dilation(0.3F)), ModelTransform.pivot(-5.0F, 2.0F, 0.0F));

        ModelPartData leftLeg = body.addChild("leftLeg", ModelPartBuilder.create().uv(0, 32).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.2F))
                .uv(0, 16).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(1.9F, 12.0F, 0.0F));

        ModelPartData leftArm = body.addChild("leftArm", ModelPartBuilder.create().uv(32, 48).cuboid(-1.0F, -1.5F, -2.0F, 3.0F, 12.0F, 4.0F, new Dilation(0.0F))
                .uv(46, 46).cuboid(-1.0F, -2.0F, -2.0F, 4.0F, 13.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(5.0F, 2.0F, 0.0F));

        ModelPartData shuimu = modelPartData.addChild("shuimu", ModelPartBuilder.create().uv(1, 66).cuboid(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(1, 66).cuboid(-5.0F, 0.0F, 2.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(1, 66).cuboid(-3.0F, 0.0F, 2.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(1, 66).cuboid(-1.0F, 0.0F, 2.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(1, 66).cuboid(-3.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(1, 66).cuboid(-5.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(0, 69).cuboid(-5.0F, -3.0F, 0.0F, 5.0F, 3.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, -9.0F, 3.0F, 0.0F, 3.1416F, 0.0F));

        ModelPartData shuimu_r1 = shuimu.addChild("shuimu_r1", ModelPartBuilder.create().uv(0, 69).cuboid(-0.5F, -0.25F, -0.5F, 1.0F, 0.5F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-5.2513F, -2.1344F, 1.5F, 0.0F, 0.0F, -0.3054F));

        ModelPartData shuimu_r2 = shuimu.addChild("shuimu_r2", ModelPartBuilder.create().uv(0, 69).cuboid(-1.0F, -0.25F, -0.5F, 2.0F, 0.5F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-6.1962F, -2.6373F, 1.5F, 0.0F, 0.0F, 0.3491F));

        return TexturedModelData.of(modelData, 64, 128);
    }

    @Override
    public void setAngles(HaiyiEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
        waist.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        shuimu.render(matrices, vertices, light, overlay, red, green, blue, alpha);

    }
}