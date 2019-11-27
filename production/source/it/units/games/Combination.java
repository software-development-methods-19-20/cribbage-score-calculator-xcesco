package it.units.games;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Adapted combination implementation from https://www.baeldung.com/java-combinations-algorithm
 */
public class Combination<T> {
    public Combination(List<T> dataSet) {
        this.dataSet = dataSet;
    }

    private List<T> dataSet;

    public Stream<Stream<T>> perform(int subItems) {
        List<int[]> result = generate(dataSet.size(), subItems);

        return result.stream().map(this::transform);
    }

    private Stream<T> transform(int[] input) {
        return Arrays.stream(input).mapToObj(index -> dataSet.get(index));
    }

    private void helper(List<int[]> combinations, int data[], int start, int end, int index) {
        if (index == data.length) {
            int[] combination = data.clone();
            combinations.add(combination);
        } else if (start <= end) {
            data[index] = start;
            helper(combinations, data, start + 1, end, index + 1);
            helper(combinations, data, start + 1, end, index);
        }
    }

    private List<int[]> generate(int n, int r) {
        List<int[]> combinations = new ArrayList<>();
        helper(combinations, new int[r], 0, n - 1, 0);
        return combinations;
    }

}
