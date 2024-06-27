// String Reverse
// Remove Character
// Remove leading and trailing spaces from a string.
// Remove leading spaces from a string
// Remove trailing spaces from a string
// Sort Array
// Sum Array

package PracticeFile1;

import java.util.Arrays;

public class P23 {
    public static void main(String[] args) {
        String S1 = "Engineer";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "Engineer";
        S2 = S2.replaceAll("e","");
        System.out.println(S2);

        String S3 = "     Engineer    ";
        S3 = S3.trim();
        System.out.println(S3);

        String S4 = "      Engineer";
        S4 = S4.replaceAll("^\\s+","");
        System.out.println(S4);

        String S5 = "Engineer      ";
        S5 = S5.replaceAll("\\s+$","");
        System.out.println(S5);

        String[] S6 = {"E","n","g","i","n","e","e","r"};
        Arrays.sort(S6);
        System.out.println(Arrays.toString(S6));

        Double[] S7 = {34.4,23.32,454.54,45.4};
        Arrays.sort(S7);
        System.out.println(Arrays.toString(S7));

        int[] S8 = {56,23,8};
        int sum = 0;
        for (int i : S8) sum += i;
        System.out.println(sum);
    }
}
