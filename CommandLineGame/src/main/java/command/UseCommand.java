package command;

import io.muic.ooc.homework2.CommandLineGame.Player;
import item.*;

import java.util.Iterator;

/**
 * Created by Sea on 2/2/17.
 */
public class UseCommand implements Command {
    @Override
    public void apply(Player player, String[] args) {

        Iterator<Item> iterator = player.getBag().iterator();

        while (iterator.hasNext()){
            Item item = iterator.next();
            if(item.getType().equals("potion") && item.getName().equals(args[0])){
                item.use(player);
                iterator.remove();
                System.out.println("use " + args[0]);
                System.out.println("Hp: " + player.getHp());
            }
            break;
        }

    }
}
