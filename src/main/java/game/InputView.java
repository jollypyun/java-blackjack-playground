package game;

import game.model.Board;
import game.model.Player;
import game.model.Players;

import java.util.ArrayList;
import java.util.Scanner;

public class InputView {
    public Players setPlayers() {
        System.out.println("게임에 참여할 사람의 이름을 입력하세요.(쉼표 기준으로 분리)");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        return new Players(input);
    }

    public Board bettingTime(Players players) {
        Scanner scanner = new Scanner(System.in);
        Board board = new Board(new ArrayList<>());
        for(Player player : players.getList()) {
            System.out.printf("%s의 베팅 금액은?" + player.getName());
            Integer bet = Integer.parseInt(scanner.next());
            player.bet(bet);
        }
        return board;
    }
}
