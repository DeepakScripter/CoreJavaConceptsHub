// Abstract class
abstract class Animal {
    // Concrete method
    public void eat() {
        System.out.println("Animal is eating");
    }

    // Abstract method (to be implemented by subclasses)
    public abstract void makeSound();
}

// Interface
interface Flying {
    // Interface methods are implicitly public and abstract
    void fly();

    // Interfaces can also have constant fields (implicitly public, static, and
    // final)
    String WINGS = "Wings";
}

// Concrete class implementing both the abstract class and the interface
class Bird extends Animal implements Flying {
    // Implementing the abstract method from the abstract class
    @Override
    public void makeSound() {
        System.out.println("Bird is chirping");
    }

    // Implementing the method from the interface
    @Override
    public void fly() {
        System.out.println("Bird is flying with " + WINGS);
    }
}

public class InterfaceVsAbstractClass {
    public static void main(String[] args) {
        // Creating an instance of the Bird class
        Bird bird = new Bird();

        // Calling methods from the abstract class
        bird.eat();
        bird.makeSound();

        // Calling method from the interface
        bird.fly();
    }
}
