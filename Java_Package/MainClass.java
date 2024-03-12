
// File: MainClass.java
import mypackage.*;
// import mypackage.MyPackageClass;
// import mypackage.MyPackageClass;

public class MainClass {
    public static void main(String[] args) {
        MyPackageClass myPackageObject = new MyPackageClass();

        // Public method can be accessed from anywhere
        myPackageObject.publicMethod();

        // Protected method can be accessed within the same package and by subclasses
        // myPackageObject.protectedMethod();

        // InternalClass is package-private, so we can't access it directly from outside
        // the package

        // Uncommenting the following lines will result in a compilation error
        InternalClass internalObject = new InternalClass();
        internalObject.internalMethod();
        // internalObject.privateMethod();
    }
}
