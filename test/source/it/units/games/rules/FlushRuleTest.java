package it.units.games.rules;

import it.units.games.BaseTest;
import it.units.games.Hand;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class FlushRuleTest extends BaseTest {

    @BeforeAll
    static void prepareRule() {
        useOnlyThisRule(new FlushRule());
    }

    @Test
    public void testRunsFlush0() {
        checkHand("AH2H3HAC6H", 0);
    }

    @Test
    public void testRunsFlush8H7DQS2C7C() {
        checkHand("8H7DQS2C7C", 0);
    }

    @Test
    public void testRunsFlush4() {
        checkHand("AH2H3HAH6D", 4);
    }

    @Test
    public void testRunsFlush5() {
        checkHand("AH2H3HAH6H", 5);
    }

    @Test
    public void testRunsFlush6() {
        checkHand("AH2H3HAHJH", 6);
    }

}