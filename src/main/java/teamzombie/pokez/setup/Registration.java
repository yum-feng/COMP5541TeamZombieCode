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
import teamzombie.pokez.items.PokemonBlockItem;
import teamzombie.pokez.blocks.PokeballBlock;

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

	public static void init() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		BLOCKS.register(bus);
		ITEMS.register(bus);	
	}
	
	// Registering pokemon animal items
	public static final RegistryObject<Item> Bee_Item = ITEMS.register("bee_item", () -> new PokemonAnimalItem());
	public static final RegistryObject<Item> Cat_Item = ITEMS.register("cat_item", () -> new PokemonAnimalItem());
	public static final RegistryObject<Item> Chicken_Item = ITEMS.register("chicken_item", () -> new PokemonAnimalItem());
	public static final RegistryObject<Item> Cow_Item = ITEMS.register("cow_item", () -> new PokemonAnimalItem());
	public static final RegistryObject<Item> Donkey_Item = ITEMS.register("donkey_item", () -> new PokemonAnimalItem());
	public static final RegistryObject<Item> Fox_Item = ITEMS.register("fox_item", () -> new PokemonAnimalItem());
	public static final RegistryObject<Item> Goat_Item = ITEMS.register("goat_item", () -> new PokemonAnimalItem());
	public static final RegistryObject<Item> Pig_Item = ITEMS.register("pig_item", () -> new PokemonAnimalItem());
	public static final RegistryObject<Item> Rabbit_Item = ITEMS.register("rabbit_item", () -> new PokemonAnimalItem());
	public static final RegistryObject<Item> Sheep_Item = ITEMS.register("sheep_item", () -> new PokemonAnimalItem());
	public static final RegistryObject<Item> Wolf_Item = ITEMS.register("wolf_item", () -> new PokemonAnimalItem());

	// Registering pokemon blocks and block items
	public static final RegistryObject<Block> Pokeball_Red_Block = BLOCKS.register("pokeball_red_block", () -> new PokeballBlock());
	public static final RegistryObject<Item> Pokeball_Red_Block_Item = ITEMS.register("pokeball_red_block", () -> new PokemonBlockItem(Pokeball_Red_Block.get()));
	public static final RegistryObject<Block> Pokeball_Green_Block = BLOCKS.register("pokeball_green_block", () -> new PokeballBlock());
	public static final RegistryObject<Item> Pokeball_Green_Block_Item = ITEMS.register("pokeball_green_block", () -> new PokemonBlockItem(Pokeball_Green_Block.get()));
	public static final RegistryObject<Block> Pokeball_Blue_Block = BLOCKS.register("pokeball_blue_block", () -> new PokeballBlock());
	public static final RegistryObject<Item> Pokeball_Blue_Block_Item = ITEMS.register("pokeball_blue_block", () -> new PokemonBlockItem(Pokeball_Blue_Block.get()));
}
