package it.units.games.rules;

import it.units.games.Rule;
import it.units.games.RulesTest;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;


class HisNobRuleTest extends RulesTest {
    @Override
    protected List<Rule> defineUsedRules() {
        return Arrays.asList(new HisNobRule());
    }

    @Test
    public void testRunsAC3S5H8DJH() {
        checkHand("AC3S5H8DJH", 0);
    }

    @Test
    public void testRuns8DAC3SJH5H() {
        checkHand("8DAC3SJH5H", 1);
    }
}