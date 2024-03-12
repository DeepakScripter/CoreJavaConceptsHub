import java.util.PriorityQueue;
import java.util.Comparator;

// Define a Student class with name and grade attributes
class Student {
    String name;
    int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }
}

public class StudentPriorityQueue {

    public static void main(String[] args) {
        // Create a PriorityQueue with a custom Comparator to compare students based on
        // their grades
        PriorityQueue<Student> studentPriorityQueue = new PriorityQueue<>(Comparator.comparingInt(s -> s.grade));

        // Adding students to the PriorityQueue
        studentPriorityQueue.add(new Student("Alice", 85));
        studentPriorityQueue.add(new Student("Bob", 92));
        studentPriorityQueue.add(new Student("Charlie", 78));

        // Printing students based on grade (from lowest to highest)
        while (!studentPriorityQueue.isEmpty()) {
            // Retrieve and remove the student with the lowest grade from the PriorityQueue
            Student student = studentPriorityQueue.poll();
            // Print the student's name and grade
            System.out.println("Name: " + student.name + ", Grade: " + student.grade);
        }
    }
}
