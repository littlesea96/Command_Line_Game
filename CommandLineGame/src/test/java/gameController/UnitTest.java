package gameController;

import command.*;
import item.Potion;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Sea on 2/4/17.
 */
public class UnitTest {

    @Test
    public void testGetCommand() throws Exception {
        assertEquals(GameController.getCommand("info").getClass(), new InfoCommand().getClass());
        assertEquals(GameController.getCommand("go").getClass(), new GoCommand().getClass());
        assertEquals(GameController.getCommand("help").getClass(), new HelpCommand().getClass());
        assertEquals(GameController.getCommand("quit").getClass(), new QuitCommand().getClass());
        assertEquals(GameController.getCommand("take").getClass(), new TakeCommand().getClass());
        assertEquals(GameController.getCommand("use").getClass(), new UseCommand().getClass());
        assertEquals(GameController.getCommand("attackWith").getClass(), new AttackWithCommand().getClass());
    }

}