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

package PracticeFile1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P23 {
    public static void main(String[] args) {
        String S1 = "yola";
        S1 = new StringBuilder(S1).reverse().toString();;
        System.out.println(S1);

        String S2 = "yola";
        S2 = S2.replaceAll("a","");
        System.out.println(S2);

        String S3 = "             yola       ";
        S3 = S3.trim();
        System.out.println(S3);

        String S4 = "    yola";
        S4 = S4.replaceAll("^//s+","");
        System.out.println(S4);

        String S5 = "yola    ";
        S5 = S5.replaceAll("\\s+$","");
        System.out.println(S5);

        String[] S6 = {"y","o","l","a"};
        Arrays.sort(S6);
        System.out.println(Arrays.toString(S6));

        Integer[] S7 = {56,79,34,15,75};
        Arrays.sort(S7);
        System.out.println(Arrays.toString(S7));

        int[] S8 = {34,57,89,23};
        int sum = 0;
        for (int i : S8) sum += i;
        System.out.println(sum);

        Integer[] S9 = {34,56,89,23};
        Arrays.sort(S9, Collections.reverseOrder());
        System.out.println(Arrays.toString(S9));

        Integer[] S10 = {34,323,45,23,12};
        List<Integer> list = Arrays.asList(S10);
        Collections.shuffle(list);
        list.toArray(S10);
        System.out.println(Arrays.toString(S10));

        Scanner S11 = new Scanner(System.in);
        System.out.print("Rows Count : ");
        int rows = S11.nextInt();
        S11.close();
        for (int i=1; i<=rows; i++){
            for (int x=rows-i; x>0; x--){
                System.out.print(" ");
            }
            for (int x=1; x<=(2*i-1); x++){
                System.out.print("9");
            }
            System.out.println();
        }
    }
}
