package io.muic.ooc.homework2.CommandLineGame;

import Monster.Monster;
import item.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sea on 1/30/17.
 */
public class Room {
    private Room northExit = null;
    private Room southExit = null;
    private Room eastExit = null;
    private Room westExit = null;
    private List<Item> items = new ArrayList<>();
    private ArrayList<Monster> monsters = new ArrayList<>();
    private boolean exitRoom = false;

    public void addItem(Item item){
        items.add(item);
    }

    public void getInfo(){
        System.out.println("Room info");
        System.out.println("north " + northExit);
        System.out.println("south " + southExit);
        System.out.println("east " + eastExit);
        System.out.println("west " + westExit);
        System.out.println("Items in the room:");
        for (Item item: items) {
            System.out.println(item.getName());
        }

        System.out.println("Monster in the room:");
        for (Monster monster: monsters) {
            System.out.println(monster.getName());
        }
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Room getNorthExit() {
        return northExit;
    }

    public void setNorthExit(Room northExit) {
        this.northExit = northExit;
    }

    public Room getSouthExit() {
        return southExit;
    }

    public void setSouthExit(Room southExit) {
        this.southExit = southExit;
    }

    public Room getEastExit() {
        return eastExit;
    }

    public void setEastExit(Room eastExit) {
        this.eastExit = eastExit;
    }

    public Room getWestExit() {
        return westExit;
    }

    public void setWestExit(Room westExit) {
        this.westExit = westExit;
    }

    public ArrayList<Monster> getMonsters() {
        return monsters;
    }

    public void setMonsters(ArrayList<Monster> monsters) {
        this.monsters = monsters;
    }

    public boolean isExitRoom() {
        return exitRoom;
    }

    public void setExitRoom(boolean exitRoom) {
        this.exitRoom = exitRoom;
    }
}
