// String Reverse
// Remove Character
// Remove leading and trailing spaces from a string.
// Remove leading spaces from a string
// Remove trailing spaces from a string
// Sort Array

package PracticeFile1;

import java.util.Arrays;

public class P19 {
    public static void main(String[] args) {
        String S1 = "smooth";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "smooth";
        S2 = S2.replaceAll("o","");
        System.out.println(S2);

        String S3 = "  smooth   ";
        S3 = S3.trim();
        System.out.println(S3);

        String S4 = "     soomth";
        S4 = S4.replaceAll("^\\s+","");
        System.out.println(S4);

        String S5 = "smooth    ";
        S5 = S5.replaceAll("\\s+$","");
        System.out.println(S5);

        String[] S6 = {"s","g","s","v","l"};
        Arrays.sort(S6);
        System.out.println(Arrays.toString(S6));

        int[] S7 = {9,7,4,8,1,5};
        Arrays.sort(S7);
        System.out.println(Arrays.toString(S7));
    }
}
