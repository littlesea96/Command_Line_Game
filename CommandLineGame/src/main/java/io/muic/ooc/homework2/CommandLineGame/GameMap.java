package io.muic.ooc.homework2.CommandLineGame;

import Monster.Monster;

import java.util.ArrayList;

/**
 * Created by Sea on 1/30/17.
 */
public class GameMap {
    private Room[] rooms = null;
    private ArrayList<Monster> monsters;

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    public ArrayList<Monster> getMonsters() {
        return monsters;
    }

    public void setMonsters(ArrayList<Monster> monsters) {
        this.monsters = monsters;
    }
}
