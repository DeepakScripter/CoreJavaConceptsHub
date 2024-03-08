import java.util.*;

public class GregorianCalenda {

    public static void main(String[] args) {
        // Example 1: Checking if a year is a leap year
        checkLeapYear();

        // Example 2: Rolling operations on dates
        performRolling();

        // Example 3: Getting hashcode for the calendar
        getHashCode();

        // Additional Example: Working with TimeZone
        displayTimeZones();
    }

    // Example 1: Checking if a year is a leap year
    private static void checkLeapYear() {
        GregorianCalendar cal = new GregorianCalendar();
        System.out.println("Is 2000 a leap year? " + cal.isLeapYear(2000));
        System.out.println("Is 2021 a leap year? " + cal.isLeapYear(2021));
        System.out.println();
    }

    // Example 2: Rolling operations on dates
    private static void performRolling() {
        GregorianCalendar c = new GregorianCalendar();
        System.out.println("Date before rolling: " + c.getTime());

        c.roll(Calendar.MONTH, true);
        c.roll(Calendar.DATE, false);
        c.roll(Calendar.YEAR, true);

        System.out.println("Date after rolling: " + c.getTime());
        System.out.println();
    }

    // Example 3: Getting hashcode for the calendar
    private static void getHashCode() {
        GregorianCalendar c = new GregorianCalendar();
        System.out.println("Calendar: " + c.getTime());
        System.out.println("The hashcode for this calendar is: " + c.hashCode());
        System.out.println();
    }

    // Additional Example: Working with TimeZone
    private static void displayTimeZones() {
        System.out.println("Available Time Zones:");
        for (String timeZone : TimeZone.getAvailableIDs()) {
            System.out.println(timeZone);
        }
    }
}
