public class StaticVsNon_Static {
    // Instance variable
    private int instanceVariable;

    // Non-static method (instance method)
    public void instanceMethod() {
        System.out.println("This is an instance method.");

        // Access instance variables
        System.out.println("Instance variable value: " + instanceVariable);
    }

    // Static method
    public static void staticMethod() {
        System.out.println("This is a static method.");
    }

    public static void main(String[] args) {
        // Create an instance of the class
        ExampleClass obj = new ExampleClass();

        // Call the instance method on the instance
        obj.instanceMethod();

        // Call the static method using the class name
        ExampleClass.staticMethod();
    }
}
