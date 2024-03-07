class Counter {
    private int count = 0;

    // Synchronized method
    public synchronized void increment() {   
        count++;
    }

    // Synchronized block
    public void decrement() {
        synchronized (this) {
            count--;
        }
    }

    public int getCount() {
        return count;
    }
}

public class SynchronizationExample {
    public static void main(String[] args) {
        Counter counter = new Counter();

        // Creating two threads to increment and decrement the counter
        Thread incrementThread = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        });

        Thread decrementThread = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.decrement();
            }
        });

        // Start both threads
        incrementThread.start();
        decrementThread.start();

        try {
            // Wait for both threads to finish
            incrementThread.join();
            decrementThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Display the final counter value
        System.out.println("Final Counter Value: " + counter.getCount());
    }
}
