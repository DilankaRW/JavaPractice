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

public class P6 {
    public static void main(String[] args) {
        String S1 = "world";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "world";
        S2 = S2.replaceAll("r","");
        System.out.println(S2);

        String S3 = "      world          ";
        S3 = S3.trim();
        System.out.println(S3);

        String S4 = "          world";
        S4 = S4.replaceAll("^\\s+","");
        System.out.println(S4);

        String S5 = "world                ";
        S5 = S5.replaceAll("\\s+$","");
        System.out.println(S5);

        String[] S6 = {"w","o","r","l","d"};
        Arrays.sort(S6);
        System.out.println(Arrays.toString(S6));

        int[] S7 = {8,5,3,12,22,89,1};
        Arrays.sort(S7);
        System.out.println(Arrays.toString(S7));

        int[] S8 = {23,65,212};
        int sum = 0;
        for (int i : S8) sum += i;
        System.out.println(sum);

        Integer[] S9 = {1,2,4,5,7,9};
        Arrays.sort(S9, Collections.reverseOrder());
        System.out.println(Arrays.toString(S9));

        Integer[] S10 = {34,45,78,32,67};
        List<Integer> list = Arrays.asList(S10);
        Collections.shuffle(list);
        list.toArray(S10);
        System.out.println(Arrays.toString(S10));

        Scanner S11 = new Scanner(System.in);
        System.out.print("Rows Count : ");
        int rows = S11.nextInt();
        S11.close();
        for (int i = 1; i <= rows; i++){
            for (int x = rows - i; x > 0; x--){
                System.out.print(" ");
            }
            for (int x = 1; x <= (2 * i - 1); x++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
