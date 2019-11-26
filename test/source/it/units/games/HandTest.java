package it.units.games;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.is;

import static org.hamcrest.MatcherAssert.assertThat;

class HandTest {
    @Test
    public void testCreation() {
        Hand hand=new Hand("5H5D5SJC5C");

        assertThat(hand.computeScore(), is(29));
    }
}