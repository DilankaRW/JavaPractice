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

public class P21 {
    public static void main(String[] args) {
        String S1 = "luma";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "luma";
        S2 = S2.replaceAll("a","");
        System.out.println(S2);

        String S3 = "    luma    ";
        S3 = S3.trim();
        System.out.println(S3);

        String S4 = "   luma";
        S4 = S4.replaceAll("^\\s+","");
        System.out.println(S4);

        String S5 = "luma   ";
        S5 = S5.replaceAll("\\s+$","");
        System.out.println(S5);

        String[] S6 = {"l","u","m","a"};
        Arrays.sort(S6);
        System.out.println(Arrays.toString(S6));
    }
}
