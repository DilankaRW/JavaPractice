// String Reverse
// Remove Character
// Remove leading and trailing spaces from a string.
// Remove leading spaces from a string
// Remove trailing spaces from a string
// Sort Array

package PracticeFile1;

import java.util.Arrays;

public class P13 {
    public static void main(String[] args) {
        String S1 = "Good";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "Gotttttod";
        S2 = S2.replaceAll("t","");
        System.out.println(S2);

        String S3 = "          Good      ";
        S3 = S3.trim();
        System.out.println(S3);

        String S4 = "       Good";
        S4 = S4.replaceAll("^\\s+","");
        System.out.println(S4);

        String S5 = "Good      ";
        S5 = S5.replaceAll("\\s+$","");
        System.out.println(S5);

        String[] names = {"Sarath","Dinuka","Kamal","Gunapala","Charith"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        int[] num = {45,6,8,998,3,23,4};
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
    }
}
