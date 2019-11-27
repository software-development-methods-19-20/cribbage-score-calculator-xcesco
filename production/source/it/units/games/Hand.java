package it.units.games;

import java.util.ArrayList;
import java.util.List;

public class Hand {

    private final static List<Rule> rules;

    static {
        rules = new ArrayList<>();
        rules.add(new FifteenTwosRule());
        rules.add(new RunsRule());
        rules.add(new PairsRule());
    }

    private final List<Card> cards;

    public Hand(String value) {
        if (value.length() != 10) {
            throw new IllegalArgumentException("Invalid hand size");
        }
        cards = new ArrayList<>();
        for (int i = 0; i < value.length(); i += 2) {
            cards.add(new Card(value.substring(i, i + 2)));
        }
    }

    public int computeScore() {
        return rules.stream().mapToInt(item -> item.apply(this)).sum();
    }

    public List<Card> getCards() {
        return new ArrayList<>(cards);
    }
}
