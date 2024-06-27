// String Reverse
// Remove Character
// Remove leading and trailing spaces from a string.
// Remove leading spaces from a string
// Remove trailing spaces from a string
// Sort Array
// Sum Array

package PracticeFile1;

import java.util.Arrays;

public class P24 {
    public static void main(String[] args) {
        String S1 = "super";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "super";
        S2 = S2.replaceAll("u","");
        System.out.println(S2);

        String S3 = "      super      ";
        S3 = S3.trim();
        System.out.println(S3);

        String S4 = "       super";
        S4 = S4.replaceAll("^\\s+","");
        System.out.println(S4);

        String S5 = "super         ";
        S5 = S5.replaceAll("\\s+$","");
        System.out.println(S5);

        String[] S6 = {"s","u","p","e","r"};
        Arrays.sort(S6);
        System.out.println(Arrays.toString(S6));

        String[] S7 = {"s3","s5","s1","s2","s4"};
        Arrays.sort(S7);
        System.out.println(Arrays.toString(S7));

        int[] S8 = {5,4,2};
        int sum = 0;
        for (int i : S8) sum += i;
        System.out.println(sum);
    }
}
