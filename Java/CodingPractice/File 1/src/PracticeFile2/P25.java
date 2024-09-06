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

package PracticeFile2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P25 {
    public static void main(String[] args) {
        String S1 = "qwe";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "qwe";
        S2 = S2.replaceAll("q","");
        System.out.println(S2);

        String S3 = "    qwe   ";
        S3 = S3.trim();
        System.out.println(S3);

        String S4 = "    qwe";
        S4 = S4.replaceAll("^\\s+","");
        System.out.println(S4);

        String S5 = "qwe    ";
        S5 = S5.replaceAll("\\s+$","");
        System.out.println(S5);

        String[] S6 = {"q","w","e"};
        Arrays.sort(S6);
        System.out.println(Arrays.toString(S6));

        int[] S7 = {435,76,87,345};
        Arrays.sort(S7);
        System.out.println(Arrays.toString(S7));

        int[] S8 = {324,56,47,7,32,123};
        int sum = 0;
        for (int i : S8) sum += i;
        System.out.println(sum);

        Integer[] S9 = {34,5,547,324,23};
        Arrays.sort(S9, Collections.reverseOrder());
        System.out.println(Arrays.toString(S9));

        Integer[] S10 = {456,67,56,342,21};
        List<Integer> list = Arrays.asList(S10);
        Collections.shuffle(list);
        list.toArray(S10);
        System.out.println(Arrays.toString(S10));
    }
}
