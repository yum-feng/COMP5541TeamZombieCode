package teamzombie.pokez.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;
import teamzombie.pokez.PokeZ;
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
		add(Registration.Pokeball_Red_Block_Item.get(), "Red Pokeball Block");	
		add(Registration.Pokeball_Green_Block_Item.get(), "Green Pokeball Block");	
		add(Registration.Pokeball_Blue_Block_Item.get(), "Blue Pokeball Block");	
	}
}
