package game;

import game.model.Player;
import game.model.Players;

import java.util.Scanner;

public class InputView {
    public String setPlayers() {
        System.out.println("게임에 참여할 사람의 이름을 입력하세요.(쉼표 기준으로 분리)");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public Players bettingTime(String input) {
        String[] names = input.split(",");
        Players players = new Players();
        for(String name:names) {
            Integer bet = betInput(name);
            Player player = new Player(name);
            player.bet(bet);
            players.addPlayer(player);
        }
        return players;
    }

    private Integer betInput(String input) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%s의 배팅 금액은?", input);
        return Integer.parseInt(scanner.next());
    }
}
