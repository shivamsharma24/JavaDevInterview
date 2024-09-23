package javacoding;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NthNonRepeating {
    public static void main(String[] args) {
        String str="java articles are awesome";
        char result = findNthNonRepeatingChar(str, 1);
        System.out.println(" Result is "+ result);
    }

    public static char findNthNonRepeatingChar(String str,int n){

        Map<Character, Long> charCount = str.toLowerCase()
                .chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toMap(Function.identity(), c -> 1L, Long::sum, LinkedHashMap::new));

        return charCount.entrySet()
                .stream()
                .filter(entry->entry.getValue()==1)
                .skip(n-1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse('\0');
    }
}
