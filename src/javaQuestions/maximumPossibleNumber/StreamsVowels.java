package javaQuestions.maximumPossibleNumber;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsVowels {
    public static void main(String[] args) {
        List<String> list=List.of("ssdfg","vrvty","abc");
        List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u');

        List<String> finalString = list.stream()
                .filter(str -> str.chars()
                        .noneMatch(c -> vowels.contains((char) c)))
                .collect(Collectors.toList());

        System.out.println(finalString);
    }
}
