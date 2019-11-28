package it.units.games;

import it.units.games.rules.*;

import java.util.ArrayList;
import java.util.List;

public class ScoreCalculator {
    final static List<Rule> DEFAULT_RULES;
    final List<Rule> rules = new ArrayList<>();

    static {
        DEFAULT_RULES = new ArrayList<>();
        DEFAULT_RULES.add(new FifteenRule());
        DEFAULT_RULES.add(new FlushRule());
        DEFAULT_RULES.add(new RunsRule());
        DEFAULT_RULES.add(new PairsRule());
        DEFAULT_RULES.add(new HisNobRule());
    }

    public ScoreCalculator() {
        init(DEFAULT_RULES);
    }

    private void init(List<Rule> initRules) {
        rules.clear();
        rules.addAll(initRules);
    }

    public ScoreCalculator(List<Rule> initRules) {
        init(initRules);
    }

    public int compute(Hand hand) {
        return rules.stream().mapToInt(item -> item.apply(hand)).sum();
    }
}
