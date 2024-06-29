// String Reverse
// Remove Character
// Remove leading and trailing spaces from a string.
// Remove leading spaces from a string
// Remove trailing spaces from a string
// Sort Array
// Sum Array

package PracticeFile1;

import java.util.Arrays;

public class P18 {
    public static void main(String[] args) {
        String S1 = "tool";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "tool";
        S2 = S2.replaceAll("o","");
        System.out.println(S2);

        String S3 = "         tool   ";
        S3 = S3.trim();
        System.out.println(S3);

        String S4 = "         tool";
        S4 = S4.replaceAll("^\\s+","");
        System.out.println(S4);

        String S5 = "tool   ";
        S5 = S5.replaceAll("\\s+$","");
        System.out.println(S5);

        String[] S6 = {"t","o","o","l"};
        Arrays.sort(S6);
        System.out.println(Arrays.toString(S6));

        int[] S7 = {9,8,4,7,3,2,1,6};
        Arrays.sort(S7);
        System.out.println(Arrays.toString(S7));

        int[] S8 = {34,57,78};
        int sum = 0;
        for (int i : S8) sum += i;
        System.out.println(sum);
    }
}
