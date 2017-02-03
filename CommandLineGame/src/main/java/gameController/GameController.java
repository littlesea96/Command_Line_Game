package gameController;

import command.*;
import io.muic.ooc.homework2.CommandLineGame.GameMap;
import io.muic.ooc.homework2.CommandLineGame.Player;

import java.util.HashMap;

/**
 * Created by Sea on 2/3/17.
 */
public abstract class GameController {
    private static final HashMap<String, Command> commands = new HashMap<String, Command>() {
        {
            // commands are added here using lambdas. It is also possible to dynamically add commands without editing the code.
            put("info", new InfoCommand());
            put("quit", new QuitCommand());
            put("go", new GoCommand());
            put("take", new TakeCommand());
            put("use", new UseCommand());
            put("attackWith", new AttackWithCommand());
            put("help", new HelpCommand());


        }
    };

    public static Command getCommand(String name) {
        return commands.get(name);
    }

    public abstract void start(Player player);

    public abstract boolean objMet(Player player, GameMap gameMap);


}
