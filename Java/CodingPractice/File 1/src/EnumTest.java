// Create an enum in Java.
// In Java, an enum (short for "enumeration") is a special data type that enables for a variable to be a set of predefined constants. The enum constants are implicitly static and final, and they are typically used to represent a collection of related constants such as days of the week, seasons, directions, etc.
public class EnumTest {

    public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }
    public static void main(String[] args) {
        Day today = Day.MONDAY;

        System.out.println("Today is " + today);

        // Enum in switch statement
        switch (today) {
            case MONDAY:
                System.out.println("Mondays are tough.");
                break;
            case FRIDAY:
                System.out.println("Fridays are better.");
                break;
            case SATURDAY: case SUNDAY:
                System.out.println("Weekends are the best.");
                break;
            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }
}
