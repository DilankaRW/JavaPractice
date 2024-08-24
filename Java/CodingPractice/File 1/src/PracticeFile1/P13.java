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

package PracticeFile1;

public class P13 {
    public static void main(String[] args) {
        String S1 = "sad";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "sad";
        S2 = S2.replaceAll("a","");
        System.out.println(S2);

        String S3 = "   sad   ";
        S3 = S3.trim();
        System.out.println(S3);

        String S4 = "    sad";
        S4 = S4.replaceAll("^\\s+","");
        System.out.println(S4);

        String S5 = "sad    ";
        S5 = S5.replaceAll("\\s+$","");
        System.out.println(S5);
    }
}
