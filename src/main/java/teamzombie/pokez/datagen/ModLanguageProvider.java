package teamzombie.pokez.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;
import teamzombie.pokez.PokeZ;
import teamzombie.pokez.items.PokemonAnimalItem;
import teamzombie.pokez.setup.Registration;

public class ModLanguageProvider extends LanguageProvider {
	
	public ModLanguageProvider(DataGenerator generator, String locale) {
		super(generator, PokeZ.MODID, locale);
		
	}
	
	@Override
	protected void addTranslations() {
		add("itemGroup." + PokemonAnimalItem.TAB_NAME, PokemonAnimalItem.TAB_NAME);
		
		add(Registration.Chicken.get(), "Chicken");
		add(Registration.Cow.get(), "Cow");
		add(Registration.Sheep.get(), "Sheep");
		add(Registration.Pig.get(), "Pig");
		
	}

}
