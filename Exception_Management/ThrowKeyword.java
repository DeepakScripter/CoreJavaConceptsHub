// Custom exception class
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

// Example class using the throw keyword
public class ThrowKeyword {
    public static void main(String[] args) {
        try {
            // Simulating a situation where an exceptional condition occurs
            int result = divide(10, 0);
            System.out.println("Result: " + result); // This line won't be executed
        } catch (CustomException customException) {
            System.err.println("Caught CustomException: " + customException.getMessage());
        } catch (ArithmeticException arithmeticException) {
            System.err.println("Caught ArithmeticException: " + arithmeticException.getMessage());
        }

        // This line won't be executed if an exception occurs
        System.out.println("End of the program.");
    }

    // Method that throws a custom exception
    public static int divide(int numerator, int denominator) throws CustomException {
        if (denominator == 0) {
            // Using the throw keyword to throw a custom exception
            throw new CustomException("Cannot divide by zero");
        }
        return numerator / denominator;
    }
}
