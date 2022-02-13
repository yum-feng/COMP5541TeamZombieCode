package teamzombie.pokez.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import teamzombie.pokez.PokeZ;

public class ModBlockStates extends BlockStateProvider {
	
	public ModBlockStates(DataGenerator gen, ExistingFileHelper helper) {
		super(gen, PokeZ.MODID , helper);
	};
	
	@Override
	protected void registerStatesAndModels() {
		
		//simpleBlock(Registration.Example_Bloc.get());

	}

}
