// String Reverse
// Remove Character
// Remove leading and trailing spaces from a string.
// Remove leading spaces from a string
// Remove trailing spaces from a string
// Sort Array
// Sum Array
// Descending order Array

package PracticeFile1;

public class P10 {
    public static void main(String[] args) {
        String S1 = "sun";
        S1 = new StringBuilder(S1).reverse().toString();
        System.out.println(S1);

        String S2 = "sun";
        S2 = S2.replaceAll("u","");
        System.out.println(S2);

        String S3 = "    sun     ";
        S3 = S3.trim();
        System.out.println(S3);

        String S4 = "    sun";
        S4 = S4.replaceAll("^\\s+","");
        System.out.println(S4);

        String S5 = "sun     ";
        S5 = S5.replaceAll("\\s+$","");
        System.out.println(S5);
    }
}
