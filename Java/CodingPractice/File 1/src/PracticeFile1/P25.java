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

public class P25 {
    public static void main(String[] args) {
        String S1 = "ato";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "ato";
        S2 = S2.replaceAll("o","");
        System.out.println(S2);

        String S3 = "   ato     ";
        S3 = S3.trim();
        System.out.println(S3);

        String S4 = "    ato";
        S4 = S4.replaceAll("^\\s+" ,"");
        System.out.println(S4);

        String S5 = "ato     ";
        S5 = S5.replaceAll("\\s+$","");
        System.out.println(S5);

        String[] S6 = {"a","t","o"};
        Arrays.sort(S6);
        System.out.println(Arrays.toString(S6));
    }
}
