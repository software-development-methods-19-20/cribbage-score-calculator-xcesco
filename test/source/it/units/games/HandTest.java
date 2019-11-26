package it.units.games;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.is;

import static org.hamcrest.MatcherAssert.assertThat;

class HandTest {
    @Test
    public void testFifteenTwos() {
        Hand hand=new Hand("5H5D5SAC6C");
        assertThat(hand.computeScore(), is(2));
    }
}