package teamzombie.pokez.items;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.Tags;
import teamzombie.pokez.PokeZ;

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
	
	public static final String TAB_NAME = "Pokemon Animals";
	public static final Tags.IOptionalNamedTag<Item> Pokemon_Animal_Item = ItemTags.createOptional(new ResourceLocation(PokeZ.MODID, "pokemon_animal"));

	public PokemonAnimalItem(Properties p_41383_) {
		super(p_41383_.tab(ITEM_GROUP));

	}
	
	// Define creative mode tab for pokemon
	private static final CreativeModeTab ITEM_GROUP = new CreativeModeTab(TAB_NAME) {
		@Override
		public ItemStack makeIcon() { 
			return new ItemStack (Items.BLACK_CANDLE); 
		};
	};
}
