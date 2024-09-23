package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {
    public static void main(String[] args) {

        int[] arr = {16, 4, 23, 8, 15, 42, 1, 2};
        int[] result = twoSumHashing(arr, 19);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSumHashing(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }
}
