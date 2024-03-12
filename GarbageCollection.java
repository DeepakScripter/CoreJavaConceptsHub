public class GarbageCollection {

    public static void main(String[] args) {
        // Create objects
        MyClass obj1 = new MyClass("Object 1");
        MyClass obj2 = new MyClass("Object 2");
        MyClass obj3 = new MyClass("Object 3");

        // Set references to null to make objects eligible for garbage collection
        obj1 = null;
        obj2 = null;

        // Explicitly run garbage collection (Note: It's usually not necessary to do
        // this in normal programs)
        System.gc();

        // Create a new object
        MyClass obj4 = new MyClass("Object 4");

        // The garbage collector may run again when needed

        // The program ends, and all remaining objects will be automatically cleaned up
        // by the garbage collector
    }
}

class MyClass {
    private String name;

    public MyClass(String name) {
        this.name = name;
        System.out.println(name + " created.");
    }

    @Override
    protected void finalize() throws Throwable {
        // Finalize method is called before an object is garbage collected
        System.out.println(name + " finalized.");
    }
}
