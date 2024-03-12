public class ToString {
    private String name;
    private int age;

    public ToString(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        // Returns a string representation of the object
        return "Person{name='" + name + "', age=" + age + '}';
    }

    public static void main(String[] args) {
        // Create a new ToString object
        ToString person = new ToString("John", 25);
        // Print the string representation of the object
        System.out.println(person.toString());
    }
}
