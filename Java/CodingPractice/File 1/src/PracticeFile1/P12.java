// String Reverse
// Remove Character
// Remove leading and trailing spaces from a string.
// Remove leading spaces from a string
// Remove trailing spaces from a string
// Sort Array
// Sum Array

package PracticeFile1;

import java.util.Arrays;

public class P12 {
    public static void main(String[] args) {
        String S1  = "Sri Lanka";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "Srjjji Ljankjjjjjja";
        S2 = S2.replaceAll("j","");
        System.out.println(S2);

        String S3 = "    Sri Lanka   ";
        S3 = S3.trim();
        System.out.println(S3);

        String S4 = "            Sri Lanka";
        S4 = S4.replaceAll("^\\s+","");
        System.out.println(S4);

        String S5 = "Sri Lanka           ";
        S5 = S5.replaceAll("\\s+$","");
        System.out.println(S5);

        String[] S6 = {"Sri Lanka", "Colombo", "Red","Black","Apple"};
        Arrays.sort(S6);
        System.out.println(Arrays.toString(S6));

        int[] S7 = {9,8,7,6,5,4,3,2,1,0};
        Arrays.sort(S7);
        System.out.println(Arrays.toString(S7));

        int[] S8 = {45,87,9};
        int sum = 0;
        for (int i : S8) sum += i;
        System.out.println(sum);
    }
}
