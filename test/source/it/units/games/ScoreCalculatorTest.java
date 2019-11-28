package it.units.games;

import org.junit.jupiter.api.Test;

import java.util.List;

class ScoreCalculatorTest extends RulesTest {

    @Test
    public void test5D5C5SJH5H() {
        checkHand("5D5C5SJH5H", 29);
    }

    @Test
    public void test4() {
        checkHand("0DJHQSAC9D", 4);
    }

    @Test
    public void testJS6H3S10HAC() {
        checkHand("JS6H3S0HAC", 0);
    }

    @Test
    public void testJHAH6H5D3D() {
        checkHand("JHAH6H5D3D", 4);
    }

    @Test
    public void test0H9H8D7S9S() {
        checkHand("0H9H8D7S9S", 12);
    }

    @Test
    public void test4SKC8DQS5C() {
        checkHand("4SKC8DQS5C", 4);
    }

    @Test
    public void test3C8CAD7C4D() {
        checkHand("3C8CAD7C4D", 6);
    }

    @Test
    public void test8D3S9D0S8C() {
        checkHand("8D3S9D0S8C", 8);
    }

    @Test
    public void test9S9H4C4S6H() {
        checkHand("9S9H4C4S6H", 8);
    }

    @Test
    public void testACKS6CJHQS() {
        checkHand("ACKS6CJHQS", 3);
    }

    @Override
    protected List<Rule> defineUsedRules() {
        return ScoreCalculator.DEFAULT_RULES;
    }
}