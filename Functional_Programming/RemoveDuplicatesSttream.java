
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesSttream {
    public static void main(String[] args) {
        // Given an array of integers, create a stream, remove duplicates, and collect
        // the result into a new list.
        Integer[] numbers = { 1, 2, 3, 4, 1, 2, 5, 6, 7, 8, 3 };

        List<Integer> distinctNumbers = Arrays.stream(numbers)
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Original List: " + Arrays.asList(numbers));
        System.out.println("List without duplicates: " + distinctNumbers);
    }
}
