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
import java.util.Scanner;

public class P14 {
    public static void main(String[] args) {
        String S1 = "develop";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "develop";
        S2 = S2.replaceAll("o","*");
        System.out.println(S2);

        String S3 = "     develop    ";
        S3 = S3.trim();
        System.out.println(S3);

        String S4 = "   develop";
        S4 = S4.replaceAll("^\\s+","");
        System.out.println(S4);

        String S5 = "develop     ";
        S5 = S5.replaceAll("\\s+$","");
        System.out.println(S5);

        String[] S6 = {"d","e","v","e","l","o","p"};
        Arrays.sort(S6);
        System.out.println(Arrays.toString(S6));

        int[] S7 = {34,45,76,24,12,65};
        Arrays.sort(S7);
        System.out.println(Arrays.toString(S7));
    }
}
