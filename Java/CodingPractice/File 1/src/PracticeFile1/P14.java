// String Reverse
// Remove Character
// Remove leading and trailing spaces from a string.
// Remove leading spaces from a string
// Remove trailing spaces from a string
// Sort Array
// Sum Array
// Descending order Array

package PracticeFile1;

public class P14 {
    public static void main(String[] args) {
        String S1 = "slap";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "slap";
        S2 = S2.replaceAll("a","");
        System.out.println(S2);

        String S3 = "   slap    ";
        S3 = S3.trim();
        System.out.println(S3);

        String S4 = "   slap";
        S4 = S4.replaceAll("^\\s+","");
        System.out.println(S4);
    }
}
