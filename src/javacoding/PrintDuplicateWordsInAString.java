package javacoding;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrintDuplicateWordsInAString {
    public static void main(String[] args) {
        String str="I am ukg I am in ukg";

        Map<String, Long> words = Arrays.stream(str.split("\\s+"))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        words.entrySet()
                .stream()
                .filter(e->e.getValue()>1)
                .forEach(e->System.out.println(e.getKey()+" "+e.getValue()));
    }
}
