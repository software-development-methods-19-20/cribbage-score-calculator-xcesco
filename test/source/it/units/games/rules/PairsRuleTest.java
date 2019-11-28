package it.units.games.rules;

import it.units.games.Rule;
import it.units.games.RulesTest;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class PairsRuleTest extends RulesTest {

    @Override
    protected List<Rule> defineUsedRules() {
        return Arrays.asList(new PairsRule());
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