package shivam.serializationofSingletonPattern;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class Singleton implements Serializable {
    private static final long serialVersionUID = 1L;

    // Private static instance
    private static volatile Singleton instance;

    // Private constructor to prevent instantiation
    private Singleton() {
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
    }

    // Public static method to provide access to the instance
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    // Implement readResolve method to preserve singleton property
    protected Object readResolve() throws ObjectStreamException {
        return getInstance();
    }
}
