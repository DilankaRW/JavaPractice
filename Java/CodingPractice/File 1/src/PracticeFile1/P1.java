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

public class P1 {
    public static void main(String[] args) {

        String S1 = "Hello";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "Hello";
        S2 = S2.replaceAll("l","");
        System.out.println(S2);

        String S3 = "         Hello     ";
        S3 = S3.trim();
        System.out.println(S3);

        String S4 = "           Hello";
        S4 = S4.replaceAll("^\\s+","");
        System.out.println(S4);

        String S5 = "Hello            ";
        S5 = S5.replaceAll("\\s+$","");
        System.out.println(S5);

        String[] S6 = {"H","e","l","l","o"};
        Arrays.sort(S6);
        System.out.println(Arrays.toString(S6));

        int[] S7 = {34,8,7,32,3,22,24};
        Arrays.sort(S7);
        System.out.println(Arrays.toString(S7));

        int[] S8 = {34,67,9,32};
        int sum = 0;
        for (int i : S8) sum += i;
        System.out.println(sum);

        Integer[] S9 = {567,78,45423,23,56,89};
        Arrays.sort(S9, Collections.reverseOrder());
        System.out.println(Arrays.toString(S9));
    }
}
