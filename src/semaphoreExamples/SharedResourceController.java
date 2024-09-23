package semaphoreExamples;

import java.util.concurrent.Semaphore;

//@RestController
public class SharedResourceController {

    private final Semaphore semaphore = new Semaphore(1); // Binary semaphore for mutual exclusion

    //@GetMapping("/sharedResource")
    public String sharedResourceEndpoint() {
        try {
            semaphore.acquire();
            // Simulate access to a shared resource
            Thread.sleep(2000);
            return "Shared resource accessed";
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return "Access interrupted";
        } finally {
            semaphore.release();
        }
    }
}
