package teamzombie.pokez.projectile;

import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;
import teamzombie.pokez.setup.Registration;
import net.minecraft.world.entity.EntityType;

import java.util.Random;

import static teamzombie.pokez.setup.Registration.*;

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
        if (b == 1) {
            ParticleOptions po = ParticleTypes.ELECTRIC_SPARK;
            var mag = 2;
            var vmag = 3;
            for(int i = 0; i < 100000; ++i) {
                var r = new Random();
                var x = this.getX() + (r.nextDouble(mag * 2) - mag);
                var y = this.getY() + (r.nextDouble(mag * 2) - mag);
                var z = this.getZ() + (r.nextDouble(mag * 2) - mag);
                var vx = r.nextDouble(vmag * 2) - vmag;
                var vy = r.nextDouble(vmag * 2) - vmag;
                var vz = r.nextDouble(vmag * 2) - vmag;
                if(i % 100 == 0) {
                    this.level.addParticle(po, x, y, z, vx, vy, vz);
                }
            }
        }
    }

    protected void onHitEntity(EntityHitResult ehr) {
        super.onHitEntity(ehr);
        Entity hitEntity = ehr.getEntity();
        float p = new Random().nextFloat();
        String thrownPokeballId = this.getItem().getItem().getDescriptionId();
        Item hitAnimalItem = getAnimalItem(hitEntity.getName().getString());
        if (!this.level.isClientSide) {

            if (thrownPokeballId == Red_PokeBall.get().getDescriptionId()) {
                if (p >= 0.6) {
                    this.level.broadcastEntityEvent(this, (byte) 1);
                    hitEntity.spawnAtLocation(hitAnimalItem);
                    hitEntity.remove(RemovalReason.DISCARDED);
                } else {
                    hitEntity.spawnAtLocation(this.getItem());
                }
            } else if (thrownPokeballId == Green_PokeBall.get().getDescriptionId()) {
                if (p >= 0.3) {
                    this.level.broadcastEntityEvent(this, (byte) 1);
                    hitEntity.spawnAtLocation(getAnimalItem(hitEntity.getName().getString()));
                    hitEntity.remove(RemovalReason.DISCARDED);
                } else {
                    hitEntity.spawnAtLocation(this.getItem());

                }
            } else if (thrownPokeballId == Blue_PokeBall.get().getDescriptionId()) {
                if (p >= 0.05) {
                    this.level.broadcastEntityEvent(this, (byte) 1);
                    hitEntity.spawnAtLocation(getAnimalItem(hitEntity.getName().getString()));
                    hitEntity.remove(RemovalReason.DISCARDED);
                } else {
                    hitEntity.spawnAtLocation(this.getItem());
                }
            }
            this.discard();
        }

    }

    protected void onHit(HitResult r) {
        super.onHit(r);
        if (!this.level.isClientSide && ( r.getType() != HitResult.Type.ENTITY )) {
            this.discard();
            this.spawnAtLocation(this.getItem());
        }
    }
}
