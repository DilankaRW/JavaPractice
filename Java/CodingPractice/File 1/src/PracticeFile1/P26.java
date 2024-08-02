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
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class P26 {
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

        String S4 = "    zxc";
        S4 = S4.replaceAll("^\\s+","");
        System.out.println(S4);

        String S5 = "zxc   ";
        S5 = S5.replaceAll("\\s+$","");
        System.out.println(S5);

        String[] S6 = {"z","x","c"};
        Arrays.sort(S6);
        System.out.println(Arrays.toString(S6));

        int[] S7 = {7,9,5,1,2,4,3};
        Arrays.sort(S7);
        System.out.println(Arrays.toString(S7));

        int[] S8 = {34,56,8,53};
        int sum = 0;
        for (int i : S8) sum += i;
        System.out.println(sum);

        Integer[] S9 = {34,6789,2232,567,1,345};
        Arrays.sort(S9, Collections.reverseOrder());
        System.out.println(Arrays.toString(S9));

        Integer[] array = {45,678,23,65,4};
        List<Integer> List = Arrays.asList(array);
        Collections.shuffle(List);
        List.toArray(array);
        System.out.println(Arrays.toString(array));
    }
}
