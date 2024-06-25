// String Reverse
// Remove Character
// Remove leading and trailing spaces from a string.
// Remove leading spaces from a string
// Remove trailing spaces from a string
// Sort Array

package PracticeFile1;

import java.util.Arrays;

public class P25 {
    public static void main(String[] args) {
        String S1 = "moon";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "moon";
        S2 = S2.replaceAll("n","");
        System.out.println(S2);

        String S3 = "       moon   ";
        S3 = S3.trim();
        System.out.println(S3);

        String S4 = "       moon";
        S4 = S4.replaceAll("^\\s+","");
        System.out.println(S4);

        String S5 = "moon     ";
        S5 = S5.replaceAll("\\s+$","");
        System.out.println(S5);

        String[] S6 = {"m","o","o","n"};
        Arrays.sort(S6);
        System.out.println(Arrays.toString(S6));

        Integer[] S7 = {67,34,78,22};
        Arrays.sort(S7);
        System.out.println(Arrays.toString(S7));
    }
}
