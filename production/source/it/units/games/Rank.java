package it.units.games;

import java.util.Arrays;

public enum Rank {
    ACE('A'),
    RANK_2('2'),
    RANK_3('3'),
    RANK_4('4'),
    RANK_5('5'),
    RANK_6('6'),
    RANK_7('7'),
    RANK_8('8'),
    RANK_9('9'),
    RANK_10('0'),
    JACK('J'),
    QUEEN('Q'),
    KIN('K');

    public char getValue() {
        return value;
    }

    private final char value;

    Rank(char value) {
        this.value = value;
    }

    public static Rank parse(final char value) {
        return Arrays.stream(Rank.values()).filter(item -> item.getValue() == value).findFirst().orElse(null);
    }
}
