// Base class
class Animal {
    String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Method in the base class
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Derived class
class Dog extends Animal {
    int tailLength;

    // Constructor
    public Dog(String name, int tailLength) {
        // Calling the constructor of the immediate parent class (Animal)
        super(name);
        this.tailLength = tailLength;
    }

    // Method in the derived class
    void bark() {
        System.out.println("Dog is barking");
    }

    // Method overriding with the use of 'super'
    @Override
    void eat() {
        super.eat(); // Call the eat method of the immediate parent class (Animal)
        System.out.println("Dog is also eating bones");
    }

    // Method using 'super' to refer to a variable in the immediate parent class
    void displayDetails() {
        System.out.println("Name: " + super.name); // Refers to the 'name' variable of the parent class
        System.out.println("Tail Length: " + tailLength);
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        // Creating an instance of the derived class (Dog)
        Dog myDog = new Dog("Buddy", 12);

        // Accessing methods from the base and derived classes
        myDog.eat(); // Calls the overridden method in Dog, which uses 'super' to call the method in
                     // Animal
        myDog.bark(); // Calls the method specific to Dog
        myDog.displayDetails(); // Calls a method in Dog that uses 'super' to refer to a variable in Animal
    }
}
