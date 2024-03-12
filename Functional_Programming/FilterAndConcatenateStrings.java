

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAndConcatenateStrings {
    public static void main(String[] args) {
        // Given a list of strings
        List<String> stringList = Arrays.asList("Apple", "Banana", "Grapes", "Strawberry", "Watermelon");

        // Filter out strings with length less than 10 and concatenate the remaining
        // strings
        String resultString = stringList.stream()
                .filter(s -> s.length() < 10)
                .collect(Collectors.joining(", "));

        // Print the concatenated string
        System.out.println("Concatenated String: " + resultString);
    }
}
