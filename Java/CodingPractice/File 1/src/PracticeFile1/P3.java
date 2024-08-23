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

public class P3 {
    public static void main(String[] args) {
        String S1 = "are";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "are";
        S2 = S2.replaceAll("r","");
        System.out.println(S2);

        String S3 = "    are   ";
        S3 = S3.trim();
        System.out.println(S3);

        String S4 = "   are";
        S4 = S4.replaceAll("^\\s+","");
        System.out.println(S4);

        String S5 = "are    ";
        S5 = S5.replaceAll("\\s+$","");
        System.out.println(S5);

        String[] S6 = {"a","r","e"};
        Arrays.sort(S6);
        System.out.println(Arrays.toString(S6));

        int[] S7 = {3,5,779,34,56,78,90};
        Arrays.sort(S7);
        System.out.println(Arrays.toString(S7));

        int[] S8 = {45,674,34};
        int sum = 0;
        for (int i : S8) sum += i;
        System.out.println(sum);

        Integer[] S9 = {4,78,5,575,87,15,18};
        Arrays.sort(S9, Collections.reverseOrder());
        System.out.println(Arrays.toString(S9));

        Integer[] S10 = {4,5,89,75,2,668,87,21,57};
        List<Integer> list = Arrays.asList(S10);
        Collections.shuffle(list);
        list.toArray(S10);
        System.out.println(Arrays.toString(S10));

        Scanner S11 = new Scanner(System.in);
        System.out.print("Row Count : ");
        int rows = S11.nextInt();
        S11.close();
        for (int i = 1; i <= rows; i++){
            for (int x = rows - i; x > 0; x--){
                System.out.print(" ");
            }
            for (int x = 1; x <= (2 * i - 1); x++){
                System.out.print("A");
            }
            System.out.println();
        }
    }
}
