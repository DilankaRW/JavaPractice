// Remove leading spaces from a string
package PracticeFile1;

public class P20 {
    public static void main(String[] args) {
        String S = "    Software";
        String TS = S.replaceAll("^\\s+", "");
        System.out.println(TS); // Software
    }
}
