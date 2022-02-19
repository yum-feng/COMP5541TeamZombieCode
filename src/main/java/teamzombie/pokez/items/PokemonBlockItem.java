package teamzombie.pokez.items;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import teamzombie.pokez.PokeZ;

public class PokemonBlockItem extends BlockItem {

	// Default constructor
	public PokemonBlockItem(Block block, Properties props) {
		super(block, props.tab(ITEM_GROUP));
	}
	
	// New class constructor (default propreties)
	public PokemonBlockItem(Block block) {
		super(block, ITEM_PROPERTIES.tab(ITEM_GROUP));
	}
	
	public static final String TAB_NAME = "Pokemon Blocks";
	public static final Tags.IOptionalNamedTag<Item> POKEMON_BLOCK_ITEM = ItemTags.createOptional(new ResourceLocation(PokeZ.MODID, "pokemon_block"));
	
	//basic properties of pokemon block item
	private static final Item.Properties ITEM_PROPERTIES = new Item.Properties(); 
	
	// Define creative mode tab for pokemon blocks
	private static final CreativeModeTab ITEM_GROUP = new CreativeModeTab(TAB_NAME) {
		@Override
		public ItemStack makeIcon() { 
			return new ItemStack (Items.IRON_BLOCK); 
		};
	};	
	
}
