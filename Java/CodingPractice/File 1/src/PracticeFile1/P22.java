// String Reverse
// Remove Character
// Remove leading and trailing spaces from a string.
// Remove leading spaces from a string
// Remove trailing spaces from a string
// Sort Array
// Sum Array
// Descending order Array

package PracticeFile1;
public class P22 {
    public static void main(String[] args) {
        String S1 = "tako";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "tako";
        S2 = S2.replaceAll("o","");
        System.out.println(S2);

        String S3 = "    tako   ";
        S3 = S3.trim();
        System.out.println(S3);
    }
}
