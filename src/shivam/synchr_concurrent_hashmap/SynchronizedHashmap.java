package shivam.synchr_concurrent_hashmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizedHashmap {
    public static void main(String[] args) {

        Map<Integer, String> synchrMap = Collections.synchronizedMap(new HashMap<>());

        synchrMap.put(1, "one");
        synchrMap.put(2, "two");
        synchrMap.put(3, "three");

        //applying lock

        synchronized (synchrMap) {
            for (Map.Entry<Integer, String> entry : synchrMap.entrySet()) {
                System.out.println(
                        entry.getKey() + " " + entry.getValue()
                );

            }
        }
    }
}
