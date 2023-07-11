package game.model;

import java.util.*;
import java.util.stream.Collectors;

public class Players {
    private final List<Player> playerList;

    public Players(String names) {
        String[] players = names.split(",");
        this.playerList = Arrays.stream(players).map(Player::new).collect(Collectors.toList());
    }

    public int size() {
        return playerList.size();
    }

    public List<Player> getList() {
        return this.playerList;
    }
}
