// String Reverse
// Remove Character
// Remove leading and trailing spaces from a string.
// Remove leading spaces from a string
// Remove trailing spaces from a string
// Sort Array
// Sum Array
// Descending order Array

package PracticeFile1;

import java.util.Arrays;
import java.util.Collections;

public class P6 {
    public static void main(String[] args) {
        String S1 = "world";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "world";
        S2 = S2.replaceAll("r","");
        System.out.println(S2);

        String S3 = "      world          ";
        S3 = S3.trim();
        System.out.println(S3);

        String S4 = "          world";
        S4 = S4.replaceAll("^\\s+","");
        System.out.println(S4);

        String S5 = "world                ";
        S5 = S5.replaceAll("\\s+$","");
        System.out.println(S5);

        String[] S6 = {"w","o","r","l","d"};
        Arrays.sort(S6);
        System.out.println(Arrays.toString(S6));

        int[] S7 = {8,5,3,12,22,89,1};
        Arrays.sort(S7);
        System.out.println(Arrays.toString(S7));

        int[] S8 = {23,65,212};
        int sum = 0;
        for (int i : S8) sum += i;
        System.out.println(sum);

        Integer[] S9 = {1,2,4,5,7,9};
        Arrays.sort(S9, Collections.reverseOrder());
        System.out.println(Arrays.toString(S9));
    }
}
