// Custom exception class
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

// Example class using throw, throws, and custom exception
public class ThrowThrowsExample {
    public static void main(String[] args) {
        try {
            // Simulating a situation where a custom exception is thrown
            processInput(150);
        } catch (CustomException customException) {
            System.err.println("Caught CustomException: " + customException.getMessage());
        } catch (Exception e) {
            // Catching other exceptions (if any) for demonstration purposes
            System.err.println("Caught Exception: " + e.getMessage());
        }
    }

    // Method using throw to explicitly throw a custom exception
    public static void processInput(int value) throws CustomException {
        if (value < 0 || value > 100) {
            // Using the throw keyword to throw a custom exception with a specific message
            throw new CustomException("Input value must be between 0 and 100");
        }
        System.out.println("Input is valid: " + value);
    }
}
