package teamzombie.pokez.items;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import teamzombie.pokez.PokeZ;
import teamzombie.pokez.setup.Registration;

/*+----------------------------------------------------------------------
||
||  Class PokemonBlockItem
||
||         Author:  Adam Pearson
||
||        Purpose:  This class is the base class for our pokemon block
||					items. It is used to add overall features to the
||					pokemon block items. 
||
||  Inherits From:  Inherits from the forge BlockItem class

||
|+-----------------------------------------------------------------------
||
||      Features:  I have added the tab property for the pokemon blocks
||
++-----------------------------------------------------------------------*/

public class PokemonBlockItem extends BlockItem {

	// Default constructor
	public PokemonBlockItem(Block block, Properties props) {
		super(block, props.tab(ITEM_GROUP));
	}
	 
	// New class constructor (class block properties)
	public PokemonBlockItem(Block block) {
		super(block, ITEM_PROPERTIES);
	}
	
	public static final String TAB_NAME = "Pokemon Blocks";
	public static final Tags.IOptionalNamedTag<Item> POKEMON_BLOCK_ITEM = ItemTags.createOptional(new ResourceLocation(PokeZ.MODID, "pokemon_block"));

	// Define creative mode tab for pokemon blocks
	private static final CreativeModeTab ITEM_GROUP = new CreativeModeTab(TAB_NAME) {
		@Override
		public ItemStack makeIcon() { 
			// Use our registered pokeball block item as tab icon
			return new ItemStack (Registration.Red_Pokeball_Ore_Block_Item.get()); 
		};
	};
	
	//basic properties of pokemon block item
	private static final Item.Properties ITEM_PROPERTIES = new Item.Properties()
			.tab(ITEM_GROUP); 
}
