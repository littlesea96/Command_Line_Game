package command;

import io.muic.ooc.homework2.CommandLineGame.*;
import item.*;

import java.util.ArrayList;
import java.util.Iterator;


/**
 * Created by Sea on 2/2/17.
 */
public class TakeCommand implements Command {

    @Override
    public void apply(Player player, String[] args) {
        Room curRoom = player.getCurrentRoom();
        ArrayList<Item> items = curRoom.getItems();
        Iterator<Item> iterator = items.iterator();

        while (iterator.hasNext()){
            Item item = iterator.next();

            if(item.getName().equals(args[0])){
                player.addItem(item);
                iterator.remove();
                System.out.println("take " + args[0]);
            }
        }
    }
}
