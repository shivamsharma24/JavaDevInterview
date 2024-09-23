package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        // Create a fixed thread pool with 2 threads
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // Submit a task using Callable, which returns a Future
        Future<Integer> future = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 42;
            }
        });

        // Perform some other task
        System.out.println("Doing other tasks while the callable is being processed...");

        try {
            // Get the result of the callable
            Integer result = future.get();
            System.out.println("Result from callable: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // Shutdown the executor service
        executorService.shutdown();
    }
}
