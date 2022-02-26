package teamzombie.pokez.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import teamzombie.pokez.PokeZ;
import teamzombie.pokez.items.PokeballItem;
import teamzombie.pokez.items.PokemonAnimalItem;
import teamzombie.pokez.setup.Registration;

public class ModItemTags extends ItemTagsProvider {

	public ModItemTags(DataGenerator generator, BlockTagsProvider blockTags, ExistingFileHelper helper) {
		super(generator, blockTags, PokeZ.MODID, helper);
	}

	@Override
	protected void addTags() {
		tag(PokemonAnimalItem.POKEMON_ANIMAL_ITEM)
			.add(Registration.Bee_Item.get())
			.add(Registration.Cat_Item.get())
			.add(Registration.Chicken_Item.get())
			.add(Registration.Cow_Item.get())
			.add(Registration.Donkey_Item.get())
			.add(Registration.Fox_Item.get())
			.add(Registration.Goat_Item.get())
			.add(Registration.Pig_Item.get())
			.add(Registration.Rabbit_Item.get())
			.add(Registration.Sheep_Item.get())
			.add(Registration.Wolf_Item.get());
		
		tag(PokeballItem.POKEMON_BALLS)
		    .add(Registration.Red_Pokeball.get())
		    .add(Registration.Green_Pokeball.get())
		    .add(Registration.Blue_Pokeball.get());
	}
	
	@Override 
	public String getName() {return "PokeZ Mod Tags";}

}
