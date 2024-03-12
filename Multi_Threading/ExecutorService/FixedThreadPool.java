import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class FixedThreadPool {
    public static void main(String[] args) {
        // Define the number of threads in the fixed-size thread pool
        int numberOfThreads = 3;

        // Create a fixed-size thread pool with the specified number of threads
        ExecutorService executor = Executors.newFixedThreadPool(numberOfThreads);

        // Loop to submit tasks to the thread pool
        for (int i = 1; i <= 5; i++) {
            // Runnable task representing the work to be done by each thread
            Runnable task = () -> {
                // Get the name of the current thread
                String threadName = Thread.currentThread().getName();

                // Generate a random sleep time between 1 and 5 seconds
                int sleepTime = new Random().nextInt(5000) + 1000;

                // Print a message indicating that the thread is sleeping
                System.out.println(threadName + " is sleeping for " + sleepTime + " milliseconds.");

                try {
                    // Simulate the thread doing some work by sleeping for the calculated time
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    // Handle the interrupted exception if the thread is interrupted while sleeping
                    e.printStackTrace();
                }

                // Print a message indicating that the thread woke up
                System.out.println(threadName + " woke up!");
            };

            // Submit the task to the thread pool for execution
            executor.submit(task);
        }

        // Shut down the executor to stop accepting new tasks
        executor.shutdown();

        try {
            // Wait for all tasks to complete or timeout after 10 seconds
            executor.awaitTermination(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            // Handle the interrupted exception if waiting for termination is interrupted
            e.printStackTrace();
        }
    }
}
