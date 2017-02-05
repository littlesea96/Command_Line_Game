package io.muic.ooc.homework2.CommandLineGame;

import Monster.Monster;
import item.Item;
import item.Potion;
import item.Weapon;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sea on 2/3/17.
 */
public class MapLv2Factory implements MapFactory{
    @Override
    public Room[] createRoom() {
        Room[] rooms = new Room[6];
        for (int i = 0; i < 6; i++) {
            rooms[i] = new Room();
        }
        return rooms;
    }

    @Override
    public ArrayList<Monster> createMonster() {
        ArrayList<Monster> monsters = new ArrayList<>();
        Monster A = new Monster("A", 80, 15);
        Monster B = new Monster("B", 90, 20);
        Monster C = new Monster("C", 75, 10);
        monsters.add(A);
        monsters.add(B);
        monsters.add(C);
        return monsters;
    }

    @Override
    public List<Item> createItem() {
        ArrayList<Item> items = new ArrayList<>();
        Item weapon = new Weapon(45);
        weapon.setName("gun");
        weapon.setType("weapon");
        items.add(weapon);

        Item weapon1 = new Weapon(25);
        weapon1.setName("knife");
        weapon1.setType("weapon");
        items.add(weapon1);

        return items;

    }

    @Override
    public void connectRooms(Room[] rooms) {
        rooms[0].setEastExit(rooms[1]);
        rooms[1].setWestExit(rooms[0]);
        rooms[1].setEastExit(rooms[2]);
        rooms[1].setSouthExit(rooms[4]);
        rooms[2].setWestExit(rooms[1]);
        rooms[2].setEastExit(rooms[3]);
        rooms[2].setSouthExit(rooms[5]);
        rooms[3].setWestExit(rooms[2]);
        rooms[4].setNorthExit(rooms[1]);
        rooms[4].setEastExit(rooms[5]);
        rooms[5].setWestExit(rooms[4]);
        rooms[5].setNorthExit(rooms[2]);
    }

    @Override
    public void addItems(List<Item> items, Room room) {
        room.setItems(items);
    }

    @Override
    public void addMonsters(ArrayList<Monster> monsters, Room room) {
        room.setMonsters(monsters);
    }

    @Override
    public GameMap create(Player player) {
        Room[] rooms = createRoom();
        ArrayList<Monster> monsters = new ArrayList<>();
        List<Item> items = createItem();

        connectRooms(rooms);
        for (Room room: rooms) {
            ArrayList<Monster> monEachRoom = createMonster();
            addMonsters(monEachRoom, room);
            monsters.addAll(monEachRoom);
        }

        addItems(items, rooms[0]);

        GameMap gameMap = new GameMap();
        gameMap.setRooms(rooms);
        gameMap.setMonsters(monsters);

        player.setCurrentRoom(rooms[0]);


        return gameMap;
    }
}
