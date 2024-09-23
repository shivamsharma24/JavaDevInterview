package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortArrayListAndRemoveDuplicateElement {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,7,2,3,1,5,8);

        List<Integer> l = list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(l);








    }
}
