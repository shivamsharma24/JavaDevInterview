package javaQuestions.findmisssingnumberinunsortedlist;

import java.util.Arrays;

public class MissingNumberFinder {
    public static int findMissingNumber(int[] array) {
        int n = array.length + 1; // One number is missing
        int expectedSum = n * (n + 1) / 2;
        int actualSum = Arrays.stream(array).sum();
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] array = {3, 7, 1, 2, 8, 4, 5, 6, 10};
        int missingNumber = findMissingNumber(array);
        System.out.println("The missing number is: " + missingNumber);
    }
}
