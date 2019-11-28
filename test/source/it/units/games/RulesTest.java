package it.units.games;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public abstract class RulesTest {
    protected abstract List<Rule> defineUsedRules();

    protected void checkHand(String s, int i) {
        Hand hand = HandParser.parse(s);
        ScoreCalculator calculator = new ScoreCalculator(defineUsedRules());
        assertThat(calculator.compute(hand), is(i));
    }

}
