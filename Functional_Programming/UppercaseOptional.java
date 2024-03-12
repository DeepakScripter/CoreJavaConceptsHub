

import java.util.Optional;

public class UppercaseOptional {
    public static void main(String[] args) {
        String inputString = "hello";
        Optional<String> result = convertToUppercase(inputString);

        result.ifPresent(System.out::println);
    }

    // Method to convert a string to uppercase using Optional
    private static Optional<String> convertToUppercase(String input) {
        return Optional.ofNullable(input) // Wrap the input string in an Optional
                .filter(s -> !s.isEmpty()) // Filter out empty strings
                .map(String::toUpperCase); // Convert the string to uppercase
    }
}
