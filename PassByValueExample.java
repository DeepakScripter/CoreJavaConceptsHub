class MyClass {
    int value;

    // Constructor to initialize MyClass object with a value
    public MyClass(int value) {
        this.value = value;
    }
}

public class PassByValueExample {

    public static void main(String[] args) {
        // Initialize a primitive value and an object of MyClass
        int primitiveValue = 10;
        MyClass objectValue = new MyClass(20);

        // Display the values before method calls
        System.out.println("Before method calls:");
        System.out.println("Primitive Value: " + primitiveValue);
        System.out.println("Object Value: " + objectValue.value);

        // Call the method to modify values
        modifyValues(primitiveValue, objectValue);

        // Display the values after method calls
        System.out.println("\nAfter method calls:");
        System.out.println("Primitive Value: " + primitiveValue);
        System.out.println("Object Value: " + objectValue.value);
    }

    // Method to modify values
    private static void modifyValues(int primitive, MyClass object) {
        // Modifying the primitive value has no effect outside the method
        primitive = 50;

        // Modifying the object's state affects the original object outside the method
        object.value = 100;

        // Reassigning the reference does not affect the original reference outside the
        // method
        object = new MyClass(200);
    }
}