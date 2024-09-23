package javacoding;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SumOfDoublets {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 5, 6, 7};
        int target = 7;

        Set<Integer> set = new HashSet<>();

        for(int num:arr){
            int comp = target - num;
            if(set.contains(comp)){
                System.out.println("Pair is :: "+num+" "+comp+" target is "+target);
            }
            set.add(num);
        }
    }
}
