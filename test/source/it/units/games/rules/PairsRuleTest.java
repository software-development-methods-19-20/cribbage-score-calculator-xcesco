package it.units.games.rules;

import it.units.games.BaseTest;
import it.units.games.Hand;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class PairsRuleTest extends BaseTest {

    @BeforeAll
    static void prepareRule() {
        useOnlyThisRule(new PairsRule());
    }

    @Test
    public void testRunsPairs0() {
        checkHand("4H9D3SACKC", 0);
    }

    @Test
    public void testRunsPairs4() {
        checkHand("4H4D3SACAC", 4);
    }

    @Test
    public void testRunsPairs6() {
        checkHand("4H4D4H2CAC", 6);
    }

    @Test
    public void testRunsPairs8H7DQS2C7C() {
        checkHand("8H7DQS2C7C", 2);
    }
}