package game.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board {
    private final List<Map<String, Integer>> list;

    public Board(List<Map<String, Integer>> list) {
        this.list = list;
    }

    public void saveInfo(int bet, String name) {
        Map<String, Integer> map = new HashMap<>();
        map.put(name, bet);
        this.list.add(map);
    }

    public Map<String, Integer> getOne(Integer index) {
        return this.list.get(index);
    }
}
