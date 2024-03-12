import java.util.HashSet;
import java.util.Set;

public class UniqueCharacterCount {

    public static void main(String[] args) {
        // Input string
        String inputString = "hello";

        // Initialize a Set to store unique characters
        Set<Character> charSet = new HashSet<>();

        // Iterate through each character in the input string
        for (char c : inputString.toCharArray()) {
            // Add each character to the Set
            charSet.add(c);
        }

        // Count the number of unique characters in the Set
        int uniqueCharacterCount = charSet.size();

        // Display the number of unique characters in the string
        System.out.println("Number of unique characters in the string: " + uniqueCharacterCount);
    }
}
