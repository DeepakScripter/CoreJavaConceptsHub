

import java.util.stream.LongStream;

public class FactorialFunctional {
    public static void main(String[] args) {
        // Define the number for which factorial is to be calculated
        int number = 5;

        // Calculate the factorial of the given number
        long factorial = calculateFactorial(number);

        // Print the factorial result
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    // Function to calculate factorial using Java Stream API
    private static long calculateFactorial(int n) {
        return LongStream.rangeClosed(1, n)
                .reduce(1, (a, b) -> a * b);
    }
}
