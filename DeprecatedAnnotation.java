public class DeprecatedAnnotation {

    @Deprecated
    public void deprecatedMethod() {
        System.out.println("This method is deprecated.");
    }

    public static void main(String[] args) {
        DeprecatedAnnotation example = new DeprecatedAnnotation();
        example.deprecatedMethod(); // This will generate a warning about using a deprecated method.
    }
}
