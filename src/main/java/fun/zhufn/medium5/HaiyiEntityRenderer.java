package fun.zhufn.medium5;

import fun.zhufn.medium5.client.Medium5Client;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

import java.util.Date;

public class HaiyiEntityRenderer extends MobEntityRenderer<HaiyiEntity, HaiyiEntityModel> {
    public HaiyiEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new HaiyiEntityModel(context.getPart(Medium5Client.MODEL_CUBE_LAYER)), 0.5f);

    }

    @Override
    public Identifier getTexture(HaiyiEntity entity) {
        Date d= new Date();
        long x = d.getTime() / 1000;
        return x % 2 == 0 ?
                new Identifier("medium5", "textures/entity/haiyi/haiyi.png") :
                new Identifier("medium5", "textures/entity/haiyi/haiyi_shock.png");
    }
}
