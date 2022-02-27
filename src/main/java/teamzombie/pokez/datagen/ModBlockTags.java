package teamzombie.pokez.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import teamzombie.pokez.PokeZ;
import teamzombie.pokez.blocks.PokeballOreBlock;
import teamzombie.pokez.setup.Registration;

public class ModBlockTags extends BlockTagsProvider {

	public ModBlockTags(DataGenerator generator, ExistingFileHelper helper) {
		super(generator, PokeZ.MODID, helper);
	}

	@Override
	protected void addTags() {

		tag(PokeballOreBlock.POKEBALL_BLOCK_TAG)
			.add(Registration.Red_Pokeball_Ore_Block.get())
			.add(Registration.Green_Pokeball_Ore_Block.get())
			.add(Registration.Blue_Pokeball_Ore_Block.get());
	}
	
	@Override 
	public String getName() {return "PokeZ Mod Tags";}
}
