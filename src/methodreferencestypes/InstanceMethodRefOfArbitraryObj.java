package methodreferencestypes;

import java.util.Arrays;
import java.util.List;

public class InstanceMethodRefOfArbitraryObj {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("banana", "apple", "cherry");

        // Print each string using an instance method reference of an arbitrary object
        strings.forEach(System.out::println);
    }
}
