// Remove Character
package PracticeFile1;

public class P5 {
    public static void main(String[] args) {
        String O = "Col%%%%%%%%%ombo";
        O = O.replaceAll("%","");
        System.out.println(O); // Colombo
    }
}
