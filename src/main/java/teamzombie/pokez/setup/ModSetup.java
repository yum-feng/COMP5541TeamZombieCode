package teamzombie.pokez.setup;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

public class ModSetup {

//	public static final String TAB_NAME = "PokeZ";
//	
//	public static final CreativeModeTab ITEM_GROUP = new CreativeModeTab(TAB_NAME) {
//		@Override
//		public ItemStack makeIcon() { 
//			return new ItemStack (Items.DIAMOND); // This should icon of maybe a pokeball
//		};
//	};
	
	public static void init(FMLCommonSetupEvent event) {
		System.out.println("Mod setup event!!!");
	}
}
