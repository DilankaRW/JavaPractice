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

import java.util.*;

public class P15 {
    public static void main(String[] args) {
        String S1 = "oiu";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "oiu";
        S2 = S2.replaceAll("u","");
        System.out.println(S2);

        String S3 = "    oiu   ";
        S3 = S3.trim();
        System.out.println(S3);

        String S4 = "    oiu";
        S4 = S4.replaceAll("^\\s+","");
        System.out.println(S4);

        String S5 = "oiu     ";
        S5 = S5.replaceAll("\\s+$","");
        System.out.println(S5);

        String[] S6 = {"o","i","u"};
        Arrays.sort(S6);
        System.out.println(Arrays.toString(S6));

        Integer[] S7 = {64,43,3276,98};
        Arrays.sort(S7);
        System.out.println(Arrays.toString(S7));

        int[] S8 = {76,54,34,27,96};
        int sum = 0;
        for (int i : S8) sum += i;
        System.out.println(sum);

        Integer[] S9 = {98,765,3,12,45,875};
        Arrays.sort(S9, Collections.reverseOrder());
        System.out.println(Arrays.toString(S9));

        Integer[] S10 = {456,6,433,23,57,72};
        List<Integer> list = Arrays.asList(S10);
        Collections.shuffle(list);
        list.toArray(S10);
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
                System.out.print("7");
            }
            System.out.println();
        }
    }
}
