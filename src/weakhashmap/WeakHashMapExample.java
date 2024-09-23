package weakhashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapExample {
    public static void main(String[] args) {
        Map<String, String> weakHashMap = new WeakHashMap<>();

        // Creating keys as normal strings
        String key1 = new String("key1");
        String key2 = new String("key2");

        // Adding entries to the WeakHashMap
        weakHashMap.put(key1, "value1");
        weakHashMap.put(key2, "value2");

        System.out.println("WeakHashMap before GC: " + weakHashMap);

        // Nullifying the strong references to the keys
        key1 = null;
        key2 = null;

        // Requesting garbage collection
        System.gc();

        // Giving some time for GC to happen
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("WeakHashMap after GC: " + weakHashMap);
    }
}
