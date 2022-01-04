package fun.zhufn.medium5;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class Medium5 implements ModInitializer {

    public static final EntityType<HaiyiEntity> HAIYI = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier("medium5", "haiyi"),
            FabricEntityTypeBuilder
                    .create(SpawnGroup.CREATURE, HaiyiEntity::new)
                    .dimensions(EntityDimensions.fixed(1f, 2.25f))
                    .build()
    );

    public static final Item HAIYI_SPAWN_EGG = new SpawnEggItem(HAIYI, 8437242, 13297151, new Item.Settings().group(ItemGroup.MISC));

    @Override
    public void onInitialize() {
        FabricDefaultAttributeRegistry.register(HAIYI, HaiyiEntity.createMobAttributes());
        Registry.register(Registry.ITEM, new Identifier("medium5", "haiyi_spawn_egg"), HAIYI_SPAWN_EGG);
    }
}
