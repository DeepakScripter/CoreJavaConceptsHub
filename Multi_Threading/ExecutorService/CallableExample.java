import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {
    public static void main(String[] args) {
        // Create a fixed-size thread pool with 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Callable tasks to calculate factorials
        Callable<Long> factorialTask1 = new FactorialCalculator(5);
        Callable<Long> factorialTask2 = new FactorialCalculator(8);
        Callable<Long> factorialTask3 = new FactorialCalculator(10);

        // Submit tasks and get Futures
        Future<Long> future1 = executor.submit(factorialTask1);
        Future<Long> future2 = executor.submit(factorialTask2);
        Future<Long> future3 = executor.submit(factorialTask3);

        try {
            // Retrieve results and print them
            System.out.println("Factorial of 5: " + future1.get());
            System.out.println("Factorial of 8: " + future2.get());
            System.out.println("Factorial of 10: " + future3.get());
        } catch (Exception e) {
            // Handle any exceptions that occur during task execution
            e.printStackTrace();
        } finally {
            // Shutdown the executor to release resources
            executor.shutdown();
        }
    }
}

// A class to calculate the factorial of a number
class FactorialCalculator implements Callable<Long> {
    private int number;

    public FactorialCalculator(int number) {
        this.number = number;
    }

    @Override
    public Long call() {
        long result = 1;
        // Calculate the factorial
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        // Return the result
        return result;
    }
}
