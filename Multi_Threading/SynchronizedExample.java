public class SynchronizedExample {

    private static int counter = 0;

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

    // Synchronized method to increment the counter
    private synchronized static void incrementCounter(int iterations) {
        for (int i = 0; i < iterations; i++) {
            counter++;
        }
    }
}
