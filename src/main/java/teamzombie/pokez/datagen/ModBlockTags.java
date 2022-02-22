package teamzombie.pokez.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import teamzombie.pokez.PokeZ;
import teamzombie.pokez.blocks.PokeballBlock;
import teamzombie.pokez.setup.Registration;

public class ModBlockTags extends BlockTagsProvider {

	public ModBlockTags(DataGenerator generator, ExistingFileHelper helper) {
		super(generator, PokeZ.MODID, helper);
	}

	@Override
	protected void addTags() {

		tag(PokeballBlock.POKEBALL_BLOCK_TAG)
			.add(Registration.Pokeball_Red_Block.get())
			.add(Registration.Pokeball_Green_Block.get())
			.add(Registration.Pokeball_Blue_Block.get());
	}
	
	@Override 
	public String getName() {return "PokeZ Mod Tags";}
}
