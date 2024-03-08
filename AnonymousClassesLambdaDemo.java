// AnonymousClassesLambdaDemo.java

@FunctionalInterface
interface Animal {
    void bark();
}

class Dog implements Animal {
    @Override
    public void bark() {
        System.out.println("Dog barks!");
    }
}

abstract class Vehicle {
    abstract void drive();
}

@FunctionalInterface
interface Human {
    void walk();
}

@FunctionalInterface
interface LambdaExp {
    void meth1(int a, int b);
}

@FunctionalInterface
interface DemoAno {
    void meth1(int a);
    // void meth2();
}

public class AnonymousClassesLambdaDemo {
    public static void main(String[] args) {
        // Anonymous class for Animal interface
        Animal bruno = new Animal() {
            @Override
            public void bark() {
                System.out.println("Dog barks!");
            }
        };
        bruno.bark();

        // Anonymous class for Vehicle abstract class
        Vehicle car = new Vehicle() {
            @Override
            void drive() {
                System.out.println("I'm driving a car.");
            }
        };
        car.drive();

        // Anonymous class for Human interface
        Human john = new Human() {
            @Override
            public void walk() {
                System.out.println("John walks.");
            }
        };
        john.walk();

        // Lambda expression for LambdaExp interface
        LambdaExp lambdaExpObj = (a, b) -> {
            System.out.println("The value of a and b is : " + a + "," + b);
        };
        lambdaExpObj.meth1(5, 10);

        // Lambda expression for DemoAno interface
        DemoAno lambdaDemoObj = (a) -> {
            System.out.println("I am method 1 from this lambda " + a);
        };
        lambdaDemoObj.meth1(6);
    }
}
