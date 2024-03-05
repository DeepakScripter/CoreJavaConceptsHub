import java.io.Console;

public class ConsoleClass {
    public static void main(String[] args) {
        // Get the Console object
        Console console = System.console();

        if (console == null) {
            System.out.println("Console is not available. Exiting...");
            System.exit(1);
        }

        // Reading input from the console
        String name = console.readLine("Enter your name: ");
        char[] password = console.readPassword("Enter your password: ");

        // Writing output to the console
        console.printf("Hello, %s! Your password is: %s%n", name, new String(password));

        // Note: The password array should be cleared after use for security reasons
        java.util.Arrays.fill(password, ' ');
    }
}
