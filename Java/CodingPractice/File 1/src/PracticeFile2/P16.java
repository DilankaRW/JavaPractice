// Create a pyramid of characters.

package PracticeFile2;

import java.util.Scanner;

public class P16 {
    public static void main(String[] args) {
//        Scanner S = new Scanner(System.in);
//        System.out.print("Rows Count : ");
//        int row = S.nextInt();
//        S.close();
//        for (int i=1; i<=row; i++){
//            for (int x=row-i; x>0; x--){
//                System.out.print(" ");
//            }
//            for (int x=1; x<=(2*i-1); x++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        Scanner S1 = new Scanner(System.in);
//        System.out.print("Rows Count : ");
//        int row1 = S1.nextInt();
//        S1.close();
//        for (int i=1; i<=row1; i++){
//            for (int x=row1-i; x>0; x--){
//                System.out.print(" ");
//            }
//            for (int x=1;x<=(2*i-1); x++){
//                System.out.print("1");
//            }
//            System.out.println();
//        }

        Scanner S2 = new Scanner(System.in);
        System.out.print("Rows Count : ");
        int row = S2.nextInt();
        S2.close();
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
