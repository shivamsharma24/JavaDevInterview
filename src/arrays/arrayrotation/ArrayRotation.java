package arrays.arrayrotation;

import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int k = 3;
        rotate(arr,k);
        System.out.println("Rotated array by " + k + " positions: " + Arrays.toString(arr));
    }

    public static void rotate(int[] arr,int k){
        int n= arr.length;
        // k= k%n;
         reverse(arr,0,n-1);
         reverse(arr,0,k-1);
         reverse(arr, k, n - 1);
    }

    public static void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
