import java.util.HashSet;

public class HashSetExamples {

    public static void main(String[] args) {

        // Example 1: Creating a HashSet and adding elements
        HashSet<Integer> myHashSet = new HashSet<>(6, 0.5f);
        myHashSet.add(6);
        myHashSet.add(8);
        myHashSet.add(3);
        myHashSet.add(11);
        myHashSet.add(11); // This element will be ignored
        System.out.println("myHashSet: " + myHashSet);

        // Example 2: Removing an element from the HashSet
        System.out.println("myHashSet before removing any element : " + myHashSet);
        myHashSet.remove(3); // Deletes 3 from the HashSet
        System.out.println("myHashSet after removing an element : " + myHashSet);

        // Example 3: Checking if the HashSet is empty
        HashSet<Integer> myHashSet1 = new HashSet<>();
        System.out.println("Is myHashSet empty? " + myHashSet.isEmpty());
        System.out.println("Is myHashSet1 empty? " + myHashSet1.isEmpty());

        // Example 4: Clearing all elements from the HashSet
        System.out.println("myHashSet before clearing : " + myHashSet);
        myHashSet.clear(); // Deletes all elements from the HashSet
        System.out.println("myHashSet after clearing : " + myHashSet);

        // Example 5: Getting the size of the HashSet
        HashSet<Integer> myHashSet2 = new HashSet<>(6, 0.5f);
        myHashSet2.add(16);
        myHashSet2.add(33);
        myHashSet2.add(78);
        myHashSet2.add(19);
        myHashSet2.add(29);
        myHashSet2.add(10);
        System.out.println("The size of myHashSet2 is : " + myHashSet2.size());
    }
}
