// Base interface
interface Shape {
    // Abstract method to calculate area
    double calculateArea();

    // Abstract method to display information
    void displayInfo();

    // Constant variable
    String SHAPE_TYPE = "Geometric Shape";
}

// Extended interface
interface ColorfulShape extends Shape {
    // Abstract method to get the color
    String getColor();
}

// Concrete class implementing ColorfulShape interface
class ColoredSquare implements ColorfulShape {
    double sideLength;
    String color;

    // Constructor
    public ColoredSquare(double sideLength, String color) {
        this.sideLength = sideLength;
        this.color = color;
    }

    // Implementing the abstract method from Shape interface
    @Override
    public double calculateArea() {
        return sideLength * sideLength;
    }

    // Implementing the abstract method from Shape interface
    @Override
    public void displayInfo() {
        System.out.println("Colored Square - Side Length: " + sideLength + ", Color: " + color);
    }

    // Implementing the abstract method from ColorfulShape interface
    @Override
    public String getColor() {
        return color;
    }
}

public class InterfaceExtension {
    public static void main(String[] args) {
        // Creating an instance of ColoredSquare
        ColoredSquare coloredSquare = new ColoredSquare(4.0, "Green");

        // Accessing methods from interfaces and concrete class
        System.out.println("Colored Square Area: " + coloredSquare.calculateArea());
        coloredSquare.displayInfo();
        System.out.println("Colored Square Color: " + coloredSquare.getColor());

        // Accessing constant variable from the Shape interface
        System.out.println("\nShape Type: " + Shape.SHAPE_TYPE);
    }
}
