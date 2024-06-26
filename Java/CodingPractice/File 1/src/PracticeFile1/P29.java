// String Reverse
// Remove Character
// Remove leading and trailing spaces from a string.
// Remove leading spaces from a string
// Remove trailing spaces from a string
// Sort Array
// Sum Array

package PracticeFile1;

import java.util.Arrays;

public class P29 {
    public static void main(String[] args) {
        String S1 = "cool";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "cool";
        S2 = S2.replaceAll("o","");
        System.out.println(S2);

        String S3 = "           cool      ";
        S3 = S3.trim();
        System.out.println(S3);

        String S4 = "        cool";
        S4 = S4.replaceAll("^\\s+","");
        System.out.println(S4);

        String S5 = "cool       ";
        S5 = S5.replaceAll("\\s+","");
        System.out.println(S5);

        String[] S6 = {"D","S","A","M","C"};
        Arrays.sort(S6);
        System.out.println(Arrays.toString(S6));

        int[] S7 = {3,6,82,1,2};
        Arrays.sort(S7);
        System.out.println(Arrays.toString(S7));

        int[] S8 = {1,3,6,2};
        int sum = 0;
        for (int i : S8) sum += i;
        System.out.println(sum);
    }
}
