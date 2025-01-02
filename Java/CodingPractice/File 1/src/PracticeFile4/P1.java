// String Reverse
// Remove Character

package PracticeFile4;

public class P1 {
    public static void main(String[] args) {
        String S1 = "practice";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "practice";
        S2 = S2.replaceAll("t","*");
        System.out.println(S2);
    }
}
