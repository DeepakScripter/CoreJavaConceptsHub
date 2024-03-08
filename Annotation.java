import java.lang.annotation.*;

// Define a custom annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation {
    String value() default "Default Value";
}

// Create a class that uses the custom annotation
class MyClass {
    @MyAnnotation(value = "Annotated Method")
    public void annotatedMethod() {
        System.out.println("Executing Annotated Method");
    }

    public void nonAnnotatedMethod() {
        System.out.println("Executing Non-Annotated Method");
    }
}

public class Annotation {
    public static void main(String[] args) {
        // Process annotations at runtime
        processAnnotations(MyClass.class);
    }

    // Method to process annotations
    private static void processAnnotations(Class<?> clazz) {
        // Get all methods of the class
        java.lang.reflect.Method[] methods = clazz.getMethods();

        // Iterate through methods
        for (java.lang.reflect.Method method : methods) {
            // Check if the method has the custom annotation
            if (method.isAnnotationPresent(MyAnnotation.class)) {
                // Get the annotation instance
                MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);

                // Print information from the annotation
                System.out.println("Method: " + method.getName());
                System.out.println("Annotation Value: " + annotation.value());
                System.out.println("Executing the annotated method...");
                try {
                    // Invoke the annotated method
                    method.invoke(clazz.newInstance());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
