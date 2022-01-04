package fun.zhufn.medium5;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.world.World;

public class HaiyiEntity extends PathAwareEntity{
    public HaiyiEntity(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
    }
}
