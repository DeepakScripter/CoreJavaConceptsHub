import java.util.Scanner;

public class ComprehensiveDecisionMakingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example 1: if-else statement
        System.out.println("Example 1: if-else statement");
        int num1 = 20;

        if (num1 > 0) {
            System.out.println("num1 is positive.");
        } else if (num1 < 0) {
            System.out.println("num1 is negative.");
        } else {
            System.out.println("num1 is zero.");
        }

        // Example 2: switch statement
        System.out.println("\nExample 2: switch statement");
        char grade = 'B';

        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Good job!");
                break;
            case 'C':
                System.out.println("You passed.");
                break;
            default:
                System.out.println("Invalid grade.");
        }

        // Example 3: Ternary Operator
        System.out.println("\nExample 3: Ternary Operator");
        int num2 = 15;
        String result = (num2 % 2 == 0) ? "even" : "odd";
        System.out.println("The number " + num2 + " is " + result + ".");

        // Example 4: Nested if-else statements
        System.out.println("\nExample 4: Nested if-else statements");

        System.out.print("Enter a number: ");
        int nestedNum = scanner.nextInt();

        if (nestedNum > 0) {
            System.out.println("You entered a positive number.");

            // Nested if-else to check if the positive number is even or odd
            if (nestedNum % 2 == 0) {
                System.out.println("The positive number is even.");
            } else {
                System.out.println("The positive number is odd.");
            }

        } else if (nestedNum < 0) {
            System.out.println("You entered a negative number.");

            // Nested if-else to check if the negative number is even or odd
            if (nestedNum % 2 == 0) {
                System.out.println("The negative number is even.");
            } else {
                System.out.println("The negative number is odd.");
            }

        } else {
            System.out.println("You entered zero.");
        }

        // Example 5: User Input and if-else
        System.out.println("\nExample 5: User Input and if-else");
        System.out.print("Enter another number: ");
        int userInput = scanner.nextInt();

        if (userInput > 0) {
            System.out.println("You entered a positive number.");
        } else if (userInput < 0) {
            System.out.println("You entered a negative number.");
        } else {
            System.out.println("You entered zero.");
        }

        // Close the scanner
        scanner.close();
    }
}
