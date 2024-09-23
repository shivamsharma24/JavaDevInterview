package hashmap.dynamicresizing;

import java.util.HashMap;

public class DynamicResizing {
    // Method to get the current capacity of the HashMap using reflection
    public static int getCapacity(HashMap<?, ?> map) {
        try {
            java.lang.reflect.Field tableField = HashMap.class.getDeclaredField("table");
            tableField.setAccessible(true);
            Object[] table = (Object[]) tableField.get(map);
            return (table == null) ? 0 : table.length;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>(4, 0.75f);
        System.out.println("Initial Capacity: " + getCapacity(map));

        // Add elements to trigger resizing
        for (int i = 1; i <= 10; i++) {
            map.put(i, "Value " + i);
            System.out.println("Added: " + i + ", Size: " + map.size() + ", Capacity: " + getCapacity(map));
        }
    }
}
