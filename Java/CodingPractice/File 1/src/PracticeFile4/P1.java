// String Reverse
// Remove Character
// Remove leading and trailing spaces from a string.
// Remove leading spaces from a string
// Remove trailing spaces from a string
// Sort Array
// Sum Array
// Descending order Array
// Shuffle an array

package PracticeFile4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P1 {
    public static void main(String[] args) {
        String S1 = "practice";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "practice";
        S2 = S2.replaceAll("t","*");
        System.out.println(S2);

        String S3 = "   practice   ";
        S3 = S3.trim();
        System.out.println(S3);

        String S4 = "   practice";
        S4 = S4.replaceAll("^\\s+","");
        System.out.println(S4);

        String S5 = "practice    ";
        S5 = S5.replaceAll("\\s+$","");
        System.out.println(S5);

        String[] S6 = {"p","r","a","c","t","i","c","e"};
        Arrays.sort(S6);
        System.out.println(Arrays.toString(S6));

        int[] S7 = {45,87,23};
        Arrays.sort(S7);
        System.out.println(Arrays.toString(S7));

        int[] S8 = {435,765,232};
        int sum = 0;
        for(int i : S8) sum +=i;
        System.out.println(sum);

        Integer[] S9 = {32,64,23,67};
        Arrays.sort(S9, Collections.reverseOrder());
        System.out.println(Arrays.toString(S9));

        Integer[] S10 = {45,78,32,54,86};
        List<Integer> list = Arrays.asList(S10);
        Collections.shuffle(list);
        list.toArray(S10);
        System.out.println(Arrays.toString(S10));
    }
}
