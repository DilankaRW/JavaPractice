// String Reverse
// Remove Character
// pyramid of characters.
// Remove leading and trailing spaces from a string.
// Remove leading spaces from a string
// Remove trailing spaces from a string

package PracticeFile3;

import java.util.Scanner;

public class P32 {
    public static void main(String[] args) {
        String S1 = "hiru";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "hiru";
        S2 = S2.replaceAll("i","*");
        System.out.println(S2);

        String S3 = "     hiru    ";
        S3 = S3.trim();
        System.out.println(S3);

        String S4 = "    hiru";
        S4 = S4.replaceAll("^\\s+","");
        System.out.println(S4);

        String S5 = "hiru     ";
        S5 = S5.replaceAll("\\s+$","");
        System.out.println(S5);

        Scanner S = new Scanner(System.in);
        System.out.print("Rows Count : ");
        int row = S.nextInt();
        S.close();
        for (int i=1; i<=row; i++){
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
