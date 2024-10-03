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

public class P16 {
    public static void main(String[] args) {

        String S1 = "jack";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "jack";
        S2 = S2.replaceAll("a","*");
        System.out.println(S2);

        String S3 = "   jack   ";
        S3 = S3.trim();
        System.out.println(S3);

        String S4 = "    jack";
        S4 = S4.replaceAll("^\\s+","");
        System.out.println(S4);

        String S5 = "jack     ";
        S5 = S5.replaceAll("\\s+$","");
        System.out.println(S5);

        String[] S6 = {"j","a","c","k"};
        Arrays.sort(S6);
        System.out.println(Arrays.toString(S6));

        Integer[] S7 = {23,45,78,12,46,21};
        Arrays.sort(S7);
        System.out.println(Arrays.toString(S7));

        int[] S8 = {23,45,87};
        int sum = 0;
        for (int i : S8) sum += i;
        System.out.println(sum);
    }
}
