package game.model;

public class Player {
    private final String name;
    private Integer benefit = 0;

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
