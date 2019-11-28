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

    private final List<Card> cards;

    public Hand(List<Card> cards) {
        this.cards = cards;
    }

    static void init() {
        rules.clear();
        rules.add(new FifteenRule());
        rules.add(new RunsRule());
        rules.add(new PairsRule());
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
