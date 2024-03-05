public class ObjectCreation {

    // Class definition
    static class Person {
        String name;
        int age;

        // Constructor
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Method to display information
        public void displayInfo() {
            System.out.println("Name: " + name + ", Age: " + age);
        }
    }

    public static void main(String[] args) {
        // 1. Creating an object using the new keyword and a constructor
        Person person1 = new Person("John Doe", 25);
        person1.displayInfo();

        // 2. Creating an object using a static factory method
        Person person2 = createPerson("Jane Doe", 30);
        person2.displayInfo();

        // 3. Creating an object using object cloning
        Person person3 = new Person("Alice", 28);
        Person person4 = clonePerson(person3);
        person4.displayInfo();
    }

    // Static factory method for object creation (alternative to constructor)
    private static Person createPerson(String name, int age) {
        return new Person(name, age);
    }

    // Method for object cloning
    private static Person clonePerson(Person original) {
        Person clone = new Person(original.name, original.age);
        return clone;
    }
}
