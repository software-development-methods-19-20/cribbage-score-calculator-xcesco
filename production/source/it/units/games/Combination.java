package it.units.games;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Combination implementation from https://www.baeldung.com/java-combinations-algorithm
 */
public class Combination<T> {
    public Combination(List<T> data) {
        this.data=data;
    }

    private List<T> data;
    public Stream<Stream<T>> Combination(, int subItems) {

        List<int[]> result = generate(data.size(), subItems);

        return result.stream().map(item-> transform(item));
    }

    private Stream<T> transform(int[] input) {
        return Stream.iterate(0, item-> item<=input.length, item -> item+1).map(index -> data.get(index));
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
        helper(combinations, new int[r], 0, n-1, 0);
        return combinations;
    }

}
