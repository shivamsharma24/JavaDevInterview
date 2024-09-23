package javaQuestions.findFirstNonRepeatedCharacter;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountEachCharacters {
    public static void main(String[] args) {
        String str= "java articles are awesome";
        str.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .forEach((character, count) -> System.out.println(character+" "+count));


    }
}
