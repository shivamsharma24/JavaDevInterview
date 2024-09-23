package methodreferencestypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class ConstructorReference {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> strings = Arrays.asList("banana", "apple", "cherry");

        // Use a constructor reference to create a new ArrayList
        Supplier<List<String>> listSupplier = ArrayList::new;
        List<String> newList = listSupplier.get();

        newList.addAll(strings);

        System.out.println("New List: " + newList);
    }
}
