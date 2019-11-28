package it.units.games.rules;

import it.units.games.Rule;
import it.units.games.RulesTest;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class RunsRuleTest extends RulesTest {

    @Override
    protected List<Rule> defineUsedRules() {
        return Arrays.asList(new RunsRule());
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
    public void testRunsRule4H2D3SAC5C() {
        checkHand("4H2D3SAC5C", 5);
    }

    @Test
    public void testRunsRule4H6D3SAC7C() {
        checkHand("4H6D3SAC7C", 0);
    }

    @Test
    public void testRunsRule0H9H8D7S9S() {
        checkHand("0H9H8D7S9S", 8);
    }


}