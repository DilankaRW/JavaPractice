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

public class P16 {
    public static void main(String[] args) {
        String S1 = "jio";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "jio";
        S2 = S2.replaceAll("i","");
        System.out.println(S2);

        String S3 = "      jio   ";
        S3 = S3.trim();
        System.out.println(S3);

        String S4 = "     jio";
        S4 = S4.replaceAll("^\\s+","");
        System.out.println(S4);

        String S5 = "jio    ";
        S5 = S5.replaceAll("\\s+$","");
        System.out.println(S5);

        String[] S6 = {"j","i","o"};
        Arrays.sort(S6);
        System.out.println(Arrays.toString(S6));

        Integer[] S7 = {9,7,6,3,1};
        Arrays.sort(S7);
        System.out.println(Arrays.toString(S7));

        int[] S8 = {5,7,9};
        int sum = 0;
        for (int i : S8) sum += i;
        System.out.println(sum);

        Integer[] S9 = {56,8,89,23};
        Arrays.sort(S9, Collections.reverseOrder());
        System.out.println(Arrays.toString(S9));
    }
}
