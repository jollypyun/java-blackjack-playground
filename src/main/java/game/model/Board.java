package game.model;

import java.util.Map;

public class Board {
    private Map<String, Integer> stake;

    public Board() {}


    public void saveInfo(int bet, String name) {
        this.stake.put(name, bet);
    }
}
