package it.units.games;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.hamcrest.Matchers.is;

import static org.hamcrest.MatcherAssert.assertThat;

// https://cribbagecalculator.com/
class HandTest {

    @Test
    public void test() {
        String[] input = {"5H", "AC", "3S", "JH", "8D"};

        Hand hand = HandParser.parse("5HAC3SJH8D");

        IntStream.range(0, input.length).forEach(item -> {
            assertThat(hand.getCards().get(item).toString(), is(input[item]));
        });

        assertThat(hand.getStarterCard().toString(), is(input[input.length - 1]));

        List<Card> otherCard = hand.getOtherCards().collect(Collectors.toList());
        for (int i = 0; i < otherCard.size(); i++) {
            assertThat(hand.getCards().get(i).toString(), is(input[i]));
        }
    }


}