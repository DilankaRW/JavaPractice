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

package PracticeFile4;

import java.util.Arrays;

public class P8 {
    public static void main(String[] args) {
        String S1 = "jam";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "jam";
        S2 = S2.replaceAll("a","*");
        System.out.println(S2);

        String S3 = "  jam   ";
        S3 = S3.trim();
        System.out.println(S3);

        String S4 = "    jam";
        S4 = S4.replaceAll("^\\s+$","");
        System.out.println(S4);

        String S5 = "jam       ";
        S5 = S5.replaceAll("\\s+$", "");
        System.out.println(S5);

        String[] S6 = {"j","a","m"};
        Arrays.sort(S6);
        System.out.println(Arrays.toString(S6));

        int[] S7 = {23,45,21};
        Arrays.sort(S7);
        System.out.println(Arrays.toString(S7));
    }
}
