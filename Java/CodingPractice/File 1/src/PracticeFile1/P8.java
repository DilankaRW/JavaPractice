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

public class P8 {
    public static void main(String[] args) {
        String S1 = "food";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "food";
        S2 = S2.replaceAll("o","");
        System.out.println(S2);

        String S3 = "     food    ";
        S3 = S3.trim();
        System.out.println(S3);

        String S4 = "     food";
        S4 = S4.replaceAll("^\\s+","");
        System.out.println(S4);

        String S5 = "food       ";
        S5 = S5.replaceAll("\\s+$","");
        System.out.println(S5);

        String[] S6 = {"f","o","o","d"};
        Arrays.sort(S6);
        System.out.println(Arrays.toString(S6));

        int[] S7 = {76,4,3,1,56,87};
        Arrays.sort(S7);
        System.out.println(Arrays.toString(S7));

        int[] S8 = {4,3,67,9,23};
        int sum = 0;
        for (int i : S8) sum += i;
        System.out.println(sum);

        Integer[] S9 = {1,2,3,4,5,6,7,8,9,10};
        Arrays.sort(S9, Collections.reverseOrder());
        System.out.println(Arrays.toString(S9));

        Integer[] S10 = {45,67,78,34};
        List<Integer> list = Arrays.asList(S10);
        Collections.shuffle(list);
        list.toArray(S10);
        System.out.println(Arrays.toString(S10));
    }
}
