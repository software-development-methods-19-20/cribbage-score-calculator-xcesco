package it.units.games;

import java.util.ArrayList;
import java.util.List;

public abstract class HandParser {

    public static Hand parse(String value) {
        if (value.length() != 10) {
            throw new IllegalArgumentException("Invalid hand size");
        }

        List<Card> cards = new ArrayList<>();
        for (int i = 0; i < value.length(); i += 2) {
            cards.add(CardParser.parse(value.substring(i, i + 2)));
        }

        return new Hand(cards);
    }
}
