package game;

import game.model.Dealer;
import game.model.Players;

public class MainGame {
    public void drawTurn(Players players) {
        String names = players.namesToString();
        System.out.printf("딜러와 %s에게 2장을 나누었습니다.", names);
        Dealer dealer = new Dealer();
        drawEach(dealer, players);
    }

    private void drawEach(Dealer dealer, Players players) {

    }
}
