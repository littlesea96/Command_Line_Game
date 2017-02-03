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
