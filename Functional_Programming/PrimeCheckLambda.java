// Functional interface for checking if a number is prime
@FunctionalInterface
interface PrimeChecker {
    boolean isPrime(int number);
}

public class PrimeCheckLambda {

    public static void main(String[] args) {
        // Implementing the functional interface using a lambda expression
        PrimeChecker primeChecker = (number) -> {
            // Check if the number is less than or equal to 1 (not prime)
            if (number <= 1) {
                return false;
            }

            // Check for factors from 2 to the square root of the number
            for (int i = 2; i <= Math.sqrt(number); i++) {
                // If the number is divisible by any factor, it's not prime
                if (number % i == 0) {
                    return false;
                }
            }

            // If no factors found, the number is prime
            return true;
        };

        // Testing the lambda expression
        int testNumber = 13;
        System.out.println("Is " + testNumber + " prime? " + primeChecker.isPrime(testNumber));
    }
}
