public class NestedTryCatchFinallyExample {
    public static void main(String[] args) {
        try {
            System.out.println("Outer try block");

            try {
                System.out.println("Inner try block");

                // Simulating an exception in the inner try block
                int result = divideByZero(10, 0);
                System.out.println("This line won't be executed in the inner try block");
            } catch (ArithmeticException innerException) {
                System.err
                        .println("Caught ArithmeticException in the inner catch block: " + innerException.getMessage());
            } finally {
                System.out.println("Inner finally block");
            }

            // Code after the inner try-catch-finally block
            System.out.println("This line is executed after the inner try-catch-finally block");

        } catch (Exception outerException) {
            System.err.println("Caught Exception in the outer catch block: " + outerException.getMessage());
        } finally {
            System.out.println("Outer finally block");
        }

        // Code after the outer try-catch-finally block
        System.out.println("End of the program.");
    }

    public static int divideByZero(int numerator, int denominator) {
        // Simulating an ArithmeticException
        return numerator / denominator;
    }
}
