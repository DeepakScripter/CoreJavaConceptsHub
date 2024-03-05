import java.util.Scanner;

public class MatrixMirror {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the matrix
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrix = inputMatrix(rows, cols, scanner);

        // Calculate the mirror image
        int[][] mirrorMatrix = mirror(matrix);

        // Print the original matrix
        System.out.println("\nOriginal Matrix:");

        printMatrix(matrix);

        // Print the mirrored matrix
        System.out.println("\nMirrored Matrix:");

        printMatrix(mirrorMatrix);

        scanner.close();
    }

    // Helper method to input a matrix
    private static int[][] inputMatrix(int rows, int cols, Scanner scanner) {
        int[][] matrix = new int[rows][cols];

        System.out.println("Enter the elements of the matrix:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at position (" + (i + 1) + ", " + (j + 1) + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        return matrix;
    }

    // Helper method to calculate the mirror image of a matrix
    private static int[][] mirror(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] mirrorMatrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mirrorMatrix[i][j] = matrix[i][cols - 1 - j];
            }
        }

        return mirrorMatrix;
    }

    // Helper method to print a matrix
    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
