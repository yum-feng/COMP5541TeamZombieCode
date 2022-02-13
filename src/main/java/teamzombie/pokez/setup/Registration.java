package teamzombie.pokez.setup;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import teamzombie.pokez.PokeZ;
import teamzombie.pokez.items.PokemonAnimalItem;

/*+----------------------------------------------------------------------
||
||  Class Registration
||
||         Author:  Adam Pearson
||
||        Purpose:  This class is used to register all our items, blocks 
||					and entities for our pokez mod.
||
|+-----------------------------------------------------------------------
||
||  Constants:  Public static constants for each item
||
|+-----------------------------------------------------------------------
||
||  Class Methods:  
||
||		init(): Should be called by main mod class to initiate 
||				the registration
||
++-----------------------------------------------------------------------*/

public class Registration {
	
	// Registries for blocks and items
	private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, PokeZ.MODID);
	private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PokeZ.MODID);
	
	// Basic item properties
	public static final Item.Properties ITEM_PROPERTIES = new Item.Properties();
	
	public static void init() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		BLOCKS.register(bus);
		ITEMS.register(bus);
		
	}
	
	// Registering pokemon animal items
	public static final RegistryObject<Item> Cow = ITEMS.register("cow", () -> new PokemonAnimalItem(ITEM_PROPERTIES));
	public static final RegistryObject<Item> Pig = ITEMS.register("pig", () -> new PokemonAnimalItem(ITEM_PROPERTIES));
	public static final RegistryObject<Item> Sheep = ITEMS.register("sheep", () -> new PokemonAnimalItem(ITEM_PROPERTIES));
	public static final RegistryObject<Item> Chicken = ITEMS.register("chicken", () -> new PokemonAnimalItem(ITEM_PROPERTIES));
	
}
