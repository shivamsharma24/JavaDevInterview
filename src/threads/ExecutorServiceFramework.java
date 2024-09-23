package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceFramework {
    public static void main(String[] args) {
        // Create the task
        Task task = new Task();
        
        // Create an ExecutorService to manage the thread pool
        ExecutorService executor = Executors.newFixedThreadPool(2);
        
        // Execute the task using the executor
        executor.execute(task);
        
        // Shutdown the executor
        executor.shutdown();
    }
}
