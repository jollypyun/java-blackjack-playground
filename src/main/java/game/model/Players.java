package game.model;

import java.util.ArrayList;
import java.util.List;

public class Players {
    private final List<Player> playerList = new ArrayList<>();
    public Players() {
        this.playerList.add(new Player("딜러"));
    }

    public void addPlayer(Player player) {
        playerList.add(player);
    }

    public Integer size() {
        return playerList.size();
    }
}
