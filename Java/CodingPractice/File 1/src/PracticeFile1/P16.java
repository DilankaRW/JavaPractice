// String Reverse
// Remove Character
// Remove leading and trailing spaces from a string.
// Remove leading spaces from a string
// Remove trailing spaces from a string
// Sort Array

package PracticeFile1;

import java.util.Arrays;

public class P16 {
    public static void main(String[] args) {
        String S1 = "Test";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "Test";
        S2 = S2.replaceAll("v","");
        System.out.println(S2);

        String S3 = "          Test     ";
        S3 = S3.trim();
        System.out.println(S3);

        String S4 = "     Test";
        S4 = S4.replaceAll("^\\s+","");
        System.out.println(S4);

        String S5 = "Test         ";
        S5 = S5.replaceAll("\\s+$","");
        System.out.println(S5);

        String[] S6 = {"e","r","t","o"};
        Arrays.sort(S6);
        System.out.println(Arrays.toString(S6));

        int[] S7 = {4,6,8,2,7,3,1};
        Arrays.sort(S7);
        System.out.println(Arrays.toString(S7));
    }
}
