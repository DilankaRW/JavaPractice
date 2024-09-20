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

import java.util.Arrays;

public class P26 {
    public static void main(String[] args) {
        String S1 = "next";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "next";
        S2 = S2.replaceAll("x","");
        System.out.println(S2);

        String S3 = "     next   ";
        S3 = S3.trim();
        System.out.println(S3);

        String S4 = "    next";
        S4 = S4.replaceAll("^\\s+","");
        System.out.println(S4);

        String S5 = "next   ";
        S5 = S5.replaceAll("\\s+$","");
        System.out.println(S5);

        String[] S6 = {"n","e","x","t"};
        Arrays.sort(S6);
        System.out.println(Arrays.toString(S6));

        Integer[] S7 = {34,67,21,78,356,43,23,12};
        Arrays.sort(S7);
        System.out.println(Arrays.toString(S7));
    }
}
