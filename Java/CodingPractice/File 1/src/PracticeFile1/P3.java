// String Reverse
// Remove Character
// Remove leading and trailing spaces from a string.
// Remove leading spaces from a string
// Remove trailing spaces from a string
// Sort Array
// Sum Array

package PracticeFile1;

import java.util.Arrays;
import java.util.Collections;

public class P3 {
    public static void main(String[] args) {
        String S1 = "mood";
        String RS1 = new StringBuilder(S1).reverse().toString();
        System.out.println(RS1);

        String S2 = "Gohhohhd";
        S2 = S2.replaceAll("h","");
        System.out.println(S2);

        String S3 = "     Hello    ";
        String TS3 = S3.trim();
        System.out.println(TS3);

        String S4 = "    Hello";
        S4 = S4.replaceAll("^\\s+","");
        System.out.println(S4);

        String S5 = "Hello    ";
        S5 = S5.replaceAll("\\s+$","");
        System.out.println(S5);

        String[] names = {"sfjh","deui","weij","ssqw","assw"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        int[] num = {21,520,6,78,89,909,5,54,23};
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));

        int[] S8 = {5,3,8,9};
        int sum = 0;
        for (int i : S8) sum += i;
        System.out.println(sum);

        Integer[] S9 = {54,454,8,78,87,1,3};
        Arrays.sort(S9, Collections.reverseOrder());
        System.out.println(Arrays.toString(S9));
    }
}
