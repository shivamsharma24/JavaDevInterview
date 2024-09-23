package leetcode;

//Time Complexity is:  O(n)
//Space Complexity: O(1)  because only a constant amount of extra space
// is used regardless of the input size.
public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int arr[] = {0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1};
        int ans = longestOnes(arr, 3);
        System.out.println(ans);

    }

    public static int longestOnes(int[] num, int k) {
        int ans = 0;
        int i = 0;
        int j = -1;// j +1 to i-1
        int countOfZeroes = 0;
        while (i < num.length) {
            //acquire
            if (num[i] == 0) {
                countOfZeroes++;
                i++;
            } else {
                i++;
            }

            //If invalid ,release until it becomes valid
            while (countOfZeroes > k) {
                j++;
                if (num[j] == 0) {
                    countOfZeroes--;
                }
            }
            //calculate size of window
            int sow = i - 1 - j;
            ans = Math.max(ans, sow);
        }
        return ans;
    }
}
