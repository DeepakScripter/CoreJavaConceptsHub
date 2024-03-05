class Person {
    // Instance variables
    String name;
    int age;

    // Parameterized constructor
    public Person(String name, int age) {
        // Using 'this' to distinguish between instance variables and constructor
        // parameters
        this.name = name;
        this.age = age;
    }

    // Method to display information about the person
    void displayInfo() {
        // Using 'this' to refer to the instance variable
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    // Method to compare the age of the current object with another person
    boolean isOlderThan(Person otherPerson) {
        // Using 'this' to refer to the age of the current object
        return this.age > otherPerson.age;
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        // Creating instances of the Person class
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 30);

        // Displaying information using the displayInfo method
        System.out.println("Person 1:");
        person1.displayInfo();

        System.out.println("\nPerson 2:");
        person2.displayInfo();

        // Comparing ages using the isOlderThan method
        if (person1.isOlderThan(person2)) {
            System.out.println("\nPerson 1 is older than Person 2.");
        } else {
            System.out.println("\nPerson 1 is not older than Person 2.");
        }
    }
}
