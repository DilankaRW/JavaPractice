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
    }
}
