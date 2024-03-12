import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutor {
    public static void main(String[] args) {
        // Create a single-threaded executor service
        ExecutorService executor = Executors.newSingleThreadExecutor();

        // Define the task to be executed by the single thread
        Runnable task = () -> {
            // Print numbers from 1 to 10
            for (int i = 1; i <= 10; i++) {
                System.out.println("Number: " + i);
            }
        };

        // Submit the task to the executor
        executor.submit(task);

        // Shutdown the executor after the task is completed
        executor.shutdown();
    }
}
