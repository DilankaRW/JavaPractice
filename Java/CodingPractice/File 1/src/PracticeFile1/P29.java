// Create a pyramid of characters.

package PracticeFile1;

import java.util.Scanner;

public class P29 {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);

        System.out.print("Rows Count : ");
        int rows = s.nextInt();
        s.close();

        for (int i = 1; i <= rows; i++){
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
