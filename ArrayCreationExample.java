public class ArrayCreationExample {
    public static void main(String[] args) {
        // Method 1: Specify the size during declaration
        int[] array1 = new int[5];

        // Method 2: Specify the size during instantiation
        int[] array2;
        array2 = new int[5];

        // Method 3: Declare, instantiate, and initialize in a single line
        int[] array3 = { 1, 2, 3, 4, 5 };

        // Method 4: Declare and initialize separately
        int[] array4;
        array4 = new int[] { 1, 2, 3, 4, 5 };

        // Method 5: Dynamic array without initialization
        int[] array5 = new int[10];

        // Method 6: Dynamic array with initialization
        int[] array6 = new int[] { 10, 20, 30 };

        // Method 7: 2D Array
        int[][] twoDArray = { { 1, 2, 3 }, { 4, 5, 6 } };

        // Method 8: Jagged Array
        int[][] jaggedArray = new int[3][];
        jaggedArray[0] = new int[] { 1, 2, 3 };
        jaggedArray[1] = new int[] { 4, 5 };
        jaggedArray[2] = new int[] { 6 };

        // Method 9: Anonymous array
        int[] anonymousArray = { 10, 20, 30 };

        // Display array elements
        System.out.print("Array 3 Elements: ");
        for (int element : array3) {
            System.out.print(element + " ");
        }

        System.out.println("\nJagged Array Elements:");
        for (int[] row : jaggedArray) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
