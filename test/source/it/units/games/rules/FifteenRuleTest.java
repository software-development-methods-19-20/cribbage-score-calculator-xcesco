package it.units.games.rules;

import it.units.games.BaseTest;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class FifteenRuleTest extends BaseTest {

    @BeforeAll
    static void prepareRule() {
        useOnlyThisRule(new FifteenRule());
    }

    @Test
    public void testCouple() {
        checkHand("5H5D5SAC6C", 2);
    }

    @Test
    public void test4FifteenTwosRule() {
        checkHand("5H5D5SAC4C", 8);
    }

    @Test
    public void test2FifteenTwosRule() {
        checkHand("8H7DQS2C7C", 4);
    }
}