package it.units.games;

import java.util.Arrays;

public enum Suite {
    CLUBS('C'),
    DIAMONDS('D'),
    HEARTS('H'),
    SPADES('S');

    public char getValue() {
        return value;
    }

    private final char value;

    Suite(char value) {
        this.value = value;
    }

    public static Suite parse(final char value) {
        return Arrays.stream(Suite.values()).filter(item -> item.getValue() == value).findFirst().orElse(null);
    }

}
