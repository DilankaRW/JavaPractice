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

public class P24 {
    public static void main(String[] args) {
        String S1 = "nowa";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "nowa";
        S2 = S2.replaceAll("y","");
        System.out.println(S2);

        String S3 = "       nowa       ";
        S3 = S3.trim();
        System.out.println(S3);

        String S4 = "   nowa";
        S4 = S4.replaceAll("^\\s+","");
        System.out.println(S4);

        String S5 = "nowa     ";
        S5 = S5.replaceAll("\\s+$","");
        System.out.println(S5);

        String[] S6 = {"n","o","w","a"};
        Arrays.sort(S6);
        System.out.println(Arrays.toString(S6));

        int[] S7 = {456,823,689,234,909};
        Arrays.sort(S7);
        System.out.println(Arrays.toString(S7));

        int[] S8 = {34,567,96};
        int sum = 0;
        for (int i : S8) sum += i;
        System.out.println(sum);

        Integer[] S9 = {1,2,4,5,7,9,3};
        Arrays.sort(S9, Collections.reverseOrder());
        System.out.println(Arrays.toString(S9));

        Integer[] S10 = {98,67,4,32};
        List<Integer> list = Arrays.asList(S10);
        Collections.shuffle(list);
        list.toArray(S10);
        System.out.println(Arrays.toString(S10));
    }
}
