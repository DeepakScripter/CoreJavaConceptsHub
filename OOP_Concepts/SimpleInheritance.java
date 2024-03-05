public class SimpleInheritance {
    // Base class (Parent class)
    static class Vehicle {
        private String brand;

        // Constructor
        public Vehicle(String brand) {
            this.brand = brand;
        }

        // Method to display information
        public void displayInfo() {
            System.out.println("Vehicle Brand: " + brand);
        }

        // Method to start the vehicle
        public void start() {
            System.out.println("Vehicle is starting");
        }
    }

    // Derived class (Child class)
    static class Car extends Vehicle {
        private int numberOfDoors;

        // Constructor for Car class
        public Car(String brand, int numberOfDoors) {
            // Calling the constructor of the base class (Vehicle)
            super(brand);
            this.numberOfDoors = numberOfDoors;
        }

        // Method overriding (overrides displayInfo in the base class)
        @Override
        public void displayInfo() {
            super.displayInfo(); // Call the base class method
            System.out.println("Number of Doors: " + numberOfDoors);
        }

        // Additional method specific to the Car class
        public void drive() {
            System.out.println("Car is driving");
        }
    }

    public static void main(String[] args) {
        // Creating an instance of the Car class
        Car myCar = new Car("Toyota", 4);

        // Accessing base class methods and properties
        myCar.displayInfo();

        // Accessing derived class methods and properties
        myCar.drive();

        // Calling the overridden method
        myCar.start();
    }
}
