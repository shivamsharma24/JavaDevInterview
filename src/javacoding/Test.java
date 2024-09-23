package javacoding;

import java.util.List;

public class  Test {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 3, 5, 3, 6, 8, 9);

        Integer reduce = integers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .reduce(0, Integer::sum);

        System.out.println(reduce);
    }
}
