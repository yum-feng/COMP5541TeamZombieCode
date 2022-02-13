package teamzombie.pokez;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import teamzombie.pokez.core.ItemInit;
import teamzombie.pokez.events.EntityRightClickEvent;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(PokeZ.MODID)
public class PokeZ
{
	
    public static final String MODID = "pokez";
    private static final Logger LOGGER = LogManager.getLogger();

    public PokeZ() {
		
		IEventBus modbus = FMLJavaModLoadingContext.get().getModEventBus();	
		IEventBus eventModBus = MinecraftForge.EVENT_BUS;
		
		// Prints to the console the name of the entity that is hit
		// Why it prints several times... beats me!
		eventModBus.register(new EntityRightClickEvent());
		ItemInit.ITEMS.register(modbus);
		
//		modbus.addListener(ModSetup::init);
//		DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> modbus.addListener(ClientSetup::init));
    }
    

}
