// String Reverse
// Remove Character
// Remove leading and trailing spaces from a string.
// Remove leading spaces from a string
// Remove trailing spaces from a string
// Sort Array
// Sum Array
// Descending order Array
// Shuffle an array

package PracticeFile1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P13 {
    public static void main(String[] args) {
        String S1 = "zxc";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "zxc";
        S2 = S2.replaceAll("x","");
        System.out.println(S2);

        String S3 = "    zxc   ";
        S3 = S3.trim();
        System.out.println(S3);

        String S4 = "      zxc";
        S4 = S4.replaceAll("^\\s+","");
        System.out.println(S4);

        String S5 = "zxc       ";
        S5 = S5.replaceAll("\\s+$","");
        System.out.println(S5);

        String[] S6 = {"z","x","c"};
        Arrays.sort(S6);
        System.out.println(Arrays.toString(S6));

        int[] S7 = {5,8,6,7,34,56,4};
        Arrays.sort(S7);
        System.out.println(Arrays.toString(S7));

        int[] S8 = {8,7,9};
        int sum = 0;
        for (int i : S8) sum += i;
        System.out.println(sum);

        Integer[] S9 = {45,56,23,32,212};
        Arrays.sort(S9, Collections.reverseOrder());
        System.out.println(Arrays.toString(S9));

        Integer[] S10 = {76,45,3,23,586};
        List<Integer> list = Arrays.asList(S10);
        Collections.shuffle(list);
        list.toArray(S10);
        System.out.println(Arrays.toString(S10));
    }
}
