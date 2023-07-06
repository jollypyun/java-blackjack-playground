package game;

import game.model.Board;
import game.model.Players;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class InputTest {

    @Test
    void enterNameTest() {
        String names = "pobi,jason";
        Players players = new Players(names);
        assertThat(players.size()).isEqualTo(2);
    }

    @Test
    void setBettingTest() {
        Board board = new Board();
        Players players = new Players("pobi,jason");
        board.betting();
    }
}
