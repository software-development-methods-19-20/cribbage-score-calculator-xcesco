package it.units.games;

import java.util.Comparator;
import java.util.List;

/**
 * runs
 * three points for a run of three consecutive cards (regardless of suit)
 * four points for a run of four
 * five points for a run of five
 */
public class RunsRule implements Rule {
    @Override
    public int apply(Hand hand) {
        List<Card> sorted = hand.getCards();
        sorted.sort(Comparator.comparingInt(o -> o.getRank().ordinal()));

        int count = 1;
        for (int i = 1; i < sorted.size(); i++) {
            if ((sorted.get(i).getRank().ordinal() - 1) == (sorted.get(i - 1).getRank().ordinal())) {
                count++;
            }
        }
        int result = count > 2 ? count : 0;

        System.out.println(this.getClass().getSimpleName() + " generates " + result);
        return result;
    }
}
