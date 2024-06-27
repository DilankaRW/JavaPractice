// String Reverse
// Remove Character
// Remove leading and trailing spaces from a string.
// Remove leading spaces from a string
// Remove trailing spaces from a string
// Sort Array
// Sum Array

package PracticeFile1;

import java.util.Arrays;

public class P21 {
    public static void main(String[] args) {
        String S1 = "sigiriya";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "sigiriya";
        S2 = S2.replaceAll("i","");
        System.out.println(S2);

        String S3 = "       sigiriya   ";
        S3 = S3.trim();
        System.out.println(S3);

        String S4 = "         sigiriya";
        S4 = S4.replaceAll("^\\s+","");
        System.out.println(S4);

        String S5 = "sigiriya       ";
        S5 = S5.replaceAll("\\s+$","");
        System.out.println(S5);

        String[] S6 = {"s","i","g","i","r","i","y","a"};
        Arrays.sort(S6);
        System.out.println(Arrays.toString(S6));

        int[] S7 = {8,7,4,2};
        Arrays.sort(S7);
        System.out.println(Arrays.toString(S7));

        int[] S8 = {34,6,10};
        int sum = 0;
        for (int i : S8) sum += i;
        System.out.println(sum);
    }
}
