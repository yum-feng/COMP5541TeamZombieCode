package teamzombie.pokez;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import teamzombie.pokez.setup.Registration;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


// The value here should match an entry in the META-INF/mods.toml file
@Mod(PokeZ.MODID)
public class PokeZ
{
	
    public static final String MODID = "pokez";
    private static final Logger LOGGER = LogManager.getLogger();

    public PokeZ() {
    	
    	// Registration for items, blocks and entities
    	Registration.init();
		
		
		IEventBus modbus = FMLJavaModLoadingContext.get().getModEventBus();	
		IEventBus eventModBus = MinecraftForge.EVENT_BUS;
		
//		modbus.addListener(ModSetup::init);
//		DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> modbus.addListener(ClientSetup::init));
    }
    

}
