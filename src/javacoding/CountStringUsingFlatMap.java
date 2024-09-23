package javacoding;

import java.util.Arrays;
import java.util.List;

public class CountStringUsingFlatMap {
    public static void main(String[] args) {
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("apple", "banana", "cherry"),
                Arrays.asList("banana", "apple", "date"),
                Arrays.asList("cherry", "date", "banana")
        );

        String targetString = "cherry";
        long count = listOfLists.stream()
                .flatMap(List::stream)
                .filter(s -> s.equals(targetString))
                .count();

        System.out.println("Count of "+targetString+" is "+count);
    }
}
