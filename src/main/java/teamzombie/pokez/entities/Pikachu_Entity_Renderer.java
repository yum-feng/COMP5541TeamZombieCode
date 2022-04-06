package teamzombie.pokez.entities;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import teamzombie.pokez.PokeZ;

public class Pikachu_Entity_Renderer<Type extends Pikachu_Entity> extends MobRenderer<Type, Pikachu_Entity_Model<Type>> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(PokeZ.MODID, "assets/pokez/textures/entitities/Pikachu_Entity.png");

    public Pikachu_Entity_Renderer(EntityRendererProvider.Context context) {
        super(context, new Pikachu_Entity_Model<>(context.bakeLayer(Pikachu_Entity_Model.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(Type entities) {
        return TEXTURE;
    }
}
