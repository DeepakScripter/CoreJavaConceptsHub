// Abstract class representing a shape
abstract class Shape {
    // Abstract method for calculating area
    abstract double calculateArea();

    // Concrete method
    void display() {
        System.out.println("This is a shape.");
    }
}

// Concrete class implementing the Shape abstract class
class Circle extends Shape {
    double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementing the abstract method to calculate the area of a circle
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Overriding the display method
    @Override
    void display() {
        System.out.println("This is a circle with radius " + radius);
    }
}

// Concrete class implementing the Shape abstract class
class Rectangle extends Shape {
    double length;
    double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementing the abstract method to calculate the area of a rectangle
    @Override
    double calculateArea() {
        return length * width;
    }

    // Overriding the display method
    @Override
    void display() {
        System.out.println("This is a rectangle with length " + length + " and width " + width);
    }
}

public class Abstraction {
    public static void main(String[] args) {
        // Creating instances of concrete classes
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        // Calling abstract method and concrete method
        System.out.println("Area of Circle: " + circle.calculateArea());
        circle.display();

        System.out.println("\nArea of Rectangle: " + rectangle.calculateArea());
        rectangle.display();
    }
}
