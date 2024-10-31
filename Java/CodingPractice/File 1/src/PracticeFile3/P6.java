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

package PracticeFile3;

import java.util.Arrays;

public class P6 {
    public static void main(String[] args) {
        String S1 = "viru";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "viru";
        S2 = S2.replaceAll("i","*");
        System.out.println(S2);

        String S3 = "   viru    ";
        S3 = S3.trim();
        System.out.println(S3);

        String S4 = "    viru";
        S4 = S4.replaceAll("^\\s+","");
        System.out.println(S4);

        String S5 = "viru   ";
        S5 = S5.replaceAll("\\s+$","");
        System.out.println(S5);

        String[] S6 = {"v","i","r","u"};
        Arrays.sort(S6);
        System.out.println(Arrays.toString(S6));

        int[] S7 = {45,765,43,456,41};
        Arrays.sort(S7);
        System.out.println(Arrays.toString(S7));

        int[] S8 = {34,65,23};
        int sum = 0;
        for (int i : S8) sum += i;
        System.out.println(sum);
    }
}
