package it.units.games;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.is;

import static org.hamcrest.MatcherAssert.assertThat;

class HandTest {
    @Test
    public void testFifteenTwosRule() {
        Hand hand=new Hand("5H5D5SAC6C");
        assertThat(hand.computeScore(), is(2));
    }

    @Test
    public void testRunsRule3() {
        Hand hand=new Hand("AH2D3SAC6C");
        assertThat(hand.computeScore(), is(3));
    }

    @Test
    public void testRunsRule4() {
        Hand hand=new Hand("4H2D3SACAC");
        assertThat(hand.computeScore(), is(4));
    }

    @Test
    public void testRunsPairs2() {
        Hand hand=new Hand("4H9D3SACKC");
        assertThat(hand.computeScore(), is(4));
    }

    @Test
    public void testRunsPairs4() {
        Hand hand=new Hand("4H4D3SACAC");
        assertThat(hand.computeScore(), is(4));
    }

    @Test
    public void testRunsPairs3() {
        Hand hand=new Hand("4H4D9S2CAC");
        assertThat(hand.computeScore(), is(2));
    }


}