package command;

import Monster.Monster;
import io.muic.ooc.homework2.CommandLineGame.Player;
import io.muic.ooc.homework2.CommandLineGame.Room;
import item.Item;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Sea on 2/5/17.
 */
public class AttackCommand implements Command{

    @Override
    public void apply(Player player, String[] args) {
        Room room = player.getCurrentRoom();
        Monster monster = room.getMonsters().get(0);
        int monsterHp = monster.getHp();
        monster.setHp(monsterHp - player.getAttackPower());
        double curExp = player.getExp();
        player.setExp(curExp*1.1);

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
}
