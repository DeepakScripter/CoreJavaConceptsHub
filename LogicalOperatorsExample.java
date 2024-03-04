 import java.util.Scanner;

public class LogicalOperatorsExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get two boolean values from the user
        System.out.print("Enter the first boolean value (true or false): ");
        boolean value1 = scanner.nextBoolean();

        System.out.print("Enter the second boolean value (true or false): ");
        boolean value2 = scanner.nextBoolean();

        // Logical AND (&&) operator
        boolean resultAnd = value1 && value2;
        System.out.println("Logical AND Result: " + resultAnd);

        // Logical OR (||) operator
        boolean resultOr = value1 || value2;
        System.out.println("Logical OR Result: " + resultOr);

        // Logical NOT (!) operator
        boolean resultNot1 = !value1;
        boolean resultNot2 = !value2;
        System.out.println("Logical NOT Result for value1: " + resultNot1);
        System.out.println("Logical NOT Result for value2: " + resultNot2);

        scanner.close();
    }
}
true