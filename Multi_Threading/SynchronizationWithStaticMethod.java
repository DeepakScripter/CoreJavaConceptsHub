public class SynchronizationWithStaticMethod {

    private static int sharedCounter = 0;

    public static void main(String[] args) {
        // Create multiple threads that will increment the shared counter
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

        // Print the final shared counter value
        System.out.println("Final Shared Counter: " + sharedCounter);
    }

    // Static synchronized method to increment the shared counter
    private static synchronized void incrementCounter(int iterations) {
        for (int i = 0; i < iterations; i++) {
            sharedCounter++;
        }
    }
}
