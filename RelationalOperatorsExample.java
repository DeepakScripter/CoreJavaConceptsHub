import java.util.Scanner;

public class RelationalOperatorsExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Relational operators
        System.out.println("Relational Operators Example:");

        System.out.println(num1 + " is equal to " + num2 + ": " + (num1 == num2));
        System.out.println(num1 + " is not equal to " + num2 + ": " + (num1 != num2));

        System.out.println(num1 + " is greater than " + num2 + ": " + (num1 > num2));
        System.out.println(num1 + " is less than " + num2 + ": " + (num1 < num2));

        System.out.println(num1 + " is greater than or equal to " + num2 + ": " + (num1 >= num2));
        System.out.println(num1 + " is less than or equal to " + num2 + ": " + (num1 <= num2));

        // Close the scanner
        scanner.close();
    }
}

