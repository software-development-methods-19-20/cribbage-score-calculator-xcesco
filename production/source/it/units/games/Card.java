package it.units.games;

public class Card {
    private Rank rank;
    private Suite suite;

    public Card(Rank rank, Suite suite) {
        this.rank = rank;
        this.suite = suite;
    }

    public Card(String value) {
        if (value == null || value.length() != 2) {
            throw new IllegalArgumentException("Invalid card");
        }
        this.rank = Rank.parse(value.charAt(0));
        this.suite = Suite.parse(value.charAt(1));
    }

    public Rank getRank() {
        return rank;
    }

    public Suite getSuite() {
        return suite;
    }

    @Override
    public String toString() {
        return "" + rank + suite;
    }
}
