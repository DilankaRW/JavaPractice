// String Reverse
// Remove Character
// Remove leading and trailing spaces from a string.

package PracticeFile3;

public class P2 {
    public static void main(String[] args) {
        String S1  = "navbar";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "navbar";
        S2 = S2.replaceAll("b","*");
        System.out.println(S2);

        String S3 = "     navbar     ";
        S3 = S3.trim();
        System.out.println(S3);
    }
}
