package it.units.games;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class CombinationTest {

    @Test
    void calculateCombination2Of4() {
        List<String> values = Arrays.asList("0,1", "0,2", "0,3", "1,2", "1,3", "2,3");
        Combination<Integer> combination = new Combination<>(Arrays.asList(0, 1, 2, 3));
        List<String> result = combination.calculate(2).map(item -> item.map(v -> "" + v).collect(Collectors.joining(","))).collect(Collectors.toList());
        result.forEach(System.out::println);

        assertIterableEquals(values, result);
    }

    @Test
    void calculateCombination3Of5() {
        List<String> values = Arrays.asList("0,1", "0,2", "0,3", "0,4", "0,5", "1,2", "1,3", "1,4", "1,5", "2,3", "2,4", "2,5", "3,4", "3,5", "4,5");
        Combination<Integer> combination = new Combination<>(Arrays.asList(0, 1, 2, 3, 4, 5));
        List<String> result = combination.calculate(2).map(item -> item.map(v -> "" + v).collect(Collectors.joining(","))).collect(Collectors.toList());
        result.forEach(System.out::println);

        assertIterableEquals(values, result);
    }
}