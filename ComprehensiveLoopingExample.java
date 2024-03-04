import java.util.Scanner;

public class ComprehensiveLoopingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example 1: for loop to print numbers 1 to 5
        System.out.println("Example 1: for loop");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); // To move to the next line

        // Example 2: while loop to calculate the sum of numbers up to a given input
        System.out.println("\nExample 2: while loop");
        System.out.print("Enter a number to calculate the sum: ");
        int limit = scanner.nextInt();
        int sum = 0;
        int counter = 1;

        while (counter <= limit) {
            sum += counter;
            counter++;
        }
        System.out.println("The sum of numbers up to " + limit + " is: " + sum);

        // Example 3: do-while loop to print a message until the user enters 'exit'
        System.out.println("\nExample 3: do-while loop");
        String userInput;
        do {
            System.out.print("Enter a message (type 'exit' to stop): ");
            userInput = scanner.next();
            System.out.println("You entered: " + userInput);
        } while (!userInput.equals("exit"));

        // Example 4: Nested for loop to print a pattern
        System.out.println("\nExample 4: Nested for loop");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line after each row
        }

        // Example 5: for-each loop to iterate over an array
        System.out.println("\nExample 5: for-each loop");
        int[] numbers = { 1, 2, 3, 4, 5 };

        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println(); // To move to the next line

        // Close the scanner
        scanner.close();
    }
}
