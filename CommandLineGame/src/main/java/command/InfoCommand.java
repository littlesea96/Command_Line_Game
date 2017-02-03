package command;

import io.muic.ooc.homework2.CommandLineGame.Player;
import io.muic.ooc.homework2.CommandLineGame.Room;

/**
 * Created by Sea on 2/1/17.
 */
public class InfoCommand implements Command {

    @Override
    public void apply(Player player, String[] args) {
        Room room = player.getCurrentRoom();
        player.getInfo();
        room.getInfo();
//        System.out.println("cur " + room);
//        System.out.println("north " + room.getNorthExit());
//        System.out.println("south " + room.getSouthExit());
//        System.out.println("east " + room.getEastExit());
//        System.out.println("west " + room.getWestExit());
    }
}
