package captheorem;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public class Node {
    private final ConcurrentHashMap<String, String> dataStore = new ConcurrentHashMap<>();
    private final AtomicBoolean available = new AtomicBoolean(true);

    public boolean isAvailable() {
        return available.get();
    }

    public void setAvailable(boolean available) {
        this.available.set(available);
    }

    public String read(String key) {
        return dataStore.get(key);
    }

    public void write(String key, String value) {
        dataStore.put(key, value);
    }
}
