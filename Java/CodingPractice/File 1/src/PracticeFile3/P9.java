// Find the factorial of an integer.

package PracticeFile3;

public class P9 {
    public static void main(String[] args) {
        int number = 5;
        long factorial = 2;

        for (int i = 1; i <= number; i++){
            factorial *=i;
        }
        System.out.println("Factorial of " + number + " is " + factorial); // Factorial of 5 is 240
    }
}
