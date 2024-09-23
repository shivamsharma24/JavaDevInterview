package semaphoreExamples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

//@RestController
public class ResourcePoolController {

    private final Semaphore semaphore = new Semaphore(3); // Limit to 3 concurrent threads
    private final ExecutorService executorService = Executors.newFixedThreadPool(3);

    //@GetMapping("/resource")
    public String resourceEndpoint() {
        try {
            semaphore.acquire();
            executorService.submit(this::useResource);
            return "Resource requested";
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return "Resource request interrupted";
        }
    }

    private void useResource() {
        try {
            // Simulate resource usage
            Thread.sleep(3000);
            System.out.println("Resource used by " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            semaphore.release();
        }
    }
}
