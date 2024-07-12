// String Reverse
// Remove Character
// Remove leading and trailing spaces from a string.
// Remove leading spaces from a string
// Remove trailing spaces from a string
// Sort Array
// Sum Array
// Descending order Array

package PracticeFile1;

public class P7 {
    public static void main(String[] args) {
        String S1 = "ring";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "ring";
        S2 = S2.replaceAll("i","");
        System.out.println(S2);

    }
}
