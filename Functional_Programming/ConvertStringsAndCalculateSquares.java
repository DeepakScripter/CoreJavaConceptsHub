import java.util.List;
import java.util.stream.Collectors;

public class ConvertStringsAndCalculateSquares {
    public static void main(String[] args) {
        // Create a list of strings representing numbers ("1", "2", ...).
        List<String> numberStrings = List.of("1", "2", "3", "4", "5");

        // Convert each string to an integer, calculate squares, and sum up the
        // resulting integers
        int sumOfSquares = numberStrings.stream()
                .map(Integer::parseInt)
                .map(num -> num * num)
                .reduce(0, Integer::sum);

        System.out.println("Sum of squares: " + sumOfSquares);
    }
}
