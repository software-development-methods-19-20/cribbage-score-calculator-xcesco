package it.units.games;

public abstract class CardParser {
    public static Card parse(String value) {
        if (value == null || value.length() != 2) {
            throw new IllegalArgumentException("Invalid card");
        }
        Rank rank = Rank.parse(value.charAt(0));
        Suite suite = Suite.parse(value.charAt(1));

        return new Card(rank, suite);
    }
}
