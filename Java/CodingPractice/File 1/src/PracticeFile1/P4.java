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

public class P4 {
    public static void main(String[] args) {
        String S1 = "Hello";
        String RS1 = new StringBuilder(S1).reverse().toString();
        System.out.println(RS1);

        String S2 = "Hyelyyyyyylyoy";
        S2 = S2.replaceAll("y","");
        System.out.println(S2);

        String S3 = "         Hello       ";
        S3 = S3.trim();
        System.out.println(S3);

        String S4 = "          Hello  ";
        S4 = S4.replaceAll("^\\s+","");
        System.out.println(S4);

        String S5 = "   Hello    ";
        S5 = S5.replaceAll("\\s+$","");
        System.out.println(S5);

        String[] names = {"Hdfn","sjhjd","Ljklfd","Asds"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        int[] num = {9,8,7,6,5,4,3,2,1,0};
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));

        int[] S8 = {3,7,5};
        int sum = 0;
        for (int i : S8) sum += i;
        System.out.println(sum);

        Integer[] S9 = {34,56,9,234,12,123};
        Arrays.sort(S9, Collections.reverseOrder());
        System.out.println(Arrays.toString(S9));

        Integer[] S10 = {3,56,9,348,80045,45,78};
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
                System.out.print("O");
            }
            System.out.println();
        }
    }
}
