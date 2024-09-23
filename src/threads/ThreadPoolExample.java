package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    public static void main(String[] args) {
        int cores = Runtime.getRuntime().availableProcessors();
        
        // Assuming a mix of CPU-bound and I/O-bound tasks, we might choose 2 * cores
        int threadPoolSize = cores * 2;
        
        ExecutorService executor = Executors.newFixedThreadPool(threadPoolSize);
        
        for (int i = 0; i < 10; i++) {
            final int index = i;
            executor.submit(() -> {
                System.out.println("Task " + index + " is running in " + Thread.currentThread().getName());
            });
        }
        
        executor.shutdown();
    }
}
