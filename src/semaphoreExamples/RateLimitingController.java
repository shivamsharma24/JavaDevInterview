package semaphoreExamples;

import java.util.concurrent.Semaphore;

//@RestController
public class RateLimitingController {

    private final Semaphore semaphore = new Semaphore(5); // Limit to 5 concurrent requests

    //@GetMapping("/limited")
    public String limitedEndpoint() {
        try {
            semaphore.acquire();
            // Simulate processing time
            Thread.sleep(2000);
            return "Request processed";
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return "Request interrupted";
        } finally {
            semaphore.release();
        }
    }
}
