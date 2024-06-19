// Remove Character
package PracticeFile1;

public class P4 {
    public static void main(String[] args) {
        String O = "Sr@@@@@@@@i La@@nk@a";
        O = O.replaceAll("@", "");
        System.out.println(O); // Sri Lanka
    }
}
