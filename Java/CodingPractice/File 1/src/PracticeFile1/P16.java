// String Reverse
// Remove Character
// Remove leading and trailing spaces from a string.
// Remove leading spaces from a string
// Remove trailing spaces from a string
// Sort Array
// Sum Array
// Descending order Array

package PracticeFile1;
public class P16 {
    public static void main(String[] args) {
        String S1 = "jio";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "jio";
        S2 = S2.replaceAll("i","");
        System.out.println(S2);

        String S3 = "      jio   ";
        S3 = S3.trim();
        System.out.println(S3);

        String S4 = "     jio";
        S4 = S4.replaceAll("^\\s+","");
        System.out.println(S4);
    }
}
