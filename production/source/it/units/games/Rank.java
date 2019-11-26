package it.units.games;

import java.util.Arrays;

public enum Rank {
    ACE('A', 1),
    RANK_2('2', 2),
    RANK_3('3', 3),
    RANK_4('4', 4),
    RANK_5('5', 5),
    RANK_6('6', 6),
    RANK_7('7', 7),
    RANK_8('8', 8),
    RANK_9('9', 9),
    RANK_10('0', 10),
    JACK('J', 10),
    QUEEN('Q', 10),
    KIN('K', 10);

    public char getValue() {
        return value;
    }

    private final char value;

    public int getV() {
        return v;
    }

    private final int v;

    Rank(char value, int v) {
        this.value = value;
        this.v = v;
    }

    public static Rank parse(final char value) {
        return Arrays.stream(Rank.values())
                .filter(item -> item.getValue() == value)
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException(value + " is an invalid rank"));
    }

    @Override
    public String toString() {
        return "" + value;
    }

}
