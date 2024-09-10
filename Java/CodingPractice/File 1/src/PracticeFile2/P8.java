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

package PracticeFile2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {
        String S1 = "loca";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "loca";
        S2 = S2.replaceAll("o","*");
        System.out.println(S2);

        String S3 = "      loca      ";
        S3 = S3.trim();
        System.out.println(S3);

        String S4 = "    loca";
        S4 = S4.replaceAll("^\\s+","");
        System.out.println(S4);

        String S5 = "loca     ";
        S5 = S5.replaceAll("\\s+$","");
        System.out.println(S5);

        String[] S6 = {"l","o","c","a"};
        Arrays.sort(S6);
        System.out.println(Arrays.toString(S6));

        int[] S7 = {45,678,24,78,22};
        Arrays.sort(S7);
        System.out.println(Arrays.toString(S7));

        int[] S8 = {45,67,23};
        int sum = 0;
        for (int i : S8) sum += i;
        System.out.println(sum);

        Integer[] S9 = {5,65,23,324,58,435};
        Arrays.sort(S9, Collections.reverseOrder());
        System.out.println(Arrays.toString(S9));

        Integer[] S10 = {23,45,67,75,32,24};
        List<Integer> list = Arrays.asList(S10);
        Collections.shuffle(list);
        System.out.println(Arrays.toString(S10));

        Scanner S = new Scanner(System.in);
        System.out.print("Rows Count : ");
        int row = S.nextInt();
        S.close();
        for (int i=1; i<=row; i++){
            for (int x=row-i; x>0; x--){
                System.out.print(" ");
            }
            for (int x=1; x<=(2*i-1); x++){
                System.out.print("V");
            }
            System.out.println();
        }
    }
}
