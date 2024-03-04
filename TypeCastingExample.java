public class TypeCastingExample {
    public static void main(String[] args) {
        // Implicit Typecasting (Widening)
        int intValue = 10;
        long longValue = intValue; // int to long (implicit)

        float floatValue = longValue;
        double doubleValue = floatValue; // float to double (implicit)

        System.out.println("Implicit Typecasting:");
        System.out.println("int to long: " + longValue);
        System.out.println("float to double: " + doubleValue);

        // Explicit Typecasting (Narrowing)
        double anotherDoubleValue = 15.75;
        float anotherFloatValue = (float) anotherDoubleValue; // double to float (explicit)

        long anotherLongValue = (long) anotherFloatValue; // float to long (explicit)
        int anotherIntValue = (int) anotherLongValue; // long to int (explicit)

        System.out.println("\nExplicit Typecasting:");
        System.out.println("double to float: " + anotherFloatValue);
        System.out.println("float to long: " + anotherLongValue);
        System.out.println("long to int: " + anotherIntValue);
    }
}
