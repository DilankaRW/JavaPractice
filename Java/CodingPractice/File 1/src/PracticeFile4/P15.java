// Find the factorial of an integer.

package PracticeFile4;

public class P15 {
    public static void main(String[] args) {
        int number = 5; // example number
        long factorial = 1;

        for (int i =1; i<= number; i++){
            factorial *= i;
        }
        System.out.println("Factorial of " +number+ " is " +factorial);
    }
}
