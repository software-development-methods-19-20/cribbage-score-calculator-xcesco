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
        Hand hand = new Hand("AH2D3SAC6C");
        assertThat(hand.computeScore(), is(0));
    }

    @Test
    public void testRunsFlush0_2() {
        Hand hand = new Hand("AH2H3HAC6H");
        assertThat(hand.computeScore(), is(0));
    }

    @Test
    public void testRunsFlush4() {
        Hand hand = new Hand("AH2H3HAH6D");
        assertThat(hand.computeScore(), is(4));
    }

    @Test
    public void testRunsFlush5() {
        Hand hand = new Hand("AH2H3HAH6H");
        assertThat(hand.computeScore(), is(5));
    }

    @Test
    public void testRunsFlush6() {
        Hand hand = new Hand("AH2H3HAHJH");
        assertThat(hand.computeScore(), is(6));
    }

}