package threads;

public class EmptyRunMethod implements Runnable{
    @Override
    public void run() {

    }

    public static void main(String[] args) {
        EmptyRunMethod empty= new EmptyRunMethod();
        Thread t= new Thread(empty);
        t.start();
        System.out.println("Thread has started and will run empty run() method");
    }
}
