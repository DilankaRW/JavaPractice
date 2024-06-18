// Remove leading spaces from a string
package PracticeFile1;

public class P18 {
    public static void main(String[] args) {
        String s = "   Sri Lanka";
        String ts = s.replaceAll("^\\s+", "");
        System.out.println(ts); // Sri Lanka
    }
}
