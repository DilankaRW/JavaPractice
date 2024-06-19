// Remove trailing spaces from a string
package PracticeFile1;

public class P25 {
    public static void main(String[] args) {
        String S = "Google    ";
        String TS = S.replaceAll("\\s+$", "");
        System.out.println(TS); // Google
    }
}
