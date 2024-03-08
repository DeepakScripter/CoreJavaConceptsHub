import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        // Creating an ArrayList of integers
        ArrayList<Integer> list = new ArrayList<>();

        // Adding elements to the ArrayList
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(6);

        // Inserting 5 at the 5th index in the ArrayList
        list.add(5, 5);

        // Displaying the ArrayList
        System.out.println("ArrayList after inserting 5 at the 5th index: " + list);

        // Removing element at index 2
        list.remove(2);
        System.out.println("ArrayList after removing element at index 2: " + list);

        // Checking if the ArrayList contains certain elements
        System.out.println("ArrayList contains 7: " + list.contains(7));
        System.out.println("ArrayList contains 4: " + list.contains(4));

        // Creating another ArrayList
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(11);
        list2.add(12);
        list2.add(13);
        list2.add(14);

        // Merging two ArrayLists
        list.addAll(list2);
        System.out.println("ArrayList after merging with another ArrayList: " + list);

        // Finding the first occurrence of 3 in the ArrayList
        System.out.println("The first occurrence of 3 in the ArrayList is at index: " + list.indexOf(3));

        // Finding the last occurrence of 3 in the ArrayList
        System.out.println("The last occurrence of 3 in the ArrayList is at index: " + list.lastIndexOf(3));
    }
}
