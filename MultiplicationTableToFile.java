import java.io.FileWriter;
import java.io.IOException;

public class MultiplicationTableToFile {

    public static void generateTableToFile(int number, int limit, String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            for (int i = 1; i <= limit; i++) {
                int result = number * i;
                writer.write(number + " * " + i + " = " + result + "\n");
            }
            System.out.println("Multiplication table written to " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        int tableNumber = 5; // Change this to the desired number for the multiplication table
        int tableLimit = 10; // Change this to the desired limit for the multiplication table
        String fileName = "multiplication_table.txt";

        generateTableToFile(tableNumber, tableLimit, fileName);
    }
}
