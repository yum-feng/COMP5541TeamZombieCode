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
import teamzombie.pokez.projectile.PokeAnimal;
import teamzombie.pokez.setup.Registration;

/*+----------------------------------------------------------------------
||
||  Class PokemonAnimalItem
||
||         Author:  Adam Pearson
||
||        Purpose:  This class is the base class for our pokemon animal
||					items. It is used to add overall features to the
||					pokemon animal items. 
||
||  Inherits From:  Inherits from the forge Item class

||
|+-----------------------------------------------------------------------
||
||      Features:  I have added the tab property for the pokemon animals
||
++-----------------------------------------------------------------------*/

public class PokemonAnimalItem extends Item {

	// Default constructor
	public PokemonAnimalItem(Properties props) {
		super(props.tab(ITEM_GROUP));
	}
	
	// New class constructor (class block properties)
	public PokemonAnimalItem() {
		super(ITEM_PROPERTIES);
	}
	public InteractionResultHolder<ItemStack> use(Level l, Player p, InteractionHand ih) { //https://forums.minecraftforge.net/topic/103660-1171-custom-fishing-rod-doesnt-cast/
		ItemStack itemstack = p.getItemInHand(ih);
		l.playSound((Player)null, p.getX(), p.getY(), p.getZ(), SoundEvents.SNOWBALL_THROW, SoundSource.NEUTRAL, 0.5F, 0.4F / (l.getRandom().nextFloat() * 0.4F + 0.8F));
		if (!l.isClientSide) {
			PokeAnimal pokeanimal = new PokeAnimal(l, p);
			pokeanimal.setItem(itemstack);
			pokeanimal.shootFromRotation(p, p.getXRot(), p.getYRot(), 0.0F, 1.5F, 1.0F);
			l.addFreshEntity(pokeanimal);
			itemstack.shrink(1);
		}
		return InteractionResultHolder.sidedSuccess(itemstack, l.isClientSide());
	}
	public static final String TAB_NAME = "Pokebies";

	// Define creative mode tab for pokemon animals
	private static final CreativeModeTab ITEM_GROUP = new CreativeModeTab(TAB_NAME) {
		@Override
		public ItemStack makeIcon() { 
			return new ItemStack (Registration.Wolf_Item.get()); 
		};
	};	
	
	//Properties of pokemon animal item
	private static final Properties ITEM_PROPERTIES = new Properties()
			.fireResistant()
			.tab(ITEM_GROUP); 
	
}
