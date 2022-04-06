package teamzombie.pokez.setup;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import teamzombie.pokez.PokeZ;
import teamzombie.pokez.entities.pikachu_entity;
import teamzombie.pokez.items.PokeBallItem;
import teamzombie.pokez.items.PokemonAnimalItem;
import teamzombie.pokez.items.PokemonBlockItem;
import teamzombie.pokez.blocks.PokeballOreBlock;
import teamzombie.pokez.projectile.ThrowablePokeball;
import teamzombie.pokez.projectile.ThrowablePokemonItem;

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
	private static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, PokeZ.MODID);

	public static void init() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		BLOCKS.register(bus);
		ITEMS.register(bus);
		ENTITIES.register(bus);
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

	//Registering pokeball items
	public static final RegistryObject<Item> Red_PokeBall = ITEMS.register("red_pokeball", () -> new PokeballItem());
	public static final RegistryObject<Item> Green_PokeBall = ITEMS.register("green_pokeball", () -> new PokeballItem());
	public static final RegistryObject<Item> Blue_PokeBall = ITEMS.register("blue_pokeball", () -> new PokeballItem());

	// Registering pokemon blocks and block items
	public static final RegistryObject<Block> Red_Pokeball_Ore_Block = BLOCKS.register("pokeball_red_block", () -> new PokeballOreBlock());
	public static final RegistryObject<Item> Red_Pokeball_Ore_Block_Item = ITEMS.register("pokeball_red_block", () -> new PokemonBlockItem(Red_Pokeball_Ore_Block.get()));
	public static final RegistryObject<Block> Green_Pokeball_Ore_Block = BLOCKS.register("pokeball_green_block", () -> new PokeballOreBlock());
	public static final RegistryObject<Item> Green_Pokeball_Ore_Block_Item = ITEMS.register("pokeball_green_block", () -> new PokemonBlockItem(Green_Pokeball_Ore_Block.get()));
	public static final RegistryObject<Block> Blue_Pokeball_Ore_Block = BLOCKS.register("pokeball_blue_block", () -> new PokeballOreBlock());
	public static final RegistryObject<Item> Blue_Pokeball_Ore_Block_Item = ITEMS.register("pokeball_blue_block", () -> new PokemonBlockItem(Blue_Pokeball_Ore_Block.get()));

	// Entities
	public static final RegistryObject<EntityType<ThrowablePokeball>> POKEBALL_ENTITY = ENTITIES.register("pokeball_entity", () -> EntityType.Builder.<ThrowablePokeball>of(ThrowablePokeball::new, MobCategory.MISC).sized(0.25f, 0.25f).clientTrackingRange(4).updateInterval(10).build("pokeball_entity"));
	public static final RegistryObject<EntityType<ThrowablePokemonItem>> POKEANIMAL_ENTITY = ENTITIES.register("pokeanimal_entity", () -> EntityType.Builder.<ThrowablePokemonItem>of(ThrowablePokemonItem::new, MobCategory.MISC).sized(0.25f, 0.25f).clientTrackingRange(4).updateInterval(10).build("pokeanimal_entity"));

	public static Item getAnimalItem(String name) {
		var iter = ITEMS.getEntries().iterator();
		while(iter.hasNext()){
			var curItem = iter.next().get();
			String curItemName = curItem.getRegistryName().toString();
			if(curItemName.contains(name.toLowerCase())){
				return curItem;
			}
		}
		return null;
	}
}
