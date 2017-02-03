package command;

import io.muic.ooc.homework2.CommandLineGame.Player;

/**
 * Created by Sea on 2/1/17.
 */
public class QuitCommand implements Command {

    @Override
    public void apply(Player player, String[] args) {
        System.exit(0);
    }
}
