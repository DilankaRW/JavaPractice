// Create a pyramid of characters.

package PracticeFile1;

import java.util.Scanner;

public class P26 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        System.out.print("Enter Rows Count");
        int rows = S.nextInt();
        S.close();

        for(int i = 1; i<= rows; i++){
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
