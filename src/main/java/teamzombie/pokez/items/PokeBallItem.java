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
	
	public static final String TAB_NAME = "PokeBalls";
	public static final Tags.IOptionalNamedTag<Item> POKEBALL = ItemTags.createOptional(new ResourceLocation(PokeZ.MODID, "pokeball"));
	
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
