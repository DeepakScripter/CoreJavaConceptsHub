public class ExceptionExample {
    public static void main(String[] args) {
        // Example that intentionally causes various exceptions

        // 1. ArithmeticException (divide by zero)
        try {
            int result = 10 / 0;
            System.out.println("Result: " + result); // This line won't be executed
        } catch (ArithmeticException e) {
            System.err.println("Caught ArithmeticException: " + e.getMessage());
        }

        // 2. ArrayIndexOutOfBoundsException
        try {
            int[] array = new int[5];
            int value = array[10];
            System.out.println("Value: " + value); // This line won't be executed
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        // 3. NullPointerException
        try {
            String str = null;
            int length = str.length();
            System.out.println("Length: " + length); // This line won't be executed
        } catch (NullPointerException e) {
            System.err.println("Caught NullPointerException: " + e.getMessage());
        }

        // 4. NumberFormatException
        try {
            String invalidNumber = "abc";
            int number = Integer.parseInt(invalidNumber);
            System.out.println("Number: " + number); // This line won't be executed
        } catch (NumberFormatException e) {
            System.err.println("Caught NumberFormatException: " + e.getMessage());
        }

        // 5. IOException (for file operations)
        try {
            throw new java.io.IOException("Simulated IOException");
        } catch (java.io.IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());
        }

        // ... Add more examples as needed

        System.out.println("End of the program.");
    }
}
