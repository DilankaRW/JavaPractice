// Remove leading and trailing spaces from a string.
public class RemoveLeadingTrailingSpaces {
    public static void main(String[] args) {
        String str = "  Hello World!  ";
        String trimmedStr = str.trim();
        System.out.println("Trimmed String: '"+ trimmedStr +"'");
        // Trimmed String: 'Hello World!'

        // Remove leading spaces from a string
        String trimmedStr1 = str.replaceAll("^\\s+", "");
        System.out.println("String without leading spaces: '" + trimmedStr1 + "'");

        // Remove trailing spaces from a string
        String trimmedStr2 = str.replaceAll("\\s+$", "");
        System.out.println("String without trailing spaces: '" + trimmedStr2 + "'");
    }
}