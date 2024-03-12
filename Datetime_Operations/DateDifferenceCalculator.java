import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateDifferenceCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the first date
        Date firstDate = readDate("Enter the first date (yyyy-MM-dd): ", scanner);

        // Read the second date
        Date secondDate = readDate("Enter the second date (yyyy-MM-dd): ", scanner);

        // Calculate the difference in days
        int differenceInDays = calculateDifferenceInDays(firstDate, secondDate);

        System.out.println("The difference between the two dates is: " + differenceInDays + " days.");
    }

    // Function to read a date from the user with input validation
    private static Date readDate(String prompt, Scanner scanner) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print(prompt);
                String dateString = scanner.next();
                date = dateFormat.parse(dateString);
                validInput = true;
            } catch (ParseException e) {
                // Catch invalid date format exceptions
                System.out.println("Invalid date format. Please enter the date in the yyyy-MM-dd format.");
            }
        }

        return date;
    }

    // Function to calculate the difference in days between two dates
    public static int calculateDifferenceInDays(Date firstDate, Date secondDate) {
        // Calculate the absolute difference in milliseconds
        long differenceInMillis = Math.abs(secondDate.getTime() - firstDate.getTime());
        // Convert milliseconds to days
        return (int) (differenceInMillis / (1000 * 60 * 60 * 24));
    }
}
