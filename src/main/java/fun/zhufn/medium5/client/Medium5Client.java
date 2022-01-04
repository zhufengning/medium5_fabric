package fun.zhufn.medium5.client;

import fun.zhufn.medium5.HaiyiEntity;
import fun.zhufn.medium5.HaiyiEntityModel;
import fun.zhufn.medium5.Medium5;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import fun.zhufn.medium5.HaiyiEntityRenderer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

@Environment(EnvType.CLIENT)
public class Medium5Client implements ClientModInitializer {
    public static final EntityModelLayer MODEL_CUBE_LAYER = new EntityModelLayer(new Identifier("medium5", "haiyi"), "main");

    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(Medium5.HAIYI, HaiyiEntityRenderer::new);

        EntityModelLayerRegistry.registerModelLayer(MODEL_CUBE_LAYER, HaiyiEntityModel::getTexturedModelData);
    }
}
