package teamzombie.pokez.blocks;

import java.util.function.ToIntFunction;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.common.Tags;
import teamzombie.pokez.PokeZ;

/*+----------------------------------------------------------------------
||
||  Class PokeballBlock
||
||         Author:  Adam Pearson
||
||        Purpose:  This class is the base class for our pokeball blocks.
					It is used to add overall features to the
||					pokeball blocks. 
||
||  Inherits From:  Inherits from the forge Block class

||
|+-----------------------------------------------------------------------
||
||      Features:  	Adds the selected default properties to all pokeball
					blocks.
||
++-----------------------------------------------------------------------*/

public class PokeballOreBlock extends Block {

	// Default constructor
	public PokeballOreBlock(Properties props) {
		super(props);
	}
	
	// New class constructor (class block properties)
	public PokeballOreBlock() {
		super(BLOCK_PROPERTIES);
	}

	// Light level of the block
	private static ToIntFunction<BlockState> lightLevel = BlockState -> 5;
	
	// Desired properties of a pokeball bloc
	private static final Properties BLOCK_PROPERTIES = Properties
			.of(Material.STONE)
			.sound(SoundType.NETHER_ORE)
			.destroyTime(4f)
			.explosionResistance(3f)
			.lightLevel(lightLevel);

}
