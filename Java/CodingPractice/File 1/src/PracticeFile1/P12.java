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

public class P12 {
    public static void main(String[] args) {
        String S1 = "polo";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "polo";
        S2 = S2.replaceAll("o","");
        System.out.println(S2);

        String S3 = "      polo   ";
        S3 = S3.trim();
        System.out.println(S3);

        String S4 = "   polo";
        S4 = S4.replaceAll("^\\s+","");
        System.out.println(S4);

        String S5 = "polo     ";
        S5 = S5.replaceAll("\\s+$","");
        System.out.println(S5);

        String[] S6 = {"p","o","l","o"};
        Arrays.sort(S6);
        System.out.println(Arrays.toString(S6));

        int[] S7 = {78,53,25,97,64,12,32};
        Arrays.sort(S7);
        System.out.println(Arrays.toString(S7));

        int[] S8 = {56,78,43};
        int sum = 0;
        for (int i : S8) sum += i;
        System.out.println(sum);

        Integer[] S9 = {34,76,12,65,89};
        Arrays.sort(S9, Collections.reverseOrder());
        System.out.println(Arrays.toString(S9));

        Integer[] S10 = {78,56,547,89};
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
                System.out.print("i");
            }
            System.out.println();
        }
    }
}
