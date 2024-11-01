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
    }
}
