import date.DayType; // Importing the DayType enum from the date package
public enum EnhancedDay {
    SUNDAY(DayType.WEEKEND),
    MONDAY(DayType.WEEKDAY),
    TUESDAY(DayType.WEEKDAY),
    WEDNESDAY(DayType.WEEKDAY),
    THURSDAY(DayType.WEEKDAY),
    FRIDAY(DayType.WEEKDAY),
    SATURDAY(DayType.WEEKEND);

    private final DayType type;

    EnhancedDay(DayType type) {
        this.type = type;
    }

    public DayType getType() {
        return type;
    }

    public static void main(String[] args) {
        // Loop through all EnhancedDay values
        for (EnhancedDay day : EnhancedDay.values()) {
            // Print the day and its type
            System.out.println(day + " is a " + day.getType());
        }
    }
}
