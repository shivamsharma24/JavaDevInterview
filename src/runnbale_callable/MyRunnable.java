package runnbale_callable;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable task executed");
    }

    public static void main(String[] args) {
        Runnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
