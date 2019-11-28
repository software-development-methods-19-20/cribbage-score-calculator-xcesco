package it.units.games;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public abstract class BaseTest {
    protected static void useOnlyThisRule(Rule rule) {
        Hand.rules.clear();
        Hand.rules.add(rule);
    }

    protected void checkHand(String s, int i) {
        Hand hand = HandParser.parse(s);
        assertThat(hand.computeScore(), is(i));
    }

}
