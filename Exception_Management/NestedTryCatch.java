public class NestedTryCatch {
    public static void main(String[] args) {
        try {
            // Outer try block
            System.out.println("Outer try block");

            try {
                // Inner try block
                System.out.println("Inner try block");

                // Simulate an exception in the inner try block
                int result = 10 / 0;
                System.out.println("This line won't be executed in the inner try block");
            } catch (ArithmeticException innerException) {
                // Handle exception in the inner catch block
                System.err
                        .println("Caught ArithmeticException in the inner catch block: " + innerException.getMessage());
            }

            // Code after the inner try-catch block
            System.out.println("This line is executed after the inner try-catch block");

        } catch (Exception outerException) {
            // Handle exception in the outer catch block
            System.err.println("Caught Exception in the outer catch block: " + outerException.getMessage());
        }

        // Code after the outer try-catch block
        System.out.println("End of the program.");
    }
}
