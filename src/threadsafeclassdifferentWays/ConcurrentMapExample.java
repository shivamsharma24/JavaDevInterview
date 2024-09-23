package threadsafeclassdifferentWays;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMapExample {
    private ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

    public void add(String key, int value) {
        map.put(key, value);
    }

    public int get(String key) {
        return map.get(key);
    }
}
