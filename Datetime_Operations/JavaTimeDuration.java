import java.time.*;
import java.util.Calendar;

public class JavaTimeDuration {
    public static void main(String[] args) {
        // Clock Example
        Clock cl = Clock.systemDefaultZone();
        System.out.println("Clock type: " + cl.getZone());

        // Clock with UTC Example
        Clock clUTC = Clock.systemUTC();
        System.out.println("UTC Instant: " + clUTC.instant());

        // Duration Examples
        Duration d1 = Duration.between(LocalTime.MIN, LocalTime.NOON);
        System.out.println("Is d1 negative? " + d1.isNegative());

        Duration d2 = Duration.between(LocalTime.MAX, LocalTime.MIN);
        System.out.println("Is d2 negative? " + d2.isNegative());

        Duration d3 = Duration.between(LocalTime.MIN, LocalTime.MIDNIGHT);
        System.out.println("Is d3 zero? " + d3.isZero());

        Duration d4 = Duration.between(LocalTime.MAX, LocalTime.MIN);
        System.out.println("Is d4 zero? " + d4.isZero());

        // LocalDate Examples
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current date: " + currentDate);

        LocalDate date1 = LocalDate.parse("2021-05-27");
        LocalDate date2 = LocalDate.parse("2021-05-26");

        System.out.println("Are date1 and currentDate equal? " + date1.equals(currentDate));
        System.out.println("Are date2 and date1 equal? " + date2.equals(date1));

        System.out.println("Modified date1 with year 2001: " + date1.withYear(2001));

        // LocalTime Examples
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current time: " + currentTime);

        LocalTime time1 = LocalTime.of(13, 18, 29);
        System.out.println("Time before: " + time1);

        LocalTime timeAfterAddingHours = time1.plusHours(5);
        System.out.println("Time after adding 5 hours: " + timeAfterAddingHours);

        LocalTime timeAfterSubtractingMinutes = time1.minusMinutes(8);
        System.out.println("Time after subtracting 8 minutes: " + timeAfterSubtractingMinutes);

        // LocalDateTime Example
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current date and time: " + currentDateTime);

        // GregorianCalendar Example
        Calendar cal = Calendar.getInstance();
        System.out.println("Calendar type: " + cal.getTime());

        // Year Example
        Year year = Year.now();
        System.out.println("Current year: " + year);
    }

    @Override
    public String toString() {
        return "JavaTimeDuration []";
    }
}
