// String Reverce
// Remove Character
// Remove leading and trailing spaces from a string.
// Remove leading spaces from a string
// Remove trailing spaces from a string
// Sort Array

package PracticeFile1;

import java.util.Arrays;

public class P7 {
    public static void main(String[] args) {
        String S1 = "Hello";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "Heljjjjjjjjjjjjjjjlo";
        S2 = S2.replace("j","");
        System.out.println(S2);

        String S3 = "       Hello        ";
        S3 = S3.trim();
        System.out.println(S3);

        String S4 = "          Hello";
        S4 = S4.replaceAll("^\\s+","");
        System.out.println(S4);

        String S5 = "Hello        ";
        S5 = S5.replaceAll("\\s+$","");
        System.out.println(S5);

        String[] names = {"V","S","T","A","W","D","C"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        Integer[] num = {9,8,7,6,5,4,3,2,1,0};
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
    }
}
