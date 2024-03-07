public class SynchronizedBlockExample {

    private static int counter = 0;
    private static final Object lock = new Object(); // Object used as a lock for synchronization

    public static void main(String[] args) {
        // Creating multiple threads that will increment the counter
        Thread thread1 = new Thread(() -> incrementCounter(100000));
        Thread thread2 = new Thread(() -> incrementCounter(100000));

        // Start the threads
        thread1.start();
        thread2.start();

        // Wait for threads to complete
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final counter value
        System.out.println("Final Counter: " + counter);
    }

    // Method with a synchronized block to increment the counter
    private static void incrementCounter(int iterations) {
        for (int i = 0; i < iterations; i++) {
            // Synchronized block ensures that only one thread can execute this block at a
            // time
            synchronized (lock) {
                counter++;
            }
        }
    }
}
