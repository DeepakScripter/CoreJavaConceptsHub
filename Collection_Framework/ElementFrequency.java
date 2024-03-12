import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ElementFrequency {

    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> integerList = Arrays.asList(1, 2, 3, 2, 4, 2, 5);

        // Define the element to count its frequency
        int elementToCount = 2;

        // Use Collections.frequency() method to count the frequency of the element in
        // the list
        int frequency = Collections.frequency(integerList, elementToCount);

        // Display the frequency of the element
        System.out.println("Frequency of " + elementToCount + " in the List: " + frequency);
    }
}
