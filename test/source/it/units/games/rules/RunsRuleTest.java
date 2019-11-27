package it.units.games.rules;

import it.units.games.BaseTest;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class RunsRuleTest extends BaseTest {

    @BeforeAll
    static void prepareRule() {
        useOnlyThisRule(new RunsRule());
    }

    @Test
    public void testRunsRuleAH2D3SAC6C() {
        checkHand("AH2D3SAC6C", 6);
    }

    @Test
    public void testRunsRule4H2D3SACAC() {
        checkHand("4H2D3SACAC", 8);
    }

    @Test
    public void testRunsRule5() {
        checkHand("4H2D3SAC5C", 5);
    }

    @Test
    public void testRunsRule0() {
        checkHand("4H6D3SAC7C", 0);
    }

    @Test
    public void testRunsRuleWith0H9H8D7S9S() {
        checkHand("0H9H8D7S9S", 8);
    }



}