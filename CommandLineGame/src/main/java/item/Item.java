package item;

import io.muic.ooc.homework2.CommandLineGame.Player;

/**
 * Created by Sea on 1/30/17.
 */
public abstract class Item {
    private String name;
    private String type;

    public abstract void use(Player player);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
