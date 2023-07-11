package game;

import game.model.Board;
import game.model.Players;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class InputTest {

    @Test
    void enterNameTest() {
        String names = "pobi,jason";
        Players players = new Players(names);
        assertThat(players.size()).isEqualTo(2);
    }

    @Test
    void saveInfoTest() {
        Board board = new Board(new ArrayList<>());
        board.saveInfo(10000, "jason");
        board.saveInfo(20000, "pobi");
        assertThat(board.getOne(0)).isEqualTo(new HashMap<String, Integer>().put("jason", 10000));
    }
}
