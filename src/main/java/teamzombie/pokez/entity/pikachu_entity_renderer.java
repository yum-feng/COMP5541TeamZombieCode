package teamzombie.pokez.entity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import teamzombie.pokez.PokeZ;

import javax.naming.Context;

public class pikachu_entity_renderer<Type extends pikachu_entity> extends MobRenderer<Type, pikachu_entity_model<Type>> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(PokeZ.MODID, "textures/entity/pikachu_entity.png");

    public pikachu_entity_renderer(EntityRendererProvider.Context context) {
        super((EntityRendererProvider.Context) context, new pikachu_entity_model(context.bakeLayer(pikachu_entity_model.LAYER_LOCATION)), 0.05f);
    }

    @Override
    public ResourceLocation getTextureLocation(pikachu_entity Entity) {
        return TEXTURE;
    }
}
