package javacoding;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateStringFromList {
    public static void main(String[] args) {

        List<String> list= Arrays.asList("apple",
                "apple",
                "Mango",
                "Kiwi");

        Map<String, Long> collect = list.stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));

        collect.entrySet()
                .stream()
                .filter(e->e.getValue()>1)
                .forEach(e->System.out.println(e.getKey()+" "+e.getValue()));
    }
}
