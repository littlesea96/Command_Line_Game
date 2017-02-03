package io.muic.ooc.homework2.CommandLineGame;

import Monster.Monster;
import item.Item;

import java.util.ArrayList;

/**
 * Created by Sea on 1/30/17.
 */
public interface MapFactory {
    GameMap create(Player player);
    Room[] createRoom();
    ArrayList<Monster> createMonster();
    ArrayList<Item> createItem();
    void connectRooms(Room[] rooms);
    void addMonsters(ArrayList<Monster> monsters, Room room);
    void addItems(Room room);

}
