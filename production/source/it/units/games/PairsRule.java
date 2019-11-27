package it.units.games;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PairsRule implements Rule {
    @Override
    public int apply(Hand hand) {
        // https://stackoverflow.com/questions/19940319/can-you-split-a-stream-into-two-streams
        List<Card> sorted = hand.getCards();
        sorted.sort(Comparator.comparingInt(o -> o.getRank().ordinal()));

        Map<Rank, List<Card>> groups = sorted.stream().collect(Collectors.groupingBy(Card::getRank));
        int result=groups.values().stream()
                .filter(l -> l.size() >= 2)
                .mapToInt(List::size)
                .map(x -> (x == 2) ? 2 : (x == 3) ? 6 : 12).sum();
        System.out.println(this.getClass().getSimpleName()+ " generates "+result);
        return result;
    }
}
