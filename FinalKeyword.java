public class FinalKeyword {

    // Final variable
    final int constantValue = 10;

    // Constructor to initialize final variable
    public FinalKeyword(int initialValue) {
        // Compilation error: Cannot assign a value to a final variable
        // constantValue = initialValue;
    }

    // Final method
    public final void finalMethod() {
        System.out.println("This method is final and cannot be overridden.");
    }

    // Final class
    public final class FinalClass {
        // Class content
        static{
            System.out.println("This is Final Class");
        }
    }

    public static void main(String[] args) {
        // Creating an instance of the FinalKeywordExample class
        FinalKeyword example = new FinalKeyword(20);

        // Accessing the final variable
        System.out.println("Constant Value: " + example.constantValue);

        // Calling the final method
        example.finalMethod();

        // Creating an instance of the FinalClass
        FinalClass finalObj = example.new FinalClass();
    }
}
