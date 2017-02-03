package io.muic.ooc.homework2.CommandLineGame;

import item.*;

import java.util.ArrayList;

/**
 * Created by Sea on 1/30/17.
 */
public class Player {

    private String name;
    private double exp = 0.0;
    private int hp = 70;
    private int attackPower = 10;
    private Room currentRoom = null;
    private ArrayList<Item> bag = new ArrayList<>();

    public String getName() {
        return name;
    }

    public boolean death(){
        return hp <= 0;
    }

    public void addItem(Item item){
        bag.add(item);
    }

    public void getInfo(){
        System.out.println("Player info");
        System.out.println("Exp: " + exp);
        System.out.println("Hp: " + hp);
        System.out.println("Items: ");
        for (Item item : bag) {
            System.out.println(item.getName());
        }
        System.out.println("-------------------");
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getExp() {
        return exp;
    }

    public void setExp(double exp) {
        this.exp = exp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    public ArrayList<Item> getBag() {
        return bag;
    }

}
