// Example of switch expressions and multi-label case statements.
public class SwitchCase {
    public static void main(String[] args) {
        // Example of switch expression
        String dayOfWeek = "MONDAY";
        int dayNumber = switch (dayOfWeek) {
            case "MONDAY" -> 1;
            case "TUESDAY" -> 2;
            case "WEDNESDAY" -> 3;
            case "THURSDAY" -> 4;
            case "FRIDAY" -> 5;
            case "SATURDAY" -> 6;
            case "SUNDAY" -> 7;
            default -> throw new IllegalArgumentException("Invalid day: " + dayOfWeek);
        };

        System.out.println("Day number: " + dayNumber);

        // Example of multi-label case statement
        String season = "JUNE";
        String seasonType = switch (season) {
            case "DECEMBER", "JANUARY", "FEBRUARY" -> "Winter";
            case "MARCH", "APRIL", "MAY" -> "Spring";
            case "JUNE", "JULY", "AUGUST" -> "Summer";
            case "SEPTEMBER", "OCTOBER", "NOVEMBER" -> "Fall";
            default -> throw new IllegalArgumentException("Invalid month: " + season);
        };

        System.out.println("Season type: " + seasonType);
    }
}

// Switch Expression:
// The switch expression returns a value. In the example, dayNumber is assigned the value returned by the switch expression.
// The arrow (->) syntax is used for case labels, making the code concise.
// The default case handles any input that doesn’t match the specified cases.

// Multi-Label Case Statement:
// Multiple labels (cases) can be combined in a single case statement using commas.
// This is particularly useful for grouping cases that should result in the same outcome.
// In the example, months are grouped into seasons, and the corresponding season is returned.
