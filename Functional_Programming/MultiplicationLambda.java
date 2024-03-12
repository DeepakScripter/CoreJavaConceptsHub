import java.util.function.IntBinaryOperator;

public class MultiplicationLambda {
    public static void main(String[] args) {
        // Lambda expression for multiplication of two integers
        IntBinaryOperator multiply = (a, b) -> a * b;

        // Applying the lambda expression to a pair of numbers
        int result = multiply.applyAsInt(5, 7);
        System.out.println("Multiplication result: " + result);
    }
}
