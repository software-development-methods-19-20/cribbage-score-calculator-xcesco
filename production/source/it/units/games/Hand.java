package it.units.games;

import it.units.games.rules.FifteenRule;
import it.units.games.rules.PairsRule;
import it.units.games.rules.RunsRule;

import java.util.ArrayList;
import java.util.List;

public class Hand {

    final static List<Rule> rules;

    static {
        rules = new ArrayList<>();
        init();
    }

    static void init() {
        rules.clear();
        rules.add(new FifteenRule());
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

    public Card getStarterCard() {
        return cards.get(cards.size() - 1);
    }
}
