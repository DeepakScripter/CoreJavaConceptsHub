import java.util.LinkedList;

public class LinkedListExamples {

    public static void main(String[] args) {

        // Example 1: Adding elements to a LinkedList
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(11);
        l1.add(22);
        l1.add(33);
        l1.add(44);
        l1.add(55);
        l1.add(77);
        l1.add(5, 77); // Inserts 77 at index 5
        System.out.println("L1 Linked list: " + l1);

        // Example 2: Removing an element from a specific index
        System.out.println("L1 Linked list before removing element at index 2: " + l1);
        l1.remove(2); // Removes element present at 2nd index
        System.out.println("L1 Linked list after removing element at index 2: " + l1);

        // Example 3: Changing an element at a specific index
        System.out.println("L1 Linked list before changing element at index 2: " + l1);
        l1.set(2, 10); // Changes element present at 2nd index (33 changed to 10)
        System.out.println("L1 Linked list after changing element at index 2: " + l1);

        // Example 4: Adding an element to the end of the LinkedList
        System.out.println("L1 Linked list before adding element at last index: " + l1);
        l1.addLast(100); // Inserting 100 at the end of L1
        System.out.println("L1 Linked list after inserting element at last index: " + l1);

        // Example 5: Adding an element to the beginning of the LinkedList
        System.out.println("L1 Linked list before adding element at the beginning: " + l1);
        l1.addFirst(0); // Inserting 0 at the beginning of L1
        System.out.println("L1 Linked list after inserting element at the beginning: " + l1);

        // Example 6: Other LinkedList operations (contains, indexOf, lastIndexOf, set,
        // get)
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(15);
        l2.add(18);
        l2.add(19);

        l1.addAll(0, l2);
        l1.addLast(676);
        l1.addFirst(788);
        System.out.println("L1 Linked list: " + l1);
        System.out.println("L1 contains 27: " + l1.contains(27));
        System.out.println("Index of 6 in L1: " + l1.indexOf(6));
        System.out.println("Last index of 6 in L1: " + l1.lastIndexOf(6));
        l1.set(1, 566);
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i) + ", ");
        }
    }
}
