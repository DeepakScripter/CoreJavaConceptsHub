import java.util.Calendar;

public class Calendaroperation {
    public static void main(String[] args) {
        // Get the calendar instance
        Calendar calendar = Calendar.getInstance();

        // Example 1: Get the type of the calendar
        System.out.println("Calendar type: " + calendar.getCalendarType());

        // Example 2: Get various components of the current date and time
        System.out.println("Current year is: " + calendar.get(Calendar.YEAR));
        System.out.println("Current month is: " + (calendar.get(Calendar.MONTH) + 1)); // Adding 1 to match
                                                                                       // human-readable month numbering
        System.out.println("Current day of the week is: " + calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("Current hour of the day is: " + calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("Current minute is: " + calendar.get(Calendar.MINUTE));
        System.out.println("Current second is: " + calendar.get(Calendar.SECOND));

        // Example 3: Add or subtract units of time
        System.out.println("Current date is: " + calendar.getTime());
        calendar.add(Calendar.YEAR, 4); // Add 4 years
        System.out.println("After 4 years: " + calendar.getTime());
        calendar.add(Calendar.YEAR, -12); // Subtract 12 years
        System.out.println("Before 12 years: " + calendar.getTime());
        calendar.add(Calendar.MONTH, 2); // Add 2 months
        System.out.println("After 2 months: " + calendar.getTime());

        // Example 4: Get the number of weeks in the current year
        System.out.println("Number of weeks in the current year: " + calendar.getWeeksInWeekYear());

        // Example 5: Get the maximum number of weeks in a year
        System.out.println("Maximum number of weeks in a year: " + calendar.getMaximum(Calendar.WEEK_OF_YEAR));
    }
}
