import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExamples {
    public static void main(String[] args) {
        // Example 1
        LocalDateTime dt1 = LocalDateTime.now();
        System.out.println("The current date is: " + dt1);

        DateTimeFormatter df1 = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String formattedDate1 = dt1.format(df1);
        System.out.println("Date after formatting: " + formattedDate1);

        // Example 2
        LocalDateTime dt2 = LocalDateTime.now();
        DateTimeFormatter df2 = DateTimeFormatter.ISO_WEEK_DATE;
        String formattedDate2 = dt2.format(df2);
        System.out.println("Date in ISO_WEEK_DATE Format: " + formattedDate2);

        // Example 3
        LocalDateTime dt3 = LocalDateTime.now();
        DateTimeFormatter df3 = DateTimeFormatter.ISO_ORDINAL_DATE;
        String formattedDate3 = dt3.format(df3);
        System.out.println("Date in ISO_ORDINAL_DATE Format: " + formattedDate3);
    }
}

