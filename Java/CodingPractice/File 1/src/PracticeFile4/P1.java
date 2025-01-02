// String Reverse
// Remove Character
// Remove leading and trailing spaces from a string.
// Remove leading spaces from a string
// Remove trailing spaces from a string

package PracticeFile4;

public class P1 {
    public static void main(String[] args) {
        String S1 = "practice";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "practice";
        S2 = S2.replaceAll("t","*");
        System.out.println(S2);

        String S3 = "   practice   ";
        S3 = S3.trim();
        System.out.println(S3);

        String S4 = "   practice";
        S4 = S4.replaceAll("^\\s+","");
        System.out.println(S4);

        String S5 = "practice    ";
        S5 = S5.replaceAll("\\s+$","");
        System.out.println(S5);
    }
}
