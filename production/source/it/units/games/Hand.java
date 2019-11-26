package it.units.games;

public class Hand {
    private final Card[] cards;

    public Hand(String value) {
        if (value.length()!=10) {
            throw new IllegalArgumentException("Invalid hand size");
        }
        cards=new Card[5];
        for (int i=0; i<value.length();i+=2) {
            cards[i/2]=new Card(value.substring(i, i+2));
        }
    }

    public int computeScore() {
        return 0;
    }

}
