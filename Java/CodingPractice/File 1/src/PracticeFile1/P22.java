// String Reverse
// Remove Character
// Remove leading and trailing spaces from a string.
// Remove leading spaces from a string
// Remove trailing spaces from a string
// Sort Array

package PracticeFile1;

import java.util.Arrays;

public class P22 {
    public static void main(String[] args) {
        String S1 = "pool";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "pool";
        S2 = S2.replaceAll("o","");
        System.out.println(S2);

        String S3 = "             pool   ";
        S3 = S3.trim();
        System.out.println(S3);

        String S4 = "       pool";
        S4 = S4.replaceAll("^\\s+","");
        System.out.println(S4);

        String S5 = "pool     ";
        S5 = S5.replaceAll("\\s+$","");
        System.out.println(S5);

        String[] S6 = {"p","o","o","l"};
        Arrays.sort(S6);
        System.out.println(Arrays.toString(S6));

        int[] S7 = {8,5,3,9,2};
        Arrays.sort(S7);
        System.out.println(Arrays.toString(S7));
    }
}
