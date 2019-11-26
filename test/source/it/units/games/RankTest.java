package it.units.games;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static it.units.games.Rank.*;
import static org.hamcrest.Matchers.is;

public class RankTest {

    @Test
    public void testConversion() {
        Character[] input = {'A', '2', '3', '4', '5', '6', '7', '8', '9', '0', 'J', 'Q', 'K'};
        Rank[] output = {ACE, RANK_2, RANK_3, RANK_4, RANK_5, RANK_6, RANK_7, RANK_8, RANK_9, RANK_10, JACK, QUEEN, KIN};

        IntStream.range(0, input.length).forEach(index -> Assert.assertThat(Rank.parse(input[index]), is(output[index])));
    }

}