public class MultipleTryCatch {
    public static void main(String[] args) {
        try {
            // Code that might generate an ArithmeticException
            int result = divideByZero();
            System.out.println("Result: " + result);

            // Code that might generate a NullPointerException
            String str = null;
            int length = str.length();
            System.out.println("Length: " + length); // This line won't be executed
        } catch (ArithmeticException e) {
            // Handle arithmetic exception
            System.err.println("Caught ArithmeticException: " + e.getMessage());
        } catch (NullPointerException e) {
            // Handle null pointer exception
            System.err.println("Caught NullPointerException: " + e.getMessage());
        } catch (Exception e) {
            // Handle any other exception (this block should be at the end)
            System.err.println("Caught Exception: " + e.getMessage());
        } finally {
            // Code in the finally block (executed regardless of exceptions)
            System.out.println("Finally block executed.");
        }

        // Rest of the program
        System.out.println("End of the program.");
    }

    public static int divideByZero() {
        return 10 / 0; // Intentionally causing an ArithmeticException
    }
}
