// Remove trailing spaces from a string
package PracticeFile1;

public class P23 {
    public static void main(String[] args) {
        String S = "    Engineer    ";
        String TS = S.replaceAll("\\s+$", "");
        System.out.println(TS); // '    Engineer'
    }
}
