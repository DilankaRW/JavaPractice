// String Reverse
// Remove Character
// Remove leading and trailing spaces from a string.
// Remove leading spaces from a string
// Remove trailing spaces from a string
// Sort Array
// Sum Array

package PracticeFile4;

import java.util.Arrays;

public class P10 {
    public static void main(String[] args) {
        String S1 = "xcot";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "xcot";
        S2 = S2.replaceAll("x","z");
        System.out.println(S2);

        String S3 =  "    xcot   ";
        S3 = S3.trim();
        System.out.println(S3);

        String S4 = "    xcot";
        S4 = S4.replaceAll("^\\s+","");
        System.out.println(S4);

        String S5 = "xcot    ";
        S5 = S5.replaceAll("\\s+$","");
        System.out.println(S5);

        String[] S6 = {"x","c","o","t"};
        Arrays.sort(S6);
        System.out.println(Arrays.toString(S6));

        int[] S7 = {65,3,6,42,23};
        Arrays.sort(S7);
        System.out.println(Arrays.toString(S7));

        int[] S8 = {34,23,43};
        int sum = 0;
        for (int i : S8) sum +=i;
        System.out.println(sum);
    }
}
