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
            for(int i = 0; i < 1000; ++i) {
                var r = new Random();
                this.level.addParticle(po, this.getX(), this.getY(), this.getZ(), 3*r.nextDouble(), 3*r.nextDouble(), 3*r.nextDouble());
            }
        }
        if (b == 2) {
            ParticleOptions po = ParticleTypes.DOLPHIN;
            for(int i = 0; i < 8; ++i) {
                this.level.addParticle(po, this.getX(), this.getY(), this.getZ(), 0.0D, 0.0D, 0.0D);
            }
        }
    }

    protected void onHitEntity(EntityHitResult ehr) {
        super.onHitEntity(ehr);
        Entity entity = ehr.getEntity();
        float p = new Random().nextFloat();
        if (!this.level.isClientSide) {
            if (this.getItem().getItem().getDescriptionId() == Red_PokeBall.get().getDescriptionId()) {
                this.discard();
                if (p >= 0.7) {
                    this.level.broadcastEntityEvent(this, (byte) 1);
                    entity.spawnAtLocation(getAnimalItem(entity.getName().getString()));
                    entity.remove(RemovalReason.DISCARDED);
                } else {
                    this.level.broadcastEntityEvent(this, (byte) 2);
                    entity.spawnAtLocation(this.getItem());
                }
            } else if (this.getItem().getItem().getDescriptionId() == Green_PokeBall.get().getDescriptionId()) {
                this.discard();
                if (p >= 0.4) {
                    this.level.broadcastEntityEvent(this, (byte) 1);
                    entity.spawnAtLocation(getAnimalItem(entity.getName().getString()));
                    entity.remove(RemovalReason.DISCARDED);
                } else {
                    this.level.broadcastEntityEvent(this, (byte) 2);
                    entity.spawnAtLocation(this.getItem());
                }
            } else if (this.getItem().getItem().getDescriptionId() == Blue_PokeBall.get().getDescriptionId()) {
                this.discard();
                if (p >= 0.1) {
                    this.level.broadcastEntityEvent(this, (byte) 1);
                    entity.spawnAtLocation(getAnimalItem(entity.getName().getString()));
                    entity.remove(RemovalReason.DISCARDED);
                } else {
                    this.level.broadcastEntityEvent(this, (byte) 2);
                    entity.spawnAtLocation(this.getItem());
                }
            }
        }

    }

    protected void onHit(HitResult r) {
        super.onHit(r);
        if (!this.level.isClientSide && ( r.getType() != HitResult.Type.ENTITY )) {
            this.discard();
            this.spawnAtLocation(this.getItem());
            //this.level.broadcastEntityEvent(this, (byte)3);
            //this.discard();
        }
        System.out.println(r.toString());
    }
}
