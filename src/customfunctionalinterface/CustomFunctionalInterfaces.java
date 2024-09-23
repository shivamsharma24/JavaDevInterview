package customfunctionalinterface;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class CustomFunctionalInterfaces {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 1, 1, 2, 2, 2, 3, 3, 3, 4);

        // Implement the functional interface
        SecondHighestFinder finder = (l) -> {
            Optional<Integer> secondHighest = l.stream()
                    .distinct()
                    .sorted(Comparator.reverseOrder())
                    .skip(1)
                    .findFirst();

            if (secondHighest.isPresent()) {
                int secondHighestNumber = secondHighest.get();
                long count = l.stream().filter(n -> n == secondHighestNumber).count();
                return new OptionalIntWithCount(secondHighestNumber, count);
            } else {
                return new OptionalIntWithCount(-1, 0); // Return -1 and count 0 if no 2nd highest number is found
            }
        };

        // Use the implemented functional interface
        OptionalIntWithCount result = finder.findSecondHighest(list);

        System.out.println(result);
    }
}




