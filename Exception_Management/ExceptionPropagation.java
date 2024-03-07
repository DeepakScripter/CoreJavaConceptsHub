public class ExceptionPropagation {
    public static void main(String[] args) {
        try {
            // Calling a method that may throw an exception
            methodA();
        } catch (Exception e) {
            // Catching the exception propagated from methodA
            System.err.println("Caught Exception in the main method: " + e.getMessage());
        }
    }

    // Method A that throws an exception
    public static void methodA() {
        try {
            // Calling a method that may throw an exception
            methodB();
        } catch (Exception e) {
            // Catching the exception and rethrowing with additional information
            throw new RuntimeException("Exception propagated from methodB in methodA", e);
        }
    }

    // Method B that throws an exception
    public static void methodB() {
        // Simulating an exception (ArithmeticException)
        int result = 10 / 0;
    }
}
