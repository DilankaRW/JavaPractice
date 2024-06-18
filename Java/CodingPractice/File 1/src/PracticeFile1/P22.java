// Remove trailing spaces from a string
package PracticeFile1;

public class P22 {
    public static void main(String[] args) {
        String S = "DilankaRW      ";
        String TS = S.replaceAll("\\s+$", "");
        System.out.println(TS); // DilankaRW
    }
}
