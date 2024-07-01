// String Reverse
// Remove Character
// Remove leading and trailing spaces from a string.
// Remove leading spaces from a string
// Remove trailing spaces from a string
// Sort Array
// Sum Array

package PracticeFile1;

import java.util.Arrays;

public class P15 {
    public static void main(String[] args) {
        String S1 = "Sarath";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "Sargggggggggagth";
        S2 = S2.replaceAll("g","");
        System.out.println(S2);

        String S3 = "       Sarath      ";
        S3 = S3.trim();
        System.out.println(S3);

        String S4 = "        Sarath";
        S4 = S4.replaceAll("^\\s+","");
        System.out.println(S4);

        String S5 = "Sarath     ";
        S5 = S5.replaceAll("\\s+$","");
        System.out.println(S5);

        String[] names = {"d","s","t","a"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        Integer[] num = {45,7,89,445};
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));

        int[] S8 = {7,9,5};
        int sum = 0;
        for (int i : S8) sum += i;
        System.out.println(sum);
    }
}
