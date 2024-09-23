package javaQuestions.secondHighestCountNoInList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHighestNumberWithCount {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,1, 1, 2, 2,2, 3,3,3,4);

        // Find the 2nd highest number in the list
        Optional<Integer> secondHighest = list.stream()
                .distinct() // Remove duplicates
                .sorted(Comparator.reverseOrder()) // Sort in descending order
                .skip(1) // Skip the highest number
                .findFirst(); // Get the 2nd highest number

        if (secondHighest.isPresent()) {
            int secondHighestNumber = secondHighest.get();
            long count = list.stream().filter(n -> n == secondHighestNumber).count();
            System.out.println("2nd Highest Number: " + secondHighestNumber);
            System.out.println("Count: " + count);
        } else {
            System.out.println("The list doesn't have a 2nd highest number.");
        }
    }
}
