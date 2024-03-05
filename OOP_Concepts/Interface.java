// Interface with abstract methods, a default method, and a constant variable
interface Shape {
    // Abstract method to calculate area
    double calculateArea();

    // Abstract method to display information
    void displayInfo();

    // Constant variable
    public static final String SHAPE_TYPE = "Geometric Shape"; // Made public, static, and final

    // Default method to provide a default color
    default String getDefaultColor() {
        return "No specific color";
    }

    // Static method to get the common shape type
    static String getCommonShapeType() {
        return "Common Shape";
    }
}

// Another interface with a default method
interface Colorable {
    // Default method to get the default color
    default String getDefaultColor() {
        return "No specific color";
    }
}

// Concrete class implementing both Shape and Colorable interfaces
class Circle implements Shape, Colorable {
    double radius;
    String color;

    // Constructor
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Implementing the abstract method from Shape interface
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Implementing the abstract method from Shape interface
    @Override
    public void displayInfo() {
        System.out.println("Circle - Radius: " + radius + ", Color: " + color);
    }

    // Overriding the default method from Colorable interface
    @Override
    public String getDefaultColor() {
        return "Red"; // Specific color for Circle
    }
}

// Concrete class implementing Shape interface
class Square implements Shape {
    double sideLength;

    // Constructor
    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    // Implementing the abstract method from Shape interface
    @Override
    public double calculateArea() {
        return sideLength * sideLength;
    }

    // Implementing the abstract method from Shape interface
    @Override
    public void displayInfo() {
        System.out.println("Square - Side Length: " + sideLength);
    }
}

public class Interface {
    public static void main(String[] args) {
        // Creating instances of classes implementing interfaces
        Circle circle = new Circle(5.0, "Blue");
        Square square = new Square(4.0);

        // Accessing methods from interfaces and concrete classes
        System.out.println("Circle Area: " + circle.calculateArea());
        circle.displayInfo();
        System.out.println("Circle Default Color: " + circle.getDefaultColor());

        System.out.println("\nSquare Area: " + square.calculateArea());
        square.displayInfo();

        // Accessing constant variable from the interface
        System.out.println("\nShape Type: " + Shape.SHAPE_TYPE);

        // Accessing default method from the interface
        System.out.println("Default Color: " + Shape.getCommonShapeType());
    }
}
