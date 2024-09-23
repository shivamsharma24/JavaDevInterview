package threads;

public class SequencePrinter {
    private static final int MAX_COUNT = 10;
    private int currentNumber = 1;
    private int currentThread = 1;

    public static void main(String[] args) {
        SequencePrinter sequencePrinter = new SequencePrinter();
        
        Thread t1 = new Thread(new Printer(sequencePrinter, 1));
        Thread t2 = new Thread(new Printer(sequencePrinter, 2));
        Thread t3 = new Thread(new Printer(sequencePrinter, 3));
        
        t1.start();
        t2.start();
        t3.start();
    }

    public synchronized void print(int threadId) {
        while (currentNumber <= MAX_COUNT) {
            while (currentThread != threadId) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }

            if (currentNumber <= MAX_COUNT) {
                System.out.println("T" + threadId + " " + currentNumber);
                currentNumber++;
                currentThread = currentThread % 3 + 1;
                notifyAll();
            }
        }
    }
}

class Printer implements Runnable {
    private final SequencePrinter sequencePrinter;
    private final int threadId;

    public Printer(SequencePrinter sequencePrinter, int threadId) {
        this.sequencePrinter = sequencePrinter;
        this.threadId = threadId;
    }

    @Override
    public void run() {
        sequencePrinter.print(threadId);
    }
}
