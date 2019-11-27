package it.units.games.rules;

import it.units.games.*;

import java.util.Arrays;

public class FlushRule implements Rule {
    @Override
    public int apply(Hand hand) {
        int result = Arrays.stream(Suite.values()).map(suite -> {
            int score = (int) hand
                    .getCards()
                    .stream()
                    .filter(card -> card.getSuite() == suite)
                    .count();
            Card starterCard = hand.getStarterCard();
            if (score == 4) {
                return (starterCard.getSuite() == suite) ? 0 : 4;
            }

            if (score == 5) {
                return starterCard.getRank() == Rank.JACK ? 6 : 5;
            }

            return 0;
        }).filter(score -> score >= 4).mapToInt(i -> i).sum();

        System.out.println(this.getClass().getSimpleName() + " calculate " + result + " points");
        return result;
    }
}
