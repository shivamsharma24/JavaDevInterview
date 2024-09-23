package threadsafeclassdifferentWays;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        ExecutorServiceExample example = new ExecutorServiceExample();

        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                example.increment();
            }
        };

        executor.submit(task);
        executor.submit(task);

        executor.shutdown();
        while (!executor.isTerminated()) {
            // Wait for all tasks to finish
        }

        System.out.println("Final counter: " + example.getCount());
    }
}
