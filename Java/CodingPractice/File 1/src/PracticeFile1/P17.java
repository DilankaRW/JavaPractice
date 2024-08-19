// String Reverse
// Remove Character
// Remove leading and trailing spaces from a string.
// Remove leading spaces from a string
// Remove trailing spaces from a string
// Sort Array
// Descending order Array
// Shuffle an array

package PracticeFile1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P17 {
    public static void main(String[] args) {
        String S1 = "era";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "era";
        S2 = S2.replaceAll("e","");
        System.out.println(S2);

        String S3 = "   era    ";
        S3 = S3.trim();
        System.out.println(S3);

        String S4 = "   era";
        S4 = S4.replaceAll("^\\s+","");
        System.out.println(S4);

        String S5 = "era   ";
        S5 = S5.replaceAll("\\s+$","");
        System.out.println(S5);

        String[] S6 = {"e","r","a"};
        Arrays.sort(S6);
        System.out.println(Arrays.toString(S6));

        int[] S7 = {45,54,6,23,1434,3};
        Arrays.sort(S7);
        System.out.println(Arrays.toString(S7));

        int[] S8 = {23,234,423};
        int sum = 0;
        for (int i : S8) sum += i;
        System.out.println(sum);

        Integer[] S9 = {45,3,454,2324};
        Arrays.sort(S9, Collections.reverseOrder());
        System.out.println(Arrays.toString(S9));

        Integer[] S10 = {456,56,3442,23};
        List<Integer> list = Arrays.asList(S10);
        Collections.shuffle(list);
        list.toArray(S10);
        System.out.println(Arrays.toString(S10));
    }
}
