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
import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        String S1 = "working";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "working";
        S2 = S2.replaceAll("o","*");
        System.out.println(S2);

        String S3 = "   working   ";
        S3 = S3.trim();
        System.out.println(S3);

        String S4 = "    working";
        S4 = S4.replaceAll("^\\s+","");
        System.out.println(S4);

        String S5 = "working   ";
        S5 = S5.replaceAll("\\s+$","");
        System.out.println(S5);

        String[] S6 = {"w","o","r","k","i","n","g"};
        Arrays.sort(S6);
        System.out.println(Arrays.toString(S6));

        int[] S7 = {46,76,32};
        Arrays.sort(S7);
        System.out.println(Arrays.toString(S7));

        int[] S8 = {45,78,23};
        int sum = 0;
        for (int i : S8) sum += i;
        System.out.println(sum);

        Scanner S = new Scanner(System.in);
        System.out.print("Rows Count : ");
        int row = S.nextInt();
        S.close();
        for (int i=1; i<row; i++){
            for (int x=row-i; x>0; x--){
                System.out.print(" ");
            }
            for (int x=1; x<=(2*i-1); x++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
