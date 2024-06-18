// Remove trailing spaces from a string
package PracticeFile1;

public class P24 {
    public static void main(String[] args) {
        String S = "sdhgh    ";
        String TS = S.replaceAll("\\s+$","");
        System.out.println(TS); // sdhgh
    }
}
