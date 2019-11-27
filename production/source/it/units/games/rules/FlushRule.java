package it.units.games.rules;

import it.units.games.*;

import java.util.Arrays;

public class FlushRule implements Rule {
    private int result;

    @Override
    public int apply(Hand hand) {
        int result = Arrays.stream(Suite.values()).map(suite -> {
            int score = (int) hand
                    .getCards()
                    .stream()
                    .filter(card -> card.getSuite() == suite)
                    .count();
            Card starterCard = hand.getStarterCard();
            if (score == 4 && starterCard.getSuite() == suite) return 0;
            if (score == 4 && starterCard.getSuite() != suite) return 4;
            if (score == 5 && starterCard.getRank() != Rank.JACK) return 5;
            if (score == 5 && starterCard.getRank() == Rank.JACK) return 6;
            return 0;
        }).filter(score -> score >= 4).mapToInt(i -> i).sum();

        System.out.println(this.getClass().getSimpleName() + " calculate " + result+" points");
        return result;
    }
}
