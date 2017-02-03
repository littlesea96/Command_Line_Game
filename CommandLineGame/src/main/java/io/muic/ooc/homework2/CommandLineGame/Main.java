package io.muic.ooc.homework2.CommandLineGame;

import command.*;
import gameController.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Sea on 1/25/17.
 */
public class Main {
    private static final HashMap<String, Command> commands = new HashMap<String, Command>() {
        {
            // commands are added here using lambdas. It is also possible to dynamically add commands without editing the code.
            put("info", new InfoCommand());
            put("quit", new QuitCommand());
            put("go", new GoCommand());
            put("take", new TakeCommand());
            put("use", new UseCommand());
            put("attackWith", new AttackWithCommand());

        }
    };

    public static Command getCommand(String name) {
        return commands.get(name);
    }

    public static void main(final String[] arguments) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, command me!!");
        System.out.print("Enter your name: ");
        Player player = new Player();
        String name = scanner.nextLine();
        player.setName(name);

        Lv1Controller lv1 = new Lv1Controller();
        lv1.start(player);

        Lv2Controller lv2 = new Lv2Controller();
        lv2.start(player);

        Lv3Controller lv3 = new Lv3Controller();
        lv3.start(player);
    }
}
