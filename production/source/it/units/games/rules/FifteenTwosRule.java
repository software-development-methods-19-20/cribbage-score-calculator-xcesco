package it.units.games.rules;

import it.units.games.Card;
import it.units.games.Combination;
import it.units.games.Hand;
import it.units.games.Rule;

/**
 * Two points for each separate combination of two or more cards totalling exactly fifteen
 * (Jack, Queen and King count as 10, Ace count as 1)
 */
public class FifteenTwosRule implements Rule {
    @Override
    public int apply(Hand hand) {
        Combination<Card> combination = new Combination<>(hand.getCards());

        int result = 0;
        result += getScoreCombinationOf(2, combination);
        result += getScoreCombinationOf(3, combination);
        result += getScoreCombinationOf(4, combination);
        result += getScoreCombinationOf(5, combination);

        System.out.println(this.getClass().getSimpleName() + " generates " + result);
        return result;
    }

    private int getScoreCombinationOf(int combinationSize, Combination<Card> combination) {
        int score;
        score = (int) combination.calculate(combinationSize)
                .map(item -> item
                        .mapToInt(card -> card.getRank().getIntValue())
                        .sum())
                .filter(value -> value == 15)
                .count() * 2;


        return score;
    }
}
