// remove leading and trailing spaces from a string
public class RemoveLeadingTrailingSpaces {
    public static void main(String[] args) {
        String str = "  Hello World!  ";
        String trimmedStr = str.trim();
        System.out.println("Original String: '"+ str +"'");
        System.out.println("Trimmed String: '"+ trimmedStr +"'");

        //Original String: '  Hello World!  '
        //Trimmed String: 'Hello World!'
    }
}
