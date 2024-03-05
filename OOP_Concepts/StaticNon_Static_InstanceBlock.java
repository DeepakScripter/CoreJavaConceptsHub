public class StaticNon_Static_InstanceBlock {
    // Static variable
    static int staticVar;

    // Instance variable
    int instanceVar;

    // Static initializer block
    static {
        System.out.println("Static initializer block: Executed only once when the class is loaded.");
        staticVar = 10;
    }

    // Instance initializer block
    {
        System.out.println("Instance initializer block: Executed every time an instance is created.");
        instanceVar = 20;
    }

    // Constructor
    public StaticNon_Static_InstanceBlock() {
        System.out.println("Constructor: Executed when an object is created.");
    }

    // Non-static block
    void nonStaticMethod() {
        System.out.println("Non-static block: Executed every time the method is called.");
    }

    public static void main(String[] args) {
        System.out.println("Main method: Execution starts here.");

        // Creating an instance of the class
        StaticNon_Static_InstanceBlock obj = new StaticNon_Static_InstanceBlock();

        // Accessing instance variable and non-static method
        System.out.println("Instance Variable: " + obj.instanceVar);
        obj.nonStaticMethod();

        // Accessing static variable
        System.out.println("Static Variable: " + staticVar);

        System.out.println("Main method: Execution ends here.");
    }
}
