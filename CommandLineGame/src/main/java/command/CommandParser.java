package command;

import java.util.ArrayList;

/**
 * Created by Sea on 2/1/17.
 */
public class CommandParser {

    public String[] parse(String command) {
        String[] parsedCommand = command.split(" ");
        return parsedCommand;
    }
}
