import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        // Get the maximum value of long and print it
        System.out.println("The maximum value of long is: " + Long.MAX_VALUE);

        // Get the current time in milliseconds and print it
        System.out.println("The value of current time in ms: " + System.currentTimeMillis());

        // Create a new Date object representing the current date and time
        Date currentDate = new Date();
        System.out.println("The current date is: " + currentDate);

        // Create a Date object using a specific timestamp (in milliseconds) and print
        // it
        Date customDate = new Date(1621709639111L);
        System.out.println("The date calculated from milliseconds is: " + customDate);

        // Create two Date objects with different dates and compare them
        Date date1 = new Date(2021, 5, 23); // Deprecated constructor, consider using Calendar or LocalDate
        System.out.println("The result of date comparison: " + date1.compareTo(currentDate));

        // Get the number of milliseconds passed since Jan 1, 1970, and print it
        System.out.println("The number of milliseconds passed since Jan 1, 1970: " + currentDate.getTime());

        // Get specific components of the current date and print them
        System.out.println("The current date is: " + currentDate.getDate());
        System.out.println("The current year is: " + (currentDate.getYear() + 1900)); // Adding 1900 to get the correct
                                                                                      // year
    }
}
