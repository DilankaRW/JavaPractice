// Remove leading spaces from a string
package PracticeFile1;

public class P16 {
    public static void main(String[] args) {
        String S = "   Hello   ";
        String TS = S.replaceAll("^\\s+","");
        System.out.println(TS); // "Hello   "
    }
}
