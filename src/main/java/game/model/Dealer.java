package game.model;

import java.util.List;

public class Dealer {
    private Integer benefit;

    private List<String> cards;

    public void setCard(String card) {
        cards.add(card);
    }
}
