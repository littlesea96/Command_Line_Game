package command;

import io.muic.ooc.homework2.CommandLineGame.*;
import item.*;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Sea on 2/2/17.
 */
public class AttackWithCommand implements Command{

    @Override
    public void apply(Player player, String[] args) {
        Room room = player.getCurrentRoom();
//        Monster monster = room.getMonsters().get(0);
        ArrayList<Item> bag = player.getBag();
        Iterator<Item> iterator = bag.iterator();
        boolean found = false;

        while (iterator.hasNext()){
            Item item = iterator.next();
            if(item.getType().equals("weapon") && item.getName().equals(args[0])) {
                System.out.println("attack");
                item.use(player);
                found = true;
            }

            if(player.death()){
                System.exit(0);
            }
        }

        if(!found){
            System.out.println("No weapon in bag!");
        }
    }
}
