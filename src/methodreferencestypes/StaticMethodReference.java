package methodreferencestypes;

import java.util.Arrays;
import java.util.List;

public class StaticMethodReference {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("banana", "apple", "cherry");

        // Sort strings using a static method reference
        strings.sort(String::compareToIgnoreCase);

        System.out.println("Sorted Strings: " + strings);
    }
}
