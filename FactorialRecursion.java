import java.util.Scanner;

public class FactorialRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            long result = calculateFactorial(n);
            System.out.println("Factorial of " + n + " is: " + result);
        }

        scanner.close();
    }

    // Recursive method to calculate factorial
    public static long calculateFactorial(int n) {
        // Base case: factorial of 0 is 1
        if (n == 0) {
            return 1;
        } else {
            // Recursive case: n! = n * (n-1)!
            return n * calculateFactorial(n - 1);
        }
    }
}
