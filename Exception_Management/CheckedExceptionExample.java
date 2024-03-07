import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionExample {
    public static void main(String[] args) {
        try {
            // Checked exception: FileReader constructor may throw FileNotFoundException
            FileReader fileReader = new FileReader("nonexistent.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Read a line (IOException is also a checked exception)
            String line = bufferedReader.readLine();
            System.out.println(line);

            // Close the resources
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        }
    }
}
