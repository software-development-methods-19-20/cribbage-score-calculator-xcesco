package it.units.games;

public class Card {
    private Rank rank;
    private Suite suite;

    public Card(Rank rank, Suite suite) {
        this.rank=rank;
        this.suite=suite;
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
