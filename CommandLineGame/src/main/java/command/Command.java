package command;

import io.muic.ooc.homework2.CommandLineGame.Player;

/**
 * Created by Sea on 1/31/17.
 */
public interface Command {

    void apply(Player player, String[] args);
}
