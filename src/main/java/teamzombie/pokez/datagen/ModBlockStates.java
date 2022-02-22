package teamzombie.pokez.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import teamzombie.pokez.PokeZ;
import teamzombie.pokez.setup.Registration;

public class ModBlockStates extends BlockStateProvider {
	
	public ModBlockStates(DataGenerator gen, ExistingFileHelper helper) {
		super(gen, PokeZ.MODID , helper);
	};
	
	@Override
	protected void registerStatesAndModels() {
		
		simpleBlock(Registration.Pokeball_Red_Block.get());
		simpleBlock(Registration.Pokeball_Green_Block.get());
		simpleBlock(Registration.Pokeball_Blue_Block.get());

	}

}
