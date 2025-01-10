// String Reverse
// Remove Character
// Remove leading and trailing spaces from a string.
// Remove leading spaces from a string
// Remove trailing spaces from a string

package PracticeFile4;

public class P2 {
    public static void main(String[] args) {
        String S1 = "naro";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "naro";
        S2 = S2.replaceAll("o","i");
        System.out.println(S2);

        String S3 = "   naro";
        S3 = S3.trim();
        System.out.println(S3);

        String S4 = "    naro";
        S4 = S4.replaceAll("^\\s+","");
        System.out.println(S4);

        String S5 = "naro   ";
        S5 = S5.replaceAll("\\s+$","");
        System.out.println(S5);
    }
}
