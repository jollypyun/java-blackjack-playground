package game;

import game.model.Board;
import game.model.Player;
import game.model.Players;

import java.util.List;
import java.util.Scanner;

public class InputView {
    public Players setPlayers() {
        System.out.println("게임에 참여할 사람의 이름을 입력하세요.(쉼표 기준으로 분리)");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        return new Players(input);
    }

    public Board bettingTime(Players players) {
        List<Player> playerList = players.getPlayerList();
        Board board = new Board();
        Scanner scanner = new Scanner(System.in);
        for(Player player : playerList) {
            String name = player.getName();
            System.out.printf("%s의 배팅 금액은?\n", name);
            int cost = Integer.parseInt(scanner.next());
            player.bet(cost);
            board.saveInfo(cost, name);
        }
        return board;
    }
}
