// Wrapper Class

package PracticeFile3;

public class P22 {
    public static void main(String[] args) {
        int x = 12;
        Integer y = Integer.valueOf(x); // Boxing, wrapping
        Integer z = x; // Auto boxing, auto wrapping

        Integer a = 3;
        int b = a.intValue(); // unboxing, unwrapping
        int c = a; // Auto Unboxing, auto unwrapping
    }
}
