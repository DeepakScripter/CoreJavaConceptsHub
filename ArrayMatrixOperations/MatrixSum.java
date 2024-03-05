import java.util.Scanner;

public class MatrixSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the first matrix
        System.out.println("Enter details for the first matrix:");

        System.out.print("Enter the number of rows: ");
        int rows1 = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols1 = scanner.nextInt();

        int[][] matrix1 = inputMatrix(rows1, cols1, scanner);

        // Input for the second matrix
        System.out.println("\nEnter details for the second matrix:");

        System.out.print("Enter the number of rows: ");
        int rows2 = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols2 = scanner.nextInt();

        int[][] matrix2 = inputMatrix(rows2, cols2, scanner);

        // Check if matrices can be added
        if (rows1 != rows2 || cols1 != cols2) {
            System.out.println("Matrices cannot be added. Please enter matrices of the same size.");
        } else {
            // Sum the matrices
            int[][] sumMatrix = addMatrices(matrix1, matrix2);

            // Print the result
            System.out.println("\nSum of the matrices:");

            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols1; j++) {
                    System.out.print(sumMatrix[i][j] + " ");
                }
                System.out.println();
            }
        }

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

    // Helper method to add two matrices
    private static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;

        int[][] sumMatrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return sumMatrix;
    }
}
