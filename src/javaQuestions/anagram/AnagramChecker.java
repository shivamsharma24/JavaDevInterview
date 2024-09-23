package javaQuestions.anagram;

import java.util.Arrays;

public class AnagramChecker {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        boolean result = areAnagrams(str1, str2);
        System.out.println("Are the two strings anagrams? " + result);
    }

    public static boolean areAnagrams(String str1, String str2) {
        // Remove all white spaces and convert strings to lower case
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // If lengths are not the same, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to char arrays
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // Sort char arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted char arrays
        return Arrays.equals(charArray1, charArray2);
    }
}
