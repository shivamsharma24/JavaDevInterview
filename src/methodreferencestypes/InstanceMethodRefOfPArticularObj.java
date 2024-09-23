package methodreferencestypes;

import java.util.Arrays;
import java.util.List;

public class InstanceMethodRefOfPArticularObj {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("banana", "apple", "cherry");
        String prefix = "Fruit: ";

        // Append a prefix using an instance method reference of a specific object
        strings.replaceAll(prefix::concat);

        System.out.println("Prefixed Strings: " + strings);
    }
}
