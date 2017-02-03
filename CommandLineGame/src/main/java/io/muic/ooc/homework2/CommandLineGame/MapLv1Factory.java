package io.muic.ooc.homework2.CommandLineGame;

import Monster.Monster;
import item.Item;
import item.Potion;
import item.Weapon;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sea on 1/30/17.
 */
public class MapLv1Factory implements MapFactory {

    @Override
    public Room[] createRoom() {
        Room[] rooms = new Room[5];
        for (int i = 0; i < 5; i++) {
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
        Monster D = new Monster("D", 75, 10);


        monsters.add(A);
        monsters.add(B);
        monsters.add(C);
        monsters.add(D);


        return monsters;
    }

    @Override
    public List<Item> createItem() {
        ArrayList<Item> items = new ArrayList<>();
        Item potion = new Potion(30);
        potion.setName("redPotion");
        potion.setType("potion");
        items.add(potion);

        Item potion1 = new Potion(50);
        potion1.setName("bluePotion");
        potion1.setType("potion");
        items.add(potion1);

        Item potion2 = new Potion(100);
        potion2.setName("goldPotion");
        potion2.setType("potion");
        items.add(potion2);

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
        rooms[1].setSouthExit(rooms[3]);
        rooms[2].setWestExit(rooms[1]);
        rooms[3].setNorthExit(rooms[1]);
        rooms[4].setNorthExit(rooms[3]);
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
        ArrayList<Monster> monsters = createMonster();
        List<Item> items = createItem();
        addMonsters(monsters, rooms[1]);
        for (Room room: rooms) {
            addItems(items, room);
        }
        connectRooms(rooms);
        rooms[4].setExitRoom(true);

        GameMap gameMap = new GameMap();
        gameMap.setRooms(rooms);

        player.setCurrentRoom(rooms[0]);

        return gameMap;
    }
}
