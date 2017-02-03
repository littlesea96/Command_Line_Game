package command;

import io.muic.ooc.homework2.CommandLineGame.Player;

/**
 * Created by Sea on 2/4/17.
 */
public class HelpCommand implements Command {

    @Override
    public void apply(Player player, String[] args) {
        System.out.println("Play Command:");
        System.out.println("info");
        System.out.println("go direction (north, south, east, west)");
        System.out.println("take itemName");
        System.out.println("use potionName");
        System.out.println("attackWith weaponName");
        System.out.println("quit");
    }
}
