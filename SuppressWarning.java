@SuppressWarnings("deprecation")
public class SuppressWarning {

    @Deprecated
    public void deprecatedMethod() {
        System.out.println("This method is deprecated.");
    }

    public static void main(String[] args) {
        SuppressWarning example = new SuppressWarning();
        example.deprecatedMethod(); // No warning will be generated for this method.
    }
}
