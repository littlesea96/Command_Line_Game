package item;

import Monster.*;
import io.muic.ooc.homework2.CommandLineGame.Player;
import io.muic.ooc.homework2.CommandLineGame.Room;

import java.util.Iterator;

/**
 * Created by Sea on 1/30/17.
 */
public class Weapon extends Item{
    private int attackPower = 0;

    public Weapon(int attackPower) {
        this.attackPower = attackPower;
    }

    @Override
    public void use(Player player) {
        Room room = player.getCurrentRoom();
        Monster monster = room.getMonsters().get(0);
        int monsterHp = monster.getHp();
        monster.setHp(monsterHp - attackPower);

        int monsterPower = monster.getAttackPower();
        int playerHp = player.getHp();
        player.setHp(playerHp - monsterPower);

        if(monster.death()){
            room.getMonsters().remove(0);
            System.out.println("monster is killed");
        } else {
            System.out.println("Monster Hp: " + monster.getHp());
            System.out.println("Your hp: " + player.getHp());
        }

    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }
}
