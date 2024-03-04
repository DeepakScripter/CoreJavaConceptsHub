public class VariableDeclarationExample {
    public static void main(String[] args) {
        // Rule 1: Declare variables before using them
        int number1;
        int number2;

        // Rule 2: Initialize variables before using them
        number1 = 5;
        number2 = 10;

        // Rule 3: Variables can be declared and initialized on the same line
        int sum = number1 + number2;

        // Rule 4: Variables must have unique names within the same scope
        int sumOfNumbers = number1 + number2;

        // Rule 5: Variable names are case-sensitive
        int Number = 15;
        int number = 20;

        // Rule 6: Variable names can contain letters, digits, and underscores
        int total_score = 100;

        // Rule 7: Variable names cannot start with a digit
        // int 1stPlace = 1; // This will result in a compilation error

        // Rule 8: Java is statically-typed, so the data type must be specified during
        // declaration
        double average = (double) sum / 2;

        // Rule 9: Constants are declared using the 'final' keyword
        final double PI = 3.14;

        // Rule 10: Variables should have meaningful names for better code readability
        int studentAge = 25;

        // Display the result
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("PI: " + PI);
        System.out.println("Student Age: " + studentAge);
    }
}
