// Base class
class Animal {
    // Method in the base class
    void makeSound() {
        System.out.println("Generic animal sound");
    }
}

// Derived class
class Dog extends Animal {
    // Overriding the makeSound method in the derived class
    @Override
    void makeSound() {
        System.out.println("Woof! Woof!");
    }

    // Additional method specific to the Dog class
    void fetch() {
        System.out.println("Dog is fetching a ball!");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        // Creating an instance of the derived class (Dog)
        Dog myDog = new Dog();

        // Accessing the overridden method in the derived class
        myDog.makeSound(); // Calls the overridden method in Dog

        // Accessing the additional method specific to the Dog class
        myDog.fetch();
    }
}
