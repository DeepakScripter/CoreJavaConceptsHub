public class VarArgs {
    public static void main(String[] args) {
        printNumbers(1, 2, 3);
        printNumbers(10, 20, 30, 40, 50);
    }

    // A method with varargs
    public static void printNumbers(int... numbers) {
        System.out.print("Numbers: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
