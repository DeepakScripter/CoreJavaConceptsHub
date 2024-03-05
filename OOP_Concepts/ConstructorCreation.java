public class ConstructorCreation {

    // Constructor Example
    static class ConstructorExample {

        // 1. Default Constructor
        static class PersonDefault {
            String name;
            int age;

            // Default Constructor
            public PersonDefault() {
                name = "Unknown";
                age = 0;
            }

            // Method to display information
            public void displayInfo() {
                System.out.println("Default Constructor - Name: " + name + ", Age: " + age);
            }
        }

        // 2. Parameterized Constructor
        static class PersonParameterized {
            String name;
            int age;

            // Parameterized Constructor
            public PersonParameterized(String name, int age) {
                this.name = name;
                this.age = age;
            }

            // Method to display information
            public void displayInfo() {
                System.out.println("Parameterized Constructor - Name: " + name + ", Age: " + age);
            }
        }

        // 3. Constructor Overloading
        static class PersonOverloaded {
            String name;
            int age;

            // Default Constructor
            public PersonOverloaded() {
                name = "Unknown";
                age = 0;
            }

            // Parameterized Constructor
            public PersonOverloaded(String name, int age) {
                this.name = name;
                this.age = age;
            }

            // Copy Constructor
            public PersonOverloaded(PersonOverloaded original) {
                this.name = original.name;
                this.age = original.age;
            }

            // Overloaded Constructor with an additional parameter
            public PersonOverloaded(String name, int age, String occupation) {
                this.name = name;
                this.age = age;
                System.out.println("Occupation: " + occupation);
            }

            // Method to display information
            public void displayInfo() {
                System.out.println("Overloaded Constructor - Name: " + name + ", Age: " + age);
            }
        }

        // Class with a private constructor
        static class RestrictedAccessClass {

            // Private constructor to prevent instantiation from outside the class
            private RestrictedAccessClass() {
                System.out.println("RestrictedAccessClass constructor called.");
            }

            // Public method for demonstration
            public void performAction() {
                System.out.println("Action performed by RestrictedAccessClass!");
            }

            // Static method to create an instance of the class
            public static RestrictedAccessClass createInstance() {
                return new RestrictedAccessClass();
            }
        }

        public static void main(String[] args) {
            // 1. Using Default Constructor
            PersonDefault personDefault = new PersonDefault();
            personDefault.displayInfo();

            // 2. Using Parameterized Constructor
            PersonParameterized personParameterized = new PersonParameterized("John Doe", 25);
            personParameterized.displayInfo();

            // 3. Using Constructor Overloading
            PersonOverloaded personOverloaded1 = new PersonOverloaded();
            personOverloaded1.displayInfo();

            PersonOverloaded personOverloaded2 = new PersonOverloaded("Jane Doe", 30);
            personOverloaded2.displayInfo();

            PersonOverloaded personOverloaded3 = new PersonOverloaded("Bob", 35, "Engineer");
            personOverloaded3.displayInfo();
            

            // 4. Using Copy Constructor
            PersonOverloaded personCopy = new PersonOverloaded(personOverloaded2);
            System.out.println("Copy Constructor:");
            personCopy.displayInfo();

            // Attempting to create an instance directly will result in a compilation error
            // RestrictedAccessClass obj = new RestrictedAccessClass(); // Error: The
            // constructor RestrictedAccessClass() is not visible

            // Accessing the class through a static method to create an instance
            RestrictedAccessClass instance = RestrictedAccessClass.createInstance();
            instance.performAction();
        }
    }

    public static void main(String[] args) {
        // Invoking main method of the ConstructorExample class
        ConstructorExample.main(args);
    }
}
