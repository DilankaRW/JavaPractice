// String Reverse
// Remove Character
// Remove leading and trailing spaces from a string.
// Remove leading spaces from a string
// Remove trailing spaces from a string
// Sort Array
// Sum Array
// Descending order Array
// Shuffle an array
// Create a pyramid of characters.

package PracticeFile4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P3 {
    public static void main(String[] args) {
        String S1 = "back";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "back";
        S2 = S2.replaceAll("a","*");
        System.out.println(S2);

        String S3 = "   back   ";
        S3 = S3.trim();
        System.out.println(S3);

        String S4 = "   back";
        S4 = S4.replaceAll("^\\s+","");
        System.out.println(S4);

        String S5 = "back   ";
        S5 = S5.replaceAll("\\s+$","");
        System.out.println(S5);

        String[] S6 = {"b","a","c","k"};
        Arrays.sort(S6);
        System.out.println(Arrays.toString(S6));

        int[] S7 = {65,23,87};
        Arrays.sort(S7);
        System.out.println(Arrays.toString(S7));

        int[] S8 = {34,543,23};
        int sum = 0;
        for (int i : S8)sum +=i;
        System.out.println(sum);

        Integer[] S9 = {34,75,2,762,1,321};
        Arrays.sort(S9, Collections.reverseOrder());
        System.out.println(Arrays.toString(S9));

        Integer[] S10 ={68,35,9,54};
        List<Integer> list = Arrays.asList(S10);
        Collections.shuffle(list);
        list.toArray(S10);
        System.out.println(Arrays.toString(S10));
    }
}
