// String Reverse
// Remove Character

package PracticeFile4;

public class P2 {
    public static void main(String[] args) {
        String S1 = "naro";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "naro";
        S2 = S2.replaceAll("o","i");
        System.out.println(S2);
    }
}
