public class MultilevelInheritance {
    // Base class
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

    // Derived class (inherits from Vehicle)
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

    // Further derived class (inherits from Car)
    static class SportsCar extends Car {
        private boolean turbocharged;

        // Constructor for SportsCar class
        public SportsCar(String brand, int numberOfDoors, boolean turbocharged) {
            // Calling the constructor of the immediate base class (Car)
            super(brand, numberOfDoors);
            this.turbocharged = turbocharged;
        }

        // Method overriding (overrides displayInfo in the base class Car)
        @Override
        public void displayInfo() {
            super.displayInfo(); // Call the base class method (Car)
            System.out.println("Turbocharged: " + turbocharged);
        }

        // Additional method specific to the SportsCar class
        public void race() {
            System.out.println("SportsCar is racing!");
        }
    }

    public static void main(String[] args) {
        // Creating an instance of the SportsCar class
        SportsCar mySportsCar = new SportsCar("Ferrari", 2, true);

        // Accessing base class methods and properties
        mySportsCar.displayInfo();

        // Accessing methods and properties from intermediate derived class (Car)
        mySportsCar.drive();

        // Accessing methods and properties from the most derived class (SportsCar)
        mySportsCar.race();
    }
}
