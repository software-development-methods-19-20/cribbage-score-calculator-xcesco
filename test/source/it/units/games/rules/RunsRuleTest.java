package it.units.games.rules;

import it.units.games.BaseTest;
import it.units.games.Hand;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class RunsRuleTest extends BaseTest {

    @BeforeAll
    static void prepareRule() {
        useOnlyThisRule(new RunsRule());
    }

    @Test
    public void testRunsRule3() {
        Hand hand = new Hand("AH2D3SAC6C");
        assertThat(hand.computeScore(), is(3));
    }

    @Test
    public void testRunsRule4() {
        Hand hand = new Hand("4H2D3SACAC");
        assertThat(hand.computeScore(), is(4));
    }

    @Test
    public void testRunsRule5() {
        Hand hand = new Hand("4H2D3SAC5C");
        assertThat(hand.computeScore(), is(5));
    }

    @Test
    public void testRunsRule0() {
        Hand hand = new Hand("4H6D3SAC7C");
        assertThat(hand.computeScore(), is(0));
    }

}