import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

public class SortEmployeesBySalaryStream {
    public static void main(String[] args) {
        // Create a list of employees with name and salary fields
        List<Employee> employees = List.of(
                new Employee("Alice", 50000),
                new Employee("Bob", 60000),
                new Employee("Charlie", 45000),
                new Employee("David", 70000));

        // Write a comparator that sorts the employees by salary
        Comparator<Employee> salaryComparator = Comparator.comparingDouble(Employee::getSalary);

        // Use the comparator to sort the list using the sort stream operation
        List<Employee> sortedEmployees = employees.stream()
                .sorted(salaryComparator)
                .collect(Collectors.toList());

        // Print the sorted list
        sortedEmployees.forEach(
                employee -> System.out.println("Name: " + employee.getName() + ", Salary: " + employee.getSalary()));
    }
}
