// String Reverse
// Remove Character
// Remove leading and trailing spaces from a string.
// Remove leading spaces from a string
// Remove trailing spaces from a string
// Sort Array
// Sum Array
// Descending order Array
// Shuffle an array

package PracticeFile1;

public class P5 {
    public static void main(String[] args) {
        String S1 = "glo";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "glo";
        S2 = S2.replaceAll("l","");
        System.out.println(S2);

        String S3 = "    glo   ";
        S3 = S3.trim();
        System.out.println(S3);
    }
}
