package it.units.games;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.is;

import static org.hamcrest.MatcherAssert.assertThat;

// https://cribbagecalculator.com/
class HandTest {


    @Test
    public void test29() {
        Hand hand = new Hand("5D5C5SJH5H");
        assertThat(hand.computeScore(), is(29));
    }

    @Test
    public void test4() {
        Hand hand = new Hand("0DJHQSAC9D");
        assertThat(hand.computeScore(), is(4));
    }


}