// Remove leading spaces from a string
package PracticeFile1;

public class P17 {
    public static void main(String[] args) {
        String S = "   Colombo";
        String TS = S.replaceAll("^\\s+","");
        System.out.println(TS); // Colombo
    }
}
