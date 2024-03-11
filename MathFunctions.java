import java.util.Scanner;

public class MathFunctions {

    // Absolute value function
    static double absoluteValue(double a) {
        return Math.abs(a);
    }

    // Square root function
    static double squareRoot(double a) {
        return Math.sqrt(a);
    }

    // Power function
    static double power(double a, double b) {
        return Math.pow(a, b);
    }

    // Round function (float version)
    static int round(float a) {
        return Math.round(a);
    }

    // Round function (double version)
    static long round(double a) {
        return Math.round(a);
    }

    // Ceil function
    static double ceil(double a) {
        return Math.ceil(a);
    }

    // Floor function
    static double floor(double a) {
        return Math.floor(a);
    }

    // Min function
    static double min(double a, double b) {
        return Math.min(a, b);
    }

    // Max function
    static double max(double a, double b) {
        return Math.max(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a number (a): ");
        double a = scanner.nextDouble();

        System.out.print("Enter another number (b): ");
        double b = scanner.nextDouble();

        // Perform calculations using the math functions
        System.out.println("Absolute value of a: " + absoluteValue(a));
        System.out.println("Square root of a: " + squareRoot(a));
        System.out.println("a raised to the power of b: " + power(a, b));
        System.out.println("Rounded value of a (float): " + round((float) a));
        System.out.println("Rounded value of a (double): " + round(a));
        System.out.println("Ceil value of a: " + ceil(a));
        System.out.println("Floor value of a: " + floor(a));
        System.out.println("Min of a and b: " + min(a, b));
        System.out.println("Max of a and b: " + max(a, b));

        // Close the scanner
        scanner.close();
    }
}
