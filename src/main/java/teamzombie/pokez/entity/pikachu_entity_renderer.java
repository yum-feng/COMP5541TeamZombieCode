package teamzombie.pokez.entity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import teamzombie.pokez.PokeZ;

import javax.annotation.Nonnull;

public class pikachu_entity_renderer extends MobRenderer<pikachu_entity, pikachu_entity_model<pikachu_entity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(PokeZ.MODID, "textures/entity/pikachu_entity.png");

    public pikachu_entity_renderer(EntityRendererProvider.Context context) {
        super(context, new pikachu_entity_model(context.bakeLayer(pikachu_entity_model.LAYER_LOCATION)), 0.5f);
    }

    @Nonnull
    @Override
    public ResourceLocation getTextureLocation(pikachu_entity entity) {
        return TEXTURE;
    }
}
