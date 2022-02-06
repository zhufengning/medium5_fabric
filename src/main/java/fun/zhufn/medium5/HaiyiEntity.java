package fun.zhufn.medium5;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.world.World;

public class HaiyiEntity extends CowEntity {
    public HaiyiEntity(EntityType<? extends HaiyiEntity> entityType, World world) {
        super(entityType, world);
    }
}
