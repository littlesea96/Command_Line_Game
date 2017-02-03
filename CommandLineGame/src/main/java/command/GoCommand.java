package command;

import io.muic.ooc.homework2.CommandLineGame.Player;
import io.muic.ooc.homework2.CommandLineGame.Room;

/**
 * Created by Sea on 2/1/17.
 */
public class GoCommand implements Command {
    @Override
    public void apply(Player player, String[] args) {
        Room nextRoom;
        switch (args[0]){
            case "north":
                nextRoom = player.getCurrentRoom().getNorthExit();
                if(nextRoom != null){
                    player.setCurrentRoom(nextRoom);
                    System.out.println("enter room");
                } else {
                    System.out.println("no exit");
                }
                break;
            case "south":
                nextRoom = player.getCurrentRoom().getSouthExit();
                if(nextRoom != null){
                    player.setCurrentRoom(nextRoom);
                    if(!player.getCurrentRoom().isExitRoom()) {
                        System.out.println("enter room");
                    }
                } else {
                    System.out.println("no exit");
                }
                break;
            case "east":

                nextRoom = player.getCurrentRoom().getEastExit();
                if(nextRoom != null){
                    player.setCurrentRoom(nextRoom);
                    if(!player.getCurrentRoom().isExitRoom()) {
                        System.out.println("enter room");
                    }
                } else {
                    System.out.println("no exit");
                }
                break;
            case "west":
                nextRoom = player.getCurrentRoom().getWestExit();
                if(nextRoom != null){
                    player.setCurrentRoom(nextRoom);
                    if(!player.getCurrentRoom().isExitRoom()) {
                        System.out.println("enter room");
                    }
                } else {
                    System.out.println("no exit");
                }
                break;
            default:
                System.out.println("No direction!");
        }

    }
}
