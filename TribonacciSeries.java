import java.util.Scanner;

public class TribonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms in the Tribonacci series: ");
        int n = scanner.nextInt();

        System.out.println("Tribonacci Series:");

        // Print the Tribonacci series
        for (int i = 0; i < n; i++) {
            System.out.print(tribonacci(i) + " ");
        }

        scanner.close();
    }

    // Recursive method to calculate the nth Tribonacci number
    public static int tribonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
        }
    }
}
