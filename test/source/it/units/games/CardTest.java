package it.units.games;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

public class CardTest {

    @Test
    public void testConversion() {
        String[] input = {"AC", "QD", "5H"};

        IntStream.range(0, input.length).forEach(index -> new Card(input[index]));
    }

    @Test
    public void testInvalidConversion() {
        String[] input = {"CZ", "ZQ"};

        IntStream.range(0, input.length).forEach(index ->
                Assertions.assertThrows(IllegalArgumentException.class, () -> new Card(input[index])));
    }


}