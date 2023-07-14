package game.model;

import java.util.List;

public class Player {
    private final String name;
    private Integer benefit = 0;
    private List<String> cards;

    public Player(String name) {
        this.name = name;
    }

    public void bet(Integer cost) {
        this.benefit -= cost;
    }

    public String getName() {
        return name;
    }
}
