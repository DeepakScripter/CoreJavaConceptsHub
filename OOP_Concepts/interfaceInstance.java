

interface MyInterface {
    void myMethod();
}

public class interfaceInstance implements MyInterface {
    @Override
    public void myMethod() {
        System.out.println("Implementation of myMethod");
    }

    public static void main(String[] args) {
        MyInterface myInstance = new interfaceInstance();
        myInstance.myMethod(); // Calls the implementation of myMethod in InterfaceExample class.
    }
}
