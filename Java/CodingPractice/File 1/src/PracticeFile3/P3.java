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

public class P3 {
    public static void main(String[] args) {
        String S1 = "trip";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "trip";
        S2 = S2.replaceAll("i","");
        System.out.println(S2);

        String S3 = "     trip     ";
        S3 = S3.trim();
        System.out.println(S3);

        String S4 = "    trip";
        S4 = S4.replaceAll("^\\s+","");
        System.out.println(S4);

        String S5 = "trip       ";
        S5 = S5.replaceAll("\\s+$","");
        System.out.println(S5);
    }
}
