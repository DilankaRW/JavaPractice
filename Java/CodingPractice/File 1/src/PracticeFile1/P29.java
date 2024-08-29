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
import java.util.Collections;

public class P29 {
    public static void main(String[] args) {
        String S1 = "vbn";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "vbn";
        S2 = S2.replaceAll("v","");
        System.out.println(S2);

        String S3 = "   vbn    ";
        S3 = S3.trim();
        System.out.println(S3);

        String S4 = "   vbn";
        S4 = S4.replaceAll("^\\s+","");
        System.out.println(S4);

        String S5 = "vbn   ";
        S5 = S5.replaceAll("\\s+$","");
        System.out.println(S5);

        String[] S6 = {"v","b","n"};
        Arrays.sort(S6);
        System.out.println(Arrays.toString(S6));

        Integer[] S7 = {67,45,32};
        Arrays.sort(S7);
        System.out.println(Arrays.toString(S7));

        int[] S8 = {6,4,2};
        int sum = 0;
        for (int i : S8) sum += i;
        System.out.println(sum);

        Integer[] S9 = {24,457,89};
        Arrays.sort(S9, Collections.reverseOrder());
        System.out.println(Arrays.toString(S9));
    }
}
