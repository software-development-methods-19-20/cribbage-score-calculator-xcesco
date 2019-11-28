package it.units.games.rules;

import it.units.games.Rule;
import it.units.games.RulesTest;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class FifteenRuleTest extends RulesTest {

    @Test
    public void test5H5D5SAC6C() {
        checkHand("5H5D5SAC6C", 2);
    }

    @Test
    public void test5H5D5SAC4C() {
        checkHand("5H5D5SAC4C", 8);
    }

    @Test
    public void test8H7DQS2C7C() {
        checkHand("8H7DQS2C7C", 4);
    }

    @Override
    protected List<Rule> defineUsedRules() {
        return Arrays.asList(new FifteenRule());
    }
}