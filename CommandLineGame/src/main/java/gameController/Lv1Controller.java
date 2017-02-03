package gameController;

import command.Command;
import command.CommandParser;
import io.muic.ooc.homework2.CommandLineGame.*;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Sea on 2/3/17.
 */
public class Lv1Controller extends GameController {

    @Override
    public void start(Player player) {
        MapLv1Factory gameMapFactory = new MapLv1Factory();
        GameMap gameMap = gameMapFactory.create(player);
        String name = player.getName();
        Scanner scanner = new Scanner(System.in);
        boolean over = false;

        while (!over) {
            System.out.print(name + ": ");
            String commandLine = scanner.nextLine();
            CommandParser parser = new CommandParser();
            String[] parsedCommand = parser.parse(commandLine);
            Command command = getCommand(parsedCommand[0]);

            if (null == command) {
                System.out.println("Unknown command [" + commandLine + "]. Available commands: info, go, use, take and quit.");
            } else {

                if(parsedCommand.length > 1){
                    String[] args = Arrays.copyOfRange(parsedCommand, 1, parsedCommand.length);
                    command.apply(player, args);
                } else {
                    command.apply(player, null);
                }

                if(objMet(player, gameMap)){
                    over = true;
                    System.out.println("End Lv1");
                }

            }
        }
    }

    @Override
    public boolean objMet(Player player, GameMap gameMap) {
        Room room = player.getCurrentRoom();
        if(room.isExitRoom()){
            return true;
        } else {
            return false;
        }
    }
}
