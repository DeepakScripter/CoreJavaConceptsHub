

import shape.Circle;
import shape.Rectangle;
import shape.Sphere;
import shape.Square;

public class ShapeTest {
    public static void main(String[] args) {
        // Circle
        Circle circle = new Circle(5.0);
        System.out.println("Circle:");
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.calculateArea());
        System.out.println();

        // Rectangle
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Rectangle:");
        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println();

        // Square
        Square square = new Square(3.0);
        System.out.println("Square:");
        System.out.println("Side: " + square.getLength()); // Since it's a square, use length as side
        System.out.println("Area: " + square.calculateArea());
        System.out.println();

        // Sphere
        Sphere sphere = new Sphere(4.0);
        System.out.println("Sphere:");
        System.out.println("Radius: " + sphere.getRadius());
        System.out.println("Volume: " + sphere.calculateVolume());
        System.out.println("Surface Area: " + sphere.calculateSurfaceArea());
    }
}
