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

package PracticeFile3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P4 {
    public static void main(String[] args) {
        String S1 = "ola";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "ola";
        S2 = S2.replaceAll("l","");
        System.out.println(S2);

        String S3 = "   ola   ";
        S3 = S3.trim();
        System.out.println(S3);

        String S4 = "    ola";
        S4 = S4.replaceAll("^\\s+","");
        System.out.println(S4);

        String S5 = "ola    ";
        S5 = S5.replaceAll("\\s+$","");
        System.out.println(S5);

        String[] S6 = {"o","l","a"};
        Arrays.sort(S6);
        System.out.println(Arrays.toString(S6));

        Integer[] S7 = {23,455,3,65,21};
        Arrays.sort(S7);
        System.out.println(Arrays.toString(S7));

        int[] S8 = {34,67,21};
        int sum = 0;
        for (int i : S8) sum += i;
        System.out.println(sum);
        
        Integer[] S9 = {345,65,32,456,7,23};
        Arrays.sort(S9, Collections.reverseOrder());
        System.out.println(Arrays.toString(S9));

        Integer[] S10 = {34,456,237};
        List<Integer> list = Arrays.asList(S10);
        Collections.shuffle(list);
        list.toArray(S10);
        System.out.println(Arrays.toString(S10));
    }
}
