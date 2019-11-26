package it.units.games;

/**
 * Two points for each separate combination of two or more cards totalling exactly fifteen
 * (Jack, Queen and King count as 10, Ace count as 1)
 */
public class FifteenTwos implements Rule {
    @Override
    public int apply(Hand hand) {
        Combination<Card> combination = new Combination<>(hand.getCards());

        int score = 0;
        score += getScoreCombinationOf(2, combination);
        score += getScoreCombinationOf(3, combination);
        score += getScoreCombinationOf(4, combination);
        score += getScoreCombinationOf(5, combination);
        return score;
    }

    private int getScoreCombinationOf(int combinationSize, Combination<Card> combination) {
        int score;
        score = (int) combination.calculate(combinationSize)
                .map(item -> item
                        .mapToInt(card -> card.getRank().getV())
                        .sum())
                .filter(value -> value == 15)
                .count() * 2;
        return score;
    }
}
