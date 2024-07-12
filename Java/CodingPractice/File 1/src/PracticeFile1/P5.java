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

public class P5 {
    public static void main(String[] args) {
        String S1 = "Practice";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "Practice";
        S2 = S2.replaceAll("c","");
        System.out.println(S2);

        String S3 = "           Practice         ";
        S3 = S3.trim();
        System.out.println(S3);

        String S4 = "            Practice";
        S4 = S4.replaceAll("^\\s+","");
        System.out.println(S4);

        String S5 = "Practice        ";
        S5 = S5.replaceAll("\\s+$","");
        System.out.println(S5);

        String[] S6 = {"P","r","a","c","t","i","c","e"};
        Arrays.sort(S6);
        System.out.println(Arrays.toString(S6));

        int[] S7 = {34,67,80,52,23,46,78};
        Arrays.sort(S7);
        System.out.println(Arrays.toString(S7));

        int[] S8 = {34,67,78,23,33,18,9};
        int sum = 0;
        for (int i : S8) sum += i;
        System.out.println(sum);

        Integer[] S9 = {9,7,3,4,42,23};
        Arrays.sort(S9, Collections.reverseOrder());
        System.out.println(Arrays.toString(S9));
    }
}
