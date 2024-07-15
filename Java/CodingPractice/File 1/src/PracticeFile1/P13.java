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

public class P13 {
    public static void main(String[] args) {
        String S1 = "ads";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "ads";
        S2 = S2.replaceAll("d","");
        System.out.println(S2);

        String S3 = "   ads   ";
        S3 = S3.trim();
        System.out.println(S3);

        String S4 = "    ads";
        S4 = S4.replaceAll("^\\s+","");
        System.out.println(S4);

        String S5 = "ads   ";
        S5 = S5.replaceAll("\\s+$","");
        System.out.println(S5);

        String[] S6 = {"s","d","a"};
        Arrays.sort(S6);
        System.out.println(Arrays.toString(S6));
    }
}
