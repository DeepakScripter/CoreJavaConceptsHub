public class SystemOutMethods {
    public static void main(String[] args) {
        // Different System.out methods

        // 1. print method
        System.out.print("This is ");
        System.out.print("a print ");
        System.out.print("statement.");
        System.out.println(); // Move to the next line

        // 2. println method
        System.out.println("This is a println statement.");

        // 3. printf method (formatted output)
        String name = "John";
        int age = 25;
        float height = 1.75f;
        System.out.printf("Name: %s, Age: %d, Height: %.2f meters%n", name, age, height);

        // 4. format method (similar to printf)
        System.out.format("Name: %s, Age: %d, Height: %.2f meters%n", name, age, height);

        // 5. println with escape characters
        System.out.println("This is a line with\ttab\tcharacters.");
        System.out.println("This is a line with\nnewline\tcharacters.");

        // 6. print with concatenation
        int x = 5, y = 10;
        System.out.print("The sum of " + x + " and " + y + " is " + (x + y));
        System.out.println(); // Move to the next line

        // 7. write method (byte array)
        byte[] byteArray = "Hello, World!".getBytes();
        System.out.write(byteArray, 0, byteArray.length);
        System.out.println(); // Move to the next line

        // 8. append method (Java 9+)
        StringBuilder stringBuilder = new StringBuilder("Hello");
        System.out.append(", World!");
        System.out.println(stringBuilder);

        // 9. print with new line using printf
        System.out.printf("%nThis is a new line using printf.%n");

        // 10. println with multiple arguments
        int num1 = 5, num2 = 7;
        System.out.println("Sum of " + num1 + " and " + num2 + " is " + (num1 + num2));
    }
}
