// String Reverse
// Remove Character
// Remove leading and trailing spaces from a string.
// Remove leading spaces from a string
// Remove trailing spaces from a string
// Sort Array
// Descending order Array
// Shuffle an array

package PracticeFile1;

public class P17 {
    public static void main(String[] args) {
        String S1 = "era";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "era";
        S2 = S2.replaceAll("e","");
        System.out.println(S2);

        String S3 = "   era    ";
        S3 = S3.trim();
        System.out.println(S3);
    }
}
