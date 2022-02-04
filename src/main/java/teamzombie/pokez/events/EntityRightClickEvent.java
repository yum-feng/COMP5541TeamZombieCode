package teamzombie.pokez.events;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class EntityRightClickEvent {

    	@SubscribeEvent
    	public void animalHit (PlayerInteractEvent.EntityInteract event) {
    		if(Dist.CLIENT.isClient()) {
    			System.out.println(event.getTarget().getDisplayName().getString());
    		}
    	}
}
