package game.model;

import com.sun.tools.javac.util.List;

public class Card {
    private static final String[] SHAPE = {"스페이드", "하트", "다이아몬드", "클로버"};
    private static final String[] NUMBER = {"A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2"};

    public String getOne() {
        return pickNumber() + pickShape();
    }

    private String pickShape() {
        double random = Math.random();
        int index = (int) Math.round(random * (SHAPE.length - 1));
        return List.from(SHAPE).get(index);
    }

    private String pickNumber() {
        double random = Math.random();
        int index = (int) Math.round(random * (NUMBER.length - 1));
        return List.from(NUMBER).get(index);
    }
}
