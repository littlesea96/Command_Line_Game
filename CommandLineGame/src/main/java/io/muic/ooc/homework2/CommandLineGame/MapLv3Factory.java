package io.muic.ooc.homework2.CommandLineGame;

import Monster.Monster;
import item.Item;
import item.Potion;
import item.Weapon;

import java.util.ArrayList;

/**
 * Created by Sea on 2/3/17.
 */
public class MapLv3Factory implements MapFactory{
    @Override
    public Room[] createRoom() {
        Room[] rooms = new Room[3];
        rooms[0] = new Room();
        rooms[0].setName("A");

        rooms[1] = new Room();
        rooms[1].setName("B");

        rooms[2] = new Room();
        rooms[2].setName("C");
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
    public ArrayList<Item> createItem() {
        return null;

    }

    @Override
    public void connectRooms(Room[] rooms) {
        rooms[0].setEastExit(rooms[1]);
        rooms[0].setSouthExit(rooms[2]);
        rooms[1].setWestExit(rooms[0]);
        rooms[2].setNorthExit(rooms[0]);
    }

    @Override
    public void addItems(Room room) {
        Item potion = new Potion(30);
        potion.setName("potion");
        potion.setType("potion");
        room.addItem(potion);

        Weapon weapon = new Weapon(25);
        weapon.setName("gun");
        weapon.setType("weapon");
        room.addItem(weapon);


    }

    @Override
    public void addMonsters(ArrayList<Monster> monsters, Room room) {
        room.setMonsters(monsters);
    }

    @Override
    public GameMap create(Player player) {
        Room[] rooms = createRoom();
        ArrayList<Monster> monsters = createMonster();

        addMonsters(monsters, rooms[1]);
        connectRooms(rooms);
        rooms[2].setExitRoom(true);

        addItems(rooms[1]);

        GameMap gameMap = new GameMap();
        gameMap.setRooms(rooms);
        gameMap.setMonsters(monsters);

        player.setCurrentRoom(rooms[0]);

        return gameMap;
    }
}
