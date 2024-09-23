package leetcode;

import java.util.*;

public class ThreeSumProblem {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> result = threeSum(nums);

        System.out.println(result);
    }

    public static List<List<Integer>> threeSum(int[] arr) {

        if (arr == null || arr.length < 3)
            return new ArrayList<>();

        Arrays.sort(arr);
        Set<List<Integer>> result = new HashSet<>();

        //fix the first element and find remaining two elements
        for (int i = 0; i < arr.length - 2; i++) {

            //find other 2 elements using Two sum approach
            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == 0) {
                    result.add(Arrays.asList(arr[i], arr[left], arr[right]));
                    left++;
                    right--;
                } else if (sum > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }

        return new ArrayList<>(result);
    }
}
