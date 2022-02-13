package teamzombie.pokez.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import teamzombie.pokez.PokeZ;

public class ModBlockTags extends BlockTagsProvider {

	public ModBlockTags(DataGenerator generator, ExistingFileHelper helper) {
		super(generator, PokeZ.MODID, helper);
	}

	@Override
	protected void addTags() {
			
/* example code to add tags for blocks (will be used later)
		
		tag(BlockTags.MINEABLE_WITH_PICKAXE)
			.add(Registration.Example_Block.get());
		tag(BlockTags.NEEDS_IRON_TOOL)
			.add(Registration.Example_Block.get());
		tag(Tags.Blocks.ORES)
			.add(Registration.Example_Block.get());

*/
	}
	
	@Override 
	public String getName() {return "PokeZ Mod Tags";}
}
