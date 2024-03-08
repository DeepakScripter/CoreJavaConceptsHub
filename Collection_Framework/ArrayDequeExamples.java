import java.util.ArrayDeque;

public class ArrayDequeExamples {

    public static void main(String[] args) {

        // Example 1: Adding elements to an ArrayDeque at the beginning
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(6);
        ad1.add(56);
        ad1.add(9);
        ad1.addFirst(5);
        ad1.offerFirst(10);
        System.out.println("ArrayDeque after adding elements at the beginning: " + ad1);

        // Example 2: Adding elements to an ArrayDeque at the end
        ArrayDeque<Integer> ad2 = new ArrayDeque<>();
        ad2.add(6);
        ad2.add(56);
        ad2.add(9);
        ad2.addLast(5);
        ad2.offerLast(10);
        System.out.println("ArrayDeque after adding elements at the end: " + ad2);

        // Example 3: Getting the first element in an ArrayDeque
        ArrayDeque<Integer> ad3 = new ArrayDeque<>();
        ad3.add(6);
        ad3.add(56);
        ad3.add(9);
        ad3.add(10);
        ad3.add(91);
        ad3.add(19);
        System.out.println("First element in ArrayDeque: " + ad3.getFirst());
        System.out.println("Peek first element in ArrayDeque: " + ad3.peekFirst());

        // Example 4: Getting the last element in an ArrayDeque
        ArrayDeque<Integer> ad4 = new ArrayDeque<>();
        ad4.add(6);
        ad4.add(56);
        ad4.add(9);
        ad4.add(10);
        ad4.add(91);
        ad4.add(19);
        System.out.println("Last element in ArrayDeque: " + ad4.getLast());
        System.out.println("Peek last element in ArrayDeque: " + ad4.peekLast());

        // Example 5: Removing elements from the beginning of an ArrayDeque
        ArrayDeque<Integer> ad5 = new ArrayDeque<>();
        ad5.add(6);
        ad5.add(56);
        ad5.add(9);
        ad5.add(10);
        ad5.add(91);
        ad5.add(19);
        ad5.pollFirst(); // deletes 6
        ad5.removeFirst(); // deletes 56
        System.out.println("ArrayDeque after removing elements from the beginning: " + ad5);

        // Example 6: Removing elements from the end of an ArrayDeque
        ArrayDeque<Integer> ad6 = new ArrayDeque<>();
        ad6.add(6);
        ad6.add(56);
        ad6.add(9);
        ad6.add(10);
        ad6.add(91);
        ad6.add(19);
        ad6.pollLast(); // deletes 19
        ad6.removeLast(); // deletes 91
        System.out.println("ArrayDeque after removing elements from the end: " + ad6);
    }
}
