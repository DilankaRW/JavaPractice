// String Reverse
// Remove Character
// Remove leading and trailing spaces from a string.
// Remove leading spaces from a string
// Remove trailing spaces from a string

package PracticeFile4;

public class P5 {
    public static void main(String[] args) {
        String S1 = "with";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "with";
        S2 = S2.replaceAll("i","*");
        System.out.println(S2);

        String S3 = "   with   ";
        S3 = S3.trim();
        System.out.println(S3);

        String S4 = "     with";
        S4 = S4.replaceAll("^\\s+","");
        System.out.println(S4);

        String S5 = "with    ";
        S5 = S5.replaceAll("\\s+$","");
        System.out.println(S5);
    }
}
