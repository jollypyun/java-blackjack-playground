package game;

import game.model.Players;

import java.util.Scanner;

public class InputView {
    public Players setPlayers() {
        System.out.println("게임에 참여할 사람의 이름을 입력하세요.(쉼표 기준으로 분리)");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        return new Players(input);
    }

    public void bettingTime(Players players) {

    }
}
