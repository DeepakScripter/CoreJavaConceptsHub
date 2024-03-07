import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            // Code that might generate an exception
            int result = divide(10, 2);
            System.out.println("Result: " + result);

            // Attempting to read a non-existent file
            readFile("nonexistent.txt");
        } catch (ArithmeticException e) {
            // Handle arithmetic exception
            System.err.println("Cannot divide by zero.");
        } catch (IOException e) {
            // Handle IO exception
            System.err.println("Error reading the file: " + e.getMessage());
        } finally {
            // Cleanup code or final operations
            System.out.println("Finally block executed.");
        }
    }

    public static int divide(int numerator, int denominator) throws ArithmeticException {
        if (denominator == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return numerator / denominator;
    }

    public static void readFile(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            // Code to read from the file (not implemented for simplicity)
        }
    }
}
