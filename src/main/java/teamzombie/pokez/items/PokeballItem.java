package teamzombie.pokez.items;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.Tags;
import teamzombie.pokez.PokeZ;
import teamzombie.pokez.setup.Registration;


/*+----------------------------------------------------------------------
||
||  Class PokemonAnimalItem
||
||
||        Purpose:  This class is the base class for our Pokeball
||					items. It is used to add overall features to the
||					pokeball items. 
||
||  Inherits From:  Inherits from the forge Item class

||
|+-----------------------------------------------------------------------
||
||      Features:  Added the tab property for the Pokeballs
||
++-----------------------------------------------------------------------*/
public class PokeballItem extends Item{

	public PokeballItem(Properties props) {
		super(props.tab(ITEM_GROUP));
	}
	
	public PokeballItem() {
		super(ITEM_PROPERTIES.tab(ITEM_GROUP));
	}
	
	public static final String TAB_NAME = "Pokeballs";
	public static final Tags.IOptionalNamedTag<Item> POKEMON_BALLS = ItemTags.createOptional(new ResourceLocation(PokeZ.MODID, "pokeball"));
	
	//basic properties of pokeball item
	private static final Item.Properties ITEM_PROPERTIES = new Item.Properties(); 
	
	// Define creative mode tab for pokeball animals
	private static final CreativeModeTab ITEM_GROUP = new CreativeModeTab(TAB_NAME) {
		@Override
		public ItemStack makeIcon() { 
			return new ItemStack (Registration.Red_Pokeball.get()); 
		};
	};	
	
}
