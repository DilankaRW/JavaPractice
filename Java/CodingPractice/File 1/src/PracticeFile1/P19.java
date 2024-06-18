// Remove leading spaces from a string
package PracticeFile1;

public class P19 {
    public static void main(String[] args) {
        String S = "                   Good Service";
        String TS = S.replaceAll("^\\s+", "");
        System.out.println(TS); // Good Service
    }
}
