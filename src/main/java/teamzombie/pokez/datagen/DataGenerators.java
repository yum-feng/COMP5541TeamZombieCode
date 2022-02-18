package teamzombie.pokez.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;
import teamzombie.pokez.PokeZ;

@Mod.EventBusSubscriber(modid = PokeZ.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
	
	@SubscribeEvent
	public static void gatherData(GatherDataEvent event) {
		
		DataGenerator generator = event.getGenerator();
		
		if (event.includeServer()) {
			ModBlockTags blockTags = new ModBlockTags(generator, event.getExistingFileHelper());
			generator.addProvider(blockTags);
			generator.addProvider(new ModItemTags(generator, blockTags, event.getExistingFileHelper()));
		}
		
		if (event.includeClient()) {
			generator.addProvider(new ModBlockStates(generator, event.getExistingFileHelper()));
			generator.addProvider(new ModItemModels(generator, event.getExistingFileHelper()));
			generator.addProvider(new ModLanguageProvider(generator, "en_us"));
		}
	}

}
