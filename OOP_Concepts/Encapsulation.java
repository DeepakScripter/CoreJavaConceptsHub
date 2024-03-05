// Class with encapsulation
class Car {
    // Private instance variables
    private String model;
    private int year;
    private double price;

    // Constructor
    public Car(String model, int year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Getter methods to access private variables
    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    // Setter methods to modify private variables
    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Method to display information
    public void displayInfo() {
        System.out.println("Car Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        // Creating an instance of the Car class
        Car myCar = new Car("Toyota Camry", 2022, 25000.0);

        // Accessing private variables using getter methods
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Year: " + myCar.getYear());
        System.out.println("Price: $" + myCar.getPrice());

        // Modifying private variables using setter methods
        myCar.setModel("Honda Accord");
        myCar.setPrice(27000.0);

        // Displaying information using the displayInfo method
        myCar.displayInfo();
    }
}
