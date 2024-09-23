package interview;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RemoveList2IndexFromList1UsingStreams {
    public static void main(String[] args) {

        List<Integer> l1 = List.of(1, 3, 4, 5, 6);
        List<Integer> l2 = List.of(0, 4, 1);

        Set<Integer> indexToBeRemoved = new HashSet<>(l2);

        List<Integer> integerList = IntStream.
                range(0, l1.size())
                .filter(i -> !indexToBeRemoved.contains(i))
                .mapToObj(l1::get)
                .collect(Collectors.toList());

        System.out.println(integerList);
    }
}
