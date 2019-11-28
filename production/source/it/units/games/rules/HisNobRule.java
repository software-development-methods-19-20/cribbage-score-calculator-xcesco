package it.units.games.rules;

import it.units.games.Card;
import it.units.games.Hand;
import it.units.games.Rank;
import it.units.games.Rule;

public class HisNobRule implements Rule {
    @Override
    public int apply(Hand hand) {
        Card starterCard = hand.getStarterCard();
        int score = hand.getOtherCards().filter(card -> card.getSuite() == starterCard.getSuite() && card.getRank() == Rank.JACK)
                .findFirst().map(card -> 1)
                .orElse(0);
        
        return score;
    }
}
