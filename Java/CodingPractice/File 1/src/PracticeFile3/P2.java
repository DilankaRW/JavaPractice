// String Reverse
// Remove Character
// Remove leading and trailing spaces from a string.
// Remove leading spaces from a string
// Remove trailing spaces from a string
// Sort Array

package PracticeFile3;

import java.util.Arrays;

public class P2 {
    public static void main(String[] args) {
        String S1  = "navbar";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "navbar";
        S2 = S2.replaceAll("b","*");
        System.out.println(S2);

        String S3 = "     navbar     ";
        S3 = S3.trim();
        System.out.println(S3);

        String S4 = "     navbar";
        S4 = S4.replaceAll("^\\s+","");
        System.out.println(S4);

        String S5 = "navbar   ";
        S5 = S5.replaceAll("\\s+$","");
        System.out.println(S5);

        String[] S6 = {"n","a","v","b","a","r"};
        Arrays.sort(S6);
        System.out.println(Arrays.toString(S6));

        Integer[] S7 = {45,23,65,21,63};
        Arrays.sort(S7);
        System.out.println(Arrays.toString(S7));
    }
}
