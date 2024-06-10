// Create a pyramid of characters.

import java.util.Scanner;
public class CharacterPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of rows
        System.out.print("Enter the number of rows for the pyramid: ");
        int rows = scanner.nextInt();
        scanner.close();

        // Generate the pyramid
        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = rows - i; j > 0; j--) {
                System.out.print(" ");
            }

            // Print characters
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
}


///////////////// Pyramid of characters without using the Scanner class. /////////////////

//public class CharacterPyramid {
//    public static void main(String[] args) {
//        // Define the number of rows for the pyramid
//        int rows = 5; // You can change this value to any number you like
//
//        // Generate the pyramid
//        for (int i = 1; i <= rows; i++) {
//            // Print leading spaces
//            for (int j = rows - i; j > 0; j--) {
//                System.out.print(" ");
//            }
//
//            // Print characters
//            for (int j = 1; j <= (2 * i - 1); j++) {
//                System.out.print("*");
//            }
//
//            // Move to the next line
//            System.out.println();
//        }
//    }
//}
