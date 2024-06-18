// Remove trailing spaces from a string
package PracticeFile1;

public class P21 {
    public static void main(String[] args) {
        String S = "    Sigiriya            ";
        String TS = S.replaceAll("\\s+$", "");
        System.out.println(TS); // '    Sigiriya'
    }
}
