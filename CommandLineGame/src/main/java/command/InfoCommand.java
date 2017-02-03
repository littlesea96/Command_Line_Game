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
    }
}
