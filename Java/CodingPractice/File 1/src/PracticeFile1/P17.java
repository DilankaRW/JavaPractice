// String Reverse
// Remove Character
// Remove leading and trailing spaces from a string.
// Remove leading spaces from a string
// Remove trailing spaces from a string
// Sort Array
// Descending order Array

package PracticeFile1;
public class P17 {
    public static void main(String[] args) {
        String S1 = "sora";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "sora";
        S2 = S2.replaceAll("o","");
        System.out.println(S2);

        String S3 = "    sora   ";
        S3 = S3.trim();
        System.out.println(S3);

        String S4 = "    sora";
        S4 = S4.replaceAll("^//s+","");
        System.out.println(S4);

        String S5 = "sora    ";
        S5 = S5.replaceAll("\\s+$","");
        System.out.println(S5);
    }
}
