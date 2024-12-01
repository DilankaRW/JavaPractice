// String Reverse
// Remove Character
// Remove leading and trailing spaces from a string.
// Remove leading spaces from a string
// Remove trailing spaces from a string
// Sort Array
// Sum Array
// Descending order Array

package PracticeFile2;

import java.util.Arrays;
import java.util.Collections;

public class P31 {
    public static void main(String[] args) {
        String S1 = "saro";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "saro";
        S2 = S2.replaceAll("s","");
        System.out.println(S2);

        String S3 = "    saro    ";
        S3 = S3.trim();
        System.out.println(S3);

        String S4 = "   saro";
        S4 = S4.replaceAll("^\\s+","");
        System.out.println(S4);

        String S5 = "saro    ";
        S5 = S5.replaceAll("\\s+$","");
        System.out.println(S5);

        String[] S6 = {"s","a","r","o"};
        Arrays.sort(S6);
        System.out.println(Arrays.toString(S6));

        Integer[] S7 = {23,56,22,6,5,12,54};
        Arrays.sort(S7);
        System.out.println(Arrays.toString(S7));

        int[] S8 = {34,6,4,23};
        int sum = 0;
        for (int i : S8) sum += i;
        System.out.println(sum);

        Integer[] S9 = {34,56,31,45,12,53};
        Arrays.sort(S9, Collections.reverseOrder());
        System.out.println(Arrays.toString(S9));
    }
}
