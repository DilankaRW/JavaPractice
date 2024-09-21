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

package PracticeFile2;

public class P27 {
    public static void main(String[] args) {
        String S1 = "real";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "real";
        S2 = S2.replaceAll("a","");
        System.out.println(S2);

        String S3 = "    real    ";
        S3 = S3.trim();
        System.out.println(S3);
    }
}
