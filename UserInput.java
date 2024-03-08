import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for boolean
        System.out.print("Enter a boolean (true/false): ");
        boolean booleanValue = scanner.nextBoolean();
        System.out.println("You entered a boolean: " + booleanValue);

        // Input for byte
        System.out.print("Enter a byte: ");
        byte byteValue = scanner.nextByte();
        System.out.println("You entered a byte: " + byteValue);

        // Input for short
        System.out.print("Enter a short: ");
        short shortValue = scanner.nextShort();
        System.out.println("You entered a short: " + shortValue);

        // Input for int
        System.out.print("Enter an int: ");
        int intValue = scanner.nextInt();
        System.out.println("You entered an int: " + intValue);

        // Input for long
        System.out.print("Enter a long: ");
        long longValue = scanner.nextLong();
        System.out.println("You entered a long: " + longValue);

        // Input for float
        System.out.print("Enter a float: ");
        float floatValue = scanner.nextFloat();
        System.out.println("You entered a float: " + floatValue);

        // Input for double
        System.out.print("Enter a double: ");
        double doubleValue = scanner.nextDouble();
        System.out.println("You entered a double: " + doubleValue);

        // Additional float and double inputs
        System.out.print("Enter another float: ");
        float additionalFloat = scanner.nextFloat();
        System.out.println("You entered another float: " + additionalFloat);

        System.out.print("Enter another double: ");
        double additionalDouble = scanner.nextDouble();
        System.out.println("You entered another double: " + additionalDouble);

        // Closing the scanner
        scanner.close();
    }
}
