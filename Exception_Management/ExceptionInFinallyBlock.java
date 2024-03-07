public class ExceptionInFinallyBlock {
    public static void main(String[] args) {
        try {
            // Code that might generate an exception
            int result = divideByZero();
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle arithmetic exception
            System.err.println("Caught ArithmeticException: " + e.getMessage());
        } finally {
            // Code in the finally block
            System.out.println("Finally block executed.");

            // Intentionally causing an exception in the finally block
            int[] array = { 1, 2, 3 };
            System.out.println("Accessing an element outside the array bounds: " + array[10]);
        }

        // This line won't be executed due to the unhandled exception in the finally
        // block
        System.out.println("End of the program.");
    }

    public static int divideByZero() {
        return 10 / 0; // Intentionally causing an ArithmeticException
    }
}
