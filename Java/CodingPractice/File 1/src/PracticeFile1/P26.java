// String Reverse
// Remove Character
// Remove leading and trailing spaces from a string.
// Remove leading spaces from a string
// Remove trailing spaces from a string
// Sort Array
// Sum Array

package PracticeFile1;

import java.util.Arrays;

public class P26 {
    public static void main(String[] args) {
        String S1 = "roof";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "roof";
        S2 = S2.replaceAll("o","");
        System.out.println(S2);

        String S3 = "        roof           ";
        S3 = S3.trim();
        System.out.println(S3);

        String S4 = "         roof";
        S4 = S4.replaceAll("^\\s+","");
        System.out.println(S4);

        String S5 = "roof        ";
        S5 = S5.replaceAll("\\s+$","");
        System.out.println(S5);

        String[] S6 = {"r","o","o","f"};
        Arrays.sort(S6);
        System.out.println(Arrays.toString(S6));

        int[] S7 = {9,8,7,6,5,4,3,2,1};
        Arrays.sort(S7);
        System.out.println(Arrays.toString(S7));

        int[] S8 = {5,10,15};
        int sum = 0;
        for (int i : S8) sum += i;
        System.out.println(sum);
    }
}
