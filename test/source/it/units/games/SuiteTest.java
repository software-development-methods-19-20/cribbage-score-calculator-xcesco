package it.units.games;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static it.units.games.Rank.*;
import static it.units.games.Suite.*;
import static org.hamcrest.Matchers.is;

public class SuiteTest {

    @Test
    public void testConversion() {
        Character[] input = {'C', 'D', 'H', 'S'};
        Suite[] output = {CLUBS, DIAMONDS, HEARTS, SPADES};

        IntStream.range(0, input.length).forEach(index -> Assert.assertThat(Suite.parse(input[index]), is(output[index])));
    }

}