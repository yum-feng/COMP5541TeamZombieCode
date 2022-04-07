package teamzombie.pokez.datagen;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import teamzombie.pokez.PokeZ;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import teamzombie.pokez.entity.pikachu_entity;
import teamzombie.pokez.setup.Registration;

@Mod.EventBusSubscriber(modid = PokeZ.MODID, bus = Bus.MOD)
public class CommonModEvents {

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event){
        event.put(Registration.PIKACHU_ENTITY.get(), pikachu_entity.createAttributes().build());
    }
}
