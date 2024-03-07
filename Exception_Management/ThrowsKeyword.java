import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsKeyword {
    public static void main(String[] args) {
        try {
            // Calling a method that declares checked exceptions
            readFile("nonexistent.txt");
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Caught FileNotFoundException: " + fileNotFoundException.getMessage());
        } catch (IOException ioException) {
            System.err.println("Caught IOException: " + ioException.getMessage());
        }
    }

    // Method declaring that it may throw checked exceptions
    public static void readFile(String fileName) throws FileNotFoundException, IOException {
        // Using FileReader that may throw FileNotFoundException
        FileReader fileReader = new FileReader(fileName);

        // Reading a character that may throw IOException
        int character = fileReader.read();
        while (character != -1) {
            System.out.print((char) character);
            character = fileReader.read();
        }

        // Closing the FileReader
        fileReader.close();
    }
}
