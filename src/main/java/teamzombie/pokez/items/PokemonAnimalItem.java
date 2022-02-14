package teamzombie.pokez.items;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.Tags;
import teamzombie.pokez.PokeZ;
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
	
	public static final String TAB_NAME = "Pokemon Animals";
	public static final Tags.IOptionalNamedTag<Item> POKEMON_ANIMAL_ITEM = ItemTags.createOptional(new ResourceLocation(PokeZ.MODID, "pokemon_animal"));

	public PokemonAnimalItem(Properties props) {
		super(props.tab(ITEM_GROUP));

	}
	
	// Define creative mode tab for pokemon animals
	private static final CreativeModeTab ITEM_GROUP = new CreativeModeTab(TAB_NAME) {
		@Override
		public ItemStack makeIcon() { 
			return new ItemStack (Registration.Cow.get()); 
		};
	};	
}
