class SharedCounter {
    private int counter = 0;

    public void increment() {
        int currentValue = counter;
        // Simulating some processing time
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        counter = currentValue + 1;
    }

    public int getCounter() {
        return counter;
    }
}

class IncrementThread implements Runnable {
    private SharedCounter sharedCounter;

    public IncrementThread(SharedCounter sharedCounter) {
        this.sharedCounter = sharedCounter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            sharedCounter.increment();
        }
    }
}

public class MultithreadingCorruption {
    public static void main(String[] args) {
        SharedCounter sharedCounter = new SharedCounter();
        IncrementThread incrementThread1 = new IncrementThread(sharedCounter);
        IncrementThread incrementThread2 = new IncrementThread(sharedCounter);

        Thread t1 = new Thread(incrementThread1);
        Thread t2 = new Thread(incrementThread2);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Counter Value: " + sharedCounter.getCounter());
    }
}

