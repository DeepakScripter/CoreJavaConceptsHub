

// Interface with various access modifiers and static method
interface MyInterface {
    // Public, static, and final (implicitly)
    public static final int PUBLIC_STATIC_FINAL_CONSTANT = 42;

    // Default method
    default void defaultMethod() {
        System.out.println("Default method in interface");
    }

    // Public abstract method
    void publicAbstractMethod();

    // Private method (Java 9 and later)
  
    // private void privateMethod() {
    //     System.out.println("Private method in interface");
    // }

    // Static method
    static void staticMethod() {
        System.out.println("Static method in interface");
    }
}

// Class implementing the interface
public class MyInterfaceAcessModifiers implements MyInterface {
    // Private field
    private int privateField = 10;

    // Public method implementing the abstract method
    @Override
    public void publicAbstractMethod() {
        System.out.println("Implemented public abstract method");
    }

    // Public method accessing private field and calling private method
    public void accessPrivateMembers() {
        System.out.println("Accessing private field: " + privateField);
        // Accessing private method
        // privateMethod();
    }

    public static void main(String[] args) {
        // Using the interface constant
        System.out.println("Public Static Final Constant: " + MyInterface.PUBLIC_STATIC_FINAL_CONSTANT);

        // Creating an instance of the class
        MyInterfaceAcessModifiers example = new MyInterfaceAcessModifiers();

        // Calling the default method
        example.defaultMethod();

        // Calling the implemented abstract method
        example.publicAbstractMethod();

        // Calling the static method without creating an instance
        MyInterface.staticMethod();

        // Accessing private members
        example.accessPrivateMembers();
    }
}
