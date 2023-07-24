package game;

import game.model.Player;
import game.model.Players;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class InputTest {
    private InputView inputView = new InputView();

    @Test
    void setPlayers() {
        Players players = new Players();
        players.addPlayer(new Player("pobi"));
        assertThat(players.size()).isEqualTo(2);
    }

    @Test
    void bettingTest() {
    }
}
