package it.units.games.rules;

import it.units.games.BaseTest;
import it.units.games.Hand;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class FifteenTwosRuleTest extends BaseTest {

    @BeforeAll
    static void prepareRule() {
        useOnlyThisRule(new FifteenTwosRule());
    }

    @Test
    public void testCouple() {
        Hand hand = new Hand("5H5D5SAC6C");
        assertThat(hand.computeScore(), is(2));
    }

    @Test
    public void test4FifteenTwosRule() {
        Hand hand = new Hand("5H5D5SAC4C");
        assertThat(hand.computeScore(), is(8));
    }

    @Test
    public void test2FifteenTwosRule() {
        Hand hand = new Hand("8H7DQS2C7C");
        assertThat(hand.computeScore(), is(4));
    }
}