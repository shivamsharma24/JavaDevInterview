package executorserviceframeowrk;

import java.util.concurrent.*;

public class ExecutorServiceExample {

    public static void main(String[] args) {
        // Create a fixed thread pool executor with 3 threads
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // Submit Runnable tasks to the executor service
        for (int i = 0; i < 5; i++) {
            executorService.execute(new WorkerTask("Task " + i));
        }

        // Submit a Callable task to the executor service
        Future<Integer> futureResult = executorService.submit(new CallableTask());

        try {
            // Get the result of the Callable task
            Integer result = futureResult.get();
            System.out.println("Result of Callable task: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // Shut down the executor service
        executorService.shutdown();

        try {
            // Wait for all tasks to complete before continuing
            if (!executorService.awaitTermination(60, TimeUnit.SECONDS)) {
                executorService.shutdownNow();
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
        }
    }
}

class WorkerTask implements Runnable {
    private final String name;

    public WorkerTask(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " is being executed by " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000); // Simulate work
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println(name + " is completed by " + Thread.currentThread().getName());
    }
}

class CallableTask implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println("Callable task is being executed by " + Thread.currentThread().getName());
        Thread.sleep(3000); // Simulate work
        return 42; // Return result of computation
    }
}
