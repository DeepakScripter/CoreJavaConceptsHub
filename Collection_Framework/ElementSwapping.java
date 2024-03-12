import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ElementSwapping {

    public static void main(String[] args) {
        // Create a list of fruits
        List<String> fruitList = new ArrayList<>(Arrays.asList("apple", "banana", "orange"));

        // Swapping elements at indices 0 and 2 using Collections.swap() method
        Collections.swap(fruitList, 0, 2);

        // Display the list after swapping elements
        System.out.println("List after swapping elements: " + fruitList);
    }
}
