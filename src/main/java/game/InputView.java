package game;

import game.model.Board;
import game.model.Player;
import game.model.Players;

import java.util.ArrayList;
import java.util.Scanner;

public class InputView {
    public String setPlayers() {
        System.out.println("게임에 참여할 사람의 이름을 입력하세요.(쉼표 기준으로 분리)");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public Board bettingTime(String players) {
        Scanner scanner = new Scanner(System.in);
        Board board = new Board(new ArrayList<>());
        return null;
    }
}
