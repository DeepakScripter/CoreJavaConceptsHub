import java.util.Arrays;
import java.util.List;

public class StringListSorting {

    public static void main(String[] args) {
        // Create a list of strings
        List<String> stringList = Arrays.asList("apple", "banana", "orange", "grape");

        // Sorting the list in descending order using a lambda expression
        stringList.sort((s1, s2) -> s2.compareTo(s1));

        // Display the sorted list
        System.out.println("Sorted List in Descending Order: " + stringList);
    }
}
