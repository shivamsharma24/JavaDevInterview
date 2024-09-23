package threads;

public class FixRaceCondition {
    private int counter = 0;

    // Synchronized increment method to prevent race condition
    public synchronized void increment() {
        counter++;
    }

    public static void main(String[] args) {
        FixRaceCondition example = new FixRaceCondition();

        // Create two threads that increment the counter 1000 times each
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                example.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                example.increment();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Expected value: 2000
        System.out.println("Counter value: " + example.counter);
    }
}
