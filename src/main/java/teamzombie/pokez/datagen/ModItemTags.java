package teamzombie.pokez.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
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
//		tag(Tags.Items.ORES)
//			.add(Registration.Block_1_Item.get())
//			.add(Registration.Block_2_Item.get())
//			.add(Registration.Block_3_Item.get())
//			.add(Registration.Block_4_Item.get());
		tag(PokemonAnimalItem.Pokemon_Animal_Item)
			.add(Registration.Chicken.get())
			.add(Registration.Cow.get())
			.add(Registration.Sheep.get())
			.add(Registration.Pig.get());
	}
	
	@Override 
	public String getName() {return "PokeZ Mod Tags";}

}
