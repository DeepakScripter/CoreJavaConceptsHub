// Base class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Derived class 1
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Derived class 2
class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

// Derived class 3
class Bird extends Animal {
    void chirp() {
        System.out.println("Bird is chirping");
    }
}

public class HierarchicalInheritance{
    public static void main(String[] args) {
        // Creating instances of derived classes
        Dog myDog = new Dog();
        Cat myCat = new Cat();
        Bird myBird = new Bird();

        // Accessing methods from the base class
        myDog.eat(); // Inherited from Animal
        myCat.eat(); // Inherited from Animal
        myBird.eat(); // Inherited from Animal

        // Accessing methods specific to each derived class
        myDog.bark(); // Specific to Dog
        myCat.meow(); // Specific to Cat
        myBird.chirp(); // Specific to Bird
    }
}
