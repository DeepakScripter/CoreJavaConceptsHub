import java.io.*;

public class FileHandling {
    public static void main(String[] args) {
        // Specify the file paths
        String sourceFilePath = "example.txt";
        String destinationFilePath = "copied_example.txt";

        // 1. Writing to a File
        writeToFile(sourceFilePath, "Hello, File Handling in Java!");

        // 2. Reading from a File
        readFromFile(sourceFilePath);

        // 3. Appending to a File
        appendToFile(sourceFilePath, "\nAppended line.");

        // 4. Reading again after appending
        readFromFile(sourceFilePath);

        // 5. File Information
        printFileInfo(sourceFilePath);

        // 6. Rename a File
        renameFile(sourceFilePath, "renamed_example.txt");

        // 7. Copy File
        copyFile(sourceFilePath, destinationFilePath);

        // 8. Reading from the copied file
        readFromFile(destinationFilePath);

        // 9. File Information after copying
        printFileInfo(destinationFilePath);

        // 10. Deleting Files
        deleteFile("renamed_example.txt");
        deleteFile(destinationFilePath);
    }

    // Method to write content to a file
    private static void writeToFile(String filePath, String content) {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(content);
            System.out.println("Content written to the file successfully.");
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        }
    }

    // Method to read content from a file
    private static void readFromFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("\nReading from the file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading from the file: " + e.getMessage());
        }
    }

    // Method to append content to a file
    private static void appendToFile(String filePath, String content) {
        try (FileWriter writer = new FileWriter(filePath, true)) {
            writer.write(content);
            System.out.println("Content appended to the file successfully.");
        } catch (IOException e) {
            System.err.println("Error appending to the file: " + e.getMessage());
        }
    }

    // Method to print information about a file
    private static void printFileInfo(String filePath) {
        File file = new File(filePath);
        System.out.println("\nFile Information:");
        System.out.println("Name: " + file.getName());
        System.out.println("Absolute Path: " + file.getAbsolutePath());
        System.out.println("Can Write: " + file.canWrite());
        System.out.println("Can Read: " + file.canRead());
        System.out.println("File Length: " + file.length() + " bytes");
    }

    // Method to rename a file
    private static void renameFile(String oldFilePath, String newFilePath) {
        File oldFile = new File(oldFilePath);
        File newFile = new File(newFilePath);
        if (oldFile.renameTo(newFile)) {
            System.out.println("File renamed successfully.");
        } else {
            System.err.println("Error renaming the file.");
        }
    }

    // Method to copy the contents of one file to another
    private static void copyFile(String sourceFilePath, String destinationFilePath) {
        try (FileReader sourceReader = new FileReader(sourceFilePath);
                FileWriter destinationWriter = new FileWriter(destinationFilePath)) {

            int character;
            while ((character = sourceReader.read()) != -1) {
                destinationWriter.write(character);
            }
            System.out.println("File copied successfully.");

        } catch (IOException e) {
            System.err.println("Error copying the file: " + e.getMessage());
        }
    }

    // Method to delete a file
    private static void deleteFile(String filePath) {
        File file = new File(filePath);
        if (file.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.err.println("Error deleting the file.");
        }
    }
}
