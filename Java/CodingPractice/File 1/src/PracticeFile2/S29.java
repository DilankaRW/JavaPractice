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

public class S29 {
    public static void main(String[] args) {
        String S1 = "chat";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "chat";
        S2 = S2.replaceAll("a","");
        System.out.println(S2);
    }
}
