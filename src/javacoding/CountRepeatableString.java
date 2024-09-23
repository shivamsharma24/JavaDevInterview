package javacoding;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountRepeatableString {
    public static void main(String[] args) {
        String input="mohan,debjeet,ravi,debjeet,ravi";

        Map<String, Long> wordsCount = Arrays.stream(input.split(","))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        wordsCount.entrySet()
                .stream()
                .sorted(Map.Entry.<String,Long>comparingByValue().reversed())
                .forEach(e->System.out.println(e.getKey()+ "   "+e.getValue()));

    }
}
