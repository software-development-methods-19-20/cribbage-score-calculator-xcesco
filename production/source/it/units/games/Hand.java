package it.units.games;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Hand {

    private final List<Card> cards;

    public Hand(List<Card> cards) {
        this.cards = cards;
    }

    public List<Card> getCards() {
        return new ArrayList<>(cards);
    }

    public Card getStarterCard() {
        return cards.get(cards.size() - 1);
    }

    public Stream<Card> getOtherCards() {
        return IntStream.range(0, cards.size() - 1).mapToObj(cards::get);
    }
}
