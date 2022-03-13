package teamzombie.pokez.projectile;

import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;
import teamzombie.pokez.setup.Registration;
import net.minecraft.world.entity.EntityType;

public class PokeBall extends ThrowableItemProjectile {

    public PokeBall(EntityType<? extends ThrowableItemProjectile> et, Level l) {
        super(et, l);
    }

    public PokeBall(Level l, LivingEntity le) {
        super(Registration.POKEBALL_ENTITY.get(), le, l);
    }

    public PokeBall(Level l, double x, double y, double z) {
        super(Registration.POKEBALL_ENTITY.get(), x, y, z, l);
    }

    protected Item getDefaultItem() {
        return Registration.Red_PokeBall.get().asItem();
    }

    public void handleEntityEvent(byte b) {
        if (b == 3) {

            ParticleOptions po = ParticleTypes.EXPLOSION;

            for(int i = 0; i < 8; ++i) {
                this.level.addParticle(po, this.getX(), this.getY(), this.getZ(), 0.0D, 0.0D, 0.0D);
            }
        }
    }

    protected void onHitEntity(EntityHitResult ehr) {
        super.onHitEntity(ehr);
        Entity entity = ehr.getEntity();
        System.out.println(entity.getName().getString());
    }

    protected void onHit(HitResult r) {
        super.onHit(r);
        if (!this.level.isClientSide) {
            this.level.broadcastEntityEvent(this, (byte)3);
            this.discard();
        }
        System.out.println(r.toString());
    }
}