package it.units.games;

public abstract class BaseTest {
    protected static void useOnlyThisRule(Rule rule) {
        Hand.rules.clear();
        Hand.rules.add(rule);
    }

}
