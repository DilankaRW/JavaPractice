// String Reverse
// Remove Character
// Remove leading and trailing spaces from a string.
// Remove leading spaces from a string
// Remove trailing spaces from a string
// Sort Array
// Sum Array
// Descending order Array
// Shuffle an array
// Create a pyramid of characters.

package PracticeFile3;

public class P7 {
    public static void main(String[] args) {
        String S1 = "block";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "block";
        S2 = S2.replaceAll("o","");
        System.out.println(S2);

        String S3 = "     block     ";
        S3 = S3.trim();
        System.out.println(S3);

        String S4 = "   block";
        S4 = S4.replaceAll("^\\s+","");
        System.out.println(S4);
    }
}