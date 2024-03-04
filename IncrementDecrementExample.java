public class IncrementDecrementExample {
    public static void main(String[] args) {
        int number = 5;

        // Increment operator (++)
        System.out.println("Initial value: " + number);
        number++; // Increment by 1
        System.out.println("After incrementing: " + number);

        // Decrement operator (--)
        number--; // Decrement by 1
        System.out.println("After decrementing: " + number);

        // Increment and decrement with specific values
        number += 3; // Increment by 3
        System.out.println("After incrementing by 3: " + number);

        number -= 2; // Decrement by 2
        System.out.println("After decrementing by 2: " + number);
    }
}
