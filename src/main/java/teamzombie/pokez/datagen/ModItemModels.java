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
		withExistingParent(Registration.Red_Pokeball_Ore_Block_Item.get().getRegistryName().getPath(), modLoc("block/pokeball_red_block"));
		withExistingParent(Registration.Green_Pokeball_Ore_Block_Item.get().getRegistryName().getPath(), modLoc("block/pokeball_green_block"));
		withExistingParent(Registration.Blue_Pokeball_Ore_Block_Item.get().getRegistryName().getPath(), modLoc("block/pokeball_blue_block"));

	
		// Model json generation for pokemon animal items
		singleTexture(Registration.Bee_Item.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/bee_item"));
		singleTexture(Registration.Cat_Item.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/cat_item"));
		singleTexture(Registration.Chicken_Item.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/chicken_item"));
		singleTexture(Registration.Cow_Item.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/cow_item"));
		singleTexture(Registration.Donkey_Item.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/donkey_item"));
		singleTexture(Registration.Fox_Item.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/fox_item"));
		singleTexture(Registration.Goat_Item.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/goat_item"));
		singleTexture(Registration.Pig_Item.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/pig_item"));
		singleTexture(Registration.Rabbit_Item.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/rabbit_item"));
		singleTexture(Registration.Sheep_Item.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/sheep_item"));
		singleTexture(Registration.Wolf_Item.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/wolf_item"));
		singleTexture(Registration.Red_PokeBall.get().getRegistryName().getPath(),mcLoc("item/generated"),"layer0",modLoc("item/red_pokeball"));
		singleTexture(Registration.Green_PokeBall.get().getRegistryName().getPath(),mcLoc("item/generated"),"layer0",modLoc("item/green_pokeball"));
		singleTexture(Registration.Blue_PokeBall.get().getRegistryName().getPath(),mcLoc("item/generated"),"layer0",modLoc("item/blue_pokeball"));
	};
	
	
	
}
