public class NewKeyword {

    // Class to be instantiated
    public class MyClass {
        private int value;

        // Constructor
        public MyClass(int value) {
            this.value = value;
        }

        public void displayValue() {
            System.out.println("Value: " + value);
        }
    }

    public static void main(String[] args) {
        // Creating an object using the new keyword
        MyClass obj1 = new NewKeyword().new MyClass(42);

        // Accessing the method of the created object
        obj1.displayValue();

        // Creating an array using the new keyword
        int[] intArray = new int[5];

        // Initializing array elements
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i * 2;
        }

        // Displaying array elements
        System.out.print("Array Elements: ");
        for (int value : intArray) {
            System.out.print(value + " ");
        }
        System.out.println();

        // Creating a multi-dimensional array using the new keyword
        int[][] matrix = new int[3][3];

        // Initializing matrix elements
        int count = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = count++;
            }
        }

        // Displaying matrix elements
        System.out.println("Matrix Elements:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
