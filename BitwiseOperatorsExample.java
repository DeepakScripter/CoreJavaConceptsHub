public class BitwiseOperatorsExample {
    public static void main(String[] args) {
        // Bitwise AND (&) Operator
        int num1 = 12; // Binary: 1100
        int num2 = 25; // Binary: 11001

        int resultAnd = num1 & num2;
        System.out.println("Bitwise AND (&) Operator: " + resultAnd); // Output: 8 (Binary: 1000)

        // Bitwise OR (|) Operator
        int resultOr = num1 | num2;
        System.out.println("Bitwise OR (|) Operator: " + resultOr); // Output: 29 (Binary: 11101)

        // Bitwise XOR (^) Operator
        int resultXor = num1 ^ num2;
        System.out.println("Bitwise XOR (^) Operator: " + resultXor); // Output: 21 (Binary: 10101)

        // Bitwise NOT (~) Operator
        int resultNotNum1 = ~num1;
        System.out.println("Bitwise NOT (~) Operator on num1: " + resultNotNum1); // Output: -13

        // Left Shift (<<) Operator
        int leftShifted = num1 << 2;
        System.out.println("Left Shift (<<) Operator on num1: " + leftShifted); // Output: 48 (Binary: 110000)

        // Right Shift (>>) Operator
        int rightShifted = num2 >> 1;
        System.out.println("Right Shift (>>) Operator on num2: " + rightShifted); // Output: 12 (Binary: 1100)

        // Unsigned Right Shift (>>>) Operator
        int unsignedRightShifted = num2 >>> 1;
        System.out.println("Unsigned Right Shift (>>>) Operator on num2: " + unsignedRightShifted); // Output: 12

    }
}
