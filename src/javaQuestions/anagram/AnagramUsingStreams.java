package javaQuestions.anagram;

import java.util.stream.Collectors;

public class AnagramUsingStreams {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        boolean result = areAnagrams(str1, str2);
        System.out.println("Are the two strings anagrams? " + result);

    }

    public static boolean areAnagrams(String str1, String str2) {
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // If lengths are not the same, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        String sorted1 = str1.chars().
                sorted()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
        String sorted2 = str2.chars()
                .sorted()
                .mapToObj(c->String.valueOf((char)c))
                .collect(Collectors.joining());

        return sorted1.equals(sorted2);
    }

}
