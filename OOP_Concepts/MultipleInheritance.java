// Interface representing a shape
interface Shape {
    // Abstract method to calculate area
    double calculateArea();

    // Abstract method to display information
    void displayInfo();

    // Constant variable
    String SHAPE_TYPE = "Geometric Shape";
}

// Interface representing a color
interface Color {
    // Abstract method to get the color
    String getColor();
}

// Concrete class implementing both Shape and Color interfaces
class ColoredCircle implements Shape, Color {
    double radius;
    String color;

    // Constructor
    public ColoredCircle(double radius, String color) {
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
        System.out.println("Colored Circle - Radius: " + radius + ", Color: " + color);
    }

    // Implementing the abstract method from Color interface
    @Override
    public String getColor() {
        return color;
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        // Creating an instance of ColoredCircle
        ColoredCircle coloredCircle = new ColoredCircle(5.0, "Blue");

        // Accessing methods from interfaces and concrete class
        System.out.println("Colored Circle Area: " + coloredCircle.calculateArea());
        coloredCircle.displayInfo();
        System.out.println("Colored Circle Color: " + coloredCircle.getColor());

        // Accessing constant variable from the Shape interface
        System.out.println("\nShape Type: " + Shape.SHAPE_TYPE);
    }
}
