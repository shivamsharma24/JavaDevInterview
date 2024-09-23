package javacoding;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class SumOfDoubletsUisngStreams {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 5, 6, 7};
        int target = 7;

        Set<Integer> set = new HashSet<>();
        IntStream.of(arr)
                .forEach(num->{
                int comp=target-num;
                if(set.contains(comp)){
                    System.out.println("Pair is ::"+num+" "+comp+" "+target);
                }
                set.add(num);
                });
    }
}
