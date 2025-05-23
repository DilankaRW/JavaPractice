// Swap two numbers without using a third variable.

package PracticeFile4;

public class P13 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("a is " + a + " and b is " + b);

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("After swapping, a is " + a + " and b is " + b);
    }
}
