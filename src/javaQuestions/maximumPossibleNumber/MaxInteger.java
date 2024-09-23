package javaQuestions.maximumPossibleNumber;

import java.util.Arrays;

public class MaxInteger {
    public static void main(String[] args) {
        int a=4376;

        //Converting int to String
        String str = Integer.toString(a);

        //Converting string to charArray
        char[] digits = str.toCharArray();

        //sorting
        Arrays.sort(digits);

        //reverse
        StringBuilder stringBuilder= new StringBuilder(new String(digits)).reverse();

        //convert
        System.out.println(Integer.parseInt(stringBuilder.toString()));

    }
}
