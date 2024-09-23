package leetcode;

//A valid mountain array must have at least 3 elements
// ([a, b, c] where a < b > c)
public class MountainArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 3, 2};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7}; // not a mountain array (no decrease)
        int[] arr3 = {5, 4, 3, 2, 1};       // not a mountain array (no increase)
        int[] arr4 = {1, 3, 2};             // valid mountain array

        System.out.println(isMountainArray(arr1)); // true
        System.out.println(isMountainArray(arr2)); // false
        System.out.println(isMountainArray(arr3)); // false
        System.out.println(isMountainArray(arr4)); // true
    }

    public static boolean isMountainArray(int[] arr){
        if (arr.length < 3) {
            return false; // A valid mountain array must have at least 3 elements
        }
        int i = 0;
        //Ascend to peak
        while(i<arr.length-1 && arr[i]<arr[i+1]){
            i++;
        }

        //check if peak is at beginning or end
        if(i==0||i==arr.length-1){
            return false;
        }

        //Descend from peak
        while(i<arr.length-1 && arr[i]>arr[i+1]){
            i++;
        }

        //if reached at end, then its valid mountain array
        return i == arr.length - 1;
    }
}
