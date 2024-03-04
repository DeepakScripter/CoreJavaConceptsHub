public class AssignmentOperatorsExample {
    public static void main(String[] args) {
        // Assignment Operators
        int num1 = 10;
        int num2 = 5;

        System.out.println("Initial values: num1 = " + num1 + ", num2 = " + num2);

        // Arithmetic Assignment Operators
        num1 += num2; // Equivalent to num1 = num1 + num2
        System.out.println("After num1 += num2: num1 = " + num1);

        num1 -= num2; // Equivalent to num1 = num1 - num2
        System.out.println("After num1 -= num2: num1 = " + num1);

        num1 *= num2; // Equivalent to num1 = num1 * num2
        System.out.println("After num1 *= num2: num1 = " + num1);

        num1 /= num2; // Equivalent to num1 = num1 / num2
        System.out.println("After num1 /= num2: num1 = " + num1);

        num1 %= num2; // Equivalent to num1 = num1 % num2
        System.out.println("After num1 %= num2: num1 = " + num1);

        // Increment and Decrement Operators
        int x = 5;
        System.out.println("\nInitial value of x: " + x);

        x++; // Increment x by 1
        System.out.println("After x++: " + x);

        x--; // Decrement x by 1
        System.out.println("After x--: " + x);

        // Prefix and Postfix Increment/Decrement
        int y = 8;
        int result;

        result = ++y; // Prefix Increment
        System.out.println("\nPrefix Increment: result = " + result + ", y = " + y);

        y = 8; // Reset y to 8

        result = y++; // Postfix Increment
        System.out.println("Postfix Increment: result = " + result + ", y = " + y);
    }
}
