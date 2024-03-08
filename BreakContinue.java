public class BreakContinue {
    public static void main(String[] args) {
        // Example of 'break' statement
        System.out.println("Example of 'break' statement:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Breaking the loop at i = 3");
                break; // Exit the loop when i is 3
            }
            System.out.println("Iteration: " + i);
        }
        System.out.println(); // Blank line for separation

        // Example of 'continue' statement
        System.out.println("Example of 'continue' statement:");
        for (int j = 1; j <= 5; j++) {
            if (j == 3) {
                System.out.println("Skipping the iteration at j = 3");
                continue; // Skip the rest of the code in the loop for i = 3
            }
            System.out.println("Iteration: " + j);
        }
    }
}
