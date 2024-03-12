import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListReversal {

    public static void main(String[] args) {
        // Creating a List of characters
        List<Character> charList = Arrays.asList('a', 'b', 'c', 'd');

        // Reversing the list
        // Create a new ArrayList to avoid modifying the original list
        List<Character> reversedCharList = new ArrayList<>(charList);
        Collections.reverse(reversedCharList);

        // Displaying the reversed list
        System.out.println("Original List: " + charList);
        System.out.println("Reversed List: " + reversedCharList);
    }
}
