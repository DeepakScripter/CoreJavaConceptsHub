import java.util.Scanner;

public class TernaryOperatorExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example 1: Ternary Operator for Maximum of Two Numbers
        System.out.println("Example 1: Find the maximum of two numbers");

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int max = (num1 > num2) ? num1 : num2;
        System.out.println("The maximum of " + num1 + " and " + num2 + " is: " + max);

        // Example 2: Ternary Operator for Checking Odd or Even
        System.out.println("\nExample 2: Check if a number is odd or even");

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        String result = (number % 2 == 0) ? "even" : "odd";
        System.out.println("The number " + number + " is " + result + ".");

        // Close the scanner
        scanner.close();
    }
}
