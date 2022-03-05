package teamzombie.pokez.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.Items;
import teamzombie.pokez.setup.Registration;

public class ModLootTable extends BaseLootTableProvider{
    public ModLootTable(DataGenerator dataGeneratorIn) {
        super(dataGeneratorIn);
    }

    @Override
    protected void addTables() {
    	// Loot table for our pokeball block. Drops a redstone when a diamond pickaxe is used.
    	// Will modify to pokeball when the pokeball item is finished.
        lootTables.put(Registration.Red_Pokeball_Ore_Block.get(), createItemDropWithToolTable("pokeball_red_block", Registration.Red_Pokeball_Ore_Block.get(), Registration.Red_PokeBall.get(), Items.DIAMOND_PICKAXE));
        lootTables.put(Registration.Green_Pokeball_Ore_Block.get(), createItemDropWithToolTable("pokeball_green_block", Registration.Green_Pokeball_Ore_Block.get(), Registration.Green_PokeBall.get(), Items.DIAMOND_PICKAXE));
        lootTables.put(Registration.Blue_Pokeball_Ore_Block.get(), createItemDropWithToolTable("pokeball_blue_block", Registration.Blue_Pokeball_Ore_Block.get(), Registration.Blue_PokeBall.get(), Items.DIAMOND_PICKAXE));
    }
}
