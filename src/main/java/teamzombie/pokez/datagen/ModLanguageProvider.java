package teamzombie.pokez.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;
import teamzombie.pokez.PokeZ;
import teamzombie.pokez.items.PokeballItem;
import teamzombie.pokez.items.PokemonAnimalItem;
import teamzombie.pokez.items.PokemonBlockItem;
import teamzombie.pokez.setup.Registration;

public class ModLanguageProvider extends LanguageProvider {
	
	public ModLanguageProvider(DataGenerator generator, String locale) {
		super(generator, PokeZ.MODID, locale);
		
	}
	
	@Override
	protected void addTranslations() {
		add("itemGroup." + PokemonAnimalItem.TAB_NAME, PokemonAnimalItem.TAB_NAME);
		add("itemGroup." + PokemonBlockItem.TAB_NAME, PokemonBlockItem.TAB_NAME);
		
		add(Registration.Bee_Item.get(), "Bee");
		add(Registration.Cat_Item.get(), "Cat");
		add(Registration.Chicken_Item.get(), "Chicken");
		add(Registration.Cow_Item.get(), "Cow");
		add(Registration.Donkey_Item.get(), "Donkey");
		add(Registration.Fox_Item.get(), "Fox");
		add(Registration.Goat_Item.get(), "Goat");
		add(Registration.Pig_Item.get(), "Pig");
		add(Registration.Rabbit_Item.get(), "Rabbit");
		add(Registration.Sheep_Item.get(), "Sheep");
		add(Registration.Wolf_Item.get(), "Wolf");
    
		add(Registration.Red_Pokeball_Ore_Block_Item.get(), "Red Pokeball Ore");	
		add(Registration.Green_Pokeball_Ore_Block_Item.get(), "Green Pokeball Ore");	
		add(Registration.Blue_Pokeball_Ore_Block_Item.get(), "Blue Pokeball Ore");	

    add("itemGroup." + PokeballItem.TAB_NAME, PokeballItem.TAB_NAME);
		add(Registration.Red_PokeBall.get(), "Red PokeBall");
		add(Registration.Blue_PokeBall.get(), "Blue PokeBall");
		add(Registration.Green_PokeBall.get(), "Green PokeBall");
	}
}
