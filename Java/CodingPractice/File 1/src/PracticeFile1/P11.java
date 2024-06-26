// String Reverse
// Remove Character
// Remove leading and trailing spaces from a string.
// Remove leading spaces from a string
// Remove trailing spaces from a string
// Sort Array

package PracticeFile1;

import java.util.Arrays;

public class P11 {
    public static void main(String[] args) {
        String S1 = "Hello";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "Hennnnnnnllo";
        S2 = S2.replaceAll("n","");
        System.out.println(S2);

        String S3 = "   Hello    ";
        S3 = S3.trim();
        System.out.println(S3);

        String S4 = "           Hello";
        S4 = S4.replaceAll("^\\s+","");
        System.out.println(S4);

        String S5 = "Hello      ";
        S5 =S5.replaceAll("\\s+$","");
        System.out.println(S5);

        String[] names = {"t","u","i","b"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        int[] num = {8,5,6,9,1};
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
    }
}
