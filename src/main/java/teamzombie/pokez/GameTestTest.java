package teamzombie.pokez;

import net.minecraft.core.BlockPos;
import net.minecraft.gametest.framework.GameTest;
import net.minecraft.gametest.framework.GameTestHelper;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.event.RegisterGameTestsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.gametest.GameTestHolder;

@GameTestHolder("pokez")

public class GameTestTest {

    public static final String MODID = "pokez";

    @SubscribeEvent
    public void onRegisterGameTests(RegisterGameTestsEvent event)
    {
        // Registers all methods in this class annotated with @GameTest or @GameTestGenerator to the GameTestRegistry
        event.register(this.getClass());
    }

    @GameTest(templateNamespace = MODID)
    public static void testWood(GameTestHelper helper)
    {
        // The woodPos is in the bottom center of the 3x3x3 structure
        BlockPos woodPos = new BlockPos(1, 1, 1);

        // assertBlockState will convert the relative woodPos into a real world block position and check it with the predicate.
        // Relative positions are made absolute by adding their value to the block position of the structure tile entity,
        // which is always the lowest northwest corner inside the structure.
        // If the predicate fails, the String supplier will be used to construct an exception message, which is thrown
        helper.assertBlockState(woodPos, b -> b.is(Blocks.OAK_LOG), () -> "Block was not an oak log");

        // If we got to this point, the assert succeeded, so the test has succeeded.
        // Game tests require explicitly declaring success, otherwise they fail from timeout.
        helper.succeed();
    }

}
