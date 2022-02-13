package teamzombie.pokez.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import teamzombie.pokez.PokeZ;
import teamzombie.pokez.setup.Registration;

public class ModItemModels extends ItemModelProvider {

	public ModItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
		super(generator, PokeZ.MODID , existingFileHelper);
		
	}

	@Override
	protected void registerModels() {
		
		// Model json generation for blocks
		// withExistingParent(Registration.Example_Block.get().getRegistryName().getPath(), modLoc("block/example_block"));

	
		// Model json generation for pokemon animal items
		singleTexture(Registration.Chicken.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/chicken"));
		singleTexture(Registration.Cow.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/cow"));
		singleTexture(Registration.Pig.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/pig"));
		singleTexture(Registration.Sheep.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/sheep"));
	};
	
	
	
}
