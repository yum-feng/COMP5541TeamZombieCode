package teamzombie.pokez.datagen;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import teamzombie.pokez.PokeZ;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import teamzombie.pokez.entities.Pikachu_Entity;
import teamzombie.pokez.setup.Registration;

@Mod.EventBusSubscriber(modid = PokeZ.MODID, bus = Bus.MOD)
public class CommonModEvents {

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event){
        event.put(Registration.PIKACHU_ENTITY.get(), Pikachu_Entity.createAttributes().build());
    }
}
