public class UncheckedExceptionExample {
    public static void main(String[] args) {
        // Unchecked exception: Division by zero
        int result = divideByZero(10, 0);
        System.out.println("Result: " + result);

        // Unchecked exception: Null pointer access
        String str = null;
        int length = str.length(); // This line will throw NullPointerException
        System.out.println("Length: " + length);
    }

    public static int divideByZero(int numerator, int denominator) {
        // Unchecked exception: Division by zero
        return numerator / denominator;
    }
}
