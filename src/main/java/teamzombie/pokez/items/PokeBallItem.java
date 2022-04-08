package teamzombie.pokez.items;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.Tags;
import teamzombie.pokez.PokeZ;
import teamzombie.pokez.projectile.PokeBall;
import teamzombie.pokez.setup.Registration;

/*+----------------------------------------------------------------------
||
||  Class PokemonAnimalItem
||
||
||        Purpose:  This class is the base class for our PokeBall
||					items. It is used to add overall features to the
||					PokeBall items.
||
||  Inherits From:  Inherits from the forge Item class

||
|+-----------------------------------------------------------------------
||
||      Features:  Added the tab property for the PokeBalls
||
++-----------------------------------------------------------------------*/
public class PokeBallItem extends Item{

	public PokeBallItem(Properties props) {
		super(props.tab(ITEM_GROUP));
	}
	
	public PokeBallItem() {
		super(ITEM_PROPERTIES.tab(ITEM_GROUP));
	}

	public InteractionResultHolder<ItemStack> use(Level l, Player p, InteractionHand ih) { //https://forums.minecraftforge.net/topic/103660-1171-custom-fishing-rod-doesnt-cast/
		ItemStack itemstack = p.getItemInHand(ih);
		l.playSound((Player)null, p.getX(), p.getY(), p.getZ(), SoundEvents.SNOWBALL_THROW, SoundSource.NEUTRAL, 0.5F, 0.4F / (l.getRandom().nextFloat() * 0.4F + 0.8F));
		if (!l.isClientSide) {
			PokeBall pokeball = new PokeBall(l, p);
			pokeball.setItem(itemstack);
			pokeball.shootFromRotation(p, p.getXRot(), p.getYRot(), 0.0F, 1.5F, 1.0F);
			l.addFreshEntity(pokeball);
		}
		return InteractionResultHolder.sidedSuccess(itemstack, l.isClientSide());
	}

	public static final String TAB_NAME = "Pokeballs";

	//basic properties of PokeBall item
	private static final Item.Properties ITEM_PROPERTIES = new Item.Properties(); 
	
	// Define creative mode tab for PokeBall animals
	private static final CreativeModeTab ITEM_GROUP = new CreativeModeTab(TAB_NAME) {
		@Override
		public ItemStack makeIcon() { 
			return new ItemStack (Registration.Red_PokeBall.get());
		};
	};	
	
}
