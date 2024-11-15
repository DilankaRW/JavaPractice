// String Reverse
// Remove Character
// pyramid of characters.

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
