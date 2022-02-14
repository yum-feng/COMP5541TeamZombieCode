package teamzombie.pokez.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import teamzombie.pokez.PokeZ;
import teamzombie.pokez.items.PokemonAnimalItem;
import teamzombie.pokez.setup.Registration;

public class ModItemTags extends ItemTagsProvider {

	public ModItemTags(DataGenerator generator, BlockTagsProvider blockTags, ExistingFileHelper helper) {
		super(generator, blockTags, PokeZ.MODID, helper);
	}

	@Override
	protected void addTags() {
		tag(PokemonAnimalItem.POKEMON_ANIMAL_ITEM)
			.add(Registration.Chicken.get())
			.add(Registration.Cow.get())
			.add(Registration.Sheep.get())
			.add(Registration.Pig.get());
	}
	
	@Override 
	public String getName() {return "PokeZ Mod Tags";}

}
