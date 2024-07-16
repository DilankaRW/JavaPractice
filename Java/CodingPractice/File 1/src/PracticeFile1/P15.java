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

public class P15 {
    public static void main(String[] args) {
        String S1 = "pick";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "pick";
        S2 = S2.replaceAll("c","");
        System.out.println(S2);

        String S3 = "   pick   ";
        S3 = S3.trim();
        System.out.println(S3);

        String S4 = "   pick";
        S4 = S4.replaceAll("^\\s+","");
        System.out.println(S4);

        String S5 = "pick   ";
        S5 = S5.replaceAll("\\s+$","");
        System.out.println(S5);

        String[] S6 = {"p","i","c","k"};
        Arrays.sort(S6);
        System.out.println(Arrays.toString(S6));

        int[] S7 = {8,7,5,9,3,4,1,2};
        Arrays.sort(S7);
        System.out.println(Arrays.toString(S7));

        Integer[] S8 = {5,6,8};
        Integer sum = 0;
        for (Integer i : S8) sum += i;
        System.out.println(sum);

        Integer[] S9 = {5,7,9};
        Arrays.sort(S9, Collections.reverseOrder());
        System.out.println(Arrays.toString(S9));
    }
}
