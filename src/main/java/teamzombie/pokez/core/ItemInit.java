package teamzombie.pokez.core;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import teamzombie.pokez.PokeZ;
//import teamzombie.pokez;

public class ItemInit {
	
	private ItemInit() {
		
	}
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PokeZ.MODID);
	
	public static final RegistryObject<Item> Pokeball_ITEM = ITEMS.register("pokeball", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
	
	
	
}
