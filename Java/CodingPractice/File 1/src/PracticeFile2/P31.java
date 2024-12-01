// String Reverse
// Remove Character
// Remove leading and trailing spaces from a string.
// Remove leading spaces from a string
// Remove trailing spaces from a string

package PracticeFile2;

import java.util.Arrays;
import java.util.Collections;

public class P31 {
    public static void main(String[] args) {
        String S1 = "saro";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "saro";
        S2 = S2.replaceAll("s","");
        System.out.println(S2);

        String S3 = "    saro    ";
        S3 = S3.trim();
        System.out.println(S3);

        String S4 = "   saro";
        S4 = S4.replaceAll("^\\s+","");
        System.out.println(S4);

        String S5 = "saro    ";
        S5 = S5.replaceAll("\\s+$","");
        System.out.println(S5);

    }
}
