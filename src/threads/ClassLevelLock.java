package threads;

public class ClassLevelLock {
    private static int count = 0;

    // Synchronized static method
    public static synchronized void increment() {
        count++;
    }

    // Synchronized block within a static method
    public static void decrement() {
        synchronized (ClassLevelLock.class) {
            count--;
        }
    }

    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        // Create multiple threads accessing the static methods
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                ClassLevelLock.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                ClassLevelLock.decrement();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final count: " + ClassLevelLock.getCount());
    }
}
