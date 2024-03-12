

import java.util.Arrays;
import java.util.List;

public class FilterOddNumbers {
    public static void main(String[] args) {
        // Given a list of integers
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Filter odd numbers and print them
        integerList.stream()
                .filter(num -> num % 2 != 0)
                .forEach(System.out::println);
    }
}
