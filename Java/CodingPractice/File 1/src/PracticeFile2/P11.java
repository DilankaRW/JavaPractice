// Create a pyramid of characters.

package PracticeFile2;

import java.util.Scanner;

public class P11 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Rows Count : ");
        int row = S.nextInt();
        S.close();
        for (int i=1; i<=row; i++){
            for (int x=row-i; x>0; x--){
                System.out.print(" ");
            }
            for (int x=1; x<=(2*i-1); x++){
                System.out.print("U");
            }
            System.out.println();
        }
    }
}
