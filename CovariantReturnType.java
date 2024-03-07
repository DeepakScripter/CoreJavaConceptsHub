class Animal {
    String getType() {
        return "Generic Animal";
    }
}

class Dog extends Animal {
    @Override
    String getType() {
        return "Dog";
    }
}

public class CovariantReturnType {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println("Animal type: " + animal.getType());

        Dog dog = new Dog();
        System.out.println("Dog type: " + dog.getType());

        // Using covariant return type
        Animal anotherAnimal = getAnimalType();
        System.out.println("Another Animal type: " + anotherAnimal.getType());
    }

    static Animal getAnimalType() {
        // Covariant return type allows returning a subtype (Dog in this case)
        return new Dog();
    }
}
