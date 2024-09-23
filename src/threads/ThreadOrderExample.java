package threads;
/*
Q1. Suppose, you have thread T1, T2, and T3. How will you ensure
that thread T2 will run after T1 and thread T3 after T2?
*/
public class ThreadOrderExample {
    public static void main(String[] args) {
        // Create thread T1
        Thread T1 = new Thread(() -> {
            System.out.println("Thread T1 is running");
            try {
                Thread.sleep(1000); // Simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread T1 finished");
        });

        // Create thread T2
        Thread T2 = new Thread(() -> {
            try {
                T1.join(); // Wait for T1 to finish
                System.out.println("Thread T2 is running");
                Thread.sleep(1000); // Simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread T2 finished");
        });

        // Create thread T3
        Thread T3 = new Thread(() -> {
            try {
                T2.join(); // Wait for T2 to finish
                System.out.println("Thread T3 is running");
                Thread.sleep(1000); // Simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread T3 finished");
        });

        // Start the threads
        T1.start();
        T2.start();
        T3.start();
        T3.interrupt();

        // Main thread waits for T3 to finish to ensure all threads are completed before ending the program
        try {
            T3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All threads have finished");
    }
}
