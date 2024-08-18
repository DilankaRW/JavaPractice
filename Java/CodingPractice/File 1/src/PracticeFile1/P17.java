// String Reverse
// Remove Character
// Remove leading and trailing spaces from a string.
// Remove leading spaces from a string
// Remove trailing spaces from a string
// Sort Array
// Descending order Array
// Shuffle an array

package PracticeFile1;

import java.util.Arrays;

public class P17 {
    public static void main(String[] args) {
        String S1 = "era";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "era";
        S2 = S2.replaceAll("e","");
        System.out.println(S2);

        String S3 = "   era    ";
        S3 = S3.trim();
        System.out.println(S3);

        String S4 = "   era";
        S4 = S4.replaceAll("^\\s+","");
        System.out.println(S4);

        String S5 = "era   ";
        S5 = S5.replaceAll("\\s+$","");
        System.out.println(S5);

        String[] S6 = {"e","r","a"};
        Arrays.sort(S6);
        System.out.println(Arrays.toString(S6));
    }
}
