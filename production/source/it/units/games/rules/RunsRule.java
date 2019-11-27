package it.units.games.rules;

import it.units.games.Card;
import it.units.games.Combination;
import it.units.games.Hand;
import it.units.games.Rule;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * runs
 * three points for a run of three consecutive cards (regardless of suit)
 * four points for a run of four
 * five points for a run of five
 */
public class RunsRule implements Rule {
    @Override
    public int apply(Hand hand) {
        Combination<Card> combination = new Combination<>(hand.getCards());

        int result = IntStream.iterate(5, index -> index >= 3, index -> index - 1)
                .map(size -> getScoreCombinationOf(size, combination))
                .filter(value -> value > 0)
                .findFirst().orElse(0);

        System.out.println(this.getClass().getSimpleName() + " calculate " + result + " points");
        return result;
    }

    private int getScoreCombinationOf(int combinationSize, Combination<Card> combination) {
        return combination.perform(combinationSize).mapToInt(item -> {
            List<Card> sortedList = item.sorted(Comparator.comparingInt(o -> o.getRank().ordinal()))
                    .collect(Collectors.toList());
            int count = IntStream.range(0, sortedList.size())
                    .map(index -> combineWithPreviousCard(sortedList, index))
                    .sum();

            return count == combinationSize - 1 ? combinationSize : 0;
        }).filter(result -> result >= combinationSize).sum();
    }

    private int combineWithPreviousCard(List<Card> sorted, int index) {
        int previousValue = (index - 1 < 0) ? -100 : sorted.get(index - 1).getRank().ordinal();
        int currentValue = sorted.get(index).getRank().ordinal();
        return previousValue + 1 == currentValue ? 1 : 0;
    }
}
