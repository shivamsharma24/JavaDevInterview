package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task implements Runnable {
    @Override
    public void run() {
        System.out.println("Task is running");
    }
}

