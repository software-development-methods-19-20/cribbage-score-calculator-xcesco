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
        Hand hand = new Hand("4H9D3SACKC");
        assertThat(hand.computeScore(), is(0));
    }

    @Test
    public void testRunsPairs4() {
        Hand hand = new Hand("4H4D3SACAC");
        assertThat(hand.computeScore(), is(4));
    }

    @Test
    public void testRunsPairs6() {
        Hand hand = new Hand("4H4D4H2CAC");
        assertThat(hand.computeScore(), is(6));
    }

    @Test
    public void testRunsPairs3() {
        Hand hand = new Hand("4H4D9S2CAC");
        assertThat(hand.computeScore(), is(2));
    }

    @Test
    public void testRunsPairs12() {
        Hand hand = new Hand("4H4H4H4H9S");
        assertThat(hand.computeScore(), is(12));
    }
}