package teamzombie.pokez.blocks;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.common.Tags;
import teamzombie.pokez.PokeZ;

public class PokeballBlock extends Block {

	public PokeballBlock(Properties props) {
		super(props);
	}
	
	public PokeballBlock() {
		super(BLOCK_PROPERTIES);
	}
	
	public static final Tags.IOptionalNamedTag<Block> POKEBALL_BLOCK_TAG = BlockTags.createOptional(new ResourceLocation(PokeZ.MODID, "pokeball_block"));
	private static final Properties BLOCK_PROPERTIES = Properties.of(Material.STONE).strength(2f);

}
