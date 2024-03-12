import java.util.Arrays;

public class StringArrayToStream {
    public static void main(String[] args) {
        // Convert an array of strings into a stream and print each string
        String[] stringArray = { "Java", "Lambda", "Stream", "Example" };

        Arrays.stream(stringArray)
                .forEach(System.out::println);
    }
}
