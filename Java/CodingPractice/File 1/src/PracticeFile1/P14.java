// String Reverse
// Remove Character
// Remove leading and trailing spaces from a string.
// Remove leading spaces from a string
// Remove trailing spaces from a string
// Sort Array
// Sum Array

package PracticeFile1;

import java.util.Arrays;

public class P14 {
    public static void main(String[] args) {
        String S1 = "Cool";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "Cohhhhhhhhhol";
        S2 = S2.replaceAll("h","");
        System.out.println(S2);

        String S3 = "   Cool     ";
        S3 = S3.trim();
        System.out.println(S3);

        String S4 = "        Cool";
        S4 = S4.replaceAll("^\\s+","");
        System.out.println(S4);

        String S5 = "Good        ";
        S5 = S5.replaceAll("\\s+$","");
        System.out.println(S5);

        String[] S6 = {"D","F","K","L","Y","A"};
        Arrays.sort(S6);
        System.out.println(Arrays.toString(S6));

        Integer[] S7 = {232,4,5656,78,898,32,56,8};
        Arrays.sort(S7);
        System.out.println(Arrays.toString(S7));

        int[] S8 = {3,5,8,7};
        int sum = 0;
        for (int i : S8) sum += i;
        System.out.println(sum);
    }
}
