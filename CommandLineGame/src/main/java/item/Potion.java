package item;

import io.muic.ooc.homework2.CommandLineGame.Player;

/**
 * Created by Sea on 1/30/17.
 */
public class Potion extends Item{
    private int hp;

    public Potion(int hp) {
        this.hp = hp;
    }

    @Override
    public void use(Player player) {
        int curHp = player.getHp();
        player.setHp(curHp + hp);
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
