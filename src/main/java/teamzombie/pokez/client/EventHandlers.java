package teamzombie.pokez.client;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import teamzombie.pokez.PokeZ;
import teamzombie.pokez.entities.Pikachu_Entity_Model;
import teamzombie.pokez.setup.Registration;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = PokeZ.MODID, value = Dist.CLIENT)
public class EventHandlers {

    private void ClientModEvents() {}

    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(Pikachu_Entity_Model.LAYER_LOCATION, Pikachu_Entity_Model::createBodyLayer);
    }

    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(Registration.POKEBALL_ENTITY.get(), ThrownItemRenderer::new);
        event.registerEntityRenderer(Registration.POKEANIMAL_ENTITY.get(), ThrownItemRenderer::new);
    }
}