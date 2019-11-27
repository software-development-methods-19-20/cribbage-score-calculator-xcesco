package it.units.games.rules;

import it.units.games.Hand;
import it.units.games.Rule;
import it.units.games.Suite;

import java.util.Arrays;

public class FlushRule implements Rule {
    private int result;

    @Override
    public int apply(Hand hand) {
        Arrays.stream(Suite.values()).map(suite -> (int) hand
                .getCards()
                .stream()
                .filter(card -> card.getSuite() == suite)
                .count())
                //.filter(score -> score == 4 && hand.getStarterCard().getSuite() == suite)
                .mapToInt(i -> i).sum();

        this.result = 0;
        return result;
    }
}
