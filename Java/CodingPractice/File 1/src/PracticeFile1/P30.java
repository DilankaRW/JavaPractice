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

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class P30 {
    public static void main(String[] args) {
        String S1 = "Aa!1";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "Aa!1";
        S2 = S2.replaceAll("!","@");
        System.out.println(S2);

        String S3 = "   Aa!1   ";
        S3 = S3.trim();
        System.out.println(S3);

        String S4 = "    Aa!1";
        S4 = S4.replaceAll("^\\s+","");
        System.out.println(S4);

        String S5 = "Aa!1       ";
        S5 = S5.replaceAll("\\s+$","");
        System.out.println(S5);

        String[] S6 = {"A","a","!","1"};
        Arrays.sort(S6);
        System.out.println(Arrays.toString(S6));

        Integer[] S7 = {9,8,6,4,2,68,};
        Arrays.sort(S7);
        System.out.println(Arrays.toString(S7));

        int[] S8 = {45,34,23};
        int sum = 0;
        for (int i : S8) sum += i;
        System.out.println(sum);

        Integer[] S9 = {4,5,342,3};
        Arrays.sort(S9, Collections.reverseOrder());
        System.out.println(Arrays.toString(S9));
    }
}
