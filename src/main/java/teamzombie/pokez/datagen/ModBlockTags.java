package teamzombie.pokez.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
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
			
		
		tag(BlockTags.MINEABLE_WITH_PICKAXE)
			.add(Registration.Pokeball_Block.get());
		tag(BlockTags.NEEDS_DIAMOND_TOOL)
			.add(Registration.Pokeball_Block.get());
		tag(PokeballBlock.POKEBALL_BLOCK_TAG)
			.add(Registration.Pokeball_Block.get());


	}
	
	@Override 
	public String getName() {return "PokeZ Mod Tags";}
}
