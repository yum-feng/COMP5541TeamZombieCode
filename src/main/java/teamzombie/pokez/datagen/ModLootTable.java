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
        lootTables.put(Registration.Pokeball_Red_Block.get(), createItemDropWithToolTable("pokeball_red_block", Registration.Pokeball_Red_Block.get(), Items.REDSTONE, Items.DIAMOND_PICKAXE));
        lootTables.put(Registration.Pokeball_Green_Block.get(), createItemDropWithToolTable("pokeball_green_block", Registration.Pokeball_Green_Block.get(), Items.REDSTONE, Items.DIAMOND_PICKAXE));
        lootTables.put(Registration.Pokeball_Blue_Block.get(), createItemDropWithToolTable("pokeball_blue_block", Registration.Pokeball_Blue_Block.get(), Items.REDSTONE, Items.DIAMOND_PICKAXE));
    }
}
